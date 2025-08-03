# Sistema de Pedidos em Java

---

## 📋 Descrição

Este projeto é uma aplicação simples desenvolvida em Java que simula um sistema básico de pedidos. O sistema permite cadastrar clientes, criar pedidos contendo múltiplos produtos, gerenciar o status do pedido e calcular o total a pagar.

Ele serve como um ótimo exercício para consolidar conceitos de orientação a objetos, manipulação de datas, listas, enums e formatação de saída.

---

## 🛠 Funcionalidades

- **Cadastro de Cliente:** Nome, email e data de nascimento.
- **Pedidos:** Cada pedido possui um cliente, data, status (pendente, processando, enviado, entregue).
- **Produtos no Pedido:** Cada produto tem nome, preço unitário e quantidade.
- **Cálculo automático:** Total do pedido calculado somando subtotal de cada produto (preço × quantidade).
- **Resumo formatado:** Impressão detalhada do pedido, cliente e itens com valores formatados.

---

## 📂 Estrutura do Projeto
```
src/
│
├── Entities/
│ ├── Client.java
│ ├── Product.java
│ ├── Order.java
│ └── Enums/
│ └── OrderStatus.java
│
└── Main.java
```
yaml
---

## 🚀 Como Rodar

1. **Compilar:**

Abra o terminal na pasta `src` e compile:

```bash
javac Entities/*.java Main.java
```
Executar:

```bash
java Main
```
## 📚 Uso:

Siga as instruções no console para inserir os dados do cliente, status do pedido e detalhes dos produtos.

🧩 Tecnologias e Conceitos
Java SE 8+

Orientação a Objetos (encapsulamento, composição)

Enumeração para status do pedido (OrderStatus)

Manipulação e formatação de datas com SimpleDateFormat

Entrada de dados com Scanner

Uso de StringBuilder para montar strings de saída

💡 Observações e Melhores Práticas
Para valores financeiros, em projetos mais complexos, recomenda-se usar BigDecimal ao invés de Double para evitar problemas de precisão.

Atualmente, o sistema trata produtos com quantidade dentro da própria classe Product. Em sistemas maiores, é comum usar uma classe separada para itens do pedido.

O sistema utiliza o pacote Entities para organização das classes, melhorando a modularidade.

Tratamento de exceções pode ser melhorado para tornar o sistema mais robusto.

👤 Autor
Marco Antonio Lobo

📅 Data
2025

📬 Contato
Para dúvidas, sugestões ou contribuições, entre em contato pelo email: marcoantoniolobo82@gmail.com

Obrigado por conferir o projeto! 🎉