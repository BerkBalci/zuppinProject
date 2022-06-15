package com.example.zuppinproject.repository;

import com.example.zuppinproject.model.Dosya;
import com.example.zuppinproject.model.Musteri;
import com.example.zuppinproject.model.dto.DosyaDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DosyaRepository extends JpaRepository <Dosya,Integer> {




}
