package com.jobiak.bootimd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobiak.bootimd.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
