package com.mall.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjuxing.platform.common.crud.CrudController;
import com.mall.security.model.UmsRole;
import com.mall.security.service.UmsRoleService;

/**
 * 后台用户角色表
 */
@RestController
@RequestMapping(value = "/role")
public class UmsRoleController extends CrudController<UmsRoleService, UmsRole> {

    private Logger log = LoggerFactory.getLogger(UmsRoleController.class);

    @Autowired
    private UmsRoleService umsRoleService;


}

