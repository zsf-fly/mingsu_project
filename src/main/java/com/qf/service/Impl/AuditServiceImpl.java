package com.qf.service.Impl;

import com.qf.dao.AuditMapper;
import com.qf.service.AuditService;
import com.qf.vo.AuditVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditServiceImpl implements AuditService {

    @Autowired
    AuditMapper auditMapper;
    public List<AuditVO> selectAllAuditSingle() {
        return auditMapper.selectAllAuditSingle();
    }

    public List<AuditVO> checkaudit(AuditVO auditVO) {
        return auditMapper.checkaudit(auditVO);
    }
}
