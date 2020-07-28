package com.mall.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.mall.security.mapper.UmsRolePermissionRelationMapper;
import com.mall.security.model.UmsRolePermissionRelation;
import com.mall.security.service.UmsRolePermissionRelationService;

/**
 * 后台用户角色和权限关系表
 */
@Service("umsRolePermissionRelationService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsRolePermissionRelationServiceImpl extends CrudServiceImpl<UmsRolePermissionRelationMapper, UmsRolePermissionRelation> implements UmsRolePermissionRelationService {

    @Autowired
    private UmsRolePermissionRelationMapper umsRolePermissionRelationMapper;


}