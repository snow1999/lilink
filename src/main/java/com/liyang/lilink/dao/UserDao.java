package com.liyang.lilink.dao;

import com.liyang.lilink.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<UserEntity, Integer> {
    List<UserEntity> getUserEntitiesByUserName(String userName);
}
