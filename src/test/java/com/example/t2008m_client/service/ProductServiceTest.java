package com.example.t2008m_client.service;

import com.example.t2008m_client.entity.Product;
import com.example.t2008m_client.retrofit.RetrofitServiceGenerator;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {
    @Test
    public void testRetrofit() throws IOException{
        ProductService productService = RetrofitServiceGenerator.createService(ProductService.class);
        List<Product> products = productService.getProducts().execute().body();
        for (Product pro:
        products){
            System.out.println(pro.toString());
        }
    }

}