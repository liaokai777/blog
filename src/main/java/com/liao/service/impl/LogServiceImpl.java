package com.liao.service.impl;

import com.liao.entity.Log;
import com.liao.repository.LogRepository;
import com.liao.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liao
 * <p>
 * 2018年4月18日
 */
@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogRepository logRepository;

    @Override
    public Integer saveLog(Log log) {
        return logRepository.save(log).getId();
    }
}
