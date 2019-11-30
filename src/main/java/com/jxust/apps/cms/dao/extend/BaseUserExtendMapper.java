package com.jxust.apps.cms.dao.extend;

import com.jxust.apps.cms.bean.extend.BaseUserExtend;

import java.util.List;

public interface BaseUserExtendMapper {
    BaseUserExtend selectById(long id);

    List<BaseUserExtend> selectAll();
}
