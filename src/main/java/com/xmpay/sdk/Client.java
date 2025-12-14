package com.xmpay.sdk;

import com.xmpay.sdk.models.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface Client {

    /**
     * 创建虚拟账户
     *
     * @param param 创建虚拟账户参数
     * @return 创建虚拟账户结果
     */
    Virtual.Resp virtualAccount(BaseParam param) throws Exception;

    /**
     * 创建收款订单
     *
     * @param param 创建收款订单参数
     * @return 创建收款订单结果
     */
    Receive.Resp receive(Receive.Param param) throws Exception;

    /**
     * 收款订单查询
     *
     * @param param 订单查询参数
     * @return 订单查询结果
     */
    OrderQuery.Resp receiveQuery(OrderQuery.Param param) throws Exception;

    /**
     * 创建代付订单
     *
     * @param param 创建代付订单参数
     * @return 创建代付订单结果
     */
    Out.Resp out(Out.Param param) throws Exception;

    /**
     * 代付订单查询
     *
     * @param param 订单查询参数
     * @return 订单查询结果
     */
    OrderQuery.Resp outQuery(OrderQuery.Param param) throws Exception;

    /**
     * 查询渠道
     *
     * @param param 查询参数
     * @return 查询结果
     */
    List<ChannelQuery.RespItem> channelQuery(ChannelQuery.Param param) throws Exception;

    /**
     * 查询商户余额
     *
     * @return 查询结果
     */
    Balance merchantBalance() throws Exception;

    /**
     * 解密数据
     *
     * @param data 待解密数据
     * @param clazz 解密后的对象类型
     * @return 解密后的对象
     */
//     <T> T decrypt(String data, Class<T> clazz) throws Exception;

    /**
     * 回调处理
     *
     * @param request 请求对象
     * @param executor 回调执行器
     */
    void callback(HttpServletRequest request, CallbackExecutor executor) throws Exception;
}
