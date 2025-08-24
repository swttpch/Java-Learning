# Interfaces em Java

## O que são?

Interfaces são contratos que definem o que uma classe deve fazer, mas não como deve fazer.

## Características principais:

- ✅ Definem métodos que as classes devem implementar
- ✅ Permitem herança múltipla (uma classe pode implementar várias interfaces)
- ✅ Garantem que classes diferentes sigam o mesmo padrão
- ✅ Podem conter métodos abstratos, default e estáticos

## Exemplo simples:
```java
// Interface
interface Animal {
    void emitirSom();
    void mover();
}

// Classe implementando a interface
class Cachorro implements Animal {
    public void emitirSom() {
        System.out.println("Au au!");
    }
    public void mover() {
        System.out.println("Correndo...");
    }
}
```

## Por que usar?

- 🔧 Polimorfismo: Tratar objetos diferentes de forma uniforme
- 📋 Padronização: Garantir que classes tenham comportamentos consistentes
- 🔄 Flexibilidade: Fácil substituição de implementações

## Resumo:

Interfaces definem o que deve ser feito, deixando as classes decidirem como fazer.