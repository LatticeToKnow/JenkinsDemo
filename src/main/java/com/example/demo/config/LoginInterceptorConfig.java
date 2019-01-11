package com.example.demo.config;

import com.example.demo.web.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * @Description: 拦截器配置
 * 需要拦截所有接口，然后把需要开放的接口，单独开发
 * @Author: zhangrongyao
 * @CreateDate: 2018/7/20 13:46
 * @UpdateUser: zhangrongyao
 * @UpdateDate: 2018/7/20 13:46
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Configuration
public class LoginInterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/users/getMessage")
//        .excludePathPatterns("/users/getMessage")
        ;
        super.addInterceptors(registry);
    }
}
