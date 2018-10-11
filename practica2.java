clase nota
 	definir calificacion como real
 	definir materia como caracter
fin clase
---------------------------------------
clase Alumno
	definir nombre como caracter
	definir cedula como caracter
	definir promedio como real
	definir notas como coleccion<nota>

metodo asignar_nota()
	definir cantidad como entero
	definir valor como real
	mostrar "Ingrese la cantidad de notas"
	leer cantidad
	
	para i=1 hasta cantidad hacer

	mostrar "Ingrese la calificacion"
	leer valor

	notas[i].calificacion=valor

	fin para
fin metodo
fin clase
---------------------------------------