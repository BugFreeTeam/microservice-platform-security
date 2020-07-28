package com.mall.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjuxing.platform.common.crud.CrudController;
import com.mall.security.model.UmsPermission;
import com.mall.security.service.UmsPermissionService;

/**
 * 后台用户权限表
 */
@RestController
@RequestMapping(value = "/permission")
public class UmsPermissionController extends CrudController<UmsPermissionService, UmsPermission> {

    private Logger log = LoggerFactory.getLogger(UmsPermissionController.class);

    @Autowired
    private UmsPermissionService umsPermissionService;


}

