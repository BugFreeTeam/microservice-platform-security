package com.mall.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjuxing.platform.common.crud.CrudController;
import com.mall.security.model.UmsRoleMenuRelation;
import com.mall.security.service.UmsRoleMenuRelationService;

/**
 * 后台角色菜单关系表
 */
@RestController
@RequestMapping(value = "/role/menu/relation")
public class UmsRoleMenuRelationController extends CrudController<UmsRoleMenuRelationService, UmsRoleMenuRelation> {

    private Logger log = LoggerFactory.getLogger(UmsRoleMenuRelationController.class);

    @Autowired
    private UmsRoleMenuRelationService umsRoleMenuRelationService;


}

