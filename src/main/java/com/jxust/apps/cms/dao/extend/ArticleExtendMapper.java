package com.jxust.apps.cms.dao.extend;

import com.jxust.apps.cms.bean.extend.ArticleExtend;

import java.util.List;

public interface ArticleExtendMapper {
    List<ArticleExtend> selectAll();

    ArticleExtend selectById(long id);
}
