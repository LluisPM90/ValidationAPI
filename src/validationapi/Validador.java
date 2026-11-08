/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package validationapi;

/**
 * Classe amb mètodes de validació de dades.
 */
public class Validador {

    /**
     * Comprova que un nom comenci amb una lletra majúscula.
     *
     * @param nom Nom que volem validar.
     * @return true si comença amb majúscula, false en cas contrari.
     */
    public static boolean nomComencaAmbMajuscula(String nom) {

        if (nom == null || nom.trim().isEmpty()) {
            return false;
        }

        return Character.isUpperCase(nom.trim().charAt(0));
    }
}