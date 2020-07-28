package com.mall.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjuxing.platform.common.crud.CrudController;
import com.mall.security.model.UmsMenu;
import com.mall.security.service.UmsMenuService;

/**
 * 后台菜单表
 */
@RestController
@RequestMapping(value = "/menu")
public class UmsMenuController extends CrudController<UmsMenuService, UmsMenu> {

    private Logger log = LoggerFactory.getLogger(UmsMenuController.class);

    @Autowired
    private UmsMenuService umsMenuService;


}

