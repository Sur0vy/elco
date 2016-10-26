package com.Sur0vy.view;

import com.Sur0vy.controller.DBController;

public class ConsoleView {

    private DBController dbController;

    private void run(){

    }

    public ConsoleView(final String databaseName) throws Exception {
        dbController = new DBController(databaseName);
        run();
        dbController.closeConnection();
    }

}
