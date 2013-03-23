/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw.text;

/**
 *
 * @author wetteifer
 */
public interface Font {

    /**
     * Regresa el número de cuadrados horizontalmente.
     * Suponiendo que todas las matrices de caracteres contienen
     * las mismas dimensiones.
     * @return El número de cuadrados horizontalmente.
     */
    int getMatrixWidth();

    /**
     * Regresa el número de cuadrados verticalmente.
     * Suponiendo que todas las matrices de caracteres contienen
     * las mismas dimensiones.
     * @return El número de cuadrados verticalmente.
     */
    int getMatrixHeight();

    /**
     * Regresa el ancho fijo del caracter actual.
     * Si tenemos la siguiente matriz de 8x8:
     *
     *  {{0,1,1,1,1,1,1,0},
     *   {1,1,1,1,1,1,1,0},
     *   {1,0,0,1,0,0,0,0},
     *   {1,1,1,1,1,1,1,0},
     *   {0,1,1,1,1,1,1,0},
     *   {0,0,0,0,0,0,0,0},
     *   {0,0,0,0,0,0,0,0},
     *   {0,0,0,0,0,0,0,0}}
     *
     * El ancho del caracter seria 5.
     * El ancho fijo del caracter seria la cantidad restante
     * de anchura menos uno, en este caso 3 - 1 = 2.
     *
     * @param c Caracter actual.
     * @return El ancho del caracter actual.
     */
    int getFixedCharWidth(char c);

    int getFixedCharHeight(char c);

    int getStringWidth(char[] string);

    int getStringHeight(char[] string);

    byte[][] getMatrix(char c);

}
