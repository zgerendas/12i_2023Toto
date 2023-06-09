package com.company;

class EredmenyElemzo {
    private String eredmenyek;

    private int dontetlenekSzama() {
        return megszamol('X');
    }

    private int megszamol(char kimenet) {
        return (int) eredmenyek.chars().filter(ch -> ch == kimenet).count();
    }

    public boolean memvoltDontetlenMerkozes() {
        return dontetlenekSzama() == 0;
    }

    EredmenyElemzo(String eredmenyek) {
        this.eredmenyek = eredmenyek;
    }
}
