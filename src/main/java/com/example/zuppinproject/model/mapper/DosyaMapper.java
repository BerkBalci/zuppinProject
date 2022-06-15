package com.example.zuppinproject.model.mapper;

import com.example.zuppinproject.model.Dosya;
import com.example.zuppinproject.model.Musteri;
import com.example.zuppinproject.model.dto.DosyaDTO;
import com.example.zuppinproject.model.dto.MusteriDTO;

public class DosyaMapper {

    public static DosyaDTO toDto(Dosya dosya){
        DosyaDTO dosyaDTO = new DosyaDTO();
        dosyaDTO.setDosya_adi(dosya.getDosya_adi());
        dosyaDTO.setMusteri(dosya.getMusteri());




        return dosyaDTO;

    }

    public static Dosya toEntity(DosyaDTO dosyaDTO){
        Dosya dosya = new Dosya();
        dosya.setDosya_adi(dosyaDTO.getDosya_adi());
        dosya.setMusteri(dosyaDTO.getMusteri());




        return dosya;

    }
}
