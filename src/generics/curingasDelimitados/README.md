# Covariância

Quando trabalhamos com List<?>, podemos fazer o get mas não o put
Exemplo:

List<? extends Number> list = integerList;

podemos fazer o get da seguinte forma:

Number x = list.get(0);

mas fazer:

list.add(13);

resultará em erro pois não é permitido fazer o put em List<?>
por não saber se os valores da Wrapper Classes são compátiveis.

# Contravariância

É o contrário da covariância, é permitido que você faça o put (inserir valores), mas não é permitido o GET, ou seja pegar o valor.

Exemplo:

List< Obj > list = new Arraylist()<>

list.add("Goku");
list.add("Vegeta");

Criando um tipo genérico de lista para aceitar os valores da List antiga e poder adicionar o que eu quiser:

List<? super Number> listNums = list

Nesse caso a List listNums, aceita Nums e o seu supertipo ou seja Objects

podemos fazer listNums.add(10) por exemplo.

Mas não podemos fazer:

Number x = listNums.get(0); // Por quê não sabemos se get(0) retorna um Number