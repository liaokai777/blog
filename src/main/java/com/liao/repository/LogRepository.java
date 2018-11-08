package com.liao.repository;

import com.liao.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liao
 * <p>
 * 2018年4月18日
 */
public interface LogRepository extends JpaRepository<Log, Integer> {
}
