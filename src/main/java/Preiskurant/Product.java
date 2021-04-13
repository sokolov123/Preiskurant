package Preiskurant;

import java.util.Objects;

public class Product {
    private String prodName = "";
    private String prodKey = "";
    private int rubCost;
    private int kopecksCost;

    public Product(String prodName, String prodKey, int rubCost, int kopecksCost) {
        if (prodName != null && prodKey != null && rubCost >= 0 && kopecksCost >= 0) {
            this.prodName = prodName;
            this.prodKey = prodKey;
            this.rubCost = rubCost;
            this.kopecksCost = kopecksCost;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getProdName().equals(product.getProdName()) &&
                 getProdKey().equals(product.getProdKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProdName(), getProdKey(), getRubCost(), getKopecksCost());
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodName='" + prodName + '\'' +
                ", prodKey='" + prodKey + '\'' +
                ", rubCost=" + rubCost +
                ", kopecksCost=" + kopecksCost +
                '}';
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdKey() {
        return prodKey;
    }

    public void setProdKey(String prodKey) {
        this.prodKey = prodKey;
    }

    public int getRubCost() {
        return rubCost;
    }

    public void setRubCost(int rubCost) {
        this.rubCost = rubCost;
    }

    public int getKopecksCost() {
        return kopecksCost;
    }

    public void setKopecksCost(int kopecksCost) {
        this.kopecksCost = kopecksCost;
    }


}
