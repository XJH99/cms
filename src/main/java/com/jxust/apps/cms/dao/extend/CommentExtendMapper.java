package com.jxust.apps.cms.dao.extend;

import com.jxust.apps.cms.bean.Comment;

import java.util.List;

public interface CommentExtendMapper {

    List<Comment> selectByArticleId(long article_id);
}
