package Examen2022;

import java.util.Arrays;

/**
 *
 *Exceptions
 *
 */
class TresEnRayaException extends Exception {
    public TresEnRayaException(String message) {
        super(message);
    }
}

class Utilidades {
    public static boolean hayRaya(char[][] tabla, int fila, int columna, char jugador) throws TresEnRayaException {
        // Verificar que la celda existe
        if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
            throw new TresEnRayaException("No existe la celda");
        }
        // Verificar si la fila ya tiene una raya
        if (tabla[fila][0] == jugador && tabla[fila][1] == jugador && tabla[fila][2] == jugador) {
            throw new TresEnRayaException("Esta tabla ya tiene una raya");
        }
        // Verificar si la columna ya tiene una raya
        if (tabla[0][columna] == jugador && tabla[1][columna] == jugador && tabla[2][columna] == jugador) {
            throw new TresEnRayaException("Esta tabla ya tiene una raya");
        }
        // Verificar si la diagonal principal ya tiene una raya
        if (fila == columna && tabla[0][0] == jugador && tabla[1][1] == jugador && tabla[2][2] == jugador) {
            throw new TresEnRayaException("Esta tabla ya tiene una raya");
        }
        // Verificar si la diagonal secundaria ya tiene una raya
        if (fila + columna == 2 && tabla[0][2] == jugador && tabla[1][1] == jugador && tabla[2][0] == jugador) {
            throw new TresEnRayaException("Esta tabla ya tiene una raya");
        }
        // Verificar que la celda está libre
        if (tabla[fila][columna] != '_') {
            throw new TresEnRayaException("Celda ocupada");
        }

        tabla[fila][columna]=jugador;

        // Si no se ha lanzado ninguna excepción, verificar si se forma una raya con el movimiento
        char[] ojala = new char[]{jugador, jugador, jugador};
        char[] filaActual = tabla[fila];
        char[] columnaActual = {tabla[0][columna], tabla[1][columna], tabla[2][columna]};
        char[] diagonalPrincipal = {tabla[0][0], tabla[1][1], tabla[2][2]};
        char[] diagonalSecundaria = {tabla[0][2], tabla[1][1], tabla[2][0]};
        return (Arrays.equals(filaActual,ojala) ||
                Arrays.equals(columnaActual, ojala) ||
                Arrays.equals(diagonalPrincipal, ojala) ||
                Arrays.equals(diagonalSecundaria, ojala));
    }

    public static void main(String[] args) {
        char[][] tabla={ {'X','_','X'}, {'O','_','O'}, {'X','_','_'} };
        try{
            System.out.println(Utilidades.hayRaya(tabla,0,1,'X')?"SI":"NO");
        }catch (TresEnRayaException e) {
            System.out.println(e.getMessage());
        }
    }
}
