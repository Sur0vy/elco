package com.Sur0vy.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(vendors)
public class vendors {

    @DatabaseField(columnName = 'vendor_id', id = true, generatedId = true)
    private int id;

    @DatabaseField(columnName = "vendor_name")
    private String name;

    public vendors() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
