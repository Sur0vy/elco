package com.Sur0vy.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "bills")
public class Bill {

    @DatabaseField(columnName = "bill_id", foreign = true, canBeNull = false)
    private Bill bill;

    @DatabaseField(columnName = "component_id", foreign = true, canBeNull = false)
    private Component component;

    @DatabaseField(columnName = "components_count", canBeNull = false)
    private int count;

    public Bill() {
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
