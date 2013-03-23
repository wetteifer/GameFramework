/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw.text;

/**
 *
 * @author wetteifer
 */
public class Notalot35 implements Font {

    private static final byte[][] CHAR_EMPTY =
        {{0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_UNKNOWN =
        {{1,1,1,1,1,1,1,0},
         {1,1,0,0,0,1,1,0},
         {1,0,0,1,0,0,1,0},
         {1,1,0,0,0,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_A_MAYUS =
        {{0,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,1,0,0,0,0},
         {1,1,1,1,1,1,1,0},
         {0,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_B_MAYUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,1,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {0,1,1,0,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_C_MAYUS =
        {{0,1,1,1,1,1,0,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,0,0,0,1,0},
         {1,1,0,0,0,1,1,0},
         {0,1,0,0,0,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_D_MAYUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,0,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {0,1,1,1,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_E_MAYUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,1,0,0,1,0},
         {1,0,0,1,0,0,1,0},
         {1,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_F_MAYUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,1,0,0,0,0},
         {1,0,0,1,0,0,0,0},
         {1,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_G_MAYUS =
        {{0,1,1,1,1,1,0,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,0,0,0,1,0},
         {1,1,0,1,1,1,1,0},
         {0,1,0,1,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_H_MAYUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,1,0,0,0,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_I_MAYUS =
        {{1,0,0,0,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_J_MAYUS =
        {{0,0,0,0,0,1,0,0},
         {0,0,0,0,0,1,1,0},
         {0,0,0,0,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_K_MAYUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,1,0,0,0,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,0,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_L_MAYUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_M_MAYUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,1,0,0,0,0,0,0},
         {0,0,1,0,0,0,0,0},
         {0,1,0,0,0,0,0,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_N_MAYUS =
        {{1,1,1,1,1,1,1,0},
         {0,1,1,1,1,1,1,0},
         {0,0,1,0,0,0,0,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_O_MAYUS =
        {{0,1,1,1,1,1,0,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,0,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {0,1,1,1,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_P_MAYUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,1,0,0,0,0},
         {1,1,1,1,0,0,0,0},
         {0,1,1,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_Q_MAYUS =
        {{0,1,1,1,1,1,0,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,0,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {0,1,1,1,1,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_R_MAYUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,1,0,0,0,0},
         {1,1,1,1,1,1,1,0},
         {0,1,1,0,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_S_MAYUS =
        {{0,1,1,0,0,1,0,0},
         {1,1,1,1,0,1,1,0},
         {1,0,0,1,0,0,1,0},
         {1,1,0,1,1,1,1,0},
         {0,1,0,0,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_T_MAYUS =
        {{1,0,0,0,0,0,0,0},
         {1,0,0,0,0,0,0,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,0,0,0,0,0},
         {1,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_U_MAYUS =
        {{1,1,1,1,1,1,0,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_V_MAYUS =
        {{1,1,1,1,1,0,0,0},
         {1,1,1,1,1,1,0,0},
         {0,0,0,0,0,1,1,0},
         {1,1,1,1,1,1,0,0},
         {1,1,1,1,1,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_W_MAYUS =
        {{1,1,1,1,1,1,0,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,1,1,0,0},
         {0,0,0,1,1,0,0,0},
         {0,0,0,0,1,1,0,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_X_MAYUS =
        {{1,1,1,0,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,1,0,0,0,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,0,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_Y_MAYUS =
        {{1,1,1,0,0,1,0,0},
         {1,1,1,1,0,1,1,0},
         {0,0,0,1,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_Z_MAYUS =
        {{1,0,0,0,1,1,1,0},
         {1,0,0,1,1,1,1,0},
         {1,0,1,1,0,0,1,0},
         {1,1,1,0,0,0,1,0},
         {1,1,0,0,0,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_A_MINUS =
        {{0,0,0,0,0,1,0,0},
         {0,0,1,0,1,1,1,0},
         {0,0,1,0,1,0,1,0},
         {0,0,1,1,1,1,1,0},
         {0,0,0,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_B_MINUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,1,0,0,0,1,0},
         {0,0,1,1,1,1,1,0},
         {0,0,0,1,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_C_MINUS =
        {{0,0,0,1,1,1,0,0},
         {0,0,1,1,1,1,1,0},
         {0,0,1,0,0,0,1,0},
         {0,0,1,1,0,1,1,0},
         {0,0,0,1,0,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_D_MINUS =
        {{0,0,0,1,1,1,0,0},
         {0,0,1,1,1,1,1,0},
         {0,0,1,0,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_E_MINUS =
        {{0,0,0,1,1,1,0,0},
         {0,0,1,1,1,1,1,0},
         {0,0,1,0,1,0,1,0},
         {0,0,1,1,1,0,1,0},
         {0,0,0,1,1,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_F_MINUS =
        {{0,0,1,0,0,0,0,0},
         {0,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {1,0,1,0,0,0,0,0},
         {1,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_G_MINUS =
        {{0,1,1,1,0,0,0,0},
         {1,1,1,1,1,0,1,0},
         {1,0,0,0,1,0,1,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_H_MINUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,1,0,0,0,0,0},
         {0,0,1,1,1,1,1,0},
         {0,0,0,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_I_MINUS =
        {{1,0,1,1,1,1,1,0},
         {1,0,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_J_MINUS =
        {{1,0,1,1,1,1,1,1},
         {1,0,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_K_MINUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,1,0,0,0},
         {0,0,1,1,1,1,1,0},
         {0,0,1,1,0,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_L_MINUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_M_MINUS =
        {{0,0,1,1,1,1,1,0},
         {0,0,1,1,1,1,1,0},
         {0,0,1,0,0,0,0,0},
         {0,0,1,1,1,1,1,0},
         {0,0,1,0,0,0,0,0},
         {0,0,1,1,1,1,1,0},
         {0,0,0,1,1,1,1,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_N_MINUS =
        {{0,0,1,1,1,1,1,0},
         {0,0,1,1,1,1,1,0},
         {0,0,1,0,0,0,0,0},
         {0,0,1,1,1,1,1,0},
         {0,0,0,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_O_MINUS =
        {{0,0,0,1,1,1,0,0},
         {0,0,1,1,1,1,1,0},
         {0,0,1,0,0,0,1,0},
         {0,0,1,1,1,1,1,0},
         {0,0,0,1,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_P_MINUS =
        {{1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,0,1,0,0,0},
         {1,1,1,1,1,0,0,0},
         {0,1,1,1,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_Q_MINUS =
        {{0,1,1,1,0,0,0,0},
         {1,1,1,1,1,0,0,0},
         {1,0,0,0,1,0,0,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_R_MINUS =
        {{0,0,1,1,1,1,1,0},
         {0,0,1,1,1,1,1,0},
         {0,0,1,0,0,0,0,0},
         {0,0,1,1,0,0,0,0},
         {0,0,0,1,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_S_MINUS =
        {{0,0,0,1,1,0,1,0},
         {0,0,1,1,1,0,1,0},
         {0,0,1,0,1,0,1,0},
         {0,0,1,0,1,1,1,0},
         {0,0,1,0,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_T_MINUS =
        {{1,1,1,1,1,1,0,0},
         {1,1,1,1,1,1,1,0},
         {0,0,1,0,0,0,1,0},
         {0,0,1,0,0,1,1,0},
         {0,0,0,0,0,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_U_MINUS =
        {{0,0,1,1,1,1,0,0},
         {0,0,1,1,1,1,1,0},
         {0,0,0,0,0,0,1,0},
         {0,0,1,1,1,1,1,0},
         {0,0,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_V_MINUS =
        {{0,0,1,1,1,0,0,0},
         {0,0,1,1,1,1,0,0},
         {0,0,0,0,0,0,1,0},
         {0,0,1,1,1,1,0,0},
         {0,0,1,1,1,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_W_MINUS =
        {{0,0,1,1,1,1,0,0},
         {0,0,1,1,1,1,1,0},
         {0,0,0,0,0,1,1,0},
         {0,0,0,0,1,1,0,0},
         {0,0,0,0,0,1,1,0},
         {0,0,1,1,1,1,1,0},
         {0,0,1,1,1,1,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_X_MINUS =
        {{0,0,1,1,0,1,1,0},
         {0,0,1,1,1,1,1,0},
         {0,0,0,0,1,0,0,0},
         {0,0,1,1,1,1,1,0},
         {0,0,1,1,0,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_Y_MINUS =
        {{1,1,1,1,0,0,0,0},
         {1,1,1,1,1,0,1,0},
         {0,0,0,0,1,0,1,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_Z_MINUS =
        {{0,0,1,0,0,1,1,0},
         {0,0,1,0,1,1,1,0},
         {0,0,1,1,1,0,1,0},
         {0,0,1,1,0,0,1,0},
         {0,0,1,0,0,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_NUMBER_0 =
        CHAR_LETTER_O_MAYUS;

    private static final byte[][] CHAR_NUMBER_1 =
        {{1,0,0,0,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_NUMBER_2 =
        {{0,1,0,0,0,1,1,0},
         {1,1,0,0,1,1,1,0},
         {1,0,0,1,1,0,1,0},
         {1,1,1,1,0,0,1,0},
         {0,1,1,0,0,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_NUMBER_3 =
        {{0,1,0,0,0,1,0,0},
         {1,1,0,1,0,1,1,0},
         {1,0,0,1,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {0,1,1,0,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_NUMBER_4 =
        {{1,1,1,0,0,0,0,0},
         {1,1,1,1,0,0,0,0},
         {0,0,0,1,0,0,0,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_NUMBER_5 =
        {{1,1,1,1,0,0,1,0},
         {1,1,1,1,0,0,1,0},
         {1,0,0,1,0,0,1,0},
         {1,0,0,1,1,1,1,0},
         {1,0,0,0,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_NUMBER_6 =
        {{0,1,1,1,1,1,0,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,1,0,0,1,0},
         {1,1,0,1,1,1,1,0},
         {0,1,0,0,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_NUMBER_7 =
        {{1,0,0,0,0,1,1,0},
         {1,0,0,0,1,1,1,0},
         {1,0,0,1,1,0,0,0},
         {1,1,1,1,0,0,0,0},
         {1,1,1,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_NUMBER_8 =
        {{0,1,1,0,1,1,0,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,1,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {0,1,1,0,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_NUMBER_9 =
        {{0,1,1,0,0,1,0,0},
         {1,1,1,1,0,1,1,0},
         {1,0,0,1,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {0,1,1,1,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_DOLLAR =
        {{0,0,1,1,0,1,0,0},
         {0,1,1,1,0,1,0,0},
         {1,1,0,1,0,1,1,0},
         {0,1,0,1,1,1,0,0},
         {0,1,0,1,1,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_CENT =
        {{0,0,1,1,1,0,0,0},
         {0,1,1,1,1,1,0,0},
         {1,1,0,0,0,1,1,0},
         {0,1,1,0,1,1,0,0},
         {0,0,1,0,1,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_PLUS =
        {{0,0,0,1,0,0,0,0},
         {0,0,1,1,1,0,0,0},
         {0,0,1,1,1,0,0,0},
         {0,0,0,1,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_MINUS =
        {{0,0,0,1,0,0,0,0},
         {0,0,0,1,0,0,0,0},
         {0,0,0,1,0,0,0,0},
         {0,0,0,1,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_ASTERISK =
        {{0,0,1,0,1,0,0,0},
         {0,0,1,1,1,0,0,0},
         {0,1,1,1,1,1,0,0},
         {0,1,1,1,1,1,0,0},
         {0,0,1,1,1,0,0,0},
         {0,0,1,0,1,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_SLASH =
        {{0,0,0,0,1,1,1,0},
         {0,0,0,1,1,1,1,0},
         {0,0,1,1,0,0,0,0},
         {1,1,1,0,0,0,0,0},
         {1,1,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_OBELUS =
        {{0,0,0,1,0,0,0,0},
         {0,0,0,1,0,0,0,0},
         {0,1,0,1,0,1,0,0},
         {0,0,0,1,0,0,0,0},
         {0,0,0,1,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_EQUALS =
        {{0,0,1,0,1,0,0,0},
         {0,0,1,0,1,0,0,0},
         {0,0,1,0,1,0,0,0},
         {0,0,1,0,1,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_PERCENT =
        {{1,1,0,0,1,1,1,0},
         {1,1,0,1,1,1,1,0},
         {0,0,1,1,0,0,0,0},
         {1,1,1,0,0,1,1,0},
         {1,1,0,0,0,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_DOUBLE_QUOTE =
        {{1,1,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {1,1,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_SINGLE_QUOTE =
        {{1,1,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_NUMBER =
        {{0,1,0,0,0,1,0,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,1,0,0,0,1,0,0},
         {1,1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1,0},
         {0,1,0,0,0,1,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_AT =
        {{0,0,1,1,1,0,0,0},
         {0,1,1,1,1,1,0,0},
         {0,1,0,0,0,1,0,0},
         {0,1,1,1,0,1,0,0},
         {0,0,1,1,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_AMPERSAND =
        {{0,1,1,0,1,1,0,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,1,0,0,1,0},
         {1,0,0,0,0,1,1,0},
         {0,0,0,0,0,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_UNDERSCORE =
        {{0,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_OPEN_ROUND_BRACKET =
        {{0,1,1,1,1,1,0,0},
         {1,1,1,1,1,1,1,0},
         {1,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_CLOSED_ROUND_BRACKET =
        {{1,0,0,0,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {0,1,1,1,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_COMMA =
        {{0,0,0,0,1,1,0,0},
         {0,0,0,0,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_PERIOD =
        {{0,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_SEMICOLON =
        {{0,1,1,0,1,1,0,0},
         {0,1,1,0,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_COLON =
        {{0,1,1,0,1,1,0,0},
         {0,1,1,0,1,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_INVERTED_QUESTION_MARK =
        {{0,0,0,0,1,1,0,0},
         {0,0,0,1,1,1,1,0},
         {1,0,1,1,0,0,1,0},
         {1,0,1,0,0,1,1,0},
         {0,0,0,0,0,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_QUESTION_MARK =
        {{0,1,0,0,0,0,0,0},
         {1,1,0,0,1,0,1,0},
         {1,0,0,1,1,0,1,0},
         {1,1,1,1,0,0,0,0},
         {0,1,1,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_INVERTED_EXCLAMATION_MARK =
        CHAR_LETTER_I_MINUS;

    private static final byte[][] CHAR_SYMBOL_EXCLAMATION_MARK =
        {{1,1,1,1,1,0,1,0},
         {1,1,1,1,1,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_BACKSLASH =
        {{1,1,0,0,0,0,0,0},
         {1,1,1,0,0,0,0,0},
         {0,0,1,1,0,0,0,0},
         {0,0,0,1,1,1,1,0},
         {0,0,0,0,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_VERTICAL_BAR =
        CHAR_LETTER_L_MINUS;

    private static final byte[][] CHAR_SYMBOL_OPEN_CURLY_BRACKET =
        {{0,0,0,1,0,0,0,0},
         {0,1,1,1,1,1,0,0},
         {1,1,1,0,1,1,1,0},
         {1,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_CLOSED_CURLY_BRACKET =
        {{1,0,0,0,0,0,1,0},
         {1,1,1,0,1,1,1,0},
         {0,1,1,1,1,1,0,0},
         {0,0,0,1,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_OPEN_ANGULAR_BRACKET =
        {{0,0,0,1,0,0,0,0},
         {0,0,1,1,1,0,0,0},
         {0,1,1,0,1,1,0,0},
         {0,1,0,0,0,1,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_CLOSED_ANGULAR_BRACKET =
        {{0,1,0,0,0,1,0,0},
         {0,1,1,0,1,1,0,0},
         {0,0,1,1,1,0,0,0},
         {0,0,0,1,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_OPEN_SQUARE_BRACKET =
        {{1,1,1,1,1,1,1,0},
         {1,0,0,0,0,0,1,0},
         {1,0,0,0,0,0,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_CLOSED_SQUARE_BRACKET =
        {{1,0,0,0,0,0,1,0},
         {1,0,0,0,0,0,1,0},
         {1,1,1,1,1,1,1,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_CARET =
        {{0,0,1,1,0,0,0,0},
         {0,1,1,0,0,0,0,0},
         {1,1,0,0,0,0,0,0},
         {0,1,1,0,0,0,0,0},
         {0,0,1,1,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_SYMBOL_TILDE =
        {{0,0,0,1,1,0,0,0},
         {0,0,1,1,1,0,0,0},
         {0,0,1,0,0,0,0,0},
         {0,0,1,1,0,0,0,0},
         {0,0,0,1,1,0,0,0},
         {0,0,0,0,1,0,0,0},
         {0,0,1,1,1,0,0,0},
         {0,0,1,1,0,0,0,0}};

    @Override
    public int getMatrixWidth() {
        return 8;
    }

    @Override
    public int getMatrixHeight() {
        return 8;
    }

    @Override
    public int getFixedCharWidth(char c) {
        if (c >= 'A' && c <= 'Z') {
            if (c >= 'A' && c <= 'H' ||
                c >= 'J' && c <= 'L' ||
                c >= 'N' && c <= 'S' ||
                c == 'U' || c == 'V' ||
                c >= 'X' && c <= 'Z') {
                return 2;
            } else if (c == 'I') {
                return 3;
            } else if (c == 'T') {
                return 1;
            }
        } else if (c >= 'a' && c <= 'z') {
            if (c >= 'a' && c <= 'h' ||
                c == 'k'             ||
                c >= 'n' && c <= 'v' ||
                c >= 'x' && c <= 'z') {
                return 2;
            } else if (c == 'i' || c == 'j' || c == 'l') {
                return 5;
            }
        } else if (c >= '0' && c <= '9') {
            if (c == '1') {
                return 3;
            } else {
                return 2;
            }
        } else {
            switch (c) {
            case '~':
                return -1;
            case '#':
                return 0;
            case '*':
                return 1;
            case '$':
            case '\u00A2': // Cent sign.
            case '/':
            case '\u00F7': // Division sign.
            case '%':
            case '@':
            case '&':
            case '_':
            case '\u00BF': // Inverted question mark.
            case '?':
            case '\\':
            case '^':
                return 2;
            case '+':
            case '-':
            case '=':
            case '{':
            case '}':
            case '<':
            case '>':
                return 3;
            case '\"':
            case '(':
            case ')':
            case '[':
            case ']':
                return 4;
            case ',':
            case ';':
            case ':':
            case '\u00A1': // Inverted exclamation mark.
            case '!':
            case '|':
                return 5;
            case ' ':
            case '\'':
            case '.':
                return 6;
            default:
                return 2; // Unknown character.
            }
        }

        return 0;
    }

    @Override
    public int getFixedCharHeight(char c) {
        switch (c) {
        case 'g':
        case 'p':
        case 'q':
        case 'y':
            return 2;
        default:
            return 0;
        }
    }

    @Override
    public int getStringWidth(char[] string) {
        int width = 0;

        for (int i = 0; i < string.length; i++) {
            char c = string[i];

            if (c >= 'A' && c <= 'Z') {
                if (c >= 'A' && c <= 'H' ||
                    c >= 'J' && c <= 'L' ||
                    c >= 'N' && c <= 'S' ||
                    c == 'U' || c == 'V' ||
                    c >= 'X' && c <= 'Z') {
                    width += 6;
                } else if (c == 'I') {
                    width += 5;
                } else if (c == 'T') {
                    width += 7;
                } else if (c == 'M' || c == 'W') {
                    width += 8;
                }
            } else if (c >= 'a' && c <= 'z') {
                if (c >= 'a' && c <= 'h' ||
                    c == 'k'             ||
                    c >= 'n' && c <= 'v' ||
                    c >= 'x' && c <= 'z') {
                    width += 6;
                } else if (c == 'i' || c == 'j' || c == 'l') {
                    width += 3;
                } else if (c == 'm' || c == 'w') {
                    width += 8;
                }
            } else if (c >= '0' && c <= '9') {
                if (c == '1') {
                    width += 5;
                } else {
                    width += 6;
                }
            } else {
                switch (c) {
                case '~':
                    width += 9; break;
                case '#':
                    width += 8; break;
                case '*':
                    width += 7; break;
                case '$':
                case '\u00A2': // Cent sign.
                case '/':
                case '\u00F7': // Division sign.
                case '%':
                case '@':
                case '&':
                case '_':
                case '\u00BF': // Inverted question mark.
                case '?':
                case '\\':
                case '^':
                    width += 6; break;
                case '+':
                case '-':
                case '=':
                case '{':
                case '}':
                case '<':
                case '>':
                    width += 5; break;
                case '\"':
                case '(':
                case ')':
                case '[':
                case ']': width += 4; break;
                case ',':
                case ';':
                case ':':
                case '\u00A1': // Inverted exclamation mark.
                case '!':
                case '|':
                    width += 3; break;
                case ' ':
                case '\'':
                case '.':
                    width += 2; break;
                default:
                    width += 6; break; // Unknown character.
                }
            }
        }

        return width - 1;
    }

    @Override
    public int getStringHeight(char[] string) {
        int height = 8;
        char c;

    loop:
        for (int i = 0; i < string.length; i++) {
            c = string[i];
            switch (c) {
            case 'g':
            case 'p':
            case 'q':
            case 'y':
                height += 2;

                // Ya no buscamos, por el momento solo hay
                // soporte para una sola linea de texto.
                break loop;
            }
        }

        return height - 1;
    }

    @Override
    public byte[][] getMatrix(char c) {
        if (c >= 'A' && c <= 'Z') {
            switch (c) {
            case 'A':
                return CHAR_LETTER_A_MAYUS;
            case 'B':
                return CHAR_LETTER_B_MAYUS;
            case 'C':
                return CHAR_LETTER_C_MAYUS;
            case 'D':
                return CHAR_LETTER_D_MAYUS;
            case 'E':
                return CHAR_LETTER_E_MAYUS;
            case 'F':
                return CHAR_LETTER_F_MAYUS;
            case 'G':
                return CHAR_LETTER_G_MAYUS;
            case 'H':
                return CHAR_LETTER_H_MAYUS;
            case 'I':
                return CHAR_LETTER_I_MAYUS;
            case 'J':
                return CHAR_LETTER_J_MAYUS;
            case 'K':
                return CHAR_LETTER_K_MAYUS;
            case 'L':
                return CHAR_LETTER_L_MAYUS;
            case 'M':
                return CHAR_LETTER_M_MAYUS;
            case 'N':
                return CHAR_LETTER_N_MAYUS;
            case 'O':
                return CHAR_LETTER_O_MAYUS;
            case 'P':
                return CHAR_LETTER_P_MAYUS;
            case 'Q':
                return CHAR_LETTER_Q_MAYUS;
            case 'R':
                return CHAR_LETTER_R_MAYUS;
            case 'S':
                return CHAR_LETTER_S_MAYUS;
            case 'T':
                return CHAR_LETTER_T_MAYUS;
            case 'U':
                return CHAR_LETTER_U_MAYUS;
            case 'V':
                return CHAR_LETTER_V_MAYUS;
            case 'W':
                return CHAR_LETTER_W_MAYUS;
            case 'X':
                return CHAR_LETTER_X_MAYUS;
            case 'Y':
                return CHAR_LETTER_Y_MAYUS;
            case 'Z':
                return CHAR_LETTER_Z_MAYUS;
            }
        } else if (c >= 'a' && c <= 'z') {
            switch (c) {
            case 'a':
                return CHAR_LETTER_A_MINUS;
            case 'b':
                return CHAR_LETTER_B_MINUS;
            case 'c':
                return CHAR_LETTER_C_MINUS;
            case 'd':
                return CHAR_LETTER_D_MINUS;
            case 'e':
                return CHAR_LETTER_E_MINUS;
            case 'f':
                return CHAR_LETTER_F_MINUS;
            case 'g':
                return CHAR_LETTER_G_MINUS;
            case 'h':
                return CHAR_LETTER_H_MINUS;
            case 'i':
                return CHAR_LETTER_I_MINUS;
            case 'j':
                return CHAR_LETTER_J_MINUS;
            case 'k':
                return CHAR_LETTER_K_MINUS;
            case 'l':
                return CHAR_LETTER_L_MINUS;
            case 'm':
                return CHAR_LETTER_M_MINUS;
            case 'n':
                return CHAR_LETTER_N_MINUS;
            case 'o':
                return CHAR_LETTER_O_MINUS;
            case 'p':
                return CHAR_LETTER_P_MINUS;
            case 'q':
                return CHAR_LETTER_Q_MINUS;
            case 'r':
                return CHAR_LETTER_R_MINUS;
            case 's':
                return CHAR_LETTER_S_MINUS;
            case 't':
                return CHAR_LETTER_T_MINUS;
            case 'u':
                return CHAR_LETTER_U_MINUS;
            case 'v':
                return CHAR_LETTER_V_MINUS;
            case 'w':
                return CHAR_LETTER_W_MINUS;
            case 'x':
                return CHAR_LETTER_X_MINUS;
            case 'y':
                return CHAR_LETTER_Y_MINUS;
            case 'z':
                return CHAR_LETTER_Z_MINUS;
            }
        } else if (c >= '0' && c <= '9') {
            switch (c) {
            case '0':
                return CHAR_NUMBER_0;
            case '1':
                return CHAR_NUMBER_1;
            case '2':
                return CHAR_NUMBER_2;
            case '3':
                return CHAR_NUMBER_3;
            case '4':
                return CHAR_NUMBER_4;
            case '5':
                return CHAR_NUMBER_5;
            case '6':
                return CHAR_NUMBER_6;
            case '7':
                return CHAR_NUMBER_7;
            case '8':
                return CHAR_NUMBER_8;
            case '9':
                return CHAR_NUMBER_9;
            }
         } else {
            switch (c) {
            case ' ':
                return CHAR_EMPTY;
            case '~':
                return CHAR_SYMBOL_TILDE;
            case '#':
                return CHAR_SYMBOL_NUMBER;
            case '*':
                return CHAR_SYMBOL_ASTERISK;
            case '$':
                return CHAR_SYMBOL_DOLLAR;
            case '\u00A2':
                return CHAR_SYMBOL_CENT;
            case '/':
                return CHAR_SYMBOL_SLASH;
            case '\u00F7':
                return CHAR_SYMBOL_OBELUS;
            case '%':
                return CHAR_SYMBOL_PERCENT;
            case '@':
                return CHAR_SYMBOL_AT;
            case '&':
                return CHAR_SYMBOL_AMPERSAND;
            case '_':
                return CHAR_SYMBOL_UNDERSCORE;
            case '\u00BF':
                return CHAR_SYMBOL_INVERTED_QUESTION_MARK;
            case '?':
                return CHAR_SYMBOL_QUESTION_MARK;
            case '\\':
                return CHAR_SYMBOL_BACKSLASH;
            case '^':
                return CHAR_SYMBOL_CARET;
            case '+':
                return CHAR_SYMBOL_PLUS;
            case '-':
                return CHAR_SYMBOL_MINUS;
            case '=':
                return CHAR_SYMBOL_EQUALS;
            case '{':
                return CHAR_SYMBOL_OPEN_CURLY_BRACKET;
            case '}':
                return CHAR_SYMBOL_CLOSED_CURLY_BRACKET;
            case '<':
                return CHAR_SYMBOL_OPEN_ANGULAR_BRACKET;
            case '>':
                return CHAR_SYMBOL_CLOSED_ANGULAR_BRACKET;
            case '\"':
                return CHAR_SYMBOL_DOUBLE_QUOTE;
            case '\'':
                return CHAR_SYMBOL_SINGLE_QUOTE;
            case '(':
                return CHAR_SYMBOL_OPEN_ROUND_BRACKET;
            case ')':
                return CHAR_SYMBOL_CLOSED_ROUND_BRACKET;
            case '[':
                return CHAR_SYMBOL_OPEN_SQUARE_BRACKET;
            case ']':
                return CHAR_SYMBOL_CLOSED_SQUARE_BRACKET;
            case ',':
                return CHAR_SYMBOL_COMMA;
            case ';':
                return CHAR_SYMBOL_SEMICOLON;
            case ':':
                return CHAR_SYMBOL_COLON;
            case '\u00A1':
                return CHAR_SYMBOL_INVERTED_EXCLAMATION_MARK;
            case '!':
                return CHAR_SYMBOL_EXCLAMATION_MARK;
            case '|':
                return CHAR_SYMBOL_VERTICAL_BAR;
            case '.':
                return CHAR_SYMBOL_PERIOD;
            }
         }
        return CHAR_UNKNOWN;
    }

}
