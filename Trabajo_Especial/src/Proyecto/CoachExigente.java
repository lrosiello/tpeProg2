package Proyecto;

import java.util.ArrayList;
import java.util.Collections;

import filtros.Filtro;

public class CoachExigente extends Coach {
	
	/*CORRECCION, ELIMINADO DE CODIGO REPETIDO*/
	private Filtro filtro;

	public CoachExigente(String nombre, String apellido, Filtro filtro) {
		super(nombre, apellido);
		this.filtro = filtro;
	}
	
	public Filtro getFiltro() {
		return filtro;
	}

	public void setFiltro(Filtro filtro) {
		this.filtro = filtro;
	}

	public void addParticipante(ElementoParticipanteAbs participante) {
		if(filtro.cumple(participante)) {
			if(!this.getListaDeParticipantes().contains(participante)) {
				this.participantes.add(participante);
			}
		}
	}
	

	


	@Override
	public ArrayList<String> getListaOrdenadaDeGeneros(){
		ArrayList<ElementoParticipanteAbs> participantes = this.getListaDeParticipantes();
		ArrayList<String> generos = new ArrayList<>();
		ArrayList<String> aux = new ArrayList<>();
		
		for (ElementoParticipanteAbs participante : participantes) {
			generos.addAll(participante.getListaDeGeneros());
			for (String genero : generos) {
				if(!aux.contains(genero)) {
					aux.add(genero);
				}
			}
		}
		Collections.sort(aux);
		return aux;
	}
	
	

	
	@Override
	public String toString() {
		return "<----------------------------------------------------------------->\n"+
				"<-----EL EQUIPO DE " + this.getNombre().toUpperCase() + " " + this.getApellido().toUpperCase() + 
				":----->\n Idiomas de equipo: " + this.getListaDeIdiomas() +
				".\n Instrumentos de equipo: " + this.getListaDeInstrumentos() + 
				".\n Generos de equipo: " + this.getListaOrdenadaDeGeneros() + 
				".\n El promedio de edad del equipo es de: " + this.getPromedioEdad() + " a�os." + 
				"\n <<<PARTICIPANTES>>>: " + this.getListaDeParticipantes() + 
				"\n<----------------------------------------------------------------->" ;
	}
	
	

}
