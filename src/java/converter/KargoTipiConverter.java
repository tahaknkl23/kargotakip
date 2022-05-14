/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import dao.KargoTipiDAO;
import entity.KargoTipi;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;



@FacesConverter("kargotipiConverter")
public class KargoTipiConverter implements Converter {

    private KargoTipiDAO kargoDao;

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        int id = Integer.valueOf(string);
        KargoTipi k = this.getKargoTipiDao().findByID(id);
        return k;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object t) {
        KargoTipi k = (KargoTipi) t;
        return String.valueOf(k.getId());
    }

    public KargoTipiDAO getKargoTipiDao() {
        return kargoDao;
    }

    public void setKargoTipiDao(KargoTipiDAO kargoDao) {
        this.kargoDao = kargoDao;
    }


}