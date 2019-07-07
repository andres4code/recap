package com.sda.tallinn6.evgenii.personManagement;

public class Developer extends Person {

    private Integer expInMonth;

    public Developer(){
    }

    public Developer(Integer expInMonth) {
        this.expInMonth = expInMonth;
    }

    public Integer getExpInMonth() {
        return expInMonth;
    }

    public void setExpInMonth(Integer expInMonth){
       this.expInMonth = expInMonth;
    }


}
