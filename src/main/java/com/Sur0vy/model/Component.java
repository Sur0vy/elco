package com.Sur0vy.model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import com.Sur0vy.model.Group;

@DatabaseTable(tableName = "components")
public class Component {

    @DatabaseField(columnName = "component_id", id = true, generatedId = true, canBeNull = false)
    private int id;

    @DatabaseField(columnName = "group_id", canBeNull = false, foreign = true)
    private Group group;

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

    public Component() {
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(final Group group) {
        this.group = group;
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
