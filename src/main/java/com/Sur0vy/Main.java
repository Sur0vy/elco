package com.Sur0vy;

import com.Sur0vy.view.ConsoleView;

public class Main {

    private static final String DATABASE_URL = "jdbc:h2:mem:account";

    public static void main(String[] args) throws Exception {

        ConsoleView consoleView = new ConsoleView(DATABASE_URL);

    }
}
