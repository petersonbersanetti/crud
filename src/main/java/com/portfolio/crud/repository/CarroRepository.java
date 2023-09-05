package com.portfolio.crud.repository;

import com.portfolio.crud.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository <Carro, Long> {

}
