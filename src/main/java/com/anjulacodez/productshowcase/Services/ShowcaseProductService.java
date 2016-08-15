package com.anjulacodez.productshowcase.Services;

import com.anjulacodez.productshowcase.DatabaseHandlers.DatabaseHandler;
import com.anjulacodez.productshowcase.Entities.ShowcaseProduct;

import javax.persistence.EntityManager;
import java.util.HashSet;

public class ShowcaseProductService {
    private DatabaseHandler databaseHandler = new DatabaseHandler();
    private EntityManager entityManager = databaseHandler.getEM();

    public HashSet<ShowcaseProduct> getProducts(){
        return (HashSet<ShowcaseProduct>) entityManager.createQuery("SELECT c FROM PRODUCT c").getResultList();
    }
}
