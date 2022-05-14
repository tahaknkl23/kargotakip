/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import dao.KisiAdresBilgisiDAO;
import entity.KisiAdresBilgisi;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;



@FacesConverter("kisiadresbilgisiConverter")
public class KisiAdresBilgisiConverter implements Converter {

    private KisiAdresBilgisiDAO kargoDao;

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        int id = Integer.valueOf(string);
        KisiAdresBilgisi k = this.getKisiAdresBilgisiDao().findByID(id);
        return k;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        KisiAdresBilgisi k = (KisiAdresBilgisi) t;
        return String.valueOf(k.getId());
    }

    public KisiAdresBilgisiDAO getKisiAdresBilgisiDao() {
        return kargoDao;
    }

    public void setKisiAdresBilgisiDao(KisiAdresBilgisiDAO kargoDao) {

        this.kargoDao = kargoDao;
    }


}
