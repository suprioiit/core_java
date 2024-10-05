package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    private int itemId ;
    private String name ;
    private int qunatity ;
    private double price ;


    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQunatity(int qunatity) {
        this.qunatity = qunatity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public int getQunatity() {
        return qunatity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
