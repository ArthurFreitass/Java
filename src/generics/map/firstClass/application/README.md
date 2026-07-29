# MAP<K, V>

# Definição

Conjunto de pares key / value. <br>

### Uso comum: uso do localStorage e o uso de cookies

Os elementos são indexados pelo objeto chave - não tem posicão
Não aceita repetição de chaves

# Implementações principais

### HashMap - O mais rápido - tempo constante O(1) mas sem ordenação
### TreeMap - Mais lento log(n) - possuí ordenação pelo método CompareTo (ou Comparator) - Usa a key para ordenar
### LinkedHashMap - Velocidade média - Mantém a ordem em que os elementos são adicionados

# Métodos Principais

put - adiciona <br>
get - Pega a chave <br>
remove - Remova uma chave específica <br>
clear - Remove todas as chaves <br>
keySet - Retorna um Set<> das chaves <br>
values - Retorna uma Collection dos valores <br>
containsKey - Retorna se um Map<> contém ou não uma chave

# OBS

Para comparar se um elemento existe no Map<> devemos usar os métodos equals e hashCode
<br> Caso contrário ele irá fazer a verificação de ponteiros