package com.zhoukao.demomony.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "colum")
@Getter
@Setter
public class Colum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;
    private String cbian;
    private String ckehu;
    private String cer;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCbian() {
        return cbian;
    }

    public void setCbian(String cbian) {
        this.cbian = cbian;
    }

    public String getCkehu() {
        return ckehu;
    }

    public void setCkehu(String ckehu) {
        this.ckehu = ckehu;
    }

    public String getCer() {
        return cer;
    }

    public void setCer(String cer) {
        this.cer = cer;
    }

    @Override
    public String toString() {
        return "Colum{" +
                "cid=" + cid +
                ", cbian='" + cbian + '\'' +
                ", ckehu='" + ckehu + '\'' +
                ", cer='" + cer + '\'' +
                '}';
    }
}
