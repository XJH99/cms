package com.jxust.apps.cms.service;

import com.jxust.apps.cms.bean.Test;

import java.util.List;

public interface ITestService {

    void saveOrUpdate(Test test);

    List<Test> findAll();
}
