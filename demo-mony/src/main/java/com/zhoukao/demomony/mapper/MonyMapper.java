package com.zhoukao.demomony.mapper;

import com.zhoukao.demomony.entity.Colum;
import com.zhoukao.demomony.entity.Mony;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper
@Component
public interface MonyMapper {
   /* //列表
    List<Mony> getlist(@Param("mony") Mony mony);
//添加
    int insert(@Param("mony") Mony mony);
//修改
    int update(@Param("mony") Mony mony);
//删除
    @Delete("delete from mony where id in (${ids})")
    int delBy(String ids);*/


}
