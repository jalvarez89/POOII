abstracta clase paciente
	public nombre como Carater
	public cedula como Entero
	protected tipo_sangre como Caracter
	public nacimiento como Fecha
		metodo mostrarDatos()
			mostrar "Paciente "+nombre+" cedula:"+cedula+", Tipo de Sangre: "+tipo_sangre+" Fecha de Nacimiento: "+nacimiento
		fin metodo
fin clase
------------------------------------------------------------------------------------------------------------------------------
clase hospitalizado extiende paciente
	public estadoClinico como Caracter
	public habitacion como Entero
		metodo mostrarDatos()
			mostrar "Paciente "+nombre+" cedula:"+cedula+", Tipo de Sangre: "+tipo_sangre+
			" Fecha de Nacimiento: "+nacimiento+"Estado Clinico:"+estadoClinico+"Habitacion: "+habitacion
		fin metodo
fin clase
------------------------------------------------------------------------------------------------------------------------------
clase rehabilitado extiende paciente
	public fechaAlta como Fecha
fin clase
