/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.KargoTipi;
import entity.KisiAdresBilgisi;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class KisiAdresBilgisiDAO extends DBConnection {

    private KargoDAO kisiAdresBilgisiDao;

        public KisiAdresBilgisi findByID(int id) {
        KisiAdresBilgisi a = null;

        try {
            Statement st = this.getConnection().createStatement();
            String query = "select * from KisiAdresBilgisi where id=" + id;
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                a = new KisiAdresBilgisi(rs.getInt("id"), rs.getInt("mah_posta_kodu"), rs.getInt("sokak_no"), rs.getInt("bina_no"), rs.getInt("daire_no"));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
        return a;
    }


    public void create(KisiAdresBilgisi c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "insert into KisiAdresBilgisi (mah_posta_kodu,sokak_no,bina_no,daire_no) values ('" + c.getMahPostaKod() + "','" + c.getSokakNo() + "','" + c.getBinaNo() + "','" + c.getDaireNo() + "')";
            st.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }
    public void update(KisiAdresBilgisi c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "insert into KisiAdresBilgisi (mah_posta_kodu,sokak_no,bina_no,daire_no) values ('" + c.getMahPostaKod() + "','" + c.getSokakNo() + "','" + c.getBinaNo() + "','" + c.getDaireNo() + "')";
            st.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public void delete(KisiAdresBilgisi c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "delete from kargo where id=" + c.getId();
            st.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public List<KisiAdresBilgisi> getList() {
        List<KisiAdresBilgisi> list = new ArrayList<>();
        try {
            Statement st = this.getConnection().createStatement();
            String query = "select * from kargo";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                list.add(new KisiAdresBilgisi(rs.getInt("id"), rs.getInt("mah_posta_kod"), rs.getInt("sokak_no"), rs.getInt("bina_no"), rs.getInt("daire_no")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
        return list;
    }

    public KargoDAO getKisiAdresBilgisiDao() {
        return kisiAdresBilgisiDao;

    }

    public void setKisiAdresBilgisiDao(KargoDAO kisiAdresBilgisiDao) {
        this.kisiAdresBilgisiDao = kisiAdresBilgisiDao;
    }


}
