public class TestMain {
    public static void main(String[] args) {
        Punto puntoRojo = new Punto();
        puntoRojo.setSistema(Sistema.ESPACIO);
        puntoRojo.setEtiqueta("ROJO");
        puntoRojo.setX(4);
        puntoRojo.setY(1.3);
        puntoRojo.setZ(4);

        Punto puntoVerde = new Punto();
        puntoVerde.setSistema(Sistema.ESPACIO);
        puntoVerde.setEtiqueta("VERDE");
        puntoVerde.setX(6);
        puntoVerde.setY(2.7);
        puntoVerde.setZ(6);

        // codigo que debe de utilizar para probar la implementacion de sus metodos
        double distanciaEntrePuntoVerde = puntoRojo.dameDistanciaEntreOtroPunto(puntoVerde);
        System.out.println("distancia = " + distanciaEntrePuntoVerde);

        Punto puntoMedioEntrePuntoVerde = puntoRojo.damePuntoMedioEntreOtroPunto(puntoVerde);
        System.out.println("Punto Medio = " +puntoMedioEntrePuntoVerde );

    }
}
