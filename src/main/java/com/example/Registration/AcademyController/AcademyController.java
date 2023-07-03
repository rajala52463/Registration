package com.example.Registration.AcademyController;


import com.example.Registration.Dto.AcademyDTO;
import com.example.Registration.Repo.AcademyRepo;
import com.example.Registration.Service.AcademyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/academy")
public class AcademyController {

    @Autowired
    private AcademyService academyService;
    private AcademyRepo academyRepo;
    @PostMapping(path = "/save")
    public String saveAcademy(@RequestBody AcademyDTO academyDTO)
    {
     String id = academyService.addAcademy(academyDTO);
     return  id;
    }


}
