package com.example.zuppinproject.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "musteri")
public class Musteri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String musteriadsoyad;

    private String email;



    @OneToMany(
            mappedBy = "musteri",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Dosya> dosyaSet;

 //   public void setDosya(List<Dosya> dosya) {
  //      this.dosya = dosya;
  //      dosya.forEach(entity -> entity.setMusteri(this));
  //  }

}
