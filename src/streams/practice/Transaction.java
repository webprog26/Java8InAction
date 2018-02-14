/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams.practice;

/**
 *
 * @author webpr
 */
public class Transaction {
    
    private final long id;
    private final int value;
    private final String city;
    private final String traderName;
    private final int year;

    public Transaction(long id, int value, String city, String traderName, int year) {
        this.id = id;
        this.value = value;
        this.city = city;
        this.traderName = traderName;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    public String getCity() {
        return city;
    }

    public String getTraderName() {
        return traderName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(id)
                .append(" ")
                .append(value)
                .append(" ")
                .append(city)
                .append(" ")
                .append(traderName)
                .append(" ")
                .append(year).toString();
    }
    
    
}
