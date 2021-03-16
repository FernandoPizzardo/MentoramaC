package com.company;

import java.util.*;

public class PlanodeAula {
    public static void main(String... args) {
        HashMap<Integer, String> alunos = new HashMap<>();
        alunos.put(1, "Anderson");
        alunos.put(2, "Beatriz");
        alunos.put(3, "Carla");
        alunos.put(4, "Daniel");
        alunos.put(5, "Eymael");
        alunos.put(6, "Fernando");
        alunos.put(7, "Giovanna");
        alunos.put(8, "Helena");
        alunos.put(9, "Igor");
        alunos.put(10, "João");
        alunos.put(11, "Karolyne");
        alunos.put(12, "Laura");
        alunos.put(13, "Maurício");
        alunos.put(14, "Natan");
        alunos.put(15, "Olga");
        alunos.put(16, "Paula");
        alunos.put(17, "Queiroz");
        alunos.put(18, "Rafael");
        alunos.put(19, "Samara");
        alunos.put(20, "Tamires");
        alunos.put(21, "Ulisses");
        alunos.put(22, "Victor");
        alunos.put(23, "Wagner");
        alunos.put(24, "Xena");
        alunos.put(25, "Yana");
        alunos.put(26, "Zelda");



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
        HashMap<Integer, String> presenca = new HashMap<>();
        presenca.put(0, "Presente");
        presenca.put(1, "Faltante");
        /* for (int i = 1; i <= calendario.length; i++) {
            for(int x = 0; x < calendario[i].length; x++) {
                System.out.println(alunos.get(i) + " estava " + presenca.get() + " na aula" + calendario[i][x]);
                System.out.println("");
            }
        }
        */
        boolean appAula = true;
        while (appAula) {
            System.out.println("""
                   Escolha entre as opções:
                    1 - Ver classe
                    2 - Registrar aula
                    3 - Sair
                    """);
            Scanner menu = new Scanner(System.in);
            int opcoesAula = menu.nextInt();
            switch (opcoesAula){
                case 1:
                    System.out.println(alunos.values() + "\n");
                    break;
                case 2:
                    System.out.println("Insira aqui o numero do aluno que quer registrar");
                    int numAluno = menu.nextInt();
                    System.out.println("Agora primeiro dia e logo em seguida o mês");
                    int dia = menu.nextInt();
                    int mes = menu.nextInt();
                    System.out.println("Ele estava presente ou faltante? \n digite 0 para presente \n digite 1 para faltante");
                    int presente = menu.nextInt();
                    System.out.println(alunos.get(numAluno) + " estava " + presenca.get(presente) + " na aula " + calendario[dia][mes]);
                    break;
                case 3:
                    System.out.println("Até mais!");
                    appAula = false;

            }

            //System.out.println("Os alunos " + alunos.values() + " na aula de número " + Arrays.deepToString(calendario) + " estava " + presenca.values());
        }


    }
}

