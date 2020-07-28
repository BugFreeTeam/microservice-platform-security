package com.mall.security.security;

import com.anjuxing.platform.common.base.JsonResult;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RestfulAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {
        JsonResult jsonResult=new JsonResult();
        jsonResult.setMessage("该用户权限不足，请联系管理员"+e.getMessage());
        jsonResult.setResult(JsonResult.FAILURE);
        jsonResult.setCode("403");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(jsonResult);
        response.getWriter().flush();
    }
}
