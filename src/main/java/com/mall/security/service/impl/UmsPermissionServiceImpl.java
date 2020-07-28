package com.mall.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.mall.security.mapper.UmsPermissionMapper;
import com.mall.security.model.UmsPermission;
import com.mall.security.service.UmsPermissionService;

/**
 * 后台用户权限表
 */
@Service("umsPermissionService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsPermissionServiceImpl extends CrudServiceImpl<UmsPermissionMapper, UmsPermission> implements UmsPermissionService {

    @Autowired
    private UmsPermissionMapper umsPermissionMapper;


}