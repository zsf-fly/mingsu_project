package com.qf.AliPay;


import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101400684590";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCF8UnZIB7NLONEiMKlqVV0xkwlxnIWBbS5K/tnUz3y/7JpvIwt2TyBO1vWZzVLKCe63z/ldPdhfHdmXCFEKuxl+FN7sawZSibWgALmqz75z5RZyrRjXsAhCrHBN8RTDEO3PObex6gNBr6SsUu2J92su1w9WBCs/0l1jeRP2vEhZe5eJwTc1nOJsS2/kWGo21HnRPyvi5CHUs7vNMxQleywQO7skH13sLXsHOllxU7DXaTfYewSfsKphq18dPFX4+r4RRGHodJADuRnSvpKyoIxu6yHQSjId0W0DI2z4TlUuZTnwGNgcV2bWyol02r2ho2uh3RdzxunZZspJ6Msj22hAgMBAAECggEAO8QVup+dftnHsx3/FKKBcjDFa5mn8HGtWW7pqAo5u0MjHhE2z4J+f/+3k+zLl/Sb/cN+JGnTtJkwQelcIqmwgDOVNL1r2IEA4XePU9QXrqpUPNi5MxnlSxkVhezXWmM/l/TB46hdMSrQQG6CJQ6W2Gtl1i2Ei10CL0UYGhXMwKSsTZx6DqycynPeWbX6biZXZGa8lWvXHooKmwrb2kFAAsYWceTOlMLX3MoN4S6H86ypz/2HppXPOMiidd8LPwmuDdbPcFQ9XdtVIZQR47UjhsRbk+aibpxwpaDurBUzNeloSR/tky/eiFAJ9uChySC9io3zfrV+bi7gqtxwMwzDAQKBgQDpXGd9jM13ijuRYC05vx7smtKorIVAeD/8jqUywNZee6cpbHuyPCuwR+mlZtKsl6tMDNE6/VyrxkTvBJVUMzYQmjIePyWXijHGfo2zzvjQVJq4UsBTjRRv+szkDwhmeabEzx5Y3nSFj3FdwKMUWcRIgOHcwMjZUC+3dQwG0XbW0QKBgQCS78uPTc4/hwfKbG6iLGs9PdNuJE32HVUvtI/+pUhj+81m63VbjvzM/LuHMzc4wloDM04i7in/BLv37TX27QvvFY4es/I/b9Uf07x3QWSkKgtfKXrVV/hCMlvAmyy2f/Q7jL0M7ETXWDgKk8qHkW9e3FMQz1gH/N910p2MnsZ90QKBgQCmqweDJQgug3zt5IoIf1b/18fzDlyRYhEZOWwFZrL0gk4uiLuD3fO6EHJwXpLDEAQY6eKZxhDk4lOjfluE6pqHmwmGjsUziVDpmsNsE7ujV3m1gey4/78EB1VE4PO39NTGJcNf52nDZmKqegY/Z6mHuv0VpF8OznV2CtPPHtVIsQKBgGqf8gJCfqkgzml4t+uc+hDNvZCObbhr3rYoe9lYjShov8uwj0/qec4yk85vPuJEPldWMpwsYXM6N0CY9PEDYQaUiLYE9IROHcTjvD55yJNMI0Zh7k3EcVVv/57Lu+2O+mcAIOuww9/Ul44tYulvgva+QNTQ8VuSh4GTXVp+mSERAoGAYPccVQ2NIJXLzaTIvZR38cZIuTXCLVq27OQ7YlOgJ6XTceM+/oq91XOUsQjz+WimlTVy/dZkswQJRBSCyFfxNHPL5iEVhclGhaVhf8za0mNlFT5XfDfUb95X2BQUzhqmZnNCthNOHoiKyTsRSLCtO7/fWIaRElmbWsUXoB+6Pac=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAri8uFHnMERekHM+mDz2p/37LN28t7J5UIO30JjvbCo1ns9SuUdGC0yyJ1SYpMubOKRxcIKePtLNgwsC0jY/Ialpg6mNkrjnNvy36erY2UpqHDj1bV5/3GnoHSrn8s8EqN50gUOf73hRF1YEkRn0vr+aURzbGjfuAo6DfsCo11c2W+OewQff8e5SmIK+m3e9veclm638htIKoQ9uTBH/1J83xgpuPAfuTrwph+YkkrWtrDRGtBogd+28Lw6tJx0JRmTFydD/5GyfAvQfu2JtN99kSRvYEnsJOF80XN4IeLp08haHUIm9FRCm7h04mFG2ESqXQF1TJf2SoJ535X9LGpQIDAQAB";

    // 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/return_url";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    //沙箱网关
    public static String gatewayUrl ="https://openapi.alipaydev.com/gateway.do";

    // 仅支持JSON
    public static String format = "JSON";

    // 支付宝网关 日志
    public static String log_path = "C:\\";
//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    /**

     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
