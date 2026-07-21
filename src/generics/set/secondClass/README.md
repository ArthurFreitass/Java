# Explicação da igualdade no Set<>

Se os métodos equals() e hashCode(), não tiverem sido implementados na sua classe criada,
a implementação do teste de igualdade será dada pelo referência do ponteiro.

### Por exemplo: (Usando List<> mesmo) 
"Apenas para facilitar para mim"

List<Person> list;

list.add("Goku")
list.add("Naruto")
list.add("Naruto")

se fizermos:

sout(list.contains(new Person("Sasuke"))) // Retornaria false

se os métodos equals() e hashCode(), não tiverem sido implementados.
