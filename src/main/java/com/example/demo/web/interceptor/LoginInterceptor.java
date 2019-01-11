package com.example.demo.web.interceptor;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 拦截器
 * @Author: zhangrongyao
 * @CreateDate: 2018/7/20 14:03
 * @UpdateUser: zhangrongyao
 * @UpdateDate: 2018/7/20 14:03
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class LoginInterceptor implements HandlerInterceptor {

    private static final List<String> excludeUrl = new ArrayList<String>() {{
        add("/api/common/login");//登录接口
        add("/api/common/logout");//退出接口
        add("/beans");
        add("/error");
    }};

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String requestURI = httpServletRequest.getRequestURI();
//        if (!excludeUrl.contains(requestURI)
//                && !requestURI.startsWith("/swagger")
//                && !requestURI.startsWith("/v2/api")
//                ) {
//            // 验证是否登录，如果没有登录就返回false
//            UserDto loginUser = SessionUtil.getLoginUser();
//            if (null == loginUser) {
//                httpServletResponse.setCharacterEncoding("UTF-8");
//                httpServletResponse.setContentType("application/json; charset=utf-8");
//                PrintWriter printWriter = httpServletResponse.getWriter();
//                CommonResult commonResult = new CommonResult(false, null, ErrorCode.LOGIN_FAILED_SESSION_TIMEOUT.code, ErrorCode.LOGIN_FAILED_SESSION_TIMEOUT.des);
//                Gson gson = new GsonBuilder().create();
//                String jsonStr = gson.toJson(commonResult);
//                printWriter.print(jsonStr);
//                return false;
//            }
//        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
