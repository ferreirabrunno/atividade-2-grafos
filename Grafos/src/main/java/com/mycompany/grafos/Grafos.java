package com.mycompany.grafos;
import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Grafos {

    public static LinkedList<String> g =new LinkedList<>();
        
        public static void main(String args[]) throws Exception {
        File doc = new File("C:\\Users\\Aluno\\Downloads\\PequenoG.txt");
        Scanner obj = new Scanner(doc);
            
        
        

        while (obj.hasNextLine()) {
            g.add(obj.nextLine());
        }
        
        String ordem = g.get(0);
        String tamanho = g.get(1);
        System.out.println("Ordem: " + ordem);
        System.out.print("Tamanho: " + tamanho);
        
        
        
     }
         
}


