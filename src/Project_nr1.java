import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Project_nr1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        short age ;
        System.out.println("What is your name?");
        name= br.readLine();
        System.out.println("Welcome To Vistula "+name);
        System.out.println("Are you above 18?");
        age = Short.parseShort(br.readLine());
        if (age < 18) {
            System.out.println("You are only eligible if you are above 18");
        }else{
            System.out.println("You are eligible");}
        System.out.println("Go to the next counter!");


    }
}
