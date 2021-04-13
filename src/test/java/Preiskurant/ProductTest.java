package Preiskurant;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @Test
    void testToString() {
    }

    @Test
    void getProdName() {
        Product product = new Product("морковка", "2", 50, 0);
        assertEquals(true, product.getProdName().equals("морковка"));
        assertEquals(false, product.getProdName().equals("морс"));
    }

    @Test
    void setProdName() {
        Product product = new Product("морковка", "2", 50, 0);
        Product product1 = new Product("лук", "2", 50, 0);
        product.setProdName("лук");
        assertEquals(true, product.equals(product1));
    }

    @Test
    void getProdKey() {
        Product product = new Product("морковка", "2", 50, 0);
        assertEquals(true, product.getProdKey().equals("2"));
        assertEquals(false, product.getProdKey().equals("5"));
    }

    @Test
    void setProdKey() {
        Product product = new Product("лук", "2", 50, 0);
        Product product1 = new Product("лук", "3", 50, 0);
        product.setProdKey("3");
        assertEquals(true, product.equals(product1));
    }

    @Test
    void getRubCost() {
        Product product = new Product("морковка", "2", 50, 36);
        assertEquals(50, product.getRubCost());
    }

    @Test
    void setRubCost() {
        Product product = new Product("лук", "5", 75, 0);
        Product product1 = new Product("лук", "5", 50, 0);
        product.setRubCost(50);
        assertEquals(true, product.equals(product1));
    }

    @Test
    void getKopecksCost() {
        Product product = new Product("морковка", "2", 50, 36);
        assertEquals(36, product.getKopecksCost());
    }

    @Test
    void setKopecksCost() {
        Product product = new Product("лук", "5", 50, 47);
        Product product1 = new Product("лук", "5", 50, 30);
        product.setRubCost(30);
        assertEquals(true, product.equals(product1));
    }
}