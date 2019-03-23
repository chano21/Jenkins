package com.example.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitys.Customer;

public interface CutomerRepository extends JpaRepository<Customer, Long>{

}
