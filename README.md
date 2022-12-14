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
