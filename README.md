# 📅 Transação Simplificada - Backend com Spring Boot

Projeto backend desenvolvido com Spring Boot para gerenciamento de transações financeiras, incluindo controle de usuários, carteiras, saldos e autorizações externas para validação de transações. A API REST segue padrões modernos de arquitetura e é ideal para aplicações que exigem robustez, integração com serviços externos e escalabilidade.

## 🌟 Funcionalidades

- Cadastro de usuários e carteiras
- Registro de transações entre carteiras com controle de saldo
- Validação de transações via serviço externo de autorização (Feign Client)
- Envio de notificações (mockado via cliente externo)
- Tratamento global de exceções com mensagens amigáveis
- Estrutura em camadas para separação de responsabilidades

## 🏆 Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.3.0**
- **Spring Data JPA**
- **PostgreSQL**
- **Feign Client (Spring Cloud)**
- **Lombok**
- **Maven**

## 📁 Estrutura do Projeto

transacao-simplificada/
├── controller/
│   ├── GlobalExceptionHandler.java
│   ├── TransacaoController.java
│   └── TransacaoDTO.java
├── infrastructure/
│   ├── clients/
│   │   ├── AutorizacaoClient.java
│   │   ├── AutorizacaoDTO.java
│   │   ├── DataDTO.java
│   │   └── NotificacaoClient.java
│   ├── configs/
│   │   └── PopularTabelaUsuario.java
│   ├── entity/
│   │   ├── Carteira.java
│   │   ├── TipoUsuario.java
│   │   ├── Transacoes.java
│   │   └── Usuario.java
│   ├── exceptions/
│   │   ├── BadRequestException.java
│   │   └── UserNotFound.java
│   └── repository/
│       ├── CarteiraRepository.java
│       ├── TransacaoRepository.java
│       └── UsuarioRepository.java
├── service/
│   ├── AutorizacaoService.java
│   ├── CarteiraService.java
│   ├── NotificacaoService.java
│   ├── TransacaoService.java
│   └── UsuarioService.java
├── TransacaoSimplificadaApplication.java
└── pom.xml


## 🚀 Como Executar Localmente

1. **Clone o repositório:**
```bash
git clone https://github.com/seu-usuario/transacao-simplificada.git
cd transacao-simplificada
```

2. **Configure o banco de dados PostgreSQL: *Crie um banco com o nome desejado e ajuste as credenciais no application.properties:**
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

3. **Execute a aplicação:**
```bash
./mvnw spring-boot:run
```

## 🔍 Exemplos de Uso

**Criar Usuário**
```bash
POST /usuarios
{
  "nome": "João Silva",
  "cpf": "12345678901",
  "email": "joao@email.com",
  "tipo": "COMMON"
}
```

**Realizar Transação**
```bash
POST /transacoes
{
  "pagadorId": 1,
  "recebedorId": 2,
  "valor": 50.00
}
```

## 🚫 Possíveis Erros Tratados

- Usuário inexistente

- Saldo insuficiente

- Transação não autorizada pelo serviço externo

- Validações de campos obrigatórios

## 🎓 Conceitos Aplicados

- Arquitetura MVC com separação de camadas

- Uso de DTOs para abstração e segurança de dados

- Integração via Feign Client

- Manipulação de exceções personalizadas

- Bootstrapping de dados com component personalizado
