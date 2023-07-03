package com.example.Registration.Service.impl;

import com.example.Registration.Dto.AcademyDTO;
import com.example.Registration.Entity.Academy;
import com.example.Registration.Repo.AcademyRepo;
import com.example.Registration.Service.AcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcademyIMPL implements AcademyService {
    @Autowired
    private AcademyRepo academyRepo;
    @Override
    public String addAcademy(AcademyDTO academyDTO) {

        Academy academy = new Academy(
                academyDTO.getAcademyid(),
                academyDTO.getText(),
                academyDTO.getTel(),
                academyDTO.getUrl(),
                academyDTO.getEmail(),
                academyDTO.getLocation(),
                academyDTO.getTextarea()
        );

    academyRepo.save(academy);

        return academy.getText();
    }
}
