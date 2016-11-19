
	
	/* entro a entidadRelacion */
	
CREATE TABLE Entidad1-Fuerte {
	
	nombrePK varchar(255) NOT NULL ,

	nombreAtributoMultivaluado varchar(255) NOT NULL ,

	nombreFK varchar(255) NOT NULL ,

	
	PRIMARY KEY (nombrePK)

	
	FOREIGN KEY (nombreFK)

	
	FOREIGN KEY (nombreAtributoMultivaluado) /* (Mutltivaluado-test) */

}
	
	
CREATE TABLE nombreAtributoMultivaluado+"/EntidadMultivaluada"»{
	OIDMultivaluado VARCHAR (255),
	nombreAtributoMultivaluado varchar(255) NOT NULL ,
	PRIMARY KEY (OIDMultivaluado,nombreAtributoMultivaluado)
}

	



	
	/* entro a entidadRelacion */
	
CREATE TABLE Entidad2-Debil {
	
	nombreAtributoEntidad1-Fuerte Float,

	7nombreClavePrimaria varchar(255) NOT NULL ,

	7nombreAtributoMultivaluado varchar(255) NOT NULL ,

	7nombreClaveForanea varchar(255) NOT NULL ,

	
	PRIMARY KEY (7nombreClavePrimaria)

	
	FOREIGN KEY (7nombreClaveForanea)

	
	FOREIGN KEY (7nombreAtributoMultivaluado) /* (Mutltivaluado-test) */

}
	
	
CREATE TABLE 7nombreAtributoMultivaluado+"/EntidadMultivaluada"»{
	OIDMultivaluado VARCHAR (255),
	7nombreAtributoMultivaluado varchar(255) NOT NULL ,
	PRIMARY KEY (OIDMultivaluado,7nombreAtributoMultivaluado)
}

	

	

