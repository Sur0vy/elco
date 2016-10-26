package com.Sur0vy.model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "developers")
public class Developer {

    @DatabaseField(columnName = "developer_id", generatedId = true, canBeNull = false)
    private int id;

    @DatabaseField(columnName = "developer_name", canBeNull = false, dataType = DataType.STRING)
    private String name;

    public Developer() {
    }

    public Developer(final int id, final String name) {
        this.id = id;
        this.name = name;
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
