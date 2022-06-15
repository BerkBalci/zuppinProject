package com.example.zuppinproject.repository;

import com.example.zuppinproject.model.Musteri;
import com.example.zuppinproject.model.dto.DosyaDTO;
import com.example.zuppinproject.model.dto.MusteriDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MusteriRepository extends JpaRepository<Musteri,Integer> {



}
