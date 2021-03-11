package com.company;

import java.util.*;

public class PlanodeAula {
    public static void main(String... args) {
        HashMap<String, String> alunos = new HashMap<>();
        alunos.put("A", "Anderson");
        alunos.put("B", "Beatriz");
        alunos.put("C", "Carla");
        alunos.put("D", "Daniel");
        alunos.put("E", "Eymael");
        alunos.put("F", "Fernando");
        alunos.put("G", "Giovanna");
        alunos.put("H", "Helena");
        alunos.put("I", "Igor");
        alunos.put("J", "João");
        alunos.put("K", "Karolyne");
        alunos.put("L", "Laura");
        alunos.put("M", "Maurício");
        alunos.put("N", "Natan");
        alunos.put("O", "Olga");
        alunos.put("P", "Paula");
        alunos.put("Q", "Queiroz");
        alunos.put("R", "Rafael");
        alunos.put("S", "Samara");
        alunos.put("T", "Tamires");
        alunos.put("U", "Ulisses");
        alunos.put("V", "Victor");
        alunos.put("W", "Wagner");
        alunos.put("X", "Xena");
        alunos.put("Y", "Yana");
        alunos.put("Z", "Zelda");



        int[][] calendario = new int[20][11];
        int aulas = 0;
        for (int i = 0; i < 20; i++) {
            for (int x = 0; x < 11; x++) {
                aulas++;
                calendario[i][x] = aulas;
            }
        }
        for (int i = 0; i < calendario.length; i++) {
            for(int x = 0; x < calendario[i].length; x++){
                //System.out.print(calendario[i][x] + " ");
            }
            //System.out.println("");
        }
        HashMap<Boolean, String> presenca = new HashMap<>();
        presenca.put(true, "Presente");
        presenca.put(false, "Faltante");
        System.out.println("O aluno " + alunos.get("A") + " na aula de número " + calendario[1][10] + " estava " + presenca.get(true));



    }
}

