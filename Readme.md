# Exercicio 7
## APLICACION

### productsStream
Crear un novo proxecto denominado productsStream  cunha una clase denominada Product e una clase principal  tal como se describen a continuacion:

a)Clase Product: debe ter tres variables privadas
codigo   tipo String
descricion tipo String
prezo  tipo Double
O contructor por defecto introducira  cadeas nulas nas variables codigo e descricion e un cero no prezo.
A clase debe ter outro constructor con pase de tres parametros (codigo, descricion e prezo)

Os metodos da clase Product son os basicos de calquera clase , e dicir os necesarios para poder realizar as seguintes operacions sobres as tres variables

cambiar o codigo : setCodigo(String codigo)
obter o codigo: getCodigo()
cambiar a descricion setDescricion(String descricion)
obter a descricion: getDescricion()
cambiar o prezo : setPrezo(Double prezo)
obter o prezo: getPrezo()

b) Dende a  clase principal :
1)crear un  obxecto da clase Product  cos argumentos: "cod1", "parafusos", 3.0
2) gardar os valores do producto creado   nun ficheiro denominado produtos.txt mediante os metodos adecuados de  DataOutputStream (amosados ao final deste texto)
3) crear outro  obxecto da clase Product  cos argumentos: "cod2","cravos",4.0 e gardalo como anterormente
4) crear outro  obxecto da clase Product  cos argumentos: "cod3","tachas",6.0 e gardalo como anterormente
5) crear outro  obxecto da clase Product  cos argumentos: "cod4","grapas",2.0 e gardalo como anterormente
6) gardar os valores do producto creado no ficheiro produtos.txt
   7)despois  crear un obxecto tipo “producto” novo chamado po3 sen argumentos e cargar os seus atributos  a partires dos datos  dos productos que estan gardados  no ficheiro produtos.txt mediante DataInputSream, imprimindo os valores de ditas productos ( enténdese que primeiro cargo os datos de primeiro producto lido no obxecto po3 , e imprimo os valores e  e despois cargo os datos do seguinte  producto lido no mesmo obxecto po3 e volto imprimir os seus valores )

O resultado da execucion debe ser :
lista de productos gardados no ficheiro produtos.txt
cod1 , parafusos , 3.0
cod2 , cravos , 4.0
cod3,   tachas, 6.0
cod4 , grapas, 2.0
Metodos usados : cando gardedes os datos no ficheiro produtos.txt utilizar o metodo writeUtf para gardar os datos do codigo e a descripcion , e o metodo writeDouble para gardar o prezo      


