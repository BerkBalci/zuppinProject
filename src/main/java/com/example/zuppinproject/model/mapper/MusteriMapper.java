package com.example.zuppinproject.model.mapper;

import com.example.zuppinproject.model.Musteri;
import com.example.zuppinproject.model.dto.MusteriDTO;

public class MusteriMapper {

    public static MusteriDTO toDto(Musteri musteri){
        MusteriDTO musteriDTO = new MusteriDTO();
        musteriDTO.setMusteriadsoyad(musteri.getMusteriadsoyad());
        musteriDTO.setEmail(musteri.getEmail());



        return musteriDTO;

    }

    public static Musteri toEntity(MusteriDTO musteriDTO){
        Musteri musteri = new Musteri();
        musteri.setMusteriadsoyad(musteriDTO.getMusteriadsoyad());
        musteri.setEmail(musteriDTO.getEmail());



        return musteri;

    }
}
