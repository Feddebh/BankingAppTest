package com.main.example;

import java.util.Scanner;

public class BankAccount
{   //Atributos
    private int saldo;
    private int transaccionPrevia;
    private String nombreCliente;
    private String idCliente;

    //Constructor
    public BankAccount(String nombreCliente, String idCliente) {
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
    }

    //Metodos

    public void depositar(int cantidad){
        if (cantidad != 0){
            saldo = saldo + cantidad;
            transaccionPrevia = cantidad;
        }
    }

    public void retirar(int cantidad){
            if (cantidad != 0) {
                saldo = saldo - cantidad;
                transaccionPrevia = -cantidad;
            }
    }

    public void verTransaccionPrevia(){
        if(transaccionPrevia >= 0){
            System.out.println("Ud. ha depositado: " + transaccionPrevia );
        }
        else if(transaccionPrevia < 0 ){
            System.out.println("Ud. ha retirado " + Math.abs(transaccionPrevia));
        }
        else {
            System.out.println("Ud. no ha realizado una transaccion");
        }
    }

    public void showMenu(){
        char opcion = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido, " + nombreCliente);
        System.out.println("Your Id is: " + idCliente);
        System.out.println("\n");
        System.out.println("A. Consultar saldo");
        System.out.println("B. Depositar");
        System.out.println("C. Retirar fondos");
        System.out.println("D. Transaccion anterior");
        System.out.println("E. Salir");

        do {
            System.out.println("********************************************************************");
            System.out.println("Ingrese una opcion:");
            System.out.println("********************************************************************");
            opcion = scanner.next().charAt(0);
            System.out.println("\n");

            switch (opcion){
                case 'A':
                   System.out.println("=============================================");
                   System.out.println("Saldo actual: " + saldo);
                   System.out.println("=============================================");
                   System.out.println("\n");
                   break;

                case 'B':
                    System.out.println("=============================================");
                    System.out.println("Ingrese el monto a depositar:");
                    System.out.println("=============================================");
                    int cantidad = scanner.nextInt();
                    System.out.println();
                    depositar(cantidad);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("=============================================");
                    System.out.println("Ingrese el monto a retirar:");
                    System.out.println("=============================================");
                    int cantidad2 = scanner.nextInt();
                    System.out.println();
                    retirar(cantidad2);
                    System.out.println("\n");
                    break;

                case 'D':
                      System.out.println("=============================================");
                      verTransaccionPrevia();
                      System.out.println("=============================================");
                      System.out.println("\n");
                      break;

                case 'E':
                    System.out.println("*************************************************************");
                    break;

                default:
                    System.out.println("Por favor, ingrese una opcion valida.");
                    break;
            }
        }
        while (opcion != 'E');
        System.out.println("Gracias por utilizar nuestro servicio.");



    }

    }


