package dev.rmarcos.jobboard.controller.job;

import dev.rmarcos.jobboard.controller.CRUDController;
import dev.rmarcos.jobboard.dto.job.JobDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobController extends CRUDController<JobDTO, Long> {
}
