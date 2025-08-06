# 🌐 API Gateway

Este serviço funciona como um **gateway central** para todas as requisições da aplicação. Ele distribui as chamadas para os serviços certos de forma transparente para o cliente, além de forçar HTTPS e aplicar regras de segurança.

---

## 🎯 Responsabilidades

- Redirecionar requisições para os microserviços corretos
- Garantir segurança no transporte (HTTPS)
- Simplificar o acesso aos serviços

---

## 🛠️ Tecnologias e Recursos

- Spring Cloud Gateway
- Spring Boot
- SSL/HTTPS
- Service Discovery com Eureka

---

## 🔀 Roteamentos

| Caminho | Redirecionado para |
|--------|---------------------|
| `/produtos/**` | `loja-service` |
| `/carrinho/**` | `carrinho-service` |
| `/produto/**`  | `compra-service` |
| `/cadastro` ou `/login` | `loja-service` |

---

## 🧠 Aprendizado

- Criação de roteadores seguros e centralizados com Spring Cloud Gateway
- Aplicação de políticas SSL/HTTPS para microsserviços
