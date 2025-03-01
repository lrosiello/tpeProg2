package Proyecto;


import java.util.ArrayList;

public class Produccion {
	
	/*ATRIBUTOS DE LA PRODUCCION*/
	
	private int maxBatallas;
	private Desafio tipoDesafioBatalla;
	
	private ArrayList<Cancion> temas;
	private Coach coach1;
	private Coach coach2;
	
	
	/*CONSTRUCTOR*/
	public Produccion(int maxBatallas, Desafio tipoDesafioBatalla, Coach coach1, Coach coach2) {
		this.maxBatallas = maxBatallas;
		this.tipoDesafioBatalla = tipoDesafioBatalla;
		this.temas = new ArrayList<>();
		this.coach1 = coach1;
		this.coach2 = coach2;
	}
	/*GETTERS Y SETTERS*/

	public int getMaxBatallas() {
		return maxBatallas;
	}
	public void setMaxBatallas(int maxBatallas) {
		this.maxBatallas = maxBatallas;
	}
	public Desafio getTipoDesafioBatalla() {
		return tipoDesafioBatalla;
	}
	public void setTipoDesafioBatalla(Desafio tipoDesafioBatalla) {
		this.tipoDesafioBatalla = tipoDesafioBatalla;
	}

	public void addTema(Cancion tema) {
		if(!temas.contains(tema)) {
			temas.add(tema);
		}
	}
	

	/*CORRECCION GET Y SET DE LOS COUCHES*/
	public Coach getCoach1() {
		return coach1;
	}

	public void setCoach1(Coach coach1) {
		this.coach1 = coach1;
	}

	public Coach getCoach2() {
		return coach2;
	}

	public void setCoach2(Coach coach2) {
		this.coach2 = coach2;
	}

	/*CORRECCION, SIN BATALLAS FINALES*/
	public void iniciar() {
		int index=1; /*Indice auxiliar*/
		int puntosCoach1 = 0;
		int puntosCoach2 = 0;
		ElementoParticipanteAbs Participante1 = null;
		ElementoParticipanteAbs Participante2 = null;
		
		
		
		/*CORRECCION, ELIMINADO DE RONDA FINAL*/
		for(int rondas = 1; rondas <= this.getMaxBatallas(); rondas++) {
				Cancion tema = this.temaElegido(index, rondas);/*LA PRODUCCION ELIGE TEMA POR METODO*/
				System.out.println("RONDA: " + rondas + ", TEMA: " + tema);
				Participante1 = this.getCoach1().getParticipantesBatalla(tema, getTipoDesafioBatalla());
				Participante2 = this.getCoach2().getParticipantesBatalla(tema, getTipoDesafioBatalla());
				if(Participante1 != null && Participante2 != null) {
					ElementoParticipanteAbs ganadorRonda = batallar(Participante1,Participante2);
					if(ganadorRonda.equals(Participante1)) {
						puntosCoach1++;
						System.out.println("El ganador de ronda es "+ Participante1);
					}else if(ganadorRonda.equals(Participante2)) {
						puntosCoach2++;
						System.out.println("El ganador de ronda es "+ Participante2);
					}else {
						System.out.println("la ronda es empatada");
					}
							
				}else {
					if(Participante1 != null && Participante2 == null) {
						puntosCoach1++;
						System.out.println("��Por falta de participante apto!! " + 
								"ganador de ronda: "+ Participante1);
					}else {
						puntosCoach2++;
						System.out.println("��Por falta de participante apto!! " + 
								"ganador de ronda: "+ Participante2);
					}
				}
				index++;	/*CONTROL DE INDICES UTILES PARA EL METODO DE ELECCION DE TEMA*/
				if(index==this.temas.size()) {
					index=0;
				}
			}
		
		
		if(puntosCoach1 > puntosCoach2) {
			System.out.println("El ganador es " + this.getCoach1().getNombre() + " " + this.getCoach1().getApellido() + " con " + puntosCoach1);
		}else {
			System.out.println("El ganador es " + this.getCoach2().getNombre() + " " + this.getCoach2().getApellido() + " con " + puntosCoach2);
		}}
		
		/*METODO DE ELECCION DE TEMA, SIEMPRE ASEGURA QUE EL TEMA FINAL SEA EN ULTIMA RONDA*/
		public Cancion temaElegido(int index, int rondas) {
			ArrayList<Cancion> temaElegido = this.temas;
			if(rondas==this.getMaxBatallas()) {
				return temaElegido.get(this.temas.size()-1); /*Devuelve tema final en ultima ronda*/
			}else if(index==this.temas.size()-1) {
				return temaElegido.get(0);    /*Evita que devuelva un tema final a mitad de competencia*/
			}else {
				return temaElegido.get(index); /*Devuelve un tema*/
			}
		}
	
		/*METODO QUE DEVUELVE GANADOR DE BATALLA*/
		public ElementoParticipanteAbs batallar(ElementoParticipanteAbs p1,ElementoParticipanteAbs p2) {
			int res = this.getTipoDesafioBatalla().compare(p1, p2);
			if(res>0) {
				return p1;
			}else if(res<0) {
				return p2;
			}else {
				return null;
			}
		}
	
	
	
}
