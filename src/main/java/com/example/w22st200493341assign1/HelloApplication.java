

package com.example.w22st200493341assign1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

import static java.sql.Types.NULL;

public class HelloApplication {


    public static void main(String[] args) {
        Student studentOne = new Student( "Parth" , "Desai", 200493341 );
        Scanner Input = new Scanner(System.in);

        System.out.println("First Name of the Student : " +studentOne.getFirstname());
        System.out.println("Last Name of the Student : " +studentOne.getLastname());
        System.out.println("Student Number: " +studentOne.getStudentNumber());

        System.out.println("Enter Frist Name: ");
        studentOne.setFirstname(Input.nextLine());
        System.out.println("Enter Last Name: ");
        studentOne.setLastname(Input.nextLine());
        System.out.println("Enter Student Number: ");
        studentOne.setStudentNumber(Input.nextInt());

        if(studentOne.getFirstname().isEmpty() || studentOne.getLastname().isEmpty() || studentOne.getStudentNumber() == NULL)
        {
            System.out.println("Please enter appropriate values");
        }
        else
        {
            System.out.println("First Name of the Student : " +studentOne.getFirstname());
            System.out.println("Last Name of the Student : " +studentOne.getLastname());
            System.out.println("Student Number: " +studentOne.getStudentNumber());
        }

    }


}
