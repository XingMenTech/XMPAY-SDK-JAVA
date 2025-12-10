# XMPAY-SDK-JAVA

XMPAY-SDK-JAVA 是一个用于与 XMPAY 支付服务进行交互的 Java 客户端库。该 SDK 提供了两种通信方式：HTTP 和 gRPC，方便开发者集成支付功能到他们的应用程序中。

## 目录

- [功能特性](#功能特性)
- [依赖](#依赖)
- [安装](#安装)
- [使用方法](#使用方法)
  - [配置](#配置)
  - [HTTP 客户端](#http-客户端)
  - [gRPC 客户端](#grpc-客户端)
- [API 功能](#api-功能)
  - [创建虚拟账户](#创建虚拟账户)
  - [创建收款订单](#创建收款订单)
  - [查询收款订单](#查询收款订单)
  - [创建代付订单](#创建代付订单)
  - [查询代付订单](#查询代付订单)
  - [查询商户余额](#查询商户余额)
  - [查询渠道](#查询渠道)
- [示例](#示例)
- [许可证](#许可证)

## 功能特性

- 支持 HTTP 和 gRPC 两种通信协议
- 自动处理请求签名和数据加密
- 提供完整类型的请求和响应对象
- 内置错误处理机制
- 易于集成和使用

## 依赖

该 SDK 需要以下依赖项：

- Java 8 或更高版本
- gRPC 1.75.0
- Protobuf 3.21.1
- Hutool 工具包 5.8.25
- Lombok 1.18.26（编译时）

## 安装

### 手动构建

1、克隆此仓库并使用 Maven 构建：

```bash
git clone <repository-url>
cd XMPAY-SDK-JAVA
mvn clean install
```

2、在您项目的 `pom.xml` 文件中添加以下依赖项：

```xml
<dependency>
    <groupId>com.xmpay</groupId>
    <artifactId>xmpay-sdk-java</artifactId>
    <version>0.0.1</version>
</dependency>
```

## 快速开始

### 配置

在开始使用 SDK 之前，需要先配置客户端参数：

```java
ConfigProperties config = ConfigProperties.builder()
    .clientType(ClientType.HTTP) // 或 ClientType.GRPC
    .apiUrl("http://127.0.0.1:9001") // API 地址
    .appKey("your-app-key")
    .appSecret("your-app-secret")
    .inId(601) // 默认收款通道
    .outId(602) // 默认代付通道
    .inNotifyUrl("https://yourdomain.com/notify/in") // 充值回调地址
    .outNotifyUrl("https://yourdomain.com/notify/out") // 提现回调地址
    .build();
```

### HTTP 客户端

```java
PayHttpClient client = new PayHttpClient(config);
```

### gRPC 客户端

```java
PayGrpcClient client = new PayGrpcClient(config);
```

## API 功能

### 创建虚拟账户

创建一个虚拟账户用于接收付款：

```java
BaseParam virtualParam = BaseParam.builder()
    .orderNo("virtual_" + System.currentTimeMillis())
    .uid("user-id")
    .ip("user-ip")
    // ... 其他参数
    .build();

Virtual.Resp response = client.virtualAccount(virtualParam);
```

### 创建收款订单

创建一个收款订单：

```java
Receive.Param receiveParam = Receive.Param.builder()
    .amount(300000) // 金额（分）
    .orderNo("receive_" + System.currentTimeMillis())
    .uid("user-id")
    .ip("user-ip")
    .subject("商品标题")
    .body("商品描述")
    // ... 其他参数
    .build();

Receive.Resp response = client.receive(receiveParam);
```

### 查询收款订单

查询收款订单状态：

```java
OrderQuery.Param queryParam = OrderQuery.Param.builder()
    .orderNo("order-number")
    .merchantNo("merchant-number")
    .build();

OrderQuery.Resp response = client.receiveQuery(queryParam);
```

### 创建代付订单

创建一个代付订单：

```java
Out.Param outParam = Out.Param.builder()
    .amount(300000) // 金额（分）
    .orderNo("out_" + System.currentTimeMillis())
    .uid("user-id")
    .ip("user-ip")
    .bankCode("bank-code")
    .bankName("银行名称")
    .bankNo("银行卡号")
    .subject("付款标题")
    .body("付款描述")
    // ... 其他参数
    .build();

Out.Resp response = client.out(outParam);
```

### 查询代付订单

查询代付订单状态：

```java
OrderQuery.Param queryParam = OrderQuery.Param.builder()
    .orderNo("order-number")
    .merchantNo("merchant-number")
    .build();

OrderQuery.Resp response = client.outQuery(queryParam);
```

### 查询商户余额

查询当前商户的余额信息：

```java
Balance balance = client.merchantBalance();
```

### 查询渠道

查询可用的支付渠道：

```java
ChannelQuery.Param param = new ChannelQuery.Param(OrderType.OUT.getNumber());
List<ChannelQuery.RespItem> channels = client.channelQuery(param);
```

## 示例

完整的使用示例可以在 [PayHttpClientExample.java](src/test/java/com/xmpay/sdk/PayHttpClientExample.java) 和 [PayGrpcClientExample.java](src/test/java/com/xmpay/sdk/PayGrpcClientExample.java) 中找到。

## 许可证

版权所有 © 2025 XMPAY

本 SDK 根据 MIT 许可证授权使用。