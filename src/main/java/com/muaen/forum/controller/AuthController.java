package com.muaen.forum.controller;


import com.muaen.forum.common.BaseController;
import com.muaen.forum.common.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 权限
 * @author farzer
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController extends BaseController {

  @PostMapping("/login")
  public Result login() {
     return ok();
  }
}
