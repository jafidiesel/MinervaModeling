
	
	
	
/* Atributo Multivaluado */
CREATE TABLE NombreAtributoMultivaluado {
	OIDMultivaluado INT NOT NULL AUTO_INCREMENT,
	nombreAtributoMultivaluado varchar(255) NOT NULL ,
	PRIMARY KEY (OIDMultivaluado)
}

/* Entidad */
CREATE TABLE EntidadFuerte {
	
	nombrePK varchar(255) NOT NULL ,

	nombreAtributoMultivaluado varchar(255) NOT NULL ,

	
	
	PRIMARY KEY (nombrePK)

	
	FOREIGN KEY (nombreAtributoMultivaluado) REFERENCES NombreAtributoMultivaluado(OIDMultivaluado) 

}

	
/* Entidad */
CREATE TABLE Padre {
	
	clavePrimariaPadre int NOT NULL ,

	nombre varchar(255),

	
	
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

	
/* Entidad */
CREATE TABLE Algunos {
	
	cpAlgunos Char NOT NULL ,

	
	
	PRIMARY KEY (cpAlgunos)

	
}

	
/* Entidad */
CREATE TABLE Muchos {
	
	cpMuchos int NOT NULL ,

	
	
	PRIMARY KEY (cpMuchos)

	
}

	
/* Entidad */
CREATE TABLE EntidadConAtrCompuesto {
	
	
	/* AtributoCompuesto: Direccion */
	 
	
	CP varchar(255) NOT NULL ,

	 
	
	Calle varchar(255) NOT NULL ,

	 
	
	Localidad varchar(255) NOT NULL ,

	
	/* ---- */

	
	
}

	
	
/* Atributo Multivaluado */
CREATE TABLE 7nombreAtributoMultivaluado {
	OIDMultivaluado INT NOT NULL AUTO_INCREMENT,
	7nombreAtributoMultivaluado varchar(255) NOT NULL ,
	PRIMARY KEY (OIDMultivaluado)
}

/* Entidad */
CREATE TABLE EntidadDebil {
	
	7nombreClavePrimaria varchar(255) NOT NULL ,

	7nombreAtributoMultivaluado varchar(255) NOT NULL ,

	
	
	PRIMARY KEY (7nombreClavePrimaria)

	
	FOREIGN KEY (7nombreAtributoMultivaluado) REFERENCES 7nombreAtributoMultivaluado(OIDMultivaluado) 

}

	
	
	
	
	
		
		

	
	
	
	
	
	
		 
		
			
ALTER TABLE Carnet
	ADD 
	clavePrimariaConductor_Conductor int NOT NULL ,

	
	FOREIGN KEY (clavePrimariaConductor_Conductor)
		REFERENCES Conductor(clavePrimariaConductor)


			
		
	
	
	
	
	

		
	
		
		

	
	
	
	
	
	
		 
		
			
ALTER TABLE Conductor
	ADD 
	clavePrimariaAuto_Auto varchar(255) NOT NULL ,

	
	FOREIGN KEY (clavePrimariaAuto_Auto)
		REFERENCES Auto(clavePrimariaAuto)


			
		
	
	
	
	
	

		
	
		
		

	
	
	
	
	
	
		 
		
			

/* Entidad intermedia */
CREATE TABLE Algunos_Muchos {
	
	cpAlgunos_Algunos Char NOT NULL ,

	
	cpMuchos_Muchos int NOT NULL ,

	
	PRIMARY KEY (cpAlgunos)

	
	PRIMARY KEY (cpMuchos)

	
	FOREIGN KEY (cpAlgunos_Algunos)
		REFERENCES Algunos(cpAlgunos)

	
	FOREIGN KEY (cpMuchos_Muchos)
		REFERENCES Muchos(cpMuchos)

}


	
		
	
	
	
	
	

		
	
		
		

	
	
	
	
	
	
		 
		
			
ALTER TABLE EntidadDebil
	ADD 
	nombrePK_EntidadFuerte varchar(255) NOT NULL ,

	
	FOREIGN KEY (nombrePK_EntidadFuerte)
		REFERENCES EntidadFuerte(nombrePK)


			
		
	
	
	
	
	

		
	
	
	
	
	
		
		
			




/* Herencia entre Padre y Hijo */
ALTER TABLE Hijo
	
	clavePrimariaPadre_Padre int NOT NULL ,

	
	FOREIGN KEY (clavePrimariaPadre_Padre)
		REFERENCES Padre(clavePrimariaPadre)






		
		
	
