# Wrapper Classes em Java
## O que são?
São classes que envolvem os tipos primitivos, permitindo que sejam tratados como objetos.

## Tipos primitivos e suas Wrapper Classes:
| Primitive | Wrapper Class |
|-|-|
|`int`|`Integer`|
|`double`|`Double`|
|`char`|`Character`|
|`boolean`|`Boolean`|
|`byte`|`Byte`|
|`short`|`Short`|
|`long`|`Long`|
|`float`|`Float`|

## Para que servem?
- 📦 Converter primitivos em objetos (para usar com Collections)
- 🔄 Conversão entre tipos (parseInt, valueOf)
- 🧰 Oferecem métodos úteis (compareTo, toString, etc.)

## Exemplos:
```java

// Autoboxing (automático)
Integer numero = 10;

// Unboxing (automático)
int valor = numero;

// Conversão de String para int
int numero = Integer.parseInt("123");

// Métodos úteis
Integer.max(5, 10); // Retorna 10
```

## Quando usar?
- ✅ Quando precisa usar primitivos em Collections (List, Set, Map)
- ✅ Para usar métodos utilitários das wrapper classes
- ✅ Quando trabalha com tipos nullable (que podem ser null)

## Resumo:

Wrapper classes transformam tipos primitivos em objetos, permitindo usá-los em contextos onde só objetos são aceitos.