package com.wangfan.controller;

import com.wangfan.client.Feign;
import com.zhoukao.demomony.entity.Colum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feigngs")
public class FeignController {
    @Autowired
    private Feign feign;

    @RequestMapping("/colum")
    public List<Colum> getColum(){
        return feign.getColumlist();
    }
}
