/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import dao.KargoDAO;
import entity.Kargo;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;


@FacesConverter("kargoConverter")
public class KargoConverter implements Converter {

    private KargoDAO kargoDao;

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        int id = Integer.valueOf(string);
        Kargo k = this.getKargoDao().findByID(id);
        return k;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        Kargo k = (Kargo) t;
        return String.valueOf(k.getId());
    }

    public KargoDAO getKargoDao() {
        return kargoDao;
    }

    public void setKargoDao(KargoDAO kargoDao) {
        this.kargoDao = kargoDao;
    }

    
}
