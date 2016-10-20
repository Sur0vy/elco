package com.Sur0vy.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "codes")
public class codes {

    @DatabaseField(columnName = "code_id", id = true)
    private String id;

    @DatabaseField(columnName = "code_comment")
    private String comment;

    public codes(String id) {
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
