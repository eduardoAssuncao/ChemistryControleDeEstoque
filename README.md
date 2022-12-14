# ChemistryControleDeEstoque
Repositório da aplicação Chemistry que servirá para o controle de estoque e de requisições dos reagentes e vidrarias de laboratórios de química.

# Chemistry: controle de estoque
<fig>
<img src="https://i.imgur.com/PPJIJ6l.jpg" alt="Logo e nome do sistema. A logo é uma vidraria balão fundo redondo verde.">
</fig>

## Ferramentas
* [VSCode](https://code.visualstudio.com/) - IDE para desenvolvimento.
* [Postman]() - Plataforma de API
* [MySQLWorkbench](https://www.mysql.com/products/workbench/) - IDE para armazenamento da base de dados.

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

### Histórico de revisões do documento

| DATA | VERSÃO | DESCRIÇÃO DA ALTERAÇÃO | AUTOR |
| --- | --- | --- | --- |
| 19/05/2022 | 1.1 | Criação deste Documento. | Todos |
| 23/06/2021 | 1.2 | Inclusão dos Diagramas de Caso de Uso. | Eduardo e Regiana | 
| 24/06/2021 | 1.3 | Inclusão do Diagrama de Classes. | Ana Paula e Andressa | 
| 24/06/2022 | 1.4 | Inclusão da Especificação do Caso de Uso 4, Diagrama de Sequência e Transição de Estado. | Eduardo |
| 25/05/2021 | 1.5 | Inclusão de RF003, RF004, RF006, RF007, RF009, RF010, RF012, RF013, RF014 e RF015. Alteração dos Requisitos RF011, RF016, RF017 e RF018. | Todos |
| 25/05/2021 | 1.6 | Inclusão dos Diagramas dos Casos de Uso 2, 3, 5, 6 e 8. | Regiana |
| 25/05/2021 | 1.7 | Atualização do Diagrama de Classes. | Ana Paula e Andressa |
| 26/06/2022 | 1.8 | Inclusão da Especificação do Caso de Uso 5 e Diagrama de Transição de Estado. | Ana Paula |
| 26/06/2022 | 1.9 | Inclusão da Especificação do Caso de Uso 6, Diagrama de Sequência e Transição de Estado. | Andressa |
| 26/06/2022 | 1.10 | Inclusão do Diagrama de Sequência e Transição de Estado do Caso de Uso 8. | Regiana |
| 27/06/2022 | 1.11 | Inclusão da Especificação do Caso de Uso 8. | Regiana |
| 27/06/2022 | 1.12 | Inclusão do Diagrama de Sequência do Caso de Uso 5. | Ana Paula |
| 27/06/2022 | 1.13 | Revisão e conclusão | Todos |
| 05/10/2022 | 2.1 | Correção de Casos de Uso | Todos |
| 10/10/22 | 2.2 | Criação dos Diagramas de Transição de Estado, inserção dos Diagramas de Atividades e correção do Diagrama de Classes. | Todos |
| 13/10/22 | 2.3 | Correção do Diagrama de Sequência do Caso de Uso 8. | Regiana |


### Problema de negócio
O sistema de gerenciamento de estoque do laboratório de química tem como objetivo permitir a administração dos devidos produtos (reagente e vidraria) de modo a permitir a adição, remoção e edição dos produtos, além de registar as solicitações feitas pelos professores e alunos pesquisadores aos produtos.

### Levantamento de requisitos  
Os requisitos foram validados com o cliente e aprovados.

### Requisitos Funcionais
Respeitando a proposta, o sistema deverá atender os seguintes requisitos:

* **RF1** - Criar e manter três perfis de Usuário.
* **RF2** - Criar e manter Usuários.
* **RF3** - Cadastrar e manter Categorias.
* **RF4** - Cadastrar e manter Setores.
* **RF5** - Cadastrar e manter Materiais.
* **RF6** - Atualizar Estoque.
* **RF7** - Procurar Materiais.
* **RF8** - Realizar Solicitação.
* **RF9** - Visualizar Solicitações.
* **RF10** - Validar Solicitações.
* **RF11** - Emitir FISPQ.
* **RF12** - Emitir Relatório Parcial e Geral.
* **RF13** - Emitir Relatório para Polícia Federal.
* **RF14** - Emitir Relatório para o Exército.
* **RF15** - Emitir Relatório com listagem de Materias para reposição.

### Requisitos Não Funcionais
Respeitando a proposta, o sistema deverá atender os seguintes requisitos não funcionais:

* **RNF1** - Estrutura Organizacional do Sistema.
* **RNF2** - Desenvolvimento para Web.
* **RNF3** - Utilizar Banco de Dados Sql.

## Regras de Negócio

_Solicitação de materiais com antecedência_  

* **RGN1** -  As solicitações de materiais para grupos de ensino devem ser feitas pelo tipo de usuário “Professor” com 48 horas (2 dias) de antecedência do prazo de entrega.

_Validade dos Reagentes_  

* **RGN2** - Os reagentes com validade fora do prazo só deverão ser disponibilizados para funções não relacionadas à pesquisa. Caso contrário, o mesmo deverá estar dentro da validade.

## Diagramas de Caso de Uso
* **Caso de Uso 1** - Visão Geral
![Screenshot](Diagramas/vis%C3%A3o_geral.png)
