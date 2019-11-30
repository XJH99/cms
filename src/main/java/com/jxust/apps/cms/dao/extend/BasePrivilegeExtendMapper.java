package com.jxust.apps.cms.dao.extend;

import com.jxust.apps.cms.bean.BasePrivilege;
import com.jxust.apps.cms.vm.PrivilegeTree;

import java.util.List;

public interface BasePrivilegeExtendMapper {
    List<PrivilegeTree> selectAll();

    List<BasePrivilege> selectByParentId(long id);

    List<BasePrivilege> selectByRoleId(long id);

    List<BasePrivilege> selectByUserId(long id);

    List<BasePrivilege> selectMenuByUserId(long id);
}
