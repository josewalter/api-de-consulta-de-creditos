##	API-DE-CONSULTA-DE-CRÉDITOS

# 1° Passo:
  OBS: Para rodar a API localmente, faça um clone do projeto, instele o Postgres Versão: 17.5 na sua maquina ou crie 
  um container Docker das duas formas funciona adicione as  regras de usuário senha e siga as intruções de instalação
  do Postgres na sua máquina que vc pode ver em qualquer tutorial no youtube ou na documentação da Postgres.
  Link onde vc vai poder baixar o Banco de Dados Postgres:
  https://www.enterprisedb.com/downloads/postgres-postgresql-downloads
  link com instruções de instalação:
  https://www.postgresql.org/docs/current/tutorial-install.html
  
# 2° Passo rodar o projeto na sua máquina.:
  Feito isso é só subir o projeto na tua máquina, usando o STS, Eclipse ou Intellij qualquer
  uma dessas interfaces vai funcionar.

# 3° passo framework do projeto
  O Spring Boot 3.5.0 é a versão que eu usei para gerar o projeto e vai gerar as tabelas e adcionar os dados já existentes 
  se tiverem ou criar novos dados.

# 4° passo fazer o build do projeto
  Rodar o comando build: Crique como botão direito do mouse na raiz do projeto, vai até a opção Maven e ai clique em (RELOAD PROJECT)
  para que o Maven atualize as dependêcias do projeto.

# 5° Passo:  
  Endpoint para rodar os testes eu estou usando o Postman para testar.
  Buscar por numeroCredito: GET http://localhost:8080/api/creditos/credito/123456
  Buscar por numeroNfse: GET  http://localhost:8080/api/creditos/1122334  
  
