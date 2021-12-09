package com.api.rest.controller.form;

import com.api.rest.modelo.Topico;
import com.api.rest.repository.TopicoRepository;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;

public class AtualizacaoTopicoForm {
    @NotNull
    @NotEmpty
    private String titulo;

    @NotNull @NotEmpty
    private String mensagem;

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getById(id);
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);

        return topico;
    }
}
