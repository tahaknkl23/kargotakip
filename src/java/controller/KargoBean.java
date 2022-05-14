package controller;

import dao.KargoDAO;
import entity.Kargo;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;


@Named(value = "kargoBean")
@SessionScoped
public class KargoBean implements Serializable {


    private Kargo entity;
    private KargoDAO dao;
    private List<Kargo> list;

    public KargoBean() {
    }

    public void create() {
        this.getDao().create(entity);
        entity = new Kargo();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new Kargo();
    }

    public void delete(Kargo c) {
        this.getDao().delete(c);
        entity = new Kargo();
    }

    public void clear() {
        entity = new Kargo();
    }

    public Kargo getEntity() {
        if (this.entity == null) {
            this.entity = new Kargo();
        }
        return entity;
    }

    public void setEntity(Kargo entity) {
        this.entity = entity;
    }

    public KargoDAO getDao() {
        if (this.dao == null) {
            this.dao = new KargoDAO();
        }
        return dao;
    }

    public void setDao(KargoDAO dao) {
        this.dao = dao;
    }

    public List<Kargo> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<Kargo> list) {
        this.list = list;
    }
}