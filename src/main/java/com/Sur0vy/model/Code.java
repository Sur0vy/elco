package com.Sur0vy.model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "codes")
public class Code {

    @DatabaseField(columnName = "code_id", id = true, canBeNull = false)
    private String id;

    @DatabaseField(columnName = "code_comment", dataType = DataType.STRING)
    private String comment;

    public Code() {
    }

    public Code(final String id, final String comment){
        this.id = id;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }
}
