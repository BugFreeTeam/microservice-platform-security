package com.mall.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.mall.security.mapper.UmsResourceMapper;
import com.mall.security.model.UmsResource;
import com.mall.security.service.UmsResourceService;

/**
 * 后台资源表
 */
@Service("umsResourceService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsResourceServiceImpl extends CrudServiceImpl<UmsResourceMapper, UmsResource> implements UmsResourceService {

    @Autowired
    private UmsResourceMapper umsResourceMapper;


}