package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidate;

public class Program {
    public static void main(String[] args) {
        
        Map<String, Candidate> map = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.next();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                Candidate candidate;

                if(map.containsKey(fields[0])){
                    int newVotes = Integer.parseInt(fields[1]) + map.get(fields[0]).getVotes();
                    candidate = new Candidate(fields[0], newVotes);
                }
                else{
                    candidate = new Candidate(fields[0], Integer.parseInt(fields[1]));
                }

                map.put(candidate.getName(), candidate);
                line = br.readLine();
            }

            for(String key : map.keySet()){
                System.out.println(key + ": " + map.get(key).getVotes());
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