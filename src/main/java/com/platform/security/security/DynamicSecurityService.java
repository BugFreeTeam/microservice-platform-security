package com.platform.security.security;

import com.anjuxing.platform.common.exception.ServiceException;
import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

public interface DynamicSecurityService {
    /**
     * 加载资源ANT通配符和资源对应MAP
     */
    Map<String, ConfigAttribute> loadDataSource() throws ServiceException;
}
