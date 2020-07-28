package com.mall.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.mall.security.mapper.UmsResourceCategoryMapper;
import com.mall.security.model.UmsResourceCategory;
import com.mall.security.service.UmsResourceCategoryService;

/**
 * 资源分类表
 */
@Service("umsResourceCategoryService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsResourceCategoryServiceImpl extends CrudServiceImpl<UmsResourceCategoryMapper, UmsResourceCategory> implements UmsResourceCategoryService {

    @Autowired
    private UmsResourceCategoryMapper umsResourceCategoryMapper;


}