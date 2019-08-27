package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.service.AuditService;
import com.qf.vo.AdministratorInfoVO;
import com.qf.vo.AuditVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuditController {

    @Autowired
    AuditService auditService;

    @RequestMapping("selectAllAuditSingle")
    public Object selectAllAuditSingle(@RequestParam(defaultValue="1",required=true,value="pageNum") Integer pageNum){
        //每页显示的数量
        Integer pageSize=10;
        //分页
        PageHelper.startPage(pageNum,pageSize);
        //获取数据
        List<AuditVO> auditVOS = auditService.selectAllAuditSingle();
        PageInfo<AuditVO> auditVOPageInfo = new PageInfo<AuditVO>(auditVOS);
        return auditVOPageInfo;
    }

    @RequestMapping("checkaudit")
    public Object checkaudit(@RequestBody AuditVO auditVO){
        return auditService.checkaudit(auditVO);
    }
}
