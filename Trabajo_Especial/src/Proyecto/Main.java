package Proyecto;


import filtros.*;

public class Main {

	public static void main(String[] args) {
		
		Coach FreddieMercury = new Coach("Freddie","Mercury");
		Coach DavidBowie = new Coach("David","Bowie");
		
		Filtro f1 = new FiltroGenero("Pop"); 
		
		CoachExigente IndioSolari = new CoachExigente("Indio", "Solari", f1);
		
		Participante GuidoSuller = new Participante ("Guido", "Suller", 50);
		Participante SoledadSilveyra = new Participante ("Soledad", "Silveyra", 55);
		Participante DalmaMaradona = new Participante ("Dalma", "Maradona", 38);
		Participante AlejandroLerner = new Participante ("Alejandro", "Lerner", 55);
		Participante LGante = new Participante ("L-", "Gante", 20);
		Participante PeterCapusotto = new Participante ("Peter", "Capusotto", 50);
		Participante AlexGaniggia = new Participante ("Alex", "Caniggia", 30);
		Participante SandraMihanovich = new Participante ("Sandra", "Mihanovich", 50);
		Participante Londra = new Participante ("Paulo", "Londra", 20);
		Participante Trapero = new Participante ("El", "Trapero", 20);
		
		/*GUIDO SULLER*/
		GuidoSuller.addGenero("Pop");
		GuidoSuller.addIdioma("Ingles");
		GuidoSuller.addIdioma("Espa�ol");
		GuidoSuller.addInstrumento("Guitarra");
		GuidoSuller.addInstrumento("Piano");
		/*SOLEDAD SILVEYRA*/
		SoledadSilveyra.addGenero("Romantico");
		SoledadSilveyra.addIdioma("Espa�ol");
		SoledadSilveyra.addInstrumento("Guitarra");
		/*DALMA MARADONA*/
		DalmaMaradona.addGenero("Cumbia");
		DalmaMaradona.addIdioma("Espa�ol");
		DalmaMaradona.addInstrumento("Pandereta");
		/*ALEJANDRO LERNER*/
		AlejandroLerner.addGenero("Rock");
		AlejandroLerner.addGenero("Pop");
		
		AlejandroLerner.addIdioma("Espa�ol");
		AlejandroLerner.addInstrumento("Guitarra");
		AlejandroLerner.addInstrumento("Piano");
		AlejandroLerner.addInstrumento("Bajo");
		/*L GANTE*/
		LGante.addGenero("Cumbia");
		LGante.addGenero("Trap");
		LGante.addIdioma("Espa�ol");
		LGante.addInstrumento("BeatBox");
		/*PETER CAPUSOTTO*/
		PeterCapusotto.addGenero("Rock");
		PeterCapusotto.addIdioma("Ingles");
		PeterCapusotto.addIdioma("Espa�ol");
		PeterCapusotto.addInstrumento("Guitarra");
		PeterCapusotto.addInstrumento("Piano");
		/*ALEX CANIGGIA*/
		AlexGaniggia.addGenero("Trap");
		AlexGaniggia.addIdioma("Espa�ol");
		AlexGaniggia.addIdioma("Ingles");
		AlexGaniggia.addIdioma("Italiano");
		AlexGaniggia.addInstrumento("BeatBox");
		/*SANDRA MIHANOVICH*/
		SandraMihanovich.addGenero("Tango");
		SandraMihanovich.addGenero("Milonga");
		SandraMihanovich.addIdioma("Espa�ol");
		SandraMihanovich.addInstrumento("Guitarra");
		SandraMihanovich.addInstrumento("Piano");
		SandraMihanovich.addInstrumento("Acordeon");
		
		/*PAULO LONDRA*/
		Londra.addGenero("Cumbia");
		Londra.addGenero("Trap");
		Londra.addGenero("Milonga");
		Londra.addIdioma("Espa�ol");
		Londra.addInstrumento("BeatBox");
		
		/*EL TRAPERO*/
		Trapero.addGenero("Cumbia");
		Trapero.addGenero("Trap");
		Trapero.addIdioma("Espa�ol");
		Trapero.addInstrumento("BeatBox");
		
		/*COACHES*/
		/*FREDDIE MERCURY*/
		FreddieMercury.addParticipante(GuidoSuller);
		FreddieMercury.addParticipante(SoledadSilveyra);
		FreddieMercury.addParticipante(AlejandroLerner);
		FreddieMercury.addParticipante(DalmaMaradona);
		/*DAVID BOWIE*/
		DavidBowie.addParticipante(LGante);
		DavidBowie.addParticipante(PeterCapusotto);
		DavidBowie.addParticipante(AlexGaniggia);
		DavidBowie.addParticipante(SandraMihanovich);
		DavidBowie.addParticipante(Trapero);
		DavidBowie.addParticipante(Londra);
		/*INDIO SOLARI*/
		IndioSolari.addParticipante(GuidoSuller);
		IndioSolari.addParticipante(SoledadSilveyra);
		
		/*IMPRIMIR*/
		/*EQUIPO DE FREDDIE*/
		System.out.println(FreddieMercury);
		/*EQUIPO DE DAVID*/
		System.out.println(DavidBowie);
		/*EQUIPO DE INDIO*/
		System.out.println(IndioSolari);
		
		
		
		Banda LosLocos = new Banda("LosLocos");
		LosLocos.addMiembros(SandraMihanovich);
		LosLocos.addMiembros(AlexGaniggia);
		LosLocos.addMiembros(LGante);
		LosLocos.addMiembros(Londra);
		LosLocos.addMiembros(Trapero);
		
		Banda LosRockeros = new Banda("LosRock");
		LosRockeros.addMiembros(GuidoSuller);
		LosRockeros.addMiembros(AlejandroLerner);
		LosRockeros.addMiembros(PeterCapusotto);
		LosRockeros.addMiembros(DalmaMaradona);
		
	
		Cancion temaTrap = new Cancion("TrapSong", "Espa�ol");
		temaTrap.addGenero("Trap");
		temaTrap.addGenero("HipHop");
		temaTrap.addGenero("Trap");	
		temaTrap.addGenero("HipHop");
		temaTrap.addInstrumento("BeatBox");
		Cancion temaRock = new Cancion("RockSong", "Ingles");
		temaRock.addGenero("Rock");
		temaRock.addInstrumento("Guitarra");
		Cancion temaRock2 = new Cancion("RockSong2", "Ingles");
		temaRock2.addGenero("Rock");
		temaRock2.addInstrumento("Guitarra");
		temaRock2.addInstrumento("Pandereta");
		temaRock2.addInstrumento("Bajo");
		Cancion Cualquiera = new Cancion("Cualquiera", "Espa�ol");
		Cualquiera.addGenero("Rock");
		Cualquiera.addInstrumento("Guitarra");
		Cualquiera.addInstrumento("Piano");
		Cualquiera.addInstrumento("BeatBox");
		Cualquiera.addInstrumento("Acordeon");
		
		DavidBowie.addParticipante(LosLocos);
		FreddieMercury.addParticipante(LosRockeros);
		
		Cancion temaFinal = new CancionFinal("TemaFinal", "Espa�ol", 2);
		temaFinal.addGenero("Rock");
		temaFinal.addInstrumento("Guitarra");
		temaFinal.addInstrumento("Piano");
		temaFinal.addInstrumento("BeatBox");
		temaFinal.addInstrumento("Acordeon");
		
		
	
		DesafioCantInstrumentos instrumetales = new DesafioCantInstrumentos();
		
		Produccion p1 = new Produccion(8, instrumetales, FreddieMercury, DavidBowie);
		
		p1.addTema(temaTrap);
		p1.addTema(temaRock);
		p1.addTema(temaRock2);
		p1.addTema(Cualquiera);
		p1.addTema(temaFinal);
	
		p1.iniciar();
		
		
		
		/*Coach c1 = new Coach("maxi", "otharan");
		
		CoachExigente c2 = new CoachExigente("leonel", "otharan");*/
		
		
		/*Participante p1 = new Participante("dawd", "adawdwa", 30);
		Participante p2 = new Participante("awdawdawd", "aafawfawf", 25);
		
		p1.addInstrumento("flauta");
		p2.addInstrumento("flauta");
		
		p1.addIdioma("espa�ol");
		p2.addIdioma("ingles");
		
		p1.addGenero("armonico");
		p2.addGenero("pop");
		
		
		
		Participante p3 = new Participante("awdawdaawdadawdwd", "aafaawdadadwfawf", 35);
		
		p3.addInstrumento("flauta");
		p3.addIdioma("espa�ol");
		p3.addGenero("armonico");
		
		c2.addParticipante(p1);
		c2.addParticipante(p3);
		
		
		System.out.println(c2);*/
	}

}