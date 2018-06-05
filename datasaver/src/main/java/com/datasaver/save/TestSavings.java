package com.datasaver.save;

import com.datasaver.grpc.Connector;
import com.shopserver.database.objects.Category;
import com.shopserver.database.objects.Client;
import com.shopserver.database.objects.Product;
import com.shopserver.database.objects.Property;
import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;



@Data
public class TestSavings {


    private Connector connector;


    @Getter List<Client> clients = new ArrayList<>();


    @Getter List<Product> products = new ArrayList<>();


    @Getter List <Category> categories= new ArrayList<>();


    public TestSavings(){
        connector=new Connector();
        updateCategories();
        updateClients();
        updateProducts();
    }

    public void updateClients(){
        clients=connector.takeClientsGrpc();
    }

    public void updateProducts(){
        products=connector.takeProductListGrpc();
    }

    public void updateCategories(){
        categories=connector.takeCategoriesGrpc();
    }

}
