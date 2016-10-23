package com.Sur0vy.model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "components")
public class component {

    @DatabaseField(columnName = "component_id", id = true, generatedId = true, canBeNull = false)
    private int id;

    @DatabaseField(columnName = "group_id", canBeNull = false, foreign = true)
    private int groupId;

    @DatabaseField(columnName = "component_name", canBeNull = false, dataType = DataType.STRING)
    private String name;

    @DatabaseField(columnName = "component_size", dataType = DataType.STRING)
    private String size;

    @DatabaseField(columnName = "component_feature", dataType = DataType.STRING)
    private String feature;

    @DatabaseField(columnName = "component_vendor", canBeNull = false, dataType = DataType.STRING)
    private String componentVendor;

    @DatabaseField(columnName = "component_analogue", dataType = DataType.STRING)
    private int analogId;

    public component() {
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(final int groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(final String size) {
        this.size = size;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getComponentVendor() {
        return componentVendor;
    }

    public void setComponentVendor(final String componentVendor) {
        this.componentVendor = componentVendor;
    }

    public int getAnalogId() {
        return analogId;
    }

    public void setAnalogId(final int analogId) {
        this.analogId = analogId;
    }
}
