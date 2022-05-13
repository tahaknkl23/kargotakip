/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

public class Kargo {

    private int id;

    private Date verilisTarihi;
    private Date tahminiTeslimTarihi;
    

    public Kargo() {
    }

    public Kargo(int id, Date verilisTarihi, Date tahminiTeslimTarihi) {
        this.id = id;
        this.verilisTarihi = verilisTarihi;
        this.tahminiTeslimTarihi = tahminiTeslimTarihi;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getVerilisTarihi() {
        return verilisTarihi;
    }

    public void setVerilisTarihi(Date verilisTarihi) {
        this.verilisTarihi = verilisTarihi;
    }

    public Date getTahminiTeslimTarihi() {
        return tahminiTeslimTarihi;
    }

    public void setTahminiTeslimTarihi(Date tahminiTeslimTarihi) {
        this.tahminiTeslimTarihi = tahminiTeslimTarihi;
    }


}
