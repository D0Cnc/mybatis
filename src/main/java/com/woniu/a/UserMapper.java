package com.woniu.a;

import java.util.List;

import com.woniu.domain.User;

public interface UserMapper {
void save(User user);
void update(User user);
void delete(Integer id);
List<User> find();
}
