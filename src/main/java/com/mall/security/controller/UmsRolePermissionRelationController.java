package com.mall.security.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anjuxing.platform.common.crud.CrudController;
import com.mall.security.model.UmsRolePermissionRelation;
import com.mall.security.service.UmsRolePermissionRelationService;

/**
 * 后台用户角色和权限关系表
 */
@RestController
@RequestMapping(value = "/role/permission/relation")
public class UmsRolePermissionRelationController extends CrudController<UmsRolePermissionRelationService, UmsRolePermissionRelation> {

    private Logger log = LoggerFactory.getLogger(UmsRolePermissionRelationController.class);

    @Autowired
    private UmsRolePermissionRelationService umsRolePermissionRelationService;


}

