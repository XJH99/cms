package com.jxust.apps.cms.service;

import com.jxust.apps.cms.bean.Category;
import com.jxust.apps.cms.utils.CustomerException;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    void saveOrUpdate(Category category) throws CustomerException;

    void deleteById(long id) throws CustomerException;

    void batchDelete(long[] ids) throws CustomerException;
}
