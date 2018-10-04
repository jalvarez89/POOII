clase libro
    private definir nombre como caracter
    private definir autor como caracter
    private definir editorial como caracter
    private definir cantidadp como numerico
    private definir fecha como numerico
    private definir tipo como caracter
    private definir ilustrado como logico
    publico metodo libro()
        nombre="Sin Nombre"
        autor="Sin Autor"
        editorial="Sin Editorial"
        cantidadp=0
        fecha=0
        tipo="Sin Tipo"
        ilustrado=null
    fin metodo
    publico metodo libro(nombre,autor,editorial,cantidadp,fecha,tipo,ilustrado)
        nombre="POO"
        autor="CADIF1"
        editorial="EDITORIAL 1"
        cantidadp=35
        fecha=04102018
        tipo="Computacion"
        ilustrado=Verdadero
    fin metodo
fin clase
algoritmo Practica3
    definir libro1 como libro
    libro1=new libro()
    libro1=new libro("POO","CADIF1","EDITORIAL 1",35,04102018,"Computacion",Verdadero)
fin algoritmo