package com.zhoukao.demomony.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "mony")
@Getter
@Setter
public class Mony {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "che",referencedColumnName = "cid",insertable = false,updatable = false)
    private Colum chess;
    private Integer che;
    private String erd;

    public Integer getChe() {
        return che;
    }

    public void setChe(Integer che) {
        this.che = che;
    }

    private String huib;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    private String huier;
    private String name;
    private String zhus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Colum getChess() {
        return chess;
    }

    public void setChess(Colum chess) {
        this.chess = chess;
    }

    public String getErd() {
        return erd;
    }

    public void setErd(String erd) {
        this.erd = erd;
    }

    public String getHuib() {
        return huib;
    }

    public void setHuib(String huib) {
        this.huib = huib;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getHuier() {
        return huier;
    }

    public void setHuier(String huier) {
        this.huier = huier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZhus() {
        return zhus;
    }

    public void setZhus(String zhus) {
        this.zhus = zhus;
    }

    @Override
    public String toString() {
        return "Mony{" +
                "id=" + id +
                ", erd='" + erd + '\'' +
                ", huib='" + huib + '\'' +
                ", birth=" + birth +
                ", huier='" + huier + '\'' +
                ", name='" + name + '\'' +
                ", zhus='" + zhus + '\'' +
                '}';
    }

}
