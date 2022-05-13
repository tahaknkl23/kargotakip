/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.KargoTipi;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class KargoTipiDAO extends DBConnection {

    public void create(KargoTipi c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "insert into kargotipi (kisi_adi,kargo_tipi,kargo_agirlik) values ('" + c.getKisiAdi() + "','" + c.getKargoTipi() + c.getKargoAgirlik() +   "')";
            st.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public void update(KargoTipi c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "insert into kargotipi (kisi_adi,kargo_tipi,kargo_agirlik) values ('" + c.getKisiAdi() + "','" + c.getKargoTipi() + c.getKargoAgirlik() +   "')";
            st.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public void delete(KargoTipi c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "delete from kargo where id=" + c.getId();
            st.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public List<KargoTipi> getList() {
        List<KargoTipi> list = new ArrayList<>();
        try {
            Statement st = this.getConnection().createStatement();
            String query = "select * from kargo";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                list.add(new KargoTipi(rs.getInt("id"), rs.getString("kargo_tipi"), rs.getString("kargo_agirlik")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
        return list;
    }

    public KargoTipi findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
