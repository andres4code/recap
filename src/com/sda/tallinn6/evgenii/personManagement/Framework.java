package com.sda.tallinn6.evgenii.personManagement;

public class Framework {
    private String name;
    private Double version;

    public Framework(String name, Double version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }


}
