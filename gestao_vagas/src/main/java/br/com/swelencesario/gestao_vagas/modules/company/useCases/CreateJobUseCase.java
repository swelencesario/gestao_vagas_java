package br.com.swelencesario.gestao_vagas.modules.company.useCases;

import br.com.swelencesario.gestao_vagas.modules.company.entities.JobEntity;
import br.com.swelencesario.gestao_vagas.modules.company.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class CreateJobUseCase {
    @Autowired
    private JobRepository jobRepository;

    @PostMapping("/")
    public JobEntity execute(JobEntity jobEntity) {
        return this.jobRepository.save(jobEntity);
    }
}
