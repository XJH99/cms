package com.jxust.apps.cms.service.impl;

import com.jxust.apps.cms.bean.Test;
import com.jxust.apps.cms.bean.TestExample;
import com.jxust.apps.cms.dao.TestMapper;
import com.jxust.apps.cms.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: cms_jd1911
 * @description: 测试业务类
 * @author: charles
 * @create: 2019-11-11 12:22
 **/
@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public void saveOrUpdate(Test test) {
        if(test.getId()!=null){
            testMapper.updateByPrimaryKey(test);
        } else {
            testMapper.insert(test);
        }
    }

    @Override
    public List<Test> findAll() {
        TestExample example = new TestExample();
        return testMapper.selectByExample(example);
    }
}
