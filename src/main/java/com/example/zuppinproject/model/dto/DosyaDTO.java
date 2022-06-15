package com.example.zuppinproject.model.dto;

import com.example.zuppinproject.model.Dosya;
import com.example.zuppinproject.model.Musteri;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DosyaDTO {


    private String dosya_adi;
    private Integer musteri_id;

    private Musteri musteri;



}
