package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {


    public static void main(String[] args) {
        Library.showMessage();
        Library.showMenu();
        Scanner in = new Scanner(System.in);
        Library.selectedMenu(in);
    }

}