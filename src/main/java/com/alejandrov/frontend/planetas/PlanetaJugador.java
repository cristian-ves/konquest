package com.alejandrov.frontend.planetas;

import com.alejandrov.backend.Posicion;
import com.alejandrov.backend.jugador.Jugador;

import javax.swing.*;

public class PlanetaJugador extends Planeta{

    private Jugador jugador;
    private String tipo;

    public PlanetaJugador(String nombre, int cantidadNaves, Posicion posicion, double porcentajeMuerte, int produccion, Jugador jugador, String tipo) {
        super(nombre, cantidadNaves, posicion, porcentajeMuerte, produccion);
        this.jugador = jugador;
        this.tipo = tipo;
    }
}