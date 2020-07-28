package com.mall.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anjuxing.platform.common.crud.CrudServiceImpl;
import com.anjuxing.platform.common.exception.ServiceException;
import com.mall.security.mapper.UmsMenuMapper;
import com.mall.security.model.UmsMenu;
import com.mall.security.service.UmsMenuService;

/**
 * 后台菜单表
 */
@Service("umsMenuService")
@Transactional(readOnly = true, rollbackFor = ServiceException.class)
public class UmsMenuServiceImpl extends CrudServiceImpl<UmsMenuMapper, UmsMenu> implements UmsMenuService {

    @Autowired
    private UmsMenuMapper umsMenuMapper;


}