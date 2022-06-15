package com.example.zuppinproject.service.impl;

import com.example.zuppinproject.model.Dosya;
import com.example.zuppinproject.model.dto.DosyaDTO;
import com.example.zuppinproject.model.mapper.DosyaMapper;
import com.example.zuppinproject.model.mapper.MusteriMapper;
import com.example.zuppinproject.repository.DosyaRepository;
import com.example.zuppinproject.service.DosyaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class DosyaServiceImpl implements DosyaService {

    @Autowired
    private DosyaRepository dosyaRepository;

    @Override
    public List<DosyaDTO> getAllDosya() {
        List<Dosya> all = dosyaRepository.findAll();
        return all.stream().map(DosyaMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public DosyaDTO getDosya(Integer id) {
        Optional<Dosya> byId = dosyaRepository.findById(id);
        if (byId.isPresent()) {
            return DosyaMapper.toDto(byId.get());
        }
        return null;
    }

    @Override
    public boolean addDosya(Dosya dosya) {
        Dosya save = dosyaRepository.save(dosya);

        if (save == null)

            return false;
        return true;


    }

    @Override
    public DosyaDTO updateDosya(Integer id, Dosya dosya) {
        DosyaDTO currentDosya = getDosya(id);
        if (currentDosya == null)
            return null;
        dosya.setMusteri(dosya.getMusteri());
        return DosyaMapper.toDto(dosyaRepository.save(dosya));

    }

    @Override
    public boolean deleteDosya(Integer id) {
        dosyaRepository.deleteById(id);
        return true;
    }



}






