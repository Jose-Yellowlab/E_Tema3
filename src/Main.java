public class Main {
    public static void main(String[] args) {


        Coche miCoche = new Coche();
        miCoche.NumPuertas();
        System.out.println("Resultado Segunda Parte" + " = " + miCoche.Puertas + " " + "Puertas");

        //Ejercicios tema 3
        //Primera parte:
        //Crear una función con tres parámetros que sean números que se suman entre sí.
        //Llamar a la función en el main y darle valores.

        int resultado = suma(10,20,30);
        System.out.println("Resultado Primera Parte" + " = " + resultado);

    }

    public static int suma(int a,int b, int c){
        return a+b+c;
    }


        //Segunda parte:Crear una clase coche.
        //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        //Una función que incremente el número de puertas que tiene el coche.
        //Crear un objeto miCoche en el main y añadirle una puerta.
        //Mostrar el número de puertas que tiene el objeto.


        static class Coche {
            public int Puertas = 4;

            public void NumPuertas () {
                this.Puertas ++;

            }
        }
}










