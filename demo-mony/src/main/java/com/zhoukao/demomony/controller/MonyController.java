package com.zhoukao.demomony.controller;

import com.zhoukao.demomony.entity.Colum;
import com.zhoukao.demomony.entity.Mony;
import com.zhoukao.demomony.service.MonyService;
import com.zhoukao.demomony.vo.MonyVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Api(tags = "接口所在的类")
@RestController
@RequestMapping("/mony/")
@CrossOrigin
public class MonyController {
    @Autowired
    MonyService monyService;

    /**
     * 列表分页模糊
     * @param mony
     * @return
     */
    @ApiOperation("查询所有的用户")
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public Page<Mony> getlist(MonyVo monyVo, @RequestParam(defaultValue = "1") Integer pageName,
                              @RequestParam(defaultValue = "2") Integer pagSize){
        return monyService.getlist(monyVo,pageName,pagSize);
    }

    /*@RequestMapping("findAll")
    public List<Mony> findAll(){
        return monyService.findAll();
    }*/
    /**
     * 添加修改
     * @param mony
     * @return
     */
    @ApiOperation("添加/修改用户信息")
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public Mony save(@RequestBody Mony mony){
        System.out.println(mony);
        return monyService.save(mony);
    }
    /**
     * 删除
     * @param mony
     * @return
     */
    @ApiOperation("对数据的多条删除")
    @RequestMapping(value = "delByid",method = RequestMethod.POST)
    public void delByid(@RequestBody List<Mony> ids){
         monyService.delByid(ids);
    }
    @ApiOperation("单条删除用户信息")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id",value = "删除的条件",dataType = "Integer")
    )
    @RequestMapping(name = "delete",method = RequestMethod.POST)
    public void deleyte(Integer id){
        monyService.delete(id);
    }
    /**
     * 查询合同
     * @param mony
     * @return
     */
    @ApiOperation("对合同表查询所有")
    @RequestMapping(value = "getColumlist",method = RequestMethod.GET)
    public List<Colum> getColumlist(){
        return monyService.getColumlist();
    }
    /**
     * 详情
     * @param mony
     * @return
     */
    @ApiOperation("根据条件查询用户信息")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "id",value = "查询的条件",dataType = "Integer")
    )
    @RequestMapping(value = "getByid",method = RequestMethod.GET)
    public Optional<Mony> getByid(Integer id){
       return monyService.getByid(id);
    }
}
