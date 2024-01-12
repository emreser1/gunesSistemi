package org.example;

public class Gezegen {
    private int siralamaNumarası;
    private long uzaklık;
    private double yarıçap;
    private double dönmeSüresi;

    public Gezegen(int siralamaNumarası, long uzaklık, double yarıçap, double dönmeSüresi) {
        this.siralamaNumarası = siralamaNumarası;
        this.uzaklık = uzaklık;
        this.yarıçap = yarıçap;
        this.dönmeSüresi = dönmeSüresi;
    }

    public int getSiralamaNumarası() {
        return siralamaNumarası;
    }

    public void setSiralamaNumarası(int siralamaNumarası) {
        this.siralamaNumarası = siralamaNumarası;
    }

    public double getUzaklık() {
        return uzaklık;
    }

    public void setUzaklık(long uzaklık) {
        this.uzaklık = uzaklık;
    }

    public double getYarıçap() {
        return yarıçap;
    }

    public void setYarıçap(double yarıçap) {
        this.yarıçap = yarıçap;
    }

    public double getDönmeSüresi() {
        return dönmeSüresi;
    }

    public void setDönmeSüresi(double dönmeSüresi) {
        this.dönmeSüresi = dönmeSüresi;
    }

    @Override
    public String toString() {
        return "Gezegen{" + "sıralamaNumarası=" + siralamaNumarası + ", uzaklık=" + uzaklık + ", yarıçap=" + yarıçap + ", dönmeSüresi=" + dönmeSüresi + '}';
    }
}