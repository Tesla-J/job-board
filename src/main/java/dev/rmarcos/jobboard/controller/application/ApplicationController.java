package dev.rmarcos.jobboard.controller.application;

import dev.rmarcos.jobboard.controller.CRUDController;
import dev.rmarcos.jobboard.dto.application.ApplicationDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application")
public class ApplicationController extends CRUDController<ApplicationDTO, Long> {
}
