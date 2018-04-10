package com.vigekoo.common.utils;

import java.util.UUID;

/**
 * @Description:
 * @Author: 990016
 * @Date 2018/4/9 18:59
 */
public class GenerateGUIDUtils {
    /**
     * 产生UUID
     */
    public static final String generateGUID()
    {
        UUID uuid= UUID.randomUUID();
        return uuid.toString();
    }
}
