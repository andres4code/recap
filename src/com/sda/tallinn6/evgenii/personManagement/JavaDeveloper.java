package com.sda.tallinn6.evgenii.personManagement;

import java.util.List;
import java.util.Map;

public class JavaDeveloper extends Developer {

    private List<Framework> frameworks;
    private Map<Framework, Integer> expWithFrameworks;

    public JavaDeveloper(Map<Framework, Integer> expWithFrameworks) {
        this.expWithFrameworks = expWithFrameworks;
    }

    public JavaDeveloper(Integer expInMonth, Map<Framework, Integer> expWithFrameworks) {
        super(expInMonth);
        this.expWithFrameworks = expWithFrameworks;
    }

    public JavaDeveloper() {//it is invisible super
    }
}
