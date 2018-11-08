package com.liao.common.util;

import org.apache.shiro.SecurityUtils;

import com.liao.common.constant.Base;
import com.liao.entity.User;

/**
 * @author liao
 * <p>
 * 2018年1月25日
 */
public class UserUtils {

    public static User getCurrentUser() {
        User user = (User) SecurityUtils.getSubject().getSession().getAttribute(Base.CURRENT_USER);
        return user;
    }
}
