package com.qf.dao;

import com.qf.dto.SearchHouseInfoDTO;
import com.qf.vo.HouseInfoVO;

import java.util.List;
//首页展示房源信息
public interface HouseInfoMapper {
    public List<HouseInfoVO> getHouseInfo(SearchHouseInfoDTO searchHouseInfoDTO);
}
