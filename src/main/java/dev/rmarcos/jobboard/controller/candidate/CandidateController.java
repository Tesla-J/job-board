package dev.rmarcos.jobboard.controller.candidate;

import dev.rmarcos.jobboard.controller.CRUDController;
import dev.rmarcos.jobboard.dto.candidate.CandidateDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate")
public class CandidateController extends CRUDController<CandidateDTO, Long> {

}
