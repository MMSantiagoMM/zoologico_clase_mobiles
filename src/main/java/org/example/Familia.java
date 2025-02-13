package org.example;

public class Familia {
    private Animal mama;
    private Animal hijo;
    private Animal papa;



    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }

    public Familia() {
    }

    public void imprimirFamilia(){

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println("El papá es: "+this.mama.getNombre()+
                        "\nLa mamá es: "+this.papa.getNombre()+
                            "\nEl hijo es: "+this.hijo.getNombre());
    }


    public void tenerHijo(String nombre){

        if(this.mama.pareja!=null){

            Animal hijo= new Animal();
            hijo.setNombre(nombre);
            hijo.setPeso(1);
            double random = Math.random();
            if(random<0.5){
                hijo.setGenero("F");
            }else{
                hijo.setGenero("M");
            }
            this.hijo=hijo;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }

    }




}
