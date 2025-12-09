package com.adrianwieczorek.javaalgorithmsvisualizer.controller;

import com.adrianwieczorek.javaalgorithmsvisualizer.service.DataStructureService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/list")
@RequiredArgsConstructor
public class VisualizationController {

    private final DataStructureService service;

    @PostMapping("/add")
    public void add(@RequestParam String value) {
        service.addToList(value);
    }

    @PostMapping("/remove")
    public void remove(@RequestParam int index) {
        service.removeFromList(index);
    }

    @GetMapping("/view")
    public String view() {
        return service.getVisualization();
    }
}