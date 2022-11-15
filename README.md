# lapwing

## Sobre 📰

Este uma aplicação de Trabalho de conclusão de curso.

O objetivo desta aplicação é desenvolver uma API REST de registro e rastreabilidade de lotes de frangos de corte utilizando o serviço QLDB da AWS

------

## Requisitos do Projeto

* Desenvolver a funcionalidade de registrar os nós da cadeia de suprimentos
* Desenvolver a funcionalidade de registrar os lotes de frango de corte
* Desenvolver a funcionalidade de rastrear os lotes de frango de corte
* Utilizar o serviço de banco de dados contabíl QLDB

------

## Tecnologias 💻

- Spring-boot 2.7.4
- Java 11
- Maven 3.8.6
- Drive QLDB 2.3.1

## Requisitos para executar o projeto

- Java 11 
- Maven 3.8.6

## Como baixar e executar o projeto 💡

### BACK-END APLICAÇÃO
```bash

# Primeiramente clone o repositorio
$ git clone https://github.com/Joaquimlagos/lapwing.git

# Agora, verifique se você tem o maven instalado
$ mvn -v

# Agora digite o seguinte comando para aplicação rodar
$ mvn spring-boot:run 


iMPORTANTE - PARA QUE A APLICAÇÃO UTILIZE O SERVIÇO DO QLDB É NECESSÁRIO CRIAR UM LEDGER DENTRO DA AWS COM AS SEGUINTES TABELAS

* Aviary
* Agroindustry
* Distributor
* Client
* Conveyor
* BatchAviary
* BatchAgroindustry
* PrimaryBatchConveyor
* SecondaryBatchConveyor
* TertiaryBatchConveyor

Informações sobre a utilização do QLDB disponivél na documentação da AWS - https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started.java.step-1.html

IMPORTANTE - DEPOIS DE CRIAR O LEDGER É NECESSARIO CRIAR UM USUARIO NO SERVIÇO IAM COM AS PERMISSÕES PARA ACESSAR O SERVIÇO DO QLDB,
APÓS ISSO DENTRO DO PACOTE SECURITY TEM UMA CLASSE - Credentials COM AS CHAVES ( aws_key ) E ( aws_secret ),
PREENCHENDO COM AS CREDENCIAIS GERADAS NO IAM A API JÁ ESTÁ PRONTA PARA SER UTILIZADA

------

### Testar a aplicação

```bash
# Após o programa estar rodando, ele já estara disponível no seguinte endereço:
$ localhost:8080

# Para testar as funcionalidades pro programa utilize a segunte url:
$ http://localhost:8080/api/v1/lapwing

# Demais rotas consultar as classes do pacote Controller

```



