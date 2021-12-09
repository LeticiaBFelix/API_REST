package com.api.rest.repository;

import com.api.rest.modelo.Curso;
import com.api.rest.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Curso findByNome(String nomeCurso);
}
