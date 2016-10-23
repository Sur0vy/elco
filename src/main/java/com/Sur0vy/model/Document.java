package com.Sur0vy.model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "Documents")
public class Document {

    @DatabaseField(columnName = "bill_id", generatedId = true, canBeNull = false)
    private int id;

    @DatabaseField(columnName = "bill_Number", canBeNull = false, unique = true)
    private int number;

    @DatabaseField(columnName = "bill_date", canBeNull = false, dataType = DataType.DATE)
    private Date date;

    @DatabaseField(columnName = "vendor_id", foreign = true, canBeNull = false)
    private Vendor vendor;

    @DatabaseField(columnName = "waybill_number")
    private int waybillNumber;

    @DatabaseField(columnName = "waybill_date", dataType = DataType.DATE)
    private Date waybillDate;

    @DatabaseField(columnName = "invoice_number")
    private int invoceNumber;

    @DatabaseField(columnName = "invoice_date", dataType = DataType.DATE)
    private Date invoceDate;

    @DatabaseField(columnName = "developer_id", foreign = true, canBeNull = false)
    private Developer developer;

    @DatabaseField(columnName = "code_id", foreign = true, canBeNull = false)
    private Code code;

    @DatabaseField(columnName = "organization_id", foreign = true, canBeNull = false)
    private Organization paidOrganization;

    public Document() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public int getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(int waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public Date getWaybillDate() {
        return waybillDate;
    }

    public void setWaybillDate(Date waybillDate) {
        this.waybillDate = waybillDate;
    }

    public int getInvoceNumber() {
        return invoceNumber;
    }

    public void setInvoceNumber(int invoceNumber) {
        this.invoceNumber = invoceNumber;
    }

    public Date getInvoceDate() {
        return invoceDate;
    }

    public void setInvoceDate(Date invoceDate) {
        this.invoceDate = invoceDate;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public Organization getPaidOrganization() {
        return paidOrganization;
    }

    public void setPaidOrganization(Organization paidOrganization) {
        this.paidOrganization = paidOrganization;
    }
}
