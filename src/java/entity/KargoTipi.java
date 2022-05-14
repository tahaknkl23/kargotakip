/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;



public class KargoTipi {

    private int id;

    private String kisiAdi;
    private String kargoTipi;
    private String kargoAgirlik;


    public KargoTipi() {

    }

    public KargoTipi(int id, String kisiAdi, String kargoTipi, String kargoAgirlik) {
        this.id = id;
        this.kargoTipi = kargoTipi;
        this.kargoAgirlik = kargoAgirlik;

    }

    public KargoTipi(int aInt, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public KargoTipi(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKisiAdi() {
        return kisiAdi;
    }

    public void setKisiAdi(String kisiAdi) {
        this.kisiAdi = kisiAdi;
    }

    public String getKargoTipi() {
        return kargoTipi;
    }

    public void setKargoTipi(String kargoTipi) {
        this.kargoTipi = kargoTipi;
    }

    public String getKargoAgirlik() {
        return kargoAgirlik;
    }

    public void setKargoAgirlik(String kargoAgirlik) {
        this.kargoAgirlik = kargoAgirlik;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KargoTipi other = (KargoTipi) obj;
        return this.id == other.id;
    }
}
