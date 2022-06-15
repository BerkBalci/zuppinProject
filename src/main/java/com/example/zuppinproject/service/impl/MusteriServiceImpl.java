package com.example.zuppinproject.service.impl;

import com.example.zuppinproject.model.Musteri;
import com.example.zuppinproject.model.dto.MusteriDTO;
import com.example.zuppinproject.model.mapper.MusteriMapper;
import com.example.zuppinproject.repository.MusteriRepository;
import com.example.zuppinproject.service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class MusteriServiceImpl implements MusteriService {

    @Autowired
    private MusteriRepository musteriRepository;

    @Override
    public List<MusteriDTO> getAllMusteri() {
        List<Musteri> all = musteriRepository.findAll();
        return all.stream().map(MusteriMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public MusteriDTO getMusteri(Integer id) {
        Optional<Musteri> byId = musteriRepository.findById(id);
        if (byId.isPresent()) {
            return MusteriMapper.toDto(byId.get());
        }
        return null;
    }

    @Override
    public boolean addMusteri(Musteri musteri) {

        Musteri save = musteriRepository.save(musteri);
        if (save == null)

            return false;
        return true;
    }

    @Override
    public MusteriDTO updateMusteri(Integer id, Musteri musteri) {
        MusteriDTO currentMusteri = getMusteri(id);
        if (currentMusteri == null)
            return null;
        musteri.setId(id);
        return MusteriMapper.toDto(musteriRepository.save(musteri));

    }

    @Override
    public boolean deleteMusteri(Integer id) {
        musteriRepository.deleteById(id);
        return true;
    }





}
