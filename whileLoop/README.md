# While Loop em Java
## O que é?

Um loop que repete um bloco de código enquanto uma condição for verdadeira.
## Sintaxe básica:
```java
while (condição) {
    // código a ser repetido
}
```
## Funcionamento:
- ✅ Verifica a condição antes de executar
- 🔁 Repete o bloco enquanto a condição for true
- ⚠️ Cuidado com loops infinitos - sempre atualize a variável de controle

## Exemplo simples:
```java
int contador = 0;

while (contador < 5) {
    System.out.println("Número: " + contador);
    contador++; // Atualiza a variável
}
```
### Saída:
```text
Número: 0
Número: 1
Número: 2
Número: 3
Número: 4
```
## Quando usar?
- 🔁 Quando não sabe quantas iterações precisa
- ⏰ Para processamento contínuo enquanto uma condição persistir
- 🎯 Validar entrada do usuário até ser correta

## Diferença para o for:
- `while`: Condição desconhecida de antemão
- `for`: Número conhecido de iterações

## Resumo:

Use while quando precisar repetir código enquanto uma condição for verdadeira, sem saber quantas vezes precisará repetir.