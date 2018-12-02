package com.muaen.forum.common;

import com.muaen.forum.config.ResultStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 结果
 * @author farzer
 */
@Data
@AllArgsConstructor
public class Result {
  private int code;
  private String msg;
  private Object data;

  Result(ResultStatus status) {
    this.code = status.getCode();
    this.msg = status.getMsg();
    this.data = null;
  }

  Result(ResultStatus status, Object data) {
    this.code = status.getCode();
    this.msg = status.getMsg();
    this.data = data;
  }
}
