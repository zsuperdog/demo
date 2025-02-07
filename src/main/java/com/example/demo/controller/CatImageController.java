package com.example.demo.controller;

import com.example.demo.api.CatApi;
import com.example.demo.dto.CatImageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cat-generator")

public class CatImageController {
    @Autowired

    private CatApi catApi;
    @GetMapping
    public List<CatImageDto> getCatImages() {
        return catApi.getCatImages();
    }
}
