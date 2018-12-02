package com.muaen.forum.service;

import com.muaen.forum.mapper.UserMapper;
import com.muaen.forum.model.UserModel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务
 * @author farzer
 */
@Service
public class UserService {
  @Autowired
  private UserMapper userMapper;

  public UserModel select(Integer id) {
    return userMapper.selectById(id);
  }

  public UserModel selectByName(String name) {
    return userMapper.selectByName(name);
  }

  public UserModel create(UserModel user) {
    userMapper.insert(user);
    return userMapper.selectById(user.getId());
  }

  public List<UserModel> filter(UserModel user) {
    return userMapper.selectByFilter(user);
  }

  public UserModel update(UserModel user) {
    userMapper.update(user);
    return userMapper.selectById(user.getId());
  }

  public Integer delete(Integer id) {
    return userMapper.deleteById(id);
  }
}
