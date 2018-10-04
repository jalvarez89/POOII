clase Fecha
    private definir dia,mes,año como entero
    metodo fechita(dia,mes,año)
    fin metodo
fin clase
clase Estudiante
    private definir nota100, nota20, nota4, examen_p1, examen_p2, examen_p3, evaluacion_c, trabajo como real
    private definir nom, apell, como caracter
    private definir fecha como caracter
    metodo procesarNotas()
        leerNotas()
        procNotas()
        mostrarNotas()
    fin metodo
    metodo leerNotas()
        mostrar "Ingrese Nombre del Estudiante"
        leer nom
        mostrar "Ingrese Apellido del Estudiante"
        leer apell
        Mostrar "Ingrese Notas parciales"
        leer examen_p1 examen_p2 examen_p3
        Mostrar "Ingrese Nota de Evaluacion Continua"
        leer evaluacion_c
        Mostrar "Ingrese Nota de Trabajo Practico"
        leer trabajo
    fin metodo
    metodo procNotas()
        nota100=examen_p1+examen_p2+examen_p3+evaluacion_c+evaluacion_c+trabajo
        nota20=nota100/5
        nota4=nota100/25
        si nota20>=80 entonces
            mostrar "Estudiante Aprobado"
        sino
            mostrar "Estudiante Reprobado"
        finsi
    fin metodo
    metodo mostrarNotas()
        Mostrar "La Nota Final del Estudiante" nom "es Escala 100: " nota100 "en Escala 20" nota20 "y En Escala 4" nota4
    fin metodo
    metodo nota() como entero
        retornar nota100/25
    fin metodo
fin clase
algoritmo NotaFinal
        definir estu1 como Estudiante
        estu1=nuevo Estudiante()
        estu1.procesarNotas()
        fecha.fechita(27,09,2018)
        si estu1.getnota20()>estu2.getnota20() entonces
            mostrar "El Estudiante 1 Tuvo mas Nota"
        sino
            mostrar "El Estudiante 2 Tuvo mas Nota"
        finsi
fin algoritmo

