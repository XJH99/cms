package com.jxust.apps.cms.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.jxust.apps.cms.dao")
public class MybatisConfig {

}
