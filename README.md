# 🚀 Jornada Spring Boot

Repositório criado para documentar meu aprendizado no ecossistema **Spring Boot**. O objetivo é evoluir de conceitos básicos de Java e Orientação a Objetos até o desenvolvimento de aplicações robustas, escaláveis e prontas para produção (Cloud/AWS).

---

## 🛠️ Tecnologias e Ferramentas
* **Java 26** (Utilizando as funcionalidades mais recentes do JDK)
* **Spring Boot 4.x** (Framework principal)
* **Maven** (Gerenciamento de dependências e build)
* **H2 Database** (Banco de dados em memória para desenvolvimento)
* **Postman** (Testes de endpoints e design de APIs)
* **VS Code** (IDE principal com suporte Red Hat Java)

---

## 🏗️ Estrutura do Projeto e Progresso

### 🟢 Fase 1: Arquitetura e Fundamentos (Concluído)
Nesta etapa inicial, foquei no funcionamento "por baixo dos panos" do Spring Framework:
* **Injeção de Dependência (DI) e Inversão de Controle (IoC):** Implementação de desacoplamento entre classes (Ex: Sistema de Montadora injetando diferentes tipos de `Motor`).
* **Gerenciamento de Beans:** Uso das anotações `@Component`, `@Service`, `@Bean` e `@Configuration`.
* **Resolução de Ambiguidades:** Aplicação de `@Primary`, `@Qualifier` e criação de **Anotações Customizadas** (ex: `@Aspirado`, `@Turbo`) para refinar a injeção de dependências.
* **Ciclo de Vida:** Entendimento de como o Spring gerencia a criação e destruição de objetos no contexto da aplicação.



---

### 🟡 Fase 2: Persistência e APIs REST (Em Andamento)
* **Spring Data JPA:** Modelagem de entidades, mapeamento objeto-relacional e uso de `JpaRepository`.
* **API RESTful:** Implementação de controllers com suporte aos verbos HTTP (GET, POST, PUT, DELETE).
* **Design de Contratos:** Padronização de respostas e uso de DTOs (Data Transfer Objects).

---

### ⚪ Próximos Objetivos
- [ ] **Spring Security & OAuth2:** Implementar autenticação robusta e Login Social (Google).
- [ ] **Docker:** Containerização da aplicação e do banco de dados.
- [ ] **AWS Cloud:** Deploy em instâncias EC2 e banco de dados RDS.
- [ ] **Testes de Software:** Escrita de testes unitários e de integração para garantir a confiabilidade.

---

## 📂 Organização de Pastas
```text
src/main/java/com/example/arquiteturaspring
├── api/             # Controllers e Endpoints REST
├── configuration/   # Classes de configuração de Beans
├── montadora/       # Domínio, Entidades e Lógica de Negócio
└── repository/      # Interfaces de persistência (JPA)