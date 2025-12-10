package com.xmpay.sdk;

import com.xmpay.sdk.grpc.PayGrpcClient;
import com.xmpay.sdk.models.*;

import java.util.List;

/**
 * Example demonstrating how to use the PayGrpcClient
 */
public class PayGrpcClientExample {

    public static void main(String[] args) {
        // Create a client connecting to the gRPC server
        PayGrpcClient client = new PayGrpcClient(ExampleParam.grpcConfig);

        try {
            //创建虚拟账户
            BaseParam virtualParam = ExampleParam.virtualParam;
            virtualParam.setOrderNo("virtual_" + System.currentTimeMillis());
            Virtual.Resp virtual = client.virtualAccount(virtualParam);
            System.out.println("Virtual Response: " + virtual);
            //创建收款订单
            Receive.Param receiveParam = ExampleParam.receiveParam;
            receiveParam.setOrderNo("receive_" + System.currentTimeMillis());
            Receive.Resp receive = client.receive(receiveParam);
            System.out.println("Receive Response: " + receive);
            //收款订单查询
            OrderQuery.Param receiveQueryParam = OrderQuery.Param.builder().orderNo(receive.getOrderNo()).merchantNo(receive.getMerchantNo()).build();
            OrderQuery.Resp receiveOrder = client.receiveQuery(receiveQueryParam);
            System.out.println("ReceiveOrder Response: " + receiveOrder);
            //创建代付订单
            Out.Param outParam = ExampleParam.outParam;
            outParam.setOrderNo("out_" + System.currentTimeMillis());
            Out.Resp out = client.out(outParam);
            System.out.println("Out Response: " + out);
            //代付订单查询
            OrderQuery.Param outQueryParam = OrderQuery.Param.builder().orderNo(out.getOrderNo()).merchantNo(out.getMerchantNo()).build();
            OrderQuery.Resp outOrder = client.outQuery(outQueryParam);
            System.out.println("OutOrder Response: " + outOrder);

            //查询商户余额
            Balance balance = client.merchantBalance();
            System.out.println("Balance Response: " + balance);
            //查询渠道
            ChannelQuery.Param param = new ChannelQuery.Param(OrderType.OUT.getNumber());
            List<ChannelQuery.RespItem> resp = client.channelQuery(param);
            System.out.println("ChannelQuery Response: " + resp);

        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}