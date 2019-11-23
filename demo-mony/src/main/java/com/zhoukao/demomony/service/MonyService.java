package com.zhoukao.demomony.service;

import com.zhoukao.demomony.entity.Colum;
import com.zhoukao.demomony.entity.Mony;
import com.zhoukao.demomony.vo.MonyVo;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface MonyService {
    Page<Mony> getlist(MonyVo monyVo, Integer pageName, Integer pagSize);

    Mony save(Mony mony);

    void delByid(List<Mony> ids);
    void  delete(Integer id);
    List<Colum> getColumlist();

    Optional<Mony> getByid(Integer id);
}
