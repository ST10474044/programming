/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptionint;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class JOptionInt {

    public static void main(String[] args) {
       String name;
       String EmpNumber;
       
       name = JOptionPane.showInputDialog (null, " Please enter your name ");
       EmpNumber = JOptionPane.showInputDialog( " Please enter your employee number ");
       String input1 = JOptionPane.showInputDialog (null," Please enter your age ");
       int age = Integer.parseInt(input1);
       
       if (age >= 50) {
           JOptionPane.showMessageDialog(null, " Hello " +name+" : "+EmpNumber+ " You are "+age+ " therefore you are eligible for pension" );
       
    }else{
           JOptionPane.showMessageDialog(null," Hello " +name+ " : "+EmpNumber+ " You are " +age+ " therefore you are not eligbible for pension ");
    }
    }
}

