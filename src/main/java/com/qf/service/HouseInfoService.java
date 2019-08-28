package com.qf.service;

import com.qf.dto.SearchHouseInfoDTO;
import com.qf.vo.HouseInfoVO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//首页展示房源信息
public interface HouseInfoService {
    public List<HouseInfoVO> getHouseInfo(SearchHouseInfoDTO searchHouseInfoDTO);
}
