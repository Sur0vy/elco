package com.Sur0vy.model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "organizations")
public class organization {

    @DatabaseField(columnName = "organization_id", id = true, generatedId = true, canBeNull = false)
    private int id;

    @DatabaseField(columnName = "organization_name", canBeNull = false, dataType = DataType.STRING)
    private String Name;

    public organization() {
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(final String name) {
        Name = name;
    }
}
