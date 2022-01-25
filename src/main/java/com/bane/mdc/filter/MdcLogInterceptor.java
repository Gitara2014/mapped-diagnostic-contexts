package com.bane.mdc.filter;

import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

public class MdcLogInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        UUID uuid = UUID.randomUUID();
        MDC.clear();
        MDC.put("requestId", uuid.toString());
        return true;
    }
}
