package com.qf.service.Impl;

import com.qf.dao.HouseReleaseMapper;
import com.qf.pojo.*;
import com.qf.service.HouseReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseReleaseServiceImpl implements HouseReleaseService {
    @Autowired
    HouseReleaseMapper houseReleaseMapper;

    //添加房屋信息
    public boolean addHouseInfo(Houses houses) {
        return houseReleaseMapper.addHouseInfo(houses)>0;
    }

    //添加房屋配置
    public boolean upHouseAllocation(Houses houses) {
        return houseReleaseMapper.upHouseAllocation(houses)>0;
    }

    //添加房屋位置
    public boolean addHouseAddress(HouseAddress houseAddress) {
        return houseReleaseMapper.addHouseAddress(houseAddress)>0;
    }

    //添加房屋照片
    public boolean pictureUpload(HousePicture housePicture) {
        return houseReleaseMapper.pictureUpload(housePicture)>0;
    }

    //添加房屋照片时删除照片
    public boolean pictureDelete(HousePicture housePicture) {
        return houseReleaseMapper.pictureDelete(housePicture)>0;
    }

    //添加房屋详情
    public boolean addHouseDetails(HouseDetails houseDetails){
        return houseReleaseMapper.addHouseDetails(houseDetails)>0;
    }

    //添加房屋便利设施
    public boolean addHouseAmenities(Amenities amenities) {
        return houseReleaseMapper.addHouseAmenities(amenities)>0;
    }

    //添加房屋安全设施
    public boolean addHouseSafetyfacilities(Safetyfacilities safetyfacilities) {
        return houseReleaseMapper.addHouseSafetyfacilities(safetyfacilities)>0;
    }

    //添加房屋审核订单
    public boolean addAudit(Audit audit) {
        return houseReleaseMapper.addAudit(audit)>0;
    }

}
