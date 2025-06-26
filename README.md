##	API-DE-CONSULTA-DE-CRÉDITOS

# 1° Passo:
  OBS: Para rodar a API localmente, faça um clone do projeto, instele o Postgres Versão: 17.5 na sua maquina ou crie 
  um container Docker das duas formas funciona adicione as  regras de usuário senha e siga as intruções de instalação
  do Postgres na sua máquina que vc pode ver em qualquer tutorial no youtube ou na documentação da Postgres.
  Link onde vc vai poder baixar o Banco de Dados Postgres:
  https://www.enterprisedb.com/downloads/postgres-postgresql-downloads
  link com instruções de instalação:
  https://www.postgresql.org/docs/current/tutorial-install.html
  
# 2° Passo: Rodar o projeto na sua máquina.:
  Feito isso é só subir o projeto na tua máquina, usando o STS, Eclipse ou Intellij qualquer
  uma dessas interfaces vai funcionar.

# 3° Passo: Framework do projeto
  O Spring Boot 3.5.0 é a versão que eu usei para gerar o projeto e vai gerar as tabelas e adcionar os dados já existentes 
  se tiverem ou criar novos dados.

# 4° Passo: Fazer o build do projeto
  Rodar o comando build: Crique como botão direito do mouse na raiz do projeto, vai até a opção Maven e ai clique em (RELOAD PROJECT)
  para que o Maven atualize as dependêcias do projeto.

# 5° Passo:  
  Endpoint para rodar os testes eu estou usando o Postman para testar.
  Buscar por numeroCredito: GET http://localhost:8080/api/creditos/credito/123456
  Buscar por numeroNfse: GET  http://localhost:8080/api/creditos/1122334 

# 6° Passo: Comandos para rodar o docker
docker-compose -f postgres-docker-compose.yml up -d
Rodei na porta:5432.
E a porta para rodar o container é: http://localhost:8000/
Usuário: postgres
Senha:admin

# 6°.1 Passo: Configurando o properties
Fazer a configuração no properties para que a aplicação se  conecte com o container e vc possa estar usando o banco de dados em conta-
iner, os passos da configuração está dentro do arquivo properties.
Pode ser usado a interface: PhpAdmin, DBeaver, Workbenck.

# 6°.2 Passo: Criando a imagem docker da api
Comando para gerar o build da imagem dokcerfile: docker image build -t consultacreditos .
Comando para subir a imagem e manter a imagem no ar: docker container run -p 8080:8080 consultacreditos
Comando para subir a imagem e encerrar: docker container run --rm -p 8080:8080 consultacreditos

# 6°.3 Passos: para criar e subir a network e adicionar os containers dentro da rede.
 1°  Comando para criar a network dentro da pasta do projeto digite esse comando: 
 docker network create entidade_credito_net
 2°  Comando para ver se a network foi criada: docker network ls
 3°  Comando para criar o volume: docker volume create entidade_credito_volume
 4°  Comando para ver se o volume foi criado: docker volume ls
 5°  Comando para subir o container do Postgres e adiciona_ló dentro da network:
 docker container run -d -p 5432:5432 --name entidade_credito_db -e POSTGRES_PASSWORD=admin -e
 POSTGRES_USER=postgres -e POSTGRES_DB=postgres --network entidade_credito_net -v entidade_credito_volume:
/var/lib/postgresql/data postgres:17.5


docker image build -t consultacreditos .


Comando para subir a aplicação back-end
docker container run -d -p 8080:8080 -e DB_DATABASE=postgres -e  DB_HOST=consultacreditos-postgres --network consultacreditos-network  consultacreditos

  
