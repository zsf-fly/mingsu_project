package com.qf.service;

import com.qf.pojo.*;

public interface HouseReleaseService {
    //添加房屋信息
    public boolean addHouseInfo(Houses houses);

    //添加房屋配置
    public boolean upHouseAllocation(Houses houses);

    //添加房屋位置
    public boolean addHouseAddress(HouseAddress houseAddress);

    //添加房屋照片
    public boolean pictureUpload(HousePicture housePicture);

    //添加房屋照片时删除照片
    public boolean pictureDelete(HousePicture housePicture);

    //添加房屋详情
    public boolean addHouseDetails(HouseDetails houseDetails);

    //添加房屋便利设施
    public boolean addHouseAmenities(Amenities amenities);

    //添加房屋安全设施
    public boolean addHouseSafetyfacilities(Safetyfacilities safetyfacilities);

    //添加房屋审核订单
    public boolean addAudit(Audit audit);

}
