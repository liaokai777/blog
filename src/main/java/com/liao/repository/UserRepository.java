package com.liao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liao.entity.User;

/**
 * @author liao
 * <p>
 * 2018年1月23日
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByAccount(String account);

}
