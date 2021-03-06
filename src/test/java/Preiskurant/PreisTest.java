package Preiskurant;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PreisTest {

    @Test
    void testToString() {
    }

    @Test
    void addProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("капуста", "1", 100, 0));
        Preis prise = new Preis(products);
        System.out.println(prise.toString());
        assertEquals(true, prise.addProduct(new Product("морковка", "2", 50, 0)));
        System.out.println(prise.toString());
        assertEquals(false, prise.addProduct(new Product("морковка", "2", 50, 0)));
        System.out.println(prise.toString());
    }

    @Test
    void delProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("морковка", "2", 50, 0));
        products.add(new Product("лук", "1", 100, 0));
        Preis prise = new Preis(products);
        System.out.println(prise.toString());
        assertEquals(false, prise.delProduct(new Product("лук", "2", 50, 0)));
        assertEquals(true, prise.delProduct(new Product("морковка", "2", 50, 0)));
        System.out.println(prise.toString());

    }

    @Test
    void changeCostProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("морковка", "2", 50, 0));
        products.add(new Product("лук", "3", 100, 0));
        products.add(new Product("чеснок", "7", 30, 0));
        Preis prise = new Preis(products);
        System.out.println(prise.toString());
        assertEquals(true, prise.changeCostProduct(new Product("лук", "3", 100, 0), 1000, 0));
        assertEquals(true, prise.changeCostProduct(new Product("морковка", "2", 50, 0), 1010, 0));
        assertEquals(false, prise.changeCostProduct(new Product("репа", "7", 30, 0), 999, 0));
        assertEquals(false, prise.changeCostProduct(new Product("морковка", "3", 50, 0), 1111, 0));
        System.out.println(prise.toString());
    }

    @Test
    void changeNameProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("морковка", "2", 50, 0));
        products.add(new Product("чеснок", "7", 30, 0));
        Preis prise = new Preis(products);
        System.out.println(prise.toString());
        assertEquals(true, prise.changeNameProduct(new Product("морковка", "2", 50, 0), "лук"));
        assertEquals(false, prise.changeNameProduct(new Product("чеснок", "4", 60, 1), "огурец"));
        System.out.println(prise.toString());
    }

    @Test
    void findProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("морковка", "2", 50, 1));
        products.add(new Product("чеснок", "7", 30, 34));
        Preis prise = new Preis(products);
        System.out.println(prise.toString());
        assertEquals(true, prise.findProduct("2", 10).equals("цена по коду: 50.01 по колическиву экземпляров (10) цена покупки равна: 500.09999999999997"));
        System.out.println(prise.toString());
        assertEquals(true, prise.findProduct("3", 10).equals("данного кода нет в системе"));
        System.out.println(prise.toString());
        assertEquals(false, prise.findProduct("7", 4).equals("цена по коду: 30.34 по колическиву экземпляров (4) цена покупки равна: 123.35"));
        System.out.println(prise.toString());
    }
}