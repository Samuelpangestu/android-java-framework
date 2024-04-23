package test;

import io.github.cdimascio.dotenv.Dotenv;

public class Debug {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        System.out.println(dotenv.get("USERNAMES"));
    }
}
