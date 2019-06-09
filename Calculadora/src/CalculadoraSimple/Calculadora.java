/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraSimple;

/**
 *
 * @author Emma
 */
public class Calculadora {

    private String cadena;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;

    public Calculadora() {
        this.cadena = "";
        //this.resultado = 0;
        this.suma = false;
        this.resta = false;
        this.multiplicacion = false;
        this.division = false;
    }

    public String Concatenamiento(String cadena) {
        this.cadena += cadena;
        return this.cadena;
    }

    public void Suma(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        suma = true;
        this.cadena = "";
    }

    public void Resta(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        resta = true;
        this.cadena = "";
    }

    public void Division(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        division = true;
        this.cadena = "";
    }

    public void Multiplicacion(String cadena) {
        this.resultado = Double.parseDouble(cadena);
        multiplicacion = true;
        this.cadena = "";
    }

    public double Resulado(String numero) {
        if (suma == true) {
            resultado += Double.parseDouble(numero);
        } else {
            if (resta == true) {
                resultado -= Double.parseDouble(numero);
            } else {
                if (multiplicacion == true) {
                    resultado *= Double.parseDouble(numero);
                } else {
                    if (division == true) {
                        resultado /= Double.parseDouble(numero);
                    }
                }
            }
        }
        
        suma = false;
        resta = false;
        multiplicacion = false;
        division = false;

        return resultado;
    }
}
