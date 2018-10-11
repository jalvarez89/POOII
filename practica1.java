clase capitulo
    definir numero como entero
    definir descripcion como caracter
fin clase
--------------------------------------------------------------------------------
clase libro
    definir nombre como caracter
    definir autor como caracter
    definir editorial como caracter
    definir cantidadp como numerico
    definir fecha como numerico
    definir tipo como caracter
    definir ilustrado como logico
    definir precio como numerico
    definir capitulos como coleccion<capitulo>
    publico metodo calcularIva()
        definir iva como numerico
        iva=precio*0.50
        precio=precio+iva
    fin metodo
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
--------------------------------------------------------------------------------
algoritmo Practica3
    definir libro1 como libro
    definir libros como coleccion<libro>
    libro1=new libro()
    libro1=new libro("POO","CADIF1","EDITORIAL 1",35,04102018,"Computacion",Verdadero)
    libro1.calcularIva()
fin algoritmo