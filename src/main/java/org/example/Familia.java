package org.example;

public class Familia {




    Animal papa;
    Animal mama;
    Animal hijo;

    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }



    public void imprimirFamilia(){

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println("El papá es: "+this.mama.nombre+
                        "\nLa mamá es: "+this.papa.nombre+
                            "\nEl hijo es: "+this.hijo.nombre);
    }

    @Override
    public String toString() {
        return "Familia{" +
                "papa=" + papa +
                ", mama=" + mama +
                ", hijo=" + hijo +
                '}';
    }

    public void tenerHijo(String nombre){

        if(this.mama.pareja!=null){

            Animal hijo= new Animal();
            hijo.nombre=nombre;
            hijo.peso=1;
            double random = Math.random();
            if(random<0.5){
                hijo.genero="F";
            }else{
                hijo.genero="M";
            }
            this.hijo=hijo;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }

    }




}
