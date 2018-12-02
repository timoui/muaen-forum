package com.muaen.forum.mapper;

import com.muaen.forum.model.UserModel;
import java.util.List;

/**
 * 用户表操作
 * @author farzer
 */
public interface UserMapper {
  /**
   * 返回用户记录.
   *
   * @param id 用户ID
   * @return 用户记录
   */
  UserModel selectById(Integer id);

  /**
   * 根据用户搜索条件进行搜索.
   * @param user 用户信息
   * @return 符合条件的用户列表
   */
  List<UserModel> selectByFilter(UserModel user);

  /**
   * 根据用户名字搜索用户.
   * @param name 用户名字
   * @return 符合的用户
   */
  UserModel selectByName(String name);

  /**
   * 插入用户记录.
   *
   * @param user 要插入的用户信息
   * @return 操作成功标志 1 成功 0 失败
   */
  Integer insert(UserModel user);

  /**
   * 更新用户记录.
   *
   * @param user 要更新的信息
   * @return 更新标志 1 成功 0 失败
   */
  Integer update(UserModel user);

  /**
   * 删除用户记录.
   * @param id 用户ID
   * @return 删除成功标志 1 成功 0 失败
   */
  Integer deleteById(Integer id);

}
