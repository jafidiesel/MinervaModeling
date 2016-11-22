
	
	
	
/* Atributo Multivaluado */
CREATE TABLE NombreAtributoMultivaluado {
	OIDMultivaluado INT NOT NULL AUTO_INCREMENT,
	nombreAtributoMultivaluado varchar(255) NOT NULL ,
	PRIMARY KEY (OIDMultivaluado)
}

/* Entidad */
CREATE TABLE Entidad1-Fuerte {
	
	nombrePK varchar(255) NOT NULL ,

	nombreAtributoMultivaluado varchar(255) NOT NULL ,

	nombreFK varchar(255) NOT NULL ,

	
	PRIMARY KEY (nombrePK)

	
	FOREIGN KEY (nombreAtributoMultivaluado) REFERENCES NombreAtributoMultivaluado(OIDMultivaluado) 

}

	
/* Entidad */
CREATE TABLE Padre {
	
	clavePrimariaPadre int NOT NULL ,

	
	PRIMARY KEY (clavePrimariaPadre)

	
}

	
/* Entidad */
CREATE TABLE Hijo {
	
	clavePrimariaHijo int NOT NULL ,

	
	PRIMARY KEY (clavePrimariaHijo)

	
}

	
/* Entidad */
CREATE TABLE Conductor {
	
	clavePrimariaConductor int NOT NULL ,

	
	PRIMARY KEY (clavePrimariaConductor)

	
}

	
/* Entidad */
CREATE TABLE Carnet {
	
	clavePrimariaCarnet varchar(255) NOT NULL ,

	
	PRIMARY KEY (clavePrimariaCarnet)

	
}

	
/* Entidad */
CREATE TABLE Auto {
	
	clavePrimariaAuto varchar(255) NOT NULL ,

	
	PRIMARY KEY (clavePrimariaAuto)

	
}

	
	
/* Atributo Multivaluado */
CREATE TABLE 7nombreAtributoMultivaluado {
	OIDMultivaluado INT NOT NULL AUTO_INCREMENT,
	7nombreAtributoMultivaluado varchar(255) NOT NULL ,
	PRIMARY KEY (OIDMultivaluado)
}

/* Entidad */
CREATE TABLE Entidad2-Debil {
	
	nombreAtributoEntidad1-Fuerte Float,

	7nombreClavePrimaria varchar(255) NOT NULL ,

	7nombreAtributoMultivaluado varchar(255) NOT NULL ,

	7nombreClaveForanea varchar(255) NOT NULL ,

	
	PRIMARY KEY (7nombreClavePrimaria)

	
	FOREIGN KEY (7nombreAtributoMultivaluado) REFERENCES 7nombreAtributoMultivaluado(OIDMultivaluado) 

}

	
	
	
	
	
	
		
		


(2)



	 
	
		
ALTER TABLE Carnet
	
	ADD clavePrimariaConductor_Conductor 
		int,

	
	FOREIGN KEY (clavePrimariaConductor_Conductor)
		REFERENCES Conductor(clavePrimariaConductor)


		
	






		
	
		
		


(2)



	 
	
		
ALTER TABLE Conductor
	
	ADD clavePrimariaAuto_Auto 
		varchar,

	
	FOREIGN KEY (clavePrimariaAuto_Auto)
		REFERENCES Auto(clavePrimariaAuto)


		
	






		
	
		
		


(2)



	 
	
		
ALTER TABLE Entidad2-Debil
	
	ADD nombrePK_Entidad1-Fuerte 
		varchar,

	
	FOREIGN KEY (nombrePK_Entidad1-Fuerte)
		REFERENCES Entidad1-Fuerte(nombrePK)


		
	






		
	
	
	
	
	
	
	
 

/* Herencia entre Padre y Hijo */
ALTER TABLE Hijo
	
	ADD clavePrimariaPadre_Padre 
		int,

	
	FOREIGN KEY (clavePrimariaPadre_Padre)
		REFERENCES Padre(clavePrimariaPadre)




