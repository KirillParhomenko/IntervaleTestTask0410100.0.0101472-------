package com.intervale.project.app;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class PrintedProduct {
    private int id;
    private String name;
    private String type;
    private Date dater;
    private String author;
    private String publishingHouse;

    public PrintedProduct() {
    }

    public PrintedProduct(int id, String type, Date dater, String author, String publishingHouse) {
        this.id = id;
        this.type = type;
        this.dater = dater;
        this.author = author;
        this.publishingHouse = publishingHouse;
    }

    public static Date parseDate(String date){
        try{
            return new Date(new SimpleDateFormat("yyyy-MM-dd").parse(date).getTime());
        }catch (ParseException e){
            throw new IllegalArgumentException(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDater(Date dater) {
        this.dater = dater;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDater() {
        return dater;
    }

    public void setDater(String date) {
        this.dater = parseDate(date);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", dateRealise=" + dater +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
