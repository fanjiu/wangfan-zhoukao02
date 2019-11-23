package com.zhoukao.demomony.service;

import com.zhoukao.demomony.dao.ColumDao;
import com.zhoukao.demomony.dao.MonyDao;
import com.zhoukao.demomony.entity.Colum;
import com.zhoukao.demomony.entity.Mony;
import com.zhoukao.demomony.vo.MonyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MonyServiceImpl implements MonyService {

    @Autowired
    MonyDao monyDao;
    @Autowired
    ColumDao columDao;

    /**
     * 列表
     * @param mony
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public Page<Mony> getlist(MonyVo monyVo, Integer pageName, Integer pagSize) {
        //分页
        PageRequest pageRequest= PageRequest.of(pageName-1,pagSize);
        Specification<Mony> spec = new Specification<Mony>() {
            @Override
            public Predicate toPredicate(Root<Mony> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cd) {
                List<Predicate> list=new ArrayList<>();
                if(monyVo.getYukuan()!=null){
                    Predicate p1 = cd.like(root.get("erd"),"%"+monyVo.getYukuan()+"%");
                    list.add(p1);
                }
                if(monyVo.getXingming()!=null){
                    Predicate p2 = cd.like(root.get("name"),"%"+monyVo.getXingming()+"%");
                    list.add(p2);
                }
                if(monyVo.getHuikuan()!=null){
                    Predicate p3 = cd.like(root.get("huier"),"%"+monyVo.getHuikuan()+"%");
                    list.add(p3);
                }
                if(monyVo.getStartData()!=null){
                    Predicate p5 = cd.greaterThanOrEqualTo(root.get("birth"),monyVo.getStartData());
                    list.add(p5);
                }
                if(monyVo.getEndData()!=null){
                    Predicate p6 = cd.lessThanOrEqualTo(root.get("birth"),monyVo.getEndData());
                    list.add(p6);
                }
                if(monyVo.getBeizhu()!=null){
                    Predicate p4 = cd.like(root.get("zhus"),"%"+monyVo.getBeizhu()+"%");
                    list.add(p4);
                }
                Predicate[] arr=list.toArray(new Predicate[list.size()]);
                return cd.and(arr);
            }
        };
        return monyDao.findAll(spec,pageRequest);
    }

    /**
     * 添加修改
     * @param mony
     * @return
     */
    @Override
    public Mony save(Mony mony) {
        if(mony.getId()==null){
            mony.setBirth(new Date());
            return monyDao.save(mony);
        }else{
            return monyDao.save(mony);
        }
    }

    /**
     * 删除
     * @param ids
     * @param id
     * @return
     */
    @Override
    public void delByid(List<Mony> ids) {
         monyDao.deleteAll(ids);
    }

    /**
     * 合同
     * @return
     */
    @Override
    public List<Colum> getColumlist() {
        return columDao.findAll();
    }

    @Override
    public Optional<Mony> getByid(Integer id) {
       return monyDao.findById(id);
    }

    @Override
    public void delete(Integer id) {
        monyDao.deleteById(id);
    }
}
