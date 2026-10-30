# Atividade do módulo 37 — Maven

Autor: Lázaro Rodrigues Pereira

## Objetivo

Criar um projeto Maven, pesquisar bibliotecas Java, declarar as dependências no `pom.xml` e versionar o código no GitHub.

## Dependências escolhidas

| Biblioteca | Coordenadas Maven | Versão | Uso no projeto |
| --- | --- | --- | --- |
| Gson | `com.google.code.gson:gson` | 2.13.2 | Converte um objeto Java em JSON. |
| Apache Commons Lang | `org.apache.commons:commons-lang3` | 3.18.0 | Remove espaços excedentes e verifica se o nome está vazio. |

As versões estão fixadas no `pom.xml`; não é necessário baixar os arquivos JAR manualmente. O Maven resolve as dependências ao compilar.

## Fontes para consulta

- [Gson no Maven Central](https://central.sonatype.com/artifact/com.google.code.gson/gson/2.13.2)
- [Apache Commons Lang no Maven Central](https://central.sonatype.com/artifact/org.apache.commons/commons-lang3/3.18.0)
- [Documentação oficial do Gson](https://github.com/google/gson)
- [Documentação oficial do Apache Commons Lang](https://commons.apache.org/proper/commons-lang/)
- [Introdução ao Maven](https://maven.apache.org/guides/getting-started/)

## Requisitos

- JDK 17 ou superior.
- Maven 3.9 ou superior no PATH.
- Internet na primeira execução para baixar as dependências e os plugins.

## Como executar

Abra o terminal na pasta que contém o `pom.xml`:

```bash
mvn clean package
mvn exec:java
```

O primeiro comando compila e empacota o projeto. O segundo executa a classe `App` com as bibliotecas no classpath.

Saída esperada da aplicação:

```text
=== Atividade do Modulo 37 - Maven ===
Nome normalizado com Apache Commons Lang: Lazaro Rodrigues
Objeto convertido em JSON com Gson:
{
  "nome": "Lazaro Rodrigues",
  "curso": "Backend Java",
  "modulo": 37
}
```

Para conferir a árvore de dependências:

```bash
mvn dependency:tree
```

## Enviar ao GitHub

1. Crie no GitHub um repositório vazio chamado `modulo37`, sem adicionar README, licença ou `.gitignore` pelo site.
2. Na pasta deste projeto, execute os comandos abaixo. O endereço usa a conta `LazarorpDEV`.

```bash
git init
git add .
git commit -m "Adiciona atividade do modulo 37 com Maven e dependencias"
git branch -M main
git remote add origin https://github.com/LazarorpDEV/modulo37.git
git push -u origin main
```

Se o GitHub pedir autenticação, conclua o login. Depois do push, confira se o `pom.xml`, a pasta `src` e este README aparecem no repositório. A pasta `target` é gerada pelo Maven e fica fora do Git.

Envie o link do repositório na plataforma da EBAC para avaliação. O ZIP entregue contém o código; a publicação no GitHub deve ser concluída com os comandos acima.
