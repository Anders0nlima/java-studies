# 🚀 Aula 1: Sintaxe Básica de Java

## 📝 1. Introdução ao Java
Java é uma linguagem de programação orientada a objetos, fortemente tipada e multiplataforma. Isso significa que o código Java pode rodar em qualquer sistema operacional que tenha uma JVM (Java Virtual Machine) instalada.

## 📌 2. Estrutura Básica de um Programa Java
Todo programa Java começa com uma classe. A classe principal deve ter um método `main`, que é o ponto de entrada do programa.

### ✨ Exemplo:
```java
public class MeuPrimeiroPrograma {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```
🔹 public class MeuPrimeiroPrograma → Define uma classe chamada MeuPrimeiroPrograma.
🔹 public static void main(String[] args) → Método principal onde a execução começa.
🔹 System.out.println("Olá, mundo!"); → Exibe a mensagem no console.

## 🔢 3. Variáveis e Tipos de Dados
Variáveis armazenam dados e, em Java, cada variável deve ter um tipo definido.

Tipos Primitivos
Java possui 8 tipos primitivos:

Inteiros: byte, short, int, long

Ponto flutuante: float, double

Caractere: char

Booleano: boolean

### ✨ Exemplo:
```java
int idade = 25;        // Inteiro
double altura = 1.75;  // Ponto flutuante
char inicial = 'A';    // Caractere
boolean isJavaDivertido = true; // Booleano
Strings
As String são amplamente usadas para representar texto.
```

### ✨ Exemplo:
```java
String nome = "João";

## ➕ 4. Operadores
Operadores Aritméticos
+ (adição), - (subtração), * (multiplicação), / (divisão), % (módulo).

### ✨ Exemplo:
```java
int a = 10;
int b = 3;
int soma = a + b;   // 13
int resto = a % b;  // 1
Operadores de Comparação
== (igual), != (diferente), > (maior), < (menor), >= (maior ou igual), <= (menor ou igual).
```

### ✨ Exemplo:
```java
boolean isMaior = a > b; // true
Operadores Lógicos
&& (E), || (OU), ! (NÃO).
```

### ✨ Exemplo:
```java
boolean resultado = (a > 5) && (b < 5); // true
```

## 🔄 6. Estruturas de Controle
Condicionais: if, else, else if
Usadas para tomar decisões com base em condições.

### ✨ Exemplo:
```java
int nota = 85;
if (nota >= 90) {
    System.out.println("A");
} else if (nota >= 80) {
    System.out.println("B");
} else {
    System.out.println("C");
}
// Saída: B
Loops: for, while, do-while
📌 for → Repetição com número fixo de iterações.
```

### ✨ Exemplo:
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Número: " + i);
}
// Saída: Número: 0, Número: 1, ..., Número: 4
```
📌 while → Executa enquanto a condição for verdadeira.

### ✨ Exemplo:
```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
// Saída: Contador: 0, Contador: 1, ..., Contador: 4
```
## 📥 7. Entrada e Saída de Dados
Para interagir com o usuário, podemos utilizar a classe Scanner.

### ✨ Exemplo:
```java
import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");
        scanner.close();
    }
}
```
