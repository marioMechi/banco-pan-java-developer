package one.digitalinnovation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno = new HashMap<>();
        aluno.put("Nome", "João");
        aluno.put("Idade", "25");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "7C");
        System.out.println(aluno.keySet());
        List<Map<String, String>> ListaAlunos = new ArrayList<>();
        ListaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "24");
        aluno2.put("Media", "9.2");
        aluno2.put("Turma", "A2");

        ListaAlunos.add(aluno2);
        System.out.println(ListaAlunos);
    }
}
