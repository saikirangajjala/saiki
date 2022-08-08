package com.example.demo;

import com.example.demo.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewRepository extends JpaRepository<Login,Long> {
}
