package com.jxust.apps.cms.web.controller;

import com.jxust.apps.cms.bean.BasePrivilege;
import com.jxust.apps.cms.bean.BaseUser;
import com.jxust.apps.cms.bean.extend.BaseUserExtend;
import com.jxust.apps.cms.service.IBasePrivilegeService;
import com.jxust.apps.cms.service.IBaseUserService;
import com.jxust.apps.cms.utils.Message;
import com.jxust.apps.cms.utils.MessageUtil;
import com.jxust.apps.cms.vm.UserRoleVM;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: cms_jd1911
 * @description: 用户基础控制器类
 * @author: charles
 * @create: 2019-11-16 16:23
 **/
@Validated
@RestController
@RequestMapping("/baseUser")
public class BaseUserController {
    @Autowired
    private IBaseUserService baseUserService;
    @Autowired
    private IBasePrivilegeService basePrivilegeService;

    @ApiOperation(value = "通过ID查询权限信息")
    @GetMapping("findMenuByUserId")
    public Message findMenuByUserId(long id){
        List<BasePrivilege> list =  basePrivilegeService.findMenuByUserId(id);
        return MessageUtil.success(list);
    }

    @ApiOperation(value = "查询所有")
    @GetMapping(value = "findAll")
    public Message findAll(){
        List<BaseUser> list = baseUserService.findAll();
        return MessageUtil.success(list);
    }

    @ApiOperation(value = "查询所有",notes = "级联用户角色")
    @GetMapping(value = "cascadeRoleFindAll")
    public Message cascadeRoleFindAll(){
        List<BaseUserExtend> list = baseUserService.cascadeRoleFindAll();
        return MessageUtil.success(list);
    }

    @ApiOperation(value = "保存或更新")
    @PostMapping(value = "saveOrUpdate")
    public Message saveOrUpdate(BaseUser baseUser){
        baseUserService.saveOrUpdate(baseUser);
        return MessageUtil.success("更新成功");
    }

    @ApiOperation(value = "通过id删除")
    @GetMapping(value = "deleteById")
    public Message deleteById(long id){
        baseUserService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    @ApiOperation(value = "设置权限")
    @PostMapping(value = "setRoles")
    public Message setRoles(UserRoleVM userRoleVM){
        System.out.println(userRoleVM);
        baseUserService.setRoles(userRoleVM.getId(),userRoleVM.getRoles());
        return MessageUtil.success("设置成功");
    }


}
