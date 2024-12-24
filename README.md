# Desafio Bak-End Java - Projeto Via Laser

## Descrição
CRUD para simular o cadastro de alunos em academia.


## Pré-requisitos

* **Java Development Kit (JDK):** Versão 17 ou superior.
* **Maven:** Para gerenciamento de dependências.
* **Banco de dados PostgreSQL:** 
* **Spring Boot:** Framework para desenvolvimento de aplicações Java.
* **JPA:** Especificação para persistência de dados em Java.
* Criar variáveis de ambiente para conexão com o banco "DB_URL, DB_USERNAME, DB_PASSWORD"
* Criar uma chave de API no site do Google Gemini (APIKEY .env)


* **Bibliotecas necessárias:**
   * Jackson (para análise de JSON)
   * Gson (para análise alternativa de JSON)
   * Biblioteca cliente HTTP (ex: Apache HttpComponents)
   * dotenv (para gerenciar a chave da API)

### Dependências

| Dependência | Descrição | Versão | Escopo |
|---|---|---|---|
| spring-boot-starter | Fornece as funcionalidades básicas do Spring Boot. | - | Compile |
| spring-boot-starter-test | Utilitários de teste para aplicações Spring Boot. | test | test |
| gson | Biblioteca para serialização e desserialização JSON. | 2.10.1 | Compile |
| jackson-databind | Biblioteca alternativa para processamento JSON. | 2.18.1 | Compile |
| dotenv-java | Permite o gerenciamento de variáveis de ambiente. | 3.0.2 | Compile |
| spring-boot-starter-data-jpa | Fornece acesso a dados com JPA. | - | Compile |
| postgresql | Driver de banco de dados PostgreSQL. | - | runtime |
| spring-boot-starter-actuator | Fornece endpoints de monitoramento e gerenciamento. | - | Compile |
| langchain4j-google-ai-gemini | Biblioteca para interagir com a API Google AI Gemini. | 0.36.2 | Compile |
| spring-boot-devtools | Recarregamento automático durante o desenvolvimento. | - | runtime |
| lombok | Reduz código repetitivo. | - | annotationProcessor |

## Como Usar

**1. Compilando e Executando:**

**Opção 1: Usando uma Ferramenta de Build (Maven):**

Siga as instruções da ferramenta de build escolhida para compilar e executar o projeto.

**Opção 2: Compilando Manualmente:**

* Use um compilador Java para compilar as classes (Executa menu via terminal no Intellij Ideia).

# Sistema de Gestão de Alunos

## Requisitos Funcionais - Em Desenvolvimento

## Lista de Alunos
* Permitir filtrar alunos por:
  * Nome
  * E-mail
  * Número de telefone
  * IMC

## Cadastro de Novo Aluno
* Acesso ao cadastro a partir da lista de alunos.
* Validação da idade com base na data de nascimento.
  * Para menores de idade, exigir o nome do responsável legal e o grau de parentesco.
* Cálculo automático do IMC com base no peso e altura informados.
* Classificação automática do IMC de acordo com a tabela abaixo:

## Classificação do IMC

| IMC           | Classificação |
|---------------|----------------|
| **Abaixo de 18,5** | **Baixo peso**     |
| Entre 18,6 e 24,9 | Peso normal    |
| Entre 25 e 29,9 | Sobrepeso     |
| Entre 30 e 34,9 | Obesidade grau I |
| Entre 35 e 39,9 | Obesidade grau II |
| Acima de 40    | Obesidade grau III |

* Cálculo automático do valor da mensalidade e plano, considerando:
  * Plano Base: R$ 100,00
  * Plano Junior: 20% de desconto para menores de idade com frequência semanal de 3 dias.
  * Plano Premium: 15% de desconto para maiores de idade com frequência semanal de 5 dias.
  * Plano Melhor Idade: 25% de desconto para maiores de 60 anos com frequência semanal de 3 dias.
* Cadastro de ficha de treino com quantidade de exercícios personalizável.  

## Requisitos Não Funcionais
* **Tecnologia:** Wildfly (Falta Integrar ao Projeto)
* **Banco de Dados:** PostgreSQL (OK)

## Outras Informações
* **Versão:** 1.0
* **Data:** 23/12/2024
* **Em Desenvolvimento**

## Estrutura do Projeto
* **model:** Contém as classes que representam os dados da série, temporadas e episódios.
* **service:** Contém a lógica para consumir a API e converter os dados.
* **controller:** Intermediário entre o modelo e a view.
* **repositories:** Contém implementações para acesso e persistência dos dados no banco de dados.
* **view:** Contém interface com usuário.  
* **principal:** Classe principal com a interface do usuário (a partir daqui será direcionado para outras telas especificas de cadastro/listas na "view").
* **uteis:** Contém classes utilitárias, como a classe `CodificarURL`.

## Licença
Este projeto está licenciado sob a licença [MIT License]

MIT License

Copyright (c) [2024] [Clairton Zerwes]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

## Autor
* Clairton Zerwes - Desenvolvedor principal
