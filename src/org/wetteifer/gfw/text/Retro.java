/*
 * To change this template,choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw.text;

/**
 *
 * @author wetteifer
 */
public class Retro implements Font {

    private static final byte[][] CHAR_EMPTY =
        {{0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_UNKNOWN =
        {{1,1,1,1,1,1,1},
         {1,1,0,0,0,1,1},
         {1,0,0,1,0,0,1},
         {1,1,0,0,0,1,1},
         {1,1,1,1,1,1,1},
         {0,0,0,0,0,0,0},
         {0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_A_MAYUS =
        {{0,0,1,1,1,1,1},
         {0,1,1,1,1,1,1},
         {1,1,0,0,1,0,0},
         {1,0,0,0,1,0,0},
         {1,1,0,0,1,0,0},
         {0,1,1,1,1,1,1},
         {0,0,1,1,1,1,1}};

    private static final byte[][] CHAR_LETTER_B_MAYUS =
        {{1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,1,1,1,1,1,1},
         {0,1,1,0,1,1,0}};

    private static final byte[][] CHAR_LETTER_C_MAYUS =
        {{0,0,1,1,1,0,0},
         {0,1,1,1,1,1,0},
         {1,1,0,0,0,1,1},
         {1,0,0,0,0,0,1},
         {1,0,0,0,0,0,1},
         {1,1,0,0,0,1,1},
         {0,1,0,0,0,1,0}};

    private static final byte[][] CHAR_LETTER_D_MAYUS =
        {{1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {1,0,0,0,0,0,1},
         {1,0,0,0,0,0,1},
         {1,1,0,0,0,1,1},
         {0,1,1,1,1,1,0},
         {0,0,1,1,1,0,0}};

    private static final byte[][] CHAR_LETTER_E_MAYUS =
        {{1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,0,0,0,0,0,1}};

    private static final byte[][] CHAR_LETTER_F_MAYUS =
        {{1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {1,0,0,1,0,0,0},
         {1,0,0,1,0,0,0},
         {1,0,0,1,0,0,0},
         {1,0,0,1,0,0,0},
         {1,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_G_MAYUS =
        {{0,0,1,1,1,0,0},
         {0,1,1,1,1,1,0},
         {1,1,0,0,0,1,1},
         {1,0,0,0,0,0,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,1,1,1},
         {1,0,0,1,1,1,1}};

    private static final byte[][] CHAR_LETTER_H_MAYUS =
        {{1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {0,0,0,1,0,0,0},
         {0,0,0,1,0,0,0},
         {0,0,0,1,0,0,0},
         {1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1}};

    private static final byte[][] CHAR_LETTER_I_MAYUS =
        {{1,0,0,0,0,0,1},
         {1,0,0,0,0,0,1},
         {1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {1,0,0,0,0,0,1},
         {1,0,0,0,0,0,1},
         {0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_J_MAYUS =
        {{0,0,0,0,0,1,0},
         {0,0,0,0,0,1,1},
         {1,0,0,0,0,0,1},
         {1,0,0,0,0,0,1},
         {1,1,1,1,1,1,1},
         {1,1,1,1,1,1,0},
         {1,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_K_MAYUS =
        {{1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {0,0,0,1,1,0,0},
         {0,0,1,1,1,1,0},
         {0,1,1,0,1,1,0},
         {1,1,0,0,0,1,1},
         {1,0,0,0,0,0,1}};

    private static final byte[][] CHAR_LETTER_L_MAYUS =
        {{1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {0,0,0,0,0,0,1},
         {0,0,0,0,0,0,1},
         {0,0,0,0,0,0,1},
         {0,0,0,0,0,0,1},
         {0,0,0,0,0,0,1}};

    private static final byte[][] CHAR_LETTER_M_MAYUS =
        {{1,1,1,1,1,1,1},
         {0,1,1,1,1,1,1},
         {0,0,1,1,0,0,0},
         {0,0,0,1,1,0,0},
         {0,0,1,1,0,0,0},
         {0,1,1,1,1,1,1},
         {1,1,1,1,1,1,1}};

    private static final byte[][] CHAR_LETTER_N_MAYUS =
        {{1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {0,1,1,0,0,0,0},
         {0,0,1,1,0,0,0},
         {0,0,0,1,1,0,0},
         {1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1}};

    private static final byte[][] CHAR_LETTER_O_MAYUS =
        {{0,1,1,1,1,1,0},
         {1,1,1,1,1,1,1},
         {1,0,0,0,0,0,1},
         {1,0,0,0,0,0,1},
         {1,0,0,0,0,0,1},
         {1,1,1,1,1,1,1},
         {0,1,1,1,1,1,0}};

    private static final byte[][] CHAR_LETTER_P_MAYUS =
        {{1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {1,0,0,1,0,0,0},
         {1,0,0,1,0,0,0},
         {1,0,0,1,0,0,0},
         {1,1,1,1,0,0,0},
         {0,1,1,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_Q_MAYUS =
        {{0,1,1,1,1,1,0},
         {1,1,1,1,1,1,1},
         {1,0,0,0,0,0,1},
         {1,0,0,0,1,0,1},
         {1,0,0,0,1,1,0},
         {1,1,1,1,1,1,1},
         {0,1,1,1,1,0,1}};

    private static final byte[][] CHAR_LETTER_R_MAYUS =
        {{1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {1,0,0,1,0,0,0},
         {1,0,0,1,1,0,0},
         {1,0,0,1,1,1,0},
         {1,1,1,1,0,1,1},
         {0,1,1,0,0,0,1}};

    private static final byte[][] CHAR_LETTER_S_MAYUS =
        {{0,1,1,0,0,1,0},
         {1,1,1,1,0,1,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,1,0,1,1,1,1},
         {0,1,0,0,1,1,0}};

    private static final byte[][] CHAR_LETTER_T_MAYUS =
        {{1,0,0,0,0,0,0},
         {1,0,0,0,0,0,0},
         {1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {1,0,0,0,0,0,0},
         {1,0,0,0,0,0,0},
         {0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_U_MAYUS =
        {{1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1},
         {0,0,0,0,0,0,1},
         {0,0,0,0,0,0,1},
         {0,0,0,0,0,0,1},
         {1,1,1,1,1,1,1},
         {1,1,1,1,1,1,0}};

    private static final byte[][] CHAR_LETTER_V_MAYUS =
        {{1,1,1,1,1,0,0},
         {1,1,1,1,1,1,0},
         {0,0,0,0,0,1,1},
         {0,0,0,0,0,0,1},
         {0,0,0,0,0,1,1},
         {1,1,1,1,1,1,0},
         {1,1,1,1,1,0,0}};

    private static final byte[][] CHAR_LETTER_W_MAYUS =
        {{1,1,1,1,1,1,0},
         {1,1,1,1,1,1,1},
         {0,0,0,0,0,1,1},
         {0,0,0,0,1,1,0},
         {0,0,0,0,0,1,1},
         {1,1,1,1,1,1,1},
         {1,1,1,1,1,1,0}};

    private static final byte[][] CHAR_LETTER_X_MAYUS =
        {{1,0,0,0,0,1,1},
         {1,1,0,0,1,1,0},
         {0,1,1,1,1,0,0},
         {0,0,1,1,0,0,0},
         {0,1,1,1,1,0,0},
         {1,1,0,0,1,1,0},
         {1,0,0,0,0,1,1}};

    private static final byte[][] CHAR_LETTER_Y_MAYUS =
        {{1,1,1,0,0,0,0},
         {1,1,1,1,0,0,0},
         {0,0,0,1,1,1,1},
         {0,0,0,1,1,1,1},
         {1,1,1,1,0,0,0},
         {1,1,1,0,0,0,0},
         {0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_LETTER_Z_MAYUS =
        {{1,0,0,0,0,1,1},
         {1,0,0,0,1,1,1},
         {1,0,0,1,1,0,1},
         {1,0,1,1,0,0,1},
         {1,1,1,0,0,0,1},
         {1,1,0,0,0,0,1},
         {1,0,0,0,0,0,1}};

    private static final byte[][] CHAR_NUMBER_0 =
        {{0,1,1,1,1,1,0},
         {1,1,1,1,1,1,1},
         {1,0,0,0,0,0,1},
         {1,0,0,0,0,0,1},
         {1,1,1,1,1,1,1},
         {0,1,1,1,1,1,0},
         {0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_NUMBER_1 =
        {{0,0,0,0,0,0,1},
         {0,1,0,0,0,0,1},
         {1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {0,0,0,0,0,0,1},
         {0,0,0,0,0,0,1},
         {0,0,0,0,0,0,0}};

    private static final byte[][] CHAR_NUMBER_2 =
        {{0,1,0,0,0,1,1},
         {1,1,0,0,1,1,1},
         {1,0,0,1,1,0,1},
         {1,0,0,1,0,0,1},
         {1,0,1,1,0,0,1},
         {1,1,1,0,0,0,1},
         {0,1,0,0,0,0,1}};

    private static final byte[][] CHAR_NUMBER_3 =
        {{0,1,0,0,0,1,0},
         {1,1,0,0,0,1,1},
         {1,0,0,0,0,0,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,1,1,1,1,1,1},
         {0,1,1,0,1,1,0}};

    private static final byte[][] CHAR_NUMBER_4 =
        {{0,0,0,1,1,0,0},
         {0,0,1,1,1,0,0},
         {0,1,1,0,1,0,0},
         {1,1,0,0,1,0,0},
         {1,1,1,1,1,1,1},
         {1,1,1,1,1,1,1},
         {0,0,0,0,1,0,0}};

    private static final byte[][] CHAR_NUMBER_5 =
        {{1,1,1,0,0,1,0},
         {1,1,1,0,0,1,1},
         {1,0,1,0,0,0,1},
         {1,0,1,0,0,0,1},
         {1,0,1,0,0,0,1},
         {1,0,1,1,1,1,1},
         {0,0,0,1,1,1,0}};

    private static final byte[][] CHAR_NUMBER_6 =
        {{0,1,1,1,1,1,0},
         {1,1,1,1,1,1,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,1,0,1,1,1,1},
         {0,1,0,0,1,1,0}};

    private static final byte[][] CHAR_NUMBER_7 =
        {{1,0,0,0,0,0,0},
         {1,0,0,0,0,0,0},
         {1,0,0,1,1,1,1},
         {1,0,1,1,1,1,1},
         {1,1,1,0,0,0,0},
         {1,1,0,0,0,0,0},
         {1,0,0,0,0,0,0}};

    private static final byte[][] CHAR_NUMBER_8 =
        {{0,1,1,0,1,1,0},
         {1,1,1,1,1,1,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,1,1,1,1,1,1},
         {0,1,1,0,1,1,0}};

    private static final byte[][] CHAR_NUMBER_9 =
        {{0,1,1,0,0,0,0},
         {1,1,1,1,0,0,0},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,0,1},
         {1,0,0,1,0,1,1},
         {1,1,1,1,1,1,0},
         {0,1,1,1,1,0,0}};

    @Override
    public int getMatrixWidth() {
        return 7;
    }

    @Override
    public int getMatrixHeight() {
        return 7;
    }

    @Override
    public int getFixedCharWidth(char c) {
        if (c == ' ') {
            return 5;
        }

        switch (c) {
            case 'I': case 'T':
            case 'Y': case '0':
            case '1':
                return 0;
        }

        if (c >= 'A' && c <= 'H' ||
            c >= 'J' && c <= 'S' ||
            c >= 'U' && c <= 'X' ||
            c == 'Z' ||
            c >= '2' && c <= '9') {
            return -1;
        }

        return 1;
    }

    @Override
    public int getFixedCharHeight(char c) {
        return 0;
    }

    @Override
    public int getStringWidth(char[] string) {
        int width = 0;

        for (int i = 0; i < string.length; i++) {
            char c = string[i];

            if (c == ' ') {
                width += 2;
                continue;
            }

            switch (c) {
                case 'I': case 'T':
                case 'Y': case '0':
                case '1':
                    width += 7;
                    continue;
            }

            if (c >= 'A' && c <= 'H' ||
                c >= 'J' && c <= 'S' ||
                c >= 'U' && c <= 'X' ||
                c == 'Z' ||
                c >= '2' && c <= '9') {
                width += 8;
            } else {
                width += 6; // Char Unknown
            }
        }

        return width - 1;
    }

    @Override
    public int getStringHeight(char[] string) {
        return 7;
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
        } else if (c == ' ') {
            return CHAR_EMPTY;
        }
        return CHAR_UNKNOWN;
    }

}
