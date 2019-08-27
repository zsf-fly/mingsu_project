package com.qf.service;

import com.qf.vo.AuditVO;

import java.util.List;

public interface AuditService {

    public List<AuditVO> selectAllAuditSingle();

    public List<AuditVO> checkaudit(AuditVO auditVO);
}
