package com.qf.controller;

import com.qf.dao.HouseReleaseMapper;
import com.qf.pojo.*;
import com.qf.service.HouseReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class HouseReleaseController {
    @Autowired
    HouseReleaseService houseReleaseService;

    //添加房屋信息
    @RequestMapping("addHouseInfo")
    public Object addHouseInfo(@RequestBody(required = false) Houses houses,HttpSession httpSession){
        UserAccount userAccount = (UserAccount) httpSession.getAttribute("userAccount");
        int userid = userAccount.getUserid();
        houses.setUserid(userid);
        houseReleaseService.addHouseInfo(houses);
       int id = houses.getHouseid();
       return id;
    }

    //添加房屋配置
    @RequestMapping("upHouseAllocation")
    public Object upHouseAllocation(@RequestBody Houses houses){
        return houseReleaseService.upHouseAllocation(houses);
    }

    //添加房屋位置
    @RequestMapping("addHouseAddress")
    public Object addHouseAddress(@RequestBody HouseAddress houseAddress){
        return houseReleaseService.addHouseAddress(houseAddress);
    }

    //dropzone图片上传
    @RequestMapping("upload")
    @ResponseBody
    public Map<String, Object> upload(MultipartFile dropzFile, HttpServletRequest request) throws IOException {
        System.out.println("inner upload");
        Map<String, Object> result = new HashMap<String, Object>();

        //创建文件需要存储的路径
        String destPathName = request.getSession().getServletContext().getRealPath("/static/HousePicture");
        File destPath = new File(destPathName);
        //如果目标文件夹不存在我就创建它
        if (!destPath.exists()) {
            destPath.mkdirs();
        }
        //获取文件的后缀名
        String fileSuffix = dropzFile.getOriginalFilename().substring(dropzFile.getOriginalFilename().lastIndexOf("."));
        String destFileName = UUID.randomUUID() + fileSuffix;
        System.out.println(destFileName);
        File destFile = new File(destPath, destFileName);
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        dropzFile.transferTo(destFile);
        result.put("status", 200);
        //http://localhost:8080/xxxxx/xxxx.jpg
        result.put("filePath", "http://localhost:8080/static/HousePicture/" + destFileName);
        return result;
    }

    //添加房屋照片
    @RequestMapping("pictureUpload")
    public Object pictureUpload(@RequestBody HousePicture housePicture){
        return houseReleaseService.pictureUpload(housePicture);
    }

    //添加房屋照片时删除照片
    @RequestMapping("pictureDelete")
    public Object pictureDelete(@RequestBody HousePicture housePicture){
        return houseReleaseService.pictureDelete(housePicture);
    }

    //添加房屋详情
    @RequestMapping("addHouseDetails")
    public Object addHouseDetails(@RequestBody HouseDetails houseDetails){
        return houseReleaseService.addHouseDetails(houseDetails);
    }

    //添加房屋便利设施
    @RequestMapping("addHouseAmenities")
    public Object addHouseAmenities(@RequestBody Amenities amenities){
        return houseReleaseService.addHouseAmenities(amenities);
    }

    //添加房屋安全设施
    @RequestMapping("addHouseSafetyfacilities")
    public Object addHouseSafetyfacilities(@RequestBody Safetyfacilities safetyfacilities){
        return houseReleaseService.addHouseSafetyfacilities(safetyfacilities);
    }

    //添加房屋审核订单
    @RequestMapping("addAudit")
    public Object addAudit(@RequestBody(required = false) Audit audit, HttpSession httpSession){
        UserAccount userAccount = (UserAccount) httpSession.getAttribute("userAccount");
        System.out.println(userAccount);
        int userid = userAccount.getUserid();
        audit.setUserid(userid);
        System.out.println(audit);
        return houseReleaseService.addAudit(audit);
    }
}
