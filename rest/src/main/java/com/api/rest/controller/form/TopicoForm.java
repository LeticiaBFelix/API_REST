package com.api.rest.controller.form;

import com.api.rest.modelo.Curso;
import com.api.rest.modelo.Topico;
import com.api.rest.repository.CursoRepository;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;

public class TopicoForm {

    @NotNull @NotEmpty
    private String titulo;

    @NotNull @NotEmpty
    private String mensagem;

    @NotNull @NotEmpty
    private String nomeCurso;

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
