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

import java.lang.String;

public class Exer2 {
    static String strDados = "Talvez, no entanto, o maior perigo agora pairando sobre a terra deriva do poder destrutivo das armas modernas que poderia minar a paz no mundo e tornar impossível a vida humana na superfície terrestre.";
    
    /*
        5) Crie um construtor público para essa classe. Defina o método main e codifique uma 
           rotina para utilizar os métodos da classe java.lang.String utilizando a 
           variável estática strDados:
           
           concat, String.valueOf, startsWith endsWith, indexOf, substring, replace, trim, compareto.
    
    */

    public void manipulaString() {
	String strAuxiliar;
	
	// Concat
	strAuxiliar = "Discurso do Fidel: ".concat(strDados);
	System.out.println("~> Uso de CONCAT:\n" + strAuxiliar + "\n");

	// String.valueOf
	int num = 42;
	strAuxiliar = String.valueOf(num);
	System.out.println("~> Uso de String.valueOf:\n" + strAuxiliar + "\n");

	// startWith
	System.out.println("~> Uso de startWith:");

	String strVerificacao = "www";
	strAuxiliar = new String("www.java.com.br");
	boolean boolVerificacao = strAuxiliar.startsWith(strVerificacao);
	System.out.println("\t==> " + strAuxiliar + " começa com " + strVerificacao + "? " + boolVerificacao);
	
    }
    
    public static void main(String args[]){
        Exer2 e2 = new Exer2();
        e2.manipulaString();
    }    
}
