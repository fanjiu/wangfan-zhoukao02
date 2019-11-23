package com.zhoukao.demomony.dao;

import com.zhoukao.demomony.entity.Colum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ColumDao extends JpaRepository<Colum,Integer>, JpaSpecificationExecutor<Colum> {
}
