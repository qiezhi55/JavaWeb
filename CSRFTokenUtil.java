package com.mooc.interceptor;

/**
 * Created by lj on 2017/6/2.
 */
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

public class CSRFTokenUtil {

    public static String generate(HttpServletRequest request) {

        return UUID.randomUUID().toString();
    }

}