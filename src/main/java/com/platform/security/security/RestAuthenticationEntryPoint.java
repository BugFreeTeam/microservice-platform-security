package com.platform.security.security;

import com.platform.security.common.JsonResult;
import com.platform.security.utils.JsonUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 未登录自定义全局处理
 */
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        JsonResult jsonResult=new JsonResult();
        jsonResult.setMessage("该用户未登录，请登录!");
        jsonResult.setResult(JsonResult.FAILURE);
        jsonResult.setCode("401");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(JsonUtils.beanToJson(jsonResult));
        response.getWriter().flush();
    }
}
