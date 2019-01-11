package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Description: j打war包需要放开注释，把启动类Application注册进去。外部web应用服务器构建Web Application Context的时候，会把启动类添加进去
 * @Author: zhangrongyao
 * @CreateDate: 2018/8/7 16:05
 * @UpdateUser: zhangrongyao
 * @UpdateDate: 2018/8/7 16:05
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }
}
