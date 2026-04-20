# G2
Discentes: Anna Luiza de Souza Amaral; Marcos dos Reis Vargas; Robson Cleiton Dias Silva.

Projeto de um Sistema de Monitoramento de Consumo de Energia

Introdução:

O consumo de energia elétrica é um dos principais fatores relacionados ao uso eficiente de recursos energéticos em ambientes residenciais, comerciais e industriais. O aumento da demanda por eletricidade e a necessidade de utilização consciente da energia, torna importante o desenvolvimento de ferramentas que permitam monitorar e analisar o consumo energético dos diversos equipamentos presentes em uma instalação elétrica.
Os sistemas de monitoramento de consumo de energia podem fornecer informações detalhadas sobre o uso da energia elétrica, possibilitando a identificação de equipamentos que apresentam maior gasto energético e auxiliando na adoção de medidas de eficiência energética. Esses sistemas permitem acompanhar o funcionamento dos dispositivos elétricos e estimar o consumo total, contribuindo para a redução de desperdícios e para uma melhor gestão dos recursos energéticos.
Diante disso, este projeto tem como objetivo desenvolver um Sistema de Monitoramento de Consumo de Energia utilizando a linguagem de programação Java, aplicando os conceitos de Programação Orientada a Objetos (POO). O sistema será capaz de representar diferentes dispositivos elétricos, calcular o consumo de energia com base na potência e no tempo de uso dos equipamentos, além de apresentar o consumo total e estimativas de custo energético.
A utilização da POO permite estruturar o sistema de forma modular e organizada, por meio da definição de classes que representam os dispositivos elétricos e o medidor de energia, facilitando a manutenção, expansão e reutilização do código. 

Objetivos:

Simular o consumo de energia elétrica de uma residência a partir do tipo e da quantidade de equipamentos que a casa possui. A partir do sistema será possível registrar os dispositivos presentes na residência, mostrar o consumo de energia por aparelho, calcular o consumo total de energia em kWh e estimar o custo da conta de energia.

Problema:

A necessidade de acompanhar o uso dos aparelhos elétricos surge devido ao aumento do consumo de energia elétrica em residências e estabelecimentos. Entretanto, na maioria dos casos, os consumidores têm acesso apenas ao valor total da conta de energia, sem informações detalhadas sobre quanto cada equipamento contribui para esse consumo. Essa falta de monitoramento dificulta a identificação de dispositivos que consomem mais energia e impede a adoção de medidas para reduzir desperdícios e melhorar a eficiência energética. Assim, surge a necessidade de um sistema capaz de monitorar e estimar o consumo de energia dos diferentes dispositivos elétricos, permitindo ao usuário acompanhar de forma mais clara e organizada como a energia está sendo utilizada.

Aula do dia 20/04

Definição das classes, herança, encapsulamento e polimorfismo

Classes: Cliente (atributos: código do cliente, nome, cpf, cnpj, endereço); Unidade consumidora (atributos: código da unidade, tipo, histórico de consumo) ; Medidor (número de série, leitura atual, leitura anterior); Dispositivos (nome, potência, horas de uso); Fatura (data de vencimento, valor total, mês de referência, status do pagamento); Prestadora de serviço (cnpj, nome comercial, razão social, área de atuação, suporte, taxa base, lista de funcionários, lista de unidades consumidoras); Funcionário (matrícula, cargo, departamento, função); Receber (crédito, erro de leitura, ressarcimento); Pagar (fatura, multas).

Herança: Diferentes tipos de clientes (cliente residencial; cliente comercial; cliente industrial); diferentes tipos de dispositivos (geladeira; televisão; forno elétrico; ferro elétrico; ar condicionado, etc.); diferentes tipos de funcionários da empresa prestadora de serviço (funcionários do atendimento; funcionários do financeiro, técnicos, etc).

Encapsulamento: O atributo leitura atual do medidor não deve ser alterada manualmente por qualquer parte do sistema (privado), ou seja, os dados de leitura e valores de tarifas devem ser protegidos.

Polimorfismo: O método calcular o valor da conta deve estar presente para todos os clientes. No entanto, a conta deve ser calculada de forma diferente para o cliente residencial, industrial ou comercial. Ou seja, devem haver diferentes fórmulas para calcular o custo.


Cronograma:

1ª Entrega (23/03/26):

Identificação do problema a ser resolvido;
Definição dos objetivos e problema do sistema.

2ª Entrega – (06/04/2026)

Identificação das classes principais;
Definição de:
Atributos;
Métodos;
Relacionamentos (herança, associação, composição);
Criação de diagramas, como:
Diagrama de Classes (UML);
Diagrama de Casos de Uso.

3ª Entrega – (20/04/26)

Refinamento das classes
Definição de:
Interfaces
Encapsulamento
Padrões de projeto (se necessário)
Organização dos pacotes

4ª Entrega – Implementação - Codificação em Java - (04/05/26)

Desenvolvimento das classes em Java;
Aplicação dos conceitos de Orientação a Objetos:
Encapsulamento;
Herança;
Polimorfismo;
Abstração;
Integração entre as partes do sistema.

5ª Entrega – versão definitiva - (18/05/26)

Testes:
Unitários;
Integração;
Correção de erros (debug);
Documentação:
Código (comentários);
Manual do usuário;
Relatório final do projeto.

6ª Entrega - Apresentação Final do Projeto.

