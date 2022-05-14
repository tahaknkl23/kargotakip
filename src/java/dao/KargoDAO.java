/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Kargo;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class KargoDAO extends DBConnection {


    public void create(Kargo c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "insert into kargo (verilis_tarihi,tahmini_teslim_tarihi) values ('" + c.getVerilisTarihi() + "','" + c.getTahminiTeslimTarihi() + "')";
            st.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public void update(Kargo c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "insert into kargo (id,verilis_tarihi,tahmini_teslim_tarihi) values ('" + c.getVerilisTarihi() + "','" + c.getTahminiTeslimTarihi() + "')";
            st.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }
    public void delete(Kargo c) {
        try {
            Statement st = this.getConnection().createStatement();
            String query = "delete from kargo where id=" + c.getId();
            st.executeUpdate(query);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public List<Kargo> getList() {
        List<Kargo> list = new ArrayList<>();
        try {
            Statement st = this.getConnection().createStatement();
            String query = "select * from kargo";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                list.add(new Kargo(rs.getInt("id"), rs.getDate("verilis_tarihi"), rs.getDate("tahmini_teslim_tarihi")));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
        return list;
    }

    public Kargo findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
