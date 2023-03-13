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

package br.ifsul.edu.topics.exercises;

import java.util.Scanner;

/* 1) Defina um método que receba por parâmetros dois valores inteiros,
 * esse método deverá calcular a média dos valores recebidos e retornar um
 * float.
*/
public class Exer1 {
    
    // Retorna a média simples de dois números
    public static float media(int n1, int n2) {
        float med;
        med = (n1 + n2) / 2f;
        return (med);
    }
    
    public static void main(String[] args) {
        float med;
        int n1, n2;
        
        // Scanner obj
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        n1 = scn.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = scn.nextInt();
        med = media(n1, n2);
        System.out.println("A média é " + med);
    }
    
}
