package com.qf.dao;

import com.qf.vo.AuditVO;

import java.util.List;

public interface AuditMapper {

    public List<AuditVO> selectAllAuditSingle();

    public List<AuditVO> checkaudit(AuditVO auditVO);
}
