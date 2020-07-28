package com.mall.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjuxing.platform.common.crud.CrudController;
import com.mall.security.model.UmsAdmin;
import com.mall.security.service.UmsAdminService;

/**
 * 后台用户表
 */
@RestController
@RequestMapping(value = "/admin")
public class UmsAdminController extends CrudController<UmsAdminService, UmsAdmin> {

    private Logger log = LoggerFactory.getLogger(UmsAdminController.class);

    @Autowired
    private UmsAdminService umsAdminService;


}

