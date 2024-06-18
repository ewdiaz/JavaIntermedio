package com.sqa.main;

import com.sqa.autenticacion.AuthenticatorFactory;
import com.sqa.interfaces.Authenticator;
import com.sqa.procesos.LoginManager;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona el tipo de autenticacion: ");
        System.out.println("1. Autenticacion basica");
        System.out.println("2. Autenticacion OAuth");
        System.out.print("Ingresa 1 o 2: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Authenticator authenticator = null;
        if (choice == 1) {
            authenticator = AuthenticatorFactory.createAuthenticator("basic");
        } else if (choice == 2) {
            authenticator = AuthenticatorFactory.createAuthenticator("oauth");
        } else {
            System.out.println("Seleccion invalida");
            scanner.close();
            return;
        }

        LoginManager loginManager = new LoginManager(authenticator);

        System.out.print("Ingresa el nombre: ");
        String username = scanner.nextLine();

        System.out.print("Ingresa la contraseña: ");
        String password = scanner.nextLine();

        boolean success = loginManager.login(username, password);
        if (success) {
            System.out.println("Autenticacion exitosa!");
        } else {
            System.out.println("Autenticacion fallida!");
        }

        scanner.close();
    }
}

