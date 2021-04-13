package Preiskurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Preis {
    private final List<Product> products = new ArrayList<>();

    public Preis(List<Product> product){
        if (product != null) {
            products.addAll(product);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Preis)) return false;
        Preis preis = (Preis) o;
        return products.equals(preis.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "Preis{" +
                "products=" + products +
                '}';
    }

    public boolean addProduct(Product product) { // метод который вот добавляет
        for (Product it: this.products) {
            if (it.equals(product)) {
                return false; // если продукт уже существует в списке
            }
        }
        this.products.add(product);
        return true;
    }

    public boolean delProduct(Product product) { //удаляет
        for (Product it: this.products) {
            if (it.equals(product)) {
                this.products.remove(it);
                return true;
            }
        }
        return false;
    }

    public boolean changeCostProduct(Product product, int rubCost, int kopecksCost) { // меняет цену товара
        for (Product it: this.products) {
            if (it.equals(product)) {
                it.setRubCost(rubCost);
                it.setKopecksCost(kopecksCost);
                return true;
            }
        }
        return false;
    }

    public boolean changeNameProduct(Product product, String prodName) { //меняет имя продукта
        for (Product it: this.products) {
            if (it.equals(product)) {
                it.setProdName(prodName);
                return true;
            }
        }
        return false;
    }

    public String findProduct(String prodKey, int quantity) { // определение цены покупки по коду и количеству экземпляров
        for (Product it: this.products) {
            if (it.getProdKey().equals(prodKey)) {
                double a = it.getRubCost() * 1.0;
                double b = it.getKopecksCost() / 100.0;
                return "цена по коду: " +(a + b)+ " по колическиву экземпляров ("+quantity+") цена покупки равна: "+(a + b) * quantity;
            }
        }
        return "данного кода нет в системе";
    }



}
