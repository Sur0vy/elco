package com.Sur0vy.model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "bills")
public class Bill {

    @DatabaseField(columnName = "bill_id", foreign = true, canBeNull = false)
    private Document document;

    @ForeignCollectionField//(columnName = "component_id")
    private ForeignCollection<Component> components;

    @DatabaseField(columnName = "components_count", canBeNull = false)
    private int count;

    public Bill() {
    }

    public Bill(final Document document) {
        this.document = document;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public ForeignCollection<Component> getComponents() {
        return components;
    }

    public void setComponent(ForeignCollection<Component> components) {
        this.components = components;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
