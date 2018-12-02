package com.muaen.forum.config;

/**
 * 自定义状态码
 * @author farzer
 */
public enum ResultStatus {
  /**
   * 默认成功
   */
  SUCCESS(100, "成功"),
  /**
   * 默认失败
   */
  FAIL(10001, "失败");

  private int code;
  private String msg;

  ResultStatus(int code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
