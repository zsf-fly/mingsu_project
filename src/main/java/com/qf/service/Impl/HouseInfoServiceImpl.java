package com.qf.service.Impl;

import com.qf.dao.HouseInfoMapper;
import com.qf.dto.SearchHouseInfoDTO;
import com.qf.service.HouseInfoService;
import com.qf.vo.HouseInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseInfoServiceImpl implements HouseInfoService {
    @Autowired
    HouseInfoMapper houseInfoMapper;

    /**
     * 首页展示房源信息
     * @param searchHouseInfoDTO
     * @return
     */
    public List<HouseInfoVO> getHouseInfo(SearchHouseInfoDTO searchHouseInfoDTO) {
        return houseInfoMapper.getHouseInfo(searchHouseInfoDTO);
    }
}
