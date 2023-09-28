package n3Exe1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
//@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SerialObjectToJsonFlag {
	public String dir() default "json/employee.json";
}

/*
 * Añade la posibilidad de que la anotación creada en el nivel anterior 
 * sea registrada por la Virtual Machine en tiempo de ejecución. 
 * Demuestra que se ejecuta la lectura de la anotación utilizando Java Reflection.
 */