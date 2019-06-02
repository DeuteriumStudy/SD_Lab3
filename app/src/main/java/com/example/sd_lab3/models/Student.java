package com.example.sd_lab3.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import java.util.Date;

@Entity
public class Student {

    @PrimaryKey
    private long id;

    private String fullName;

    private Date addDate;
}
