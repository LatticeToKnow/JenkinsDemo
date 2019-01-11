package com.example.demo.web.controller;

import com.example.demo.common.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 测试API接口
 * @Author: zhangrongyao
 * @CreateDate: 2018/7/24 9:39
 * @UpdateUser: zhangrongyao
 * @UpdateDate: 2018/7/24 9:39
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Api(value = "测试API接口", description = "测试API接口")
@Controller
@RequestMapping(value = "/test")
public class HelloWorld {

    /**
     * 测试
     *
     * @return
     */
    @ApiOperation(value = "测试", notes = "测试")
    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult createComment() {
        return new CommonResult(false, "HelloWorld!", 0, "成功");
    }
}