package org.golfshop.service;

import org.golfshop.entities.Category;
import org.golfshop.entities.Product;
import org.golfshop.entities.ImmutableObjectProduct;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public interface IWarehouse {


    public CopyOnWriteArrayList<Product> getProductList();

    public void showAll();

    public void addMockDateToWarehouse();
    public int generateNewId();
    public void createANewProduct(String name, double rating, double price, Category category);

    public void updateAnExistingProduct(int id, String name, double rating, Category category);

    public List<ImmutableObjectProduct> getAllProduct();

    public List<ImmutableObjectProduct> getProductById(int id);

    public List<ImmutableObjectProduct> getProductByCategorySortAfterName(Category category);

    public List<ImmutableObjectProduct> getProductAfterDesiredDateDescendingOrder(LocalDate date);

    public List<ImmutableObjectProduct> getProductThatHaveBeenModified();


}
