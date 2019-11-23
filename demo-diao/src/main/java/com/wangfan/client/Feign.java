package com.wangfan.client;

import com.zhoukao.demomony.entity.Colum;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "demo-mony")
public interface Feign {

    @RequestMapping("/mony/getColumlist")
    public List<Colum> getColumlist();
}
