package dev.rmarcos.jobboard.controller.company;

import dev.rmarcos.jobboard.controller.CRUDController;
import dev.rmarcos.jobboard.dto.company.CompanyDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController extends CRUDController<CompanyDTO, Long> {

}
