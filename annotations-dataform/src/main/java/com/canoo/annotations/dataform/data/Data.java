package com.canoo.annotations.dataform.data;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private String name;

    private String description;

    private final List<DataAttribute> attributes = new ArrayList<DataAttribute>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<DataAttribute> getAttributes() {
        return attributes;
    }
}
