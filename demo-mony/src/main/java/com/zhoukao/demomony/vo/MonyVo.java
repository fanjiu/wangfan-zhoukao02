package com.zhoukao.demomony.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class MonyVo implements Serializable {

    private String yukuan;   //余款
    private String xingming;  //姓名
    private String huikuan;    //回款
    private Date startData;  //开始日期
    private Date endData;   //截止日期
    private String beizhu;    //备注

    public String getYukuan() {
        return yukuan;
    }

    public void setYukuan(String yukuan) {
        this.yukuan = yukuan;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getHuikuan() {
        return huikuan;
    }

    public void setHuikuan(String huikuan) {
        this.huikuan = huikuan;
    }

    public Date getStartData() {
        return startData;
    }

    public void setStartData(Date startData) {
        this.startData = startData;
    }

    public Date getEndData() {
        return endData;
    }

    public void setEndData(Date endData) {
        this.endData = endData;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}
