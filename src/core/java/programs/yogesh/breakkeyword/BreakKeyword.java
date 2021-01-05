/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.java.programs.yogesh.breakkeyword;

/**
 *
 * @author Yogesh
 */
public class BreakKeyword {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
    }
}
/*
 * The break statement in Java programming language has the following two usages
 * −
 * 
 * When the break statement is encountered inside a loop, the loop is
 * immediately terminated and the program control resumes at the next statement
 * following the loop.
 */