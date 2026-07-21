# Às três principais implementações da Set< T >

### 1- HashSet<>
<br>
Muito rápida - tempo constante O(1) <br>
Não tem ordem de índice<br>
Hash Table<br>

Usar quando preciso de alta performace sem ordem

### 2-TreeSet<>
<br>
Funciona estilo árvore Rubro-Negra <br>
Segue ordem - Ordem alfabética para String e númerica para Integer - Double <br>
Ou usa compareTo() <br>

Desempenho mais lento que HashSet<> <br>
Tempo O(log n)

Usar quando não quero repetição e com uma ordem

### LinkedHashSet<>

É um HashSet<> combinado com uma lista encadeada<br>
Mantém a ordem doss elementos na ordem que forem adicionados<br>
Desempenham quase idêntico ao da HashSet<> mas consome mais memória para manter os ponteiros<br>

Usar quando quero velocidade e quero manter a ordem que os item foram adicionados.