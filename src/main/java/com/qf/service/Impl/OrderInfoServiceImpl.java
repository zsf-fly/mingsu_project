package com.qf.service.Impl;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.qf.AliPay.AlipayConfig;
import com.qf.dao.OrderInfoMapper;
import com.qf.pojo.ToOrderInfo;
import com.qf.service.OrderInfoService;
import com.qf.vo.OrderInfoVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Service

public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    OrderInfoMapper orderInfoMapper;

    @Test
    public Object payStart(String order_number,int total_price) {
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = order_number;
        //付款金额，必填
        String total_amount = String.valueOf(total_price);
        //订单名称，必填
        String subject = "房屋租金";
        //商品描述，可空
        //String body = orderForm.getBody();
        String result=null;
        try {
            alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                    + "\"total_amount\":\""+ total_amount +"\","
                    + "\"subject\":\""+ subject +"\","
                    + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
            //请求
            result = alipayClient.pageExecute(alipayRequest).getBody();
            //输出 pay页面取出
            return result;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 展示详情页房源信息（预定页）
     * @param houseid
     * @return
     */
    public List<OrderInfoVO> getOrderInfo(int houseid)
    {
        return orderInfoMapper.getOrderInfo(houseid);
    }

    /**
     * 生成订单信息(添加订单信息)
     * @param toOrderInfo
     * @return
     */
    public boolean addOrderInfo(ToOrderInfo toOrderInfo) {
        return orderInfoMapper.addOrderInfo(toOrderInfo)>0;
    }

    public boolean updateOrderInof(String order_number) {
        return orderInfoMapper.updateOrderInof(order_number)>0;
    }

}
