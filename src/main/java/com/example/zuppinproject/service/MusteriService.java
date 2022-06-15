package com.example.zuppinproject.service;

import com.example.zuppinproject.model.Musteri;
import com.example.zuppinproject.model.dto.MusteriDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MusteriService {

    List<MusteriDTO> getAllMusteri();

    MusteriDTO getMusteri(Integer id);


    boolean addMusteri(Musteri musteri);

    MusteriDTO updateMusteri(Integer id,Musteri musteri);

    boolean deleteMusteri(Integer id);


}
