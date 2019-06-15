package com.sda.tallinn6.advancedFeatures.genericTypes;

public class GenericBox <T>{

    private T item;

    public GenericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
