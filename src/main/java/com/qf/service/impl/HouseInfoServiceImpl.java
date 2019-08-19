package com.qf.service.impl;

import com.qf.dao.HouseInfoMapper;
import com.qf.service.HouseInfoService;
import com.qf.vo.HouseInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseInfoServiceImpl implements HouseInfoService {
    @Autowired
    HouseInfoMapper houseInfoMapper;
    public List<HouseInfoVO> getHouseInfo() {
        return houseInfoMapper.getHouseInfo();
    }
}
