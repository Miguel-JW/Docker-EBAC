package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class ApiResponse {
    private String mensagem;
    private LocalDateTime timestamp;
    private List<Produto> produtos;

    @Data
    @AllArgsConstructor
    public static class Produto {
        private Long id;
        private String nome;
        private String categoria;
        private Double preco;
        private Boolean disponivel;
    }
}
