package com.qf.service;

public interface AliyunSmsService {
    /**
     * 短信验证码
     * @param mobile
     * @return
     */
    public String getPhonemsg(String mobile);
}
