
	
	
	
/* Atributo Multivaluado */
CREATE TABLE nombreAtributoMultivaluado {
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

	
	FOREIGN KEY (nombreAtributoMultivaluado) REFERENCES nombreAtributoMultivaluado(OIDMultivaluado) 

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

	
	
	
	
	
		/* Entidades relacionadas:
		
		- Entidad1-Fuerte
		
		- Entidad2-Debil
		
		*/
	
	
	
	
