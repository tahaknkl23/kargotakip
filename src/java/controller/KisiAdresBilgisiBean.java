package controller;

import dao.KisiAdresBilgisiDAO;
import entity.KisiAdresBilgisi;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;


@Named(value = "kisiadresbilgisiBean")
@SessionScoped
public class KisiAdresBilgisiBean implements Serializable {

    private KisiAdresBilgisi entity;
    private KisiAdresBilgisiDAO dao;
    private List<KisiAdresBilgisi> list;

    public KisiAdresBilgisiBean() {
    }

    public void create() {
        this.getDao().create(entity);
        entity = new KisiAdresBilgisi();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new KisiAdresBilgisi();
    }

    public void delete(KisiAdresBilgisi c) {
        this.getDao().delete(c);
        entity = new KisiAdresBilgisi();
    }

    public void clear() {
        entity = new KisiAdresBilgisi();
    }

    public KisiAdresBilgisi getEntity() {
        return entity;
    }

    public void setEntity(KisiAdresBilgisi entity) {
        this.entity = entity;
    }

    public KisiAdresBilgisiDAO getDao() {
        return dao;
    }

    public void setDao(KisiAdresBilgisiDAO dao) {
        this.dao = dao;
    }

    public List<KisiAdresBilgisi> getList() {
        return list;
    }

    public void setList(List<KisiAdresBilgisi> list) {
        this.list = list;
    }



}