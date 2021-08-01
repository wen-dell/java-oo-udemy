package com.udemy.arquivos.exercicio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        readFile(strPath);

    }

    public static void readFile(String strPath) {
        File path = new File(strPath);
        List<Item> items = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line = bf.readLine();
            while (line != null) {
                String[] parts = line.split(",");

                String name = parts[0];
                Double price = Double.parseDouble(parts[1]);
                Integer quantity = Integer.parseInt(parts[2]);
                Item item = new Item(name, price, quantity);

                items.add(item);

                line = bf.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao processar arquivo: " + e.getMessage());
        }

        writeFile(strPath, items);
    }

    public static void writeFile(String basePath, List<Item> items) {
        String newPath = new File(basePath).getParent() + "//out";
        final boolean mkdir = new File(newPath).mkdir();
        String fileName = newPath + "//summary.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Item item : items) {
                String name = item.getName();
                Double total = item.total();
                String line = String.format("%s,%.2f", name, total);

                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo: " + e.getMessage());
        }
    }

}
