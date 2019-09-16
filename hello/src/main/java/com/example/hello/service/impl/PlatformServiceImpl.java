package com.example.hello.service.impl;

import com.example.hello.mapper.PlatformMapper;
import com.example.hello.service.PlatformService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class PlatformServiceImpl  implements PlatformService {
    @Resource
    private PlatformMapper mapper;
    public Map<String, Object> selectAll() {
        return mapper.selectAll();
    }
}
