package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter file path: ");
        String strPath = sc.nextLine();

        File pathFile = new File(strPath);

        String pathParentStr = pathFile.getParent();

        new File(pathParentStr + "\\out").mkdir();

        String strFile = pathParentStr + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();

            while(line != null){
                String[] product = line.split(",");

                products.add(new Product(product[0], Double.parseDouble(product[1]), Integer.parseInt(product[2])));
                
                line = br.readLine();
            }
            
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(strFile))){

                for(Product product : products){
                    bw.write(product.toString());
                    bw.newLine();
                }

                System.out.println(strFile + " created");
            }
            catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }
            
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}