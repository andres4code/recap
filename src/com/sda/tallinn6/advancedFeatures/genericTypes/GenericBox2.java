package com.sda.tallinn6.advancedFeatures.genericTypes;

import com.sda.tallinn6.advancedFeatures.inheritance.Shape;

public class GenericBox2<T extends Shape>{

    private T item;

    public GenericBox2(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
