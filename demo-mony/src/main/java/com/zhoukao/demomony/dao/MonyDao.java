package com.zhoukao.demomony.dao;

import com.zhoukao.demomony.entity.Mony;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MonyDao extends JpaRepository<Mony,Integer>, JpaSpecificationExecutor<Mony> {
}
