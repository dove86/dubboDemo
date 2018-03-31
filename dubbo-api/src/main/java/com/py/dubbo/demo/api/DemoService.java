package com.py.dubbo.demo.api;

import java.util.List;

/**
 * Created by Administrator on 3/28/2018.
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}