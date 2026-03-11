package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.response.ProductResponse;

@Service
public class ProductService {
    public ProductResponse calProductResponse(ProductRequest req){
        int total=0;
        int nettotal=0;
        int GST=18;

        total=req.getProduct1()+req.getProduct2()+req.getProduct3()+req.getProduct4()+req.getProduct5()+req.getProduct6()+req.getProduct7()+req.getProduct8()+req.getProduct9()+req.getProduct10();
        double percentage=(total/100.0)*GST;
        nettotal=total+(total*GST/100);
        return new ProductResponse(req.getName(), total, percentage, nettotal, GST);
    }
}
