package com.example.zuppinproject.Controller;


import com.example.zuppinproject.model.Dosya;
import com.example.zuppinproject.model.Musteri;
import com.example.zuppinproject.model.dto.DosyaDTO;
import com.example.zuppinproject.model.dto.MusteriDTO;
import com.example.zuppinproject.model.mapper.DosyaMapper;
import com.example.zuppinproject.model.mapper.MusteriMapper;
import com.example.zuppinproject.repository.DosyaRepository;
import com.example.zuppinproject.repository.MusteriRepository;
import com.example.zuppinproject.service.DosyaService;
import com.example.zuppinproject.service.MusteriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/dosya")
public class DosyaController {

    @Autowired
    private DosyaService dosyaService;

    @GetMapping(path = "/allDosya")
    public List<DosyaDTO> getAllDosya() {
        return dosyaService.getAllDosya();
    }

    @PostMapping(path = "/getDosya")
    public DosyaDTO getDosya(@RequestParam Integer id) {
        return dosyaService.getDosya(id);
    }

//    @PostMapping(path = "/addDosya")
//    @ResponseBody
//    public boolean addDosya(@RequestBody DosyaDTO dosya) {

//        Musteri musteri = MusteriRepository.findById(dosya.getMusterId()
//                .orElseThrow(EntityNotFoundException::new);

//        return dosyaService.addDosya(DosyaMapper.toEntity(dosya, musteri));
//    }

    @PostMapping(path = "/addDosya")
    public boolean addDosya(@RequestBody DosyaDTO dosya){
        return dosyaService.addDosya(DosyaMapper.toEntity(dosya));
    }

    @PutMapping(value = "/updateDosya/{id}")
    public DosyaDTO updateDosya(@PathVariable Integer id,
                                    @RequestBody DosyaDTO dosya) {
        return dosyaService.updateDosya(id, DosyaMapper.toEntity(dosya));
    }

    @DeleteMapping(value = "/deleteDosya/id={id}")
    public boolean deleteDosya(@PathVariable Integer id) {

        return dosyaService.deleteDosya(id);
    }
}
