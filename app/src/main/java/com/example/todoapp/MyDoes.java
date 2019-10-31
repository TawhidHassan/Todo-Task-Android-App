package com.example.todoapp;

public class MyDoes {
    String titledoes;
    String datedoes;
    String descodes;
    String keydoes;

    public MyDoes(){

    }

    public MyDoes(String titledoes, String datedoes, String descodes, String keydoes) {
        this.titledoes = titledoes;
        this.datedoes = datedoes;
        this.descodes = descodes;
        this.keydoes = keydoes;
    }

    public String getKeydoes() {
        return keydoes;
    }

    public void setKeydoes(String keydoes) {
        this.keydoes = keydoes;
    }

    public String getTitledoes() {
        return titledoes;
    }

    public void setTitledoes(String titledoes) {
        this.titledoes = titledoes;
    }

    public String getDatedoes() {
        return datedoes;
    }

    public void setDatedoes(String datedoes) {
        this.datedoes = datedoes;
    }

    public String getDescodes() {
        return descodes;
    }

    public void setDescodes(String descodes) {
        this.descodes = descodes;
    }
}
