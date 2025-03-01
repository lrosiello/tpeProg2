package Proyecto;


import java.util.ArrayList;

import filtros.Filtro;

public class Participante extends ElementoParticipanteAbs{
	
	/*Atributos*/
	private String apellido;
	private int edad;
	private Banda banda;
	private ArrayList<String> generos, idiomas, instrumentos;
	
	
	/*Constructor*/
	public Participante(String nombre, String apellido, int edad) {
		super(nombre);
		this.apellido = apellido;
		this.edad = edad;
		this.banda = null;
		this.generos = new ArrayList<>();
		this.idiomas = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
	}

	/*Getters*/
	public String getApellido() {
		return apellido;
	}
	public Banda getBanda() {
		return banda;
	}
	public void unoBanda(Banda banda) {
		this.banda = banda;
	}
	
	@Override
	public int getEdad() {
		return edad;
	}

	/*Equals*/
	@Override
	public boolean equals(Object otro) {
		try {
			Participante participante = (Participante) otro;
			return this.getApellido().equals(participante.getApellido())&&
					this.getNombre().equals(participante.getNombre());
		}catch(Exception e){
			return false;
		}
		
	}
	
	/*ToString*/
	
	@Override
	public String toString() {
		return "\n" + this.getApellido() + ", " + this.getNombre() + ". " + this.getEdad() + " a�os. Generos: " + this.getListaDeGeneros() 
		+ ". Idiomas: " + this.getListaDeIdiomas() + ". Instrumentos: " + this.getListaDeInstrumentos() ; 
	}

	public void addGenero(String genero) {
		if(!this.generos.contains(genero)) {
			this.generos.add(genero);
		}
	}

	public void addIdioma(String idioma) {
		if(!this.idiomas.contains(idioma)) {
			this.idiomas.add(idioma);
		}
	}

	public void addInstrumento(String instrumento) {
		if(!this.instrumentos.contains(instrumento)) {
			this.instrumentos.add(instrumento);
		}
	}

	public ArrayList<String> getListaDeGeneros() {
		ArrayList<String> generosAux = new ArrayList<>();
		for (String g: generos) {
			generosAux.add(g);
		}
		return generosAux;
	}

	public ArrayList<String> getListaDeIdiomas() {
		ArrayList<String> idiomasAux = new ArrayList<>();
		for (String g: idiomas) {
			idiomasAux.add(g);
		}
		return idiomasAux;
	}

	public ArrayList<String> getListaDeInstrumentos() {
		ArrayList<String> instrumentosAux = new ArrayList<>();
		for (String g: instrumentos) {
			instrumentosAux.add(g);
		}
		return instrumentosAux;
	}

	@Override
	public ArrayList<ElementoParticipanteAbs> getListaDeParticipantesConFiltro(Filtro f) {
		ArrayList<ElementoParticipanteAbs> participante = new ArrayList<>();
			if (f.cumple(this)){
				participante.add(this);
			}
		return participante;
	}

	/*CORRECCION PUEDE INTERPRETAR CANCION*/
	@Override
	public boolean puedeInterpretarCancion(Cancion cancion) {
		return cancion.esInterpretable(this);
	}


	
	
}
