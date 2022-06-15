package com.example.zuppinproject.service;

import com.example.zuppinproject.model.Dosya;
import com.example.zuppinproject.model.Musteri;
import com.example.zuppinproject.model.dto.DosyaDTO;
import com.example.zuppinproject.model.dto.MusteriDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DosyaService {

    List<DosyaDTO> getAllDosya();


    DosyaDTO getDosya(Integer id);

    boolean addDosya(Dosya dosya);

    DosyaDTO updateDosya(Integer id,Dosya dosya);

    boolean deleteDosya(Integer id);




}
