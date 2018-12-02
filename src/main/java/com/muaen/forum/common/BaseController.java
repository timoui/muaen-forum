package com.muaen.forum.common;

import com.muaen.forum.config.ResultStatus;

/**
 * 基础控制器
 * @author farzer
 */
public class BaseController {
  protected Result result(int code, String msg, Object data) {
    return new Result(code, msg, data);
  }

  private Result result(ResultStatus status) {
    return new Result(status);
  }

  protected Result ok() {
    return result(ResultStatus.SUCCESS);
  }

  protected Result ok(ResultStatus status) {
    return result(status);
  }

  protected Result ok(Object data) {
    return new Result(ResultStatus.SUCCESS, data);
  }

  protected Result error(ResultStatus status) {
    return result(status);
  }
}
