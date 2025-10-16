/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Registro {
     public static boolean login(String usuario, String password) {

        boolean usr = false;
        boolean pssw = false;

        String[] spUsuario = new String[10];
        String[] spPassword = new String[10];

        spUsuario[0] = "Super Admin";
        spPassword[0] = "admin";
         spUsuario[1] = "Admin";
        spPassword[1] = "admin";
         spUsuario[2] = "Cajero1";
        spPassword[2] = "admin";
//        if("alumno".equals(password)){
//        return true;
//        }
        
        for (int x = 0; x < spUsuario.length; x++) {
            if (usuario.equals(spUsuario[x]) && spPassword[x].equals(password)) {
              
                usr = true;
                pssw = true;  // ¡Ahora se actualiza correctamente!
            }
        }

        return usr && pssw;
    }
    
}
