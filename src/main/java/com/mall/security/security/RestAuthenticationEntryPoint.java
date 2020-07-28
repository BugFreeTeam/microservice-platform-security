package com.mall.security.security;

import com.anjuxing.platform.common.base.JsonResult;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        JsonResult jsonResult=new JsonResult();
        jsonResult.setMessage("该用户未登录，请登录"+authException.getMessage());
        jsonResult.setResult(JsonResult.FAILURE);
        jsonResult.setCode("401");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(jsonResult);
        response.getWriter().flush();
    }
}
