# ChemistryControleDeEstoque
Repositório da aplicação Chemistry que servirá para o controle de estoque e de requisições dos reagentes e vidrarias de laboratórios de química.

# Chemistry: controle de estoque
<fig>
<img src="![Logo e nome do sistema. A logo é uma vidraria balão fundo redondo verde.](https://i.imgur.com/QL1gCie.png" alt="Logo e nome do sistema. A logo é uma vidraria balão fundo redondo verde.">
</fig>

## Ferramentas
* [VSCode](https://code.visualstudio.com/) - IDE para desenvolvimento.
* [Postman]() - Plataforma de API
* 

# Chemistry: controle de estoque

## Introdução


Este sistema possui o objetivo principal de auxiliar na gestão e controle de vidrarias e reagentes químicos dos laboratórios de química do Instituto Federal do Maranhão. É possível adicionar, remover e editar os produtos, e registrar solicitações de materiais feitas pelos professores e alunos pesquisadores do instituto.

O estoque pode ser acessado através de qualquer navegador *web*.

## Análise técnica

### Descrição do ambiente técnico

O sistema é composto por um banco de dados e uma interface web. Funcionalidades principais:

* **F1** - Solicitação de materiais
* **F2** - Cadastro de usuários e materiais
* **F3** - Controle de estoque

As ferramentas utilizadas para o desenvolvimento incluem Java, que é uma linguagem de programação utilizada para o Back-end (Spring Boot), para front-end foi utilizado HTML, CSS e JavaScript, e MySQL atuando como sistema gerenciador de banco de dados relacional.

### Levantamento de requisitos  
Os requisitos foram validados com o cliente e aprovados.

### Requisitos Funcionais
Respeitando a proposta, o sistema deverá atender os seguintes requisitos:

* **RF1** - Criar e manter três perfis de Usuário.
* **RF2** - Cadastrar e manter materiais.
* **RF4** - Atualizar estoque.
* **RF5** - Realizar solicitação.
* **RF6** - Visualizar solicitações.
* **RF7** - Validar solicitações.
* **RF8** - Emitir FISPQ.
* **RF8** - Emitir Relatórios.

## Regras de Negócio

_Solicitação de materiais com antecedência_  

**RGN1** -  As solicitações de materiais para grupos de ensino devem ser feitas pelo tipo de usuário “Professor” com 48 horas (2 dias) de antecedência do prazo de entrega.

_Validade dos Reagentes_  

**RGN2** - Os reagentes com validade fora do prazo só deverão ser disponibilizados para funções não relacionadas à pesquisa. Caso contrário, o mesmo deverá estar dentro da validade.
