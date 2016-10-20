package com.Sur0vy.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "developers")
public class developers {

    @DatabaseField(columnName = "developer_id", id = true, generatedId = true)
    private int id;

    @DatabaseField(columnName = "developer_name")
    private String name;

    public developers() {
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
