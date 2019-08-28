package com.qf.dao;

import com.qf.pojo.*;

public interface HouseReleaseMapper {
    //添加房屋信息
    public int addHouseInfo(Houses houses);

    //添加房屋配置
    public int upHouseAllocation(Houses houses);

    //添加房屋位置
    public int addHouseAddress(HouseAddress houseAddress);

    //添加房屋照片
    public int pictureUpload (HousePicture housePicture);

    //添加房屋照片时删除照片
    public int pictureDelete(HousePicture housePicture);

    //添加房屋详情
    public int addHouseDetails(HouseDetails houseDetails);

    //添加房屋便利设施
    public int addHouseAmenities(Amenities amenities);

    //添加房屋安全设施
    public int addHouseSafetyfacilities(Safetyfacilities safetyfacilities);

    //添加房屋审核订单
    public int addAudit(Audit audit);
}
