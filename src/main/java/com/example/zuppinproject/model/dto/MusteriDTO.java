package com.example.zuppinproject.model.dto;


import com.example.zuppinproject.model.Musteri;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MusteriDTO {

    private String musteriadsoyad;
    private String email;
    private Musteri musteri;

    @JsonProperty("musteri_id")
    private void unpackNested(Integer musteri_id) {
        this.musteri = new Musteri();
        musteri.setId(musteri_id);
    }


}
