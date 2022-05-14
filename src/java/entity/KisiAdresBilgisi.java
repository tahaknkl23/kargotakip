/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class KisiAdresBilgisi {

    private int id;

    private int mahPostaKod;
    private int sokakNo;
    private int binaNo;
    private int daireNo;


    public KisiAdresBilgisi() {
    }


    public KisiAdresBilgisi(int id, int mahPostaKod, int sokakNo, int binaNo, int daireNo) {
        this.id = id;
        this.mahPostaKod = mahPostaKod;
        this.sokakNo = sokakNo;
        this.binaNo = binaNo;
        this.daireNo = daireNo;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMahPostaKod() {
        return mahPostaKod;
    }

    public void setMahPostaKod(int mahPostaKod) {
        this.mahPostaKod = mahPostaKod;
    }

    public int getSokakNo() {
        return sokakNo;
    }

    public void setSokakNo(int sokakNo) {
        this.sokakNo = sokakNo;
    }

    public int getBinaNo() {
        return binaNo;
    }

    public void setBinaNo(int binaNo) {
        this.binaNo = binaNo;
    }

    public int getDaireNo() {
        return daireNo;
    }

    public void setDaireNo(int daireNo) {
        this.daireNo = daireNo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
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
        final KisiAdresBilgisi other = (KisiAdresBilgisi) obj;
        return this.id == other.id;
    }
}
