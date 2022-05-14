package controller;

import dao.KargoTipiDAO;
import entity.KargoTipi;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;


@Named(value = "kargotipiBean")
@SessionScoped
public class KargoTipiBean implements Serializable {



    private KargoTipi entity;
    private KargoTipiDAO dao;
    private List<KargoTipi> list;

    public KargoTipiBean() {
    }

    public void create() {
        this.getDao().create(entity);
        entity = new KargoTipi();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new KargoTipi();
    }

    public void delete(KargoTipi c) {
        this.getDao().delete(c);
        entity = new KargoTipi();
    }

    public void clear() {
        entity = new KargoTipi();
    }

    public KargoTipi getEntity() {
        return entity;
    }

    public void setEntity(KargoTipi entity) {
        this.entity = entity;
    }

    public KargoTipiDAO getDao() {
        return dao;
    }

    public void setDao(KargoTipiDAO dao) {
        this.dao = dao;
    }

    public List<KargoTipi> getList() {
        return list;
    }

    public void setList(List<KargoTipi> list) {
        this.list = list;
    }



}