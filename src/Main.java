/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;//(Ejercicio1)seleccionamos el nombre cuenta1 y damos a la opcion refactor rename y cambiariamos el nombre de esa variable.
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 0);//(Ejercicio2)hemos introducido el metodo mediante refactor extract metode y le nombramos operativa_cuenta
                                  //Desde aqui podemos acceder a el.
    }

    public static void operativa_cuenta(CCuenta cuenta1,float cantidad) {//(Ejercicio4)Añadimos el parametro y nos da un erro en operativa_cuenta
	try {                                                            // y añadimos el argumento en la inicializacion de operativa cuenta.
            cuenta1.retirar(2300);
            //modificado
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
