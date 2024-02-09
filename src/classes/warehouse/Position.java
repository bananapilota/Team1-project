package classes.warehouse;

import classes.interfaces.Searchable;
import classes.product.Product;

import java.util.Objects;

public class Position implements Searchable {
    private static int wid = 1;
    private String lot;
    private boolean Full = false;
    private Product product;
    private int quantity;

    public Position(int width, int height) {
        this.lot = constructLot(width, height);
        wid++;
    }

    public static int getWid() {
        return wid;
    }

    private String constructLot(int width, int height) {
        return width + "L" + height;
    }

    public String getLot() {
        return lot;
    }

    public boolean getFull() {
        return Full;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public void setFull(boolean full) {
        Full = full;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Position{" +
                "lot='" + lot + '\'' +
                ", isFull=" + Full +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}