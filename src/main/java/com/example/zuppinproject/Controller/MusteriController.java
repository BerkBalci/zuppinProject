package com.example.zuppinproject.Controller;

import com.example.zuppinproject.model.dto.MusteriDTO;
import com.example.zuppinproject.model.mapper.MusteriMapper;
import com.example.zuppinproject.service.MusteriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/musteri")
public class MusteriController {

    @Autowired
    private MusteriService musteriService;


    @GetMapping(path = "/all")
    public List<MusteriDTO> getAllMusteri() {
        return musteriService.getAllMusteri();
    }

    @PostMapping(path = "/get")
    public MusteriDTO getMusteri(@RequestParam Integer id) {
        return musteriService.getMusteri(id);
    }

    @PostMapping(path = "/add")
    public boolean addMusteri(@RequestBody MusteriDTO musteri) {
        return musteriService.addMusteri(MusteriMapper.toEntity(musteri));
    }



    @PutMapping(value = "/update/{id}")
    public MusteriDTO updateMusteri(@PathVariable Integer id,
                                    @RequestBody MusteriDTO musteri) {
        return musteriService.updateMusteri(id, MusteriMapper.toEntity(musteri));
    }

    @DeleteMapping(value = "/delete/id={id}")
    public boolean deleteMusteri(@PathVariable Integer id) {

        return musteriService.deleteMusteri(id);
    }

}
