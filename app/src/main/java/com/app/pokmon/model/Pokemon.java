package com.app.pokmon.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by Lobna Babker on 12/8/2022.
 */
@Entity(tableName = "fav_table")
public class Pokemon {
    @PrimaryKey(autoGenerate = true)
    private int id;
    String name;
    String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
