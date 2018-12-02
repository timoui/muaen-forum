package com.muaen.forum.model;

import java.util.Date;
import lombok.Data;

/**
 * user model
 * @author farzer
 */
@Data
public class UserModel {
  private Integer id;
  private String name;
  private String password;
  private String email;
  private Date created;
  private Date modified;
}
