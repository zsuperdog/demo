package com.example.demo.api;

import com.example.demo.dto.CatImageDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface CatApi {
    @GetMapping("https://api.thecatapi.com/v1/images/search")
    List<CatImageDto> getCatImages();
}
