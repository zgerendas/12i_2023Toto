package com.company;

public class Fordulo {
    int ev;
    int het;
    int fordulo;
    int t13p1;
    int ny13p1;
    String eredmények;

    public Fordulo(int ev, int het, int fordulo, int t13p1, int ny13p1, String eredmények) {
        this.ev = ev;
        this.het = het;
        this.fordulo = fordulo;
        this.t13p1 = t13p1;
        this.ny13p1 = ny13p1;
        this.eredmények = eredmények;
    }
    public Fordulo(String sor ) {
        String[] bontva = sor.split(";");
        this.ev = Integer.parseInt(bontva[0]);
        this.het = Integer.parseInt(bontva[1]);
        this.fordulo = Integer.parseInt(bontva[2]);
        this.t13p1 = Integer.parseInt(bontva[3]);
        this.ny13p1 = Integer.parseInt(bontva[4]);
        this.eredmények = bontva[5];
    }

    @Override
    public String toString() {
        return "Fordulo{" +
                "ev=" + ev +
                ", het=" + het +
                ", fordulo=" + fordulo +
                ", t13p1=" + t13p1 +
                ", ny13p1=" + ny13p1 +
                ", eredmények='" + eredmények + '\'' +
                '}';
    }
}





