package com.portfolio.crud.controller;

import com.portfolio.crud.repository.CarroRepository;
import com.portfolio.crud.model.Carro;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarroController {

    CarroRepository carroRepository;

    @GetMapping("/carro")
    public List<Carro> getAllCarros() {
        return carroRepository.findAll();
    }

    @GetMapping("/carro/{id}")
    public Carro getCarroById(@PathVariable Long id) {
        return carroRepository.findById(id).get();
    }

    @PostMapping("/carro")
    public Carro save(@RequestBody Carro carro){
        return carroRepository.save(carro);
    }

    @DeleteMapping("/carro/{id}")
    public void deleteCarro (@PathVariable Long id){
        carroRepository.deleteById(id);
    }

}
