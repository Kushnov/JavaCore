package Homework_8;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        UserInterface userInterface = new UserInterface();
        userInterface.runApplication();
    }
}
