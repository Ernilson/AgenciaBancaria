################################# DESAFIO TÉCNICO #######################################

                          Simulação de Conta Bancária

#########################################################################################

Desenvolver um aplicativo em Java ou JavaEE para realizar a abertura e o saque de valores
de uma conta bancária. A conta bancária pode ser classificada em:

- Conta Corrente
- Conta Poupança

REQUISITOS FUNCIONAIS
---------------------

RNG1 - Abertura da Conta Bancária
================================= 
Para abrir a conta bancária, deve-se prover uma das seguintes informações (Conta Corrente ou Conta Poupança):

Dados da Conta Corrente
- Nome do Cliente
- Senha do Cliente
- Número da Agência
- Número da Conta
- Saldo Disponível
- Tipo da Conta (1 - Pessoa Física, 2 - Pessoa Jurídica)

Dados da Conta Poupança
- Nome do Cliente
- Senha do Cliente
- Número da Agência
- Número da Conta
- Saldo Disponível
- Data de Aniversario (rendimento da poupança)


RNG2 - Depósito de Valor na Conta Bancária
==========================================
Para realizar o depósito na conta bancária, deve-se informar um valor maior que zero e
somá-lo ao saldo disponível da conta. Para localizar a conta, deve-se informar o número
da agência, o número da conta e o tipo da conta.


RNG3 - Saque de Valor na Conta Bancária
=======================================
Para realizar o saque na conta bancária, deve-se informar o valor desejado para saque e
confrontá-lo com o valor do saldo disponível da conta, tendo como premissas:
- O valor do saque deve ser menor ou igual ao saldo disponível da conta;
- O valor do saque deve ser maior que zero.
Caso as premissas sejam atendidas, o sistema subtrai do saldo disponível da conta o valor
do saque solicitado.


REQUISITOS NÃO FUNCIONAIS
-------------------------
- Não se faz necessária a utilização de banco de dados. As contas bancárias podem ser
  armazenadas em memória (utilizando uma Collection, por exemplo);

- Não se faz necessária a criação de INPUTS para testar a aplicação. Todos os dados
  podem ser informados de forma FIXA no próprio código fonte (classe de teste, por exemplo);
  
- O código não precisa compilar! O objetivo deste desafio será avaliar o candidato nos
  seguintes quesitos:
  * Estruturação do Código Fonte;
  * Aplicação de conceitos de orientação à objetos;
  * Código Limpo;
  * Domínio da Linguagem Java;
  * Capacidade na resolução de problemas. 
  
