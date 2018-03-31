package com.py.dubbo.demo.provider;

import java.util.ArrayList;
import java.util.List;
import com.py.dubbo.demo.api.DemoService;

/**
 * Created by Administrator on 3/28/2018.
 */
public class DemoServiceImpl implements DemoService {
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}