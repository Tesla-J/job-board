package dev.rmarcos.jobboard.controller.candidate;

import dev.rmarcos.jobboard.dto.candidate.CandidateCreateDTO;
import dev.rmarcos.jobboard.dto.candidate.CandidateReadDTO;
import dev.rmarcos.jobboard.dto.candidate.CandidateUpdateDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @GetMapping()
    List<CandidateReadDTO> getAllUsers(){
        // TDOO
        return null;
    }

    @GetMapping("/{id}")
    CandidateReadDTO getUser(@PathVariable Long id){
        // TODO
        return null;
    }

    @PostMapping
    void newCandidate(@RequestBody CandidateCreateDTO newCandidate){
        //TODO
    }

    @PatchMapping
    void updateCandidate(@RequestBody CandidateUpdateDTO candidate){
        // TODO
    }

    @PutMapping
    void replaceCandidate(@RequestBody CandidateUpdateDTO candidate){
        // TODO
    }

    @DeleteMapping("/{id}")
    void deleteCandidate(@PathVariable Long candidateId){
        // TODO
    }
}
