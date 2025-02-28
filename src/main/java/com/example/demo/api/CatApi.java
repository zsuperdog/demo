package com.example.demo.api;

import com.example.demo.dto.CatImageDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface CatApi {
    @GetExchange("https://api.thecatapi.com/v1/images/search?limit=10")
    List<CatImageDto> getCatImages();
}
