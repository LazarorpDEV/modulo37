package br.com.lazaro;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String nome = StringUtils.normalizeSpace("  Lazaro   Rodrigues  ");
        if (StringUtils.isBlank(nome)) {
            throw new IllegalArgumentException("O nome precisa ser informado.");
        }

        Aluno aluno = new Aluno(nome, "Backend Java", 37);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.println("=== Atividade do Modulo 37 - Maven ===");
        System.out.println("Nome normalizado com Apache Commons Lang: " + nome);
        System.out.println("Objeto convertido em JSON com Gson:");
        System.out.println(gson.toJson(aluno));
    }

    private static class Aluno {
        private final String nome;
        private final String curso;
        private final int modulo;

        Aluno(String nome, String curso, int modulo) {
            this.nome = nome;
            this.curso = curso;
            this.modulo = modulo;
        }
    }
}
