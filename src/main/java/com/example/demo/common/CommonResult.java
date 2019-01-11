package com.example.demo.common;


import java.io.Serializable;

/**
 * @Description: 封装返回值
 * @Author: zhangrongyao
 * @CreateDate: 2018/7/20 14:03
 * @UpdateUser: zhangrongyao
 * @UpdateDate: 2018/7/20 14:03
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class CommonResult implements Serializable {

  /**
   * 返回的状态
   */
  private boolean status;
  /**
   * 返回信息码
   */
  private Integer code;
  /**
   * 主题,正确返回数据
   */
  private Object data;
  /**
   * 错误返回的文字信息
   */
  private String message;


  /**
   * 公共无参数的构造
   */
  public CommonResult() {

  }

  public CommonResult(boolean status, Object data, Integer code, String message) {
    this.status = status;
    this.code = code;
    this.data = data;
    this.message = message;
  }

  public CommonResult(boolean status, Integer code, String message) {
    this.status = status;
    this.code = code;
    this.data = null;
    this.message = message;
  }


  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


}

