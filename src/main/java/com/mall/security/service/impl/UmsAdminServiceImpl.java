package com.mall.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.mall.security.mapper.UmsAdminMapper;
import com.mall.security.model.UmsAdmin;
import com.mall.security.service.UmsAdminService;

/**
 * 后台用户表
 */
@Service("umsAdminService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsAdminServiceImpl extends CrudServiceImpl<UmsAdminMapper, UmsAdmin> implements UmsAdminService {

    @Autowired
    private UmsAdminMapper umsAdminMapper;


}