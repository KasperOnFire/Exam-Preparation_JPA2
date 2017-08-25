package entity;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class PaperBook extends Book implements Serializable {

    private double shippingWeight;
    private int inStock;

    public PaperBook() {
    }

    public PaperBook(double shippingWeight, int inStock) {
        this.shippingWeight = shippingWeight;
        this.inStock = inStock;
    }

    public double getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(double shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

}
