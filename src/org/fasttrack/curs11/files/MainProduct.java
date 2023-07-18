package org.fasttrack.curs11.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduct {

    public static void main(String[] args) throws IOException {
        List<Product> allPRoducts = readProductsFromFile("files/products.txt");

        File productsFile = new File("files/products.txt");
        Scanner scanner = new Scanner(productsFile);

        List<String> linesFromFile = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            linesFromFile.add(currentLine);
        }

        System.out.println(linesFromFile);

        List<Product> productsFromFile = transformLinesIntoFiles(linesFromFile);
        System.out.println(productsFromFile);

        int valoareProduse = calculateValue(productsFromFile);
        String mesajValoareProduct = "Valoarea totala a produselor din stoc este " + valoareProduse;
        System.out.println(mesajValoareProduct);
        Product mostExpensiveProduct = mostValuableProduct(productsFromFile);
        String mesajCelMaiScumpProdus = "Most expensive product: " + mostExpensiveProduct.getName() + " with value " + mostExpensiveProduct.getValue();
        System.out.println(mesajCelMaiScumpProdus);

        FileWriter fileWriter = new FileWriter("files/bilant.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);

        writer.append(mesajValoareProduct);
        writer.write("\n");
        writer.append(mesajCelMaiScumpProdus);
        writer.close();
    }

    public static List<Product> transformLinesIntoFiles(List<String> linesFromFile) {
        List<Product> products = new ArrayList<>();
        for (String currentLine: linesFromFile) {
            products.add(parseLineIntoProduct(currentLine));
        }
        return products;
    }

    public static Product parseLineIntoProduct(String line) {
        //Iphone 14; telefon; 100; 5000
        // if | is delimitator => split ("\\|");
        String[] productParts = line.split(";");
        Product currentProduct = new Product(productParts[0], productParts[1],
                Integer.parseInt(productParts[2].trim()),
                Integer.parseInt(productParts[3].trim()));
        return currentProduct;
    }

    public static int calculateValue(List<Product> products) {
        int sum = 0;
        for (Product currentProduct: products) {
            sum += currentProduct.getValue();
        }
        return sum;
    }

    public static Product mostValuableProduct(List<Product> products) {
        Product mostExpensiveProduct = null;
        int quantum = 0;
        for (Product currentProduct: products) {
            int value = currentProduct.getValue();
            if (value > quantum) {
                quantum = value;
                mostExpensiveProduct = currentProduct;
            }
        }
        return mostExpensiveProduct;
    }

    public static List<Product> readProductsFromFile(String filePath) {
        //in here read the input file, read to String, then convert to product
        // and do operations and what not.
        return new ArrayList<>();
    }

}
