# Calculadora de papel higiênico

## Requistos funcionais
1. Cálculo do valor por metro
- Usuário deve informar: 
    - Valor do pacote;
    - Quantidade de rolos;
    - Quantidade de metros por rolo.
    - Descritivo da opção (marca/variação pra poder ordenar resultados)
- Sistema deve calcular e ordenar: 
    - Cálculo do Valor do metro = Valor do pacote / qtde rolos * qtde de metros por rolo.
    - Armazenar resultado cronologicamente
    - Permitir ordenação por valor
    - Destacar melhor valor de compra


2. Ranking melhor opção de compra
- Usuário deve informar:
    - Nome do supermercado
    - Nome da opção do produto: marca e descritivo
    - Tipo: Folha dupla, Folha simples

# Descrição da arquitetura TO BE
1. Lógica de negócio em Python acessível via REST rodando em container docker na VPS Hostinger;
2. Banco de dados rodando em container docker na VPS Hostinger;
3. Front end em Vue.js rodando na Netlify# challenges
