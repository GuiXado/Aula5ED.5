# Aula5ED.5
## Atividade 5

### 5. Considerando a biblioteca PilhaString, já criada, faça:
  
Criar um projeto Java (HistoricoSim) e importe a biblioteca PilhaStrings. Esse novo projeto simulará uma função presente nos navegadores Web, a função de histórico.

A função de histórico empilha os endereços de sites acessados.

A classe Principal, no package view, deve ter na Main, a criação de uma Pilha denominada histórico e deve dar ao usuário a possibilidade de inserir um novo endereço no histórico, remover o último endereço da pilha, saber qual foi o último endereço visitado. Um menu deve ser criado.

A classe HistoricoController deve ter os métodos de validação das operações oferecidas na Main da Classe Principal. Todos os métodos devem receber a pilha criada no método Main como parâmetro.

• O método de inserir um novo endereço, deve-se verificar antes, se o endereço é válido (um endereço válido começa com http:// e, na sequência, deve ter algo no formato www.endereço.com (podendo ser, .com, .co.uk, .com.br, etc.). Não serão aceitos sites sem www;

• O método de remover o último endereço deve dar um erro se o histórico estiver vazio ou desempilhar o último endereço;

• O método de consultar o último endereço, deve dar um erro se o histórico estiver vazio ou apresentar o último endereço, sem removê-lo.
