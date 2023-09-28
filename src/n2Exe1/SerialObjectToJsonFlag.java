package n2Exe1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SerialObjectToJsonFlag {
	public String dir() default "json/employee.json";
}


/*
 * Crea una anotación personalizada que debe 
 * permitir serializar un objeto Java en un archivo JSON. 
 * La anotación debe recibir el directorio 
 * donde se colocará el archivo resultante.
 */