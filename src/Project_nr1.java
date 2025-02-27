import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project_nr1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        System.out.println("What is your name?");
        name= br.readLine();
        System.out.println("Welcome To Vistula "+name);
    }
}
