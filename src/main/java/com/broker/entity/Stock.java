package com.broker.entity;

import lombok.*;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@NoArgsConstructor
@Data
@ToString()
@EqualsAndHashCode()
public class Stock implements Serializable {
    private static final String DATE_FORMAT = "MMM dd yyyy HH:mm:ss";
    private String code;
    private double price;
    private Date date = new Date();

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private DateFormat dateFormat =
            new SimpleDateFormat(DATE_FORMAT);

    public Stock(String code, Double price){
        this.code = code;
        this.price = price;
    }

    public String getDate(){
        return dateFormat.format(date);
    }
}
