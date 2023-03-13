/*
 * The MIT License
 *
 * Copyright 2023 Lucas Zunho <lucaszunho17@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package br.edu.ifsul.topics.exercises;

import java.util.Scanner;
import javax.swing.JOptionPane;

/* 1) Defina um método que receba por parâmetros dois valores inteiros,
 * esse método deverá calcular a média dos valores recebidos e retornar um
 * float.
*/
public class Exer1 {
    
    // Retorna a média simples de dois números
    public static float mediaSimples(int n1, int n2) {
        float med;
        med = (n1 + n2) / 2f;
        return (med);
    }
    
    public static void main(String[] args) {
        boolean useGraphical = false;
        float med;
        int n1, n2;

        // Commandline arguments handler
        for (int i = 0; i < args.length; i++) {
            if (args[i] == "--graphical" || args[i] == "-g") {
                useGraphical = true;
            }
        }

        // Escolha de entrada de dados
        if (useGraphical) {
            // Mensagem de entrada
            JOptionPane.showMessageDialog(null, "Calculo de média simples de DOIS números");

            // Entrada do usuário de maneira gráfica
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor o primeiro número? "));
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor o segundo número? "));

            // Cálculo da média simples
            med = mediaSimples(n1, n2);
            JOptionPane.showMessageDialog(null, "A média dos números " + n1 + " e " + n2 + " é " + med);
        } else {
            // Scanner obj
            Scanner scn = new Scanner(System.in);

            // Entrada do usuário
            System.out.print("Digite o primeiro número: ");
            n1 = scn.nextInt();
            System.out.print("Digite o segundo número: ");
            n2 = scn.nextInt();

            // Calculo da média simples
            med = mediaSimples(n1, n2);
            System.out.println("A média é " + med);

            // Exit
            scn.close();
        }
    }
    
}
