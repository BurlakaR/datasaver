package com.datasaver.save;

import com.datasaver.grpc.Connector;
import com.shopserver.database.objects.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


public class TestSavings {

    @Autowired
    private Connector connector;

    @PostConstruct
    public void init(){
        for(int i=0;i<5; i++) {
            List<String> bufSubCategories = new ArrayList<String>();
            String name="Category#"+i;
            for(int j=0; j<=i;j++){
                bufSubCategories.add("Subcategory#"+j);
            }
            connector.saveCategoryGrpc(new Category(name, bufSubCategories));
        }
    }

}
