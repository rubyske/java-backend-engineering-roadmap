<div align="center">

# ☕ Java Backend Engineering Roadmap

### Rebuilding my career as a Java Backend Developer — from fundamentals to production-grade, in public.

[![Java](https://img.shields.io/badge/Java-25_LTS-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.1-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-18-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![Docker](https://img.shields.io/badge/Docker-Compose-2496ED?style=for-the-badge&logo=docker&logoColor=white)](https://www.docker.com/)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](./LICENSE)

**[🚀 Roadmap](#-roadmap) · [🧱 Tech Stack](#-tech-stack) · [📁 Structure](#-repository-structure) · [🏗️ Final Project](#-final-project--order-management-system) · [📊 Progress](#-progress-tracker)**

</div>

---

## 👋 About This Repository

I'm **Badru**, a former Java Backend Developer. After time away from the field working other jobs, I'm rebuilding my skills from the ground up — not from zero knowledge, but from zero *current* practice — toward a modern, cloud-native, AI-aware Java backend stack.

This repository is my **public learning log and portfolio**: every concept gets a written explanation, every topic gets working code, and every milestone gets a commit. No copy-pasted tutorials without understanding — every folder here reflects something I can actually explain and defend.

> **Career target:** Java Backend Engineer → Cloud-Native Backend Engineer → AI-enabled Backend Engineer

---

## 🧱 Tech Stack

| Layer | Technology | Priority |
|---|---|:---:|
| **Language** | Java 25 (LTS) | 🔴 Must |
| **Build Tool** | Maven | 🔴 Must |
| **Framework** | Spring Boot 4.1 · Spring Framework 7 | 🔴 Must |
| **Data Access** | Spring Data JPA · Hibernate | 🔴 Must |
| **Security** | Spring Security · JWT | 🔴 Must |
| **Database** | PostgreSQL 18 | 🔴 Must |
| **Cache** | Redis | 🔴 Must |
| **Messaging** | Apache Kafka | 🟡 Should |
| **Testing** | JUnit 5 · Mockito · Testcontainers | 🔴 Must |
| **Containerization** | Docker · Docker Compose | 🔴 Must |
| **CI/CD** | GitHub Actions | 🟡 Should |
| **Cloud** | AWS (EC2 · RDS · S3 · IAM) | 🟡 Should |
| **Observability** | Spring Actuator · Prometheus · Grafana | ⚪ Awareness |
| **Architecture** | SOLID · Layered · Modular Monolith → Microservices | 🔴 Must |
| **AI Integration** | Spring AI · LLM API · RAG basics | 🟡 Should |

---

## 🗺️ Roadmap

A structured 30-day plan across 20 phases — from raw fundamentals to a production-shaped final project.

<details open>
<summary><b>Click to expand full 30-day table</b></summary>

| Day | Phase | Focus | Key Output |
|:---:|---|---|---|
| 1 | P0 · Environment & Git | JDK 25, IntelliJ, Git/GitHub, SSH | Repo initialized |
| 2 | P1 · Programming Fundamentals | Compiler, JVM/JDK/JRE, first program | Hello World+ |
| 3 | P1 · Programming Fundamentals | Variables, data types, operators | CLI calculator |
| 4 | P1 · Programming Fundamentals | Conditionals & loops | FizzBuzz & variants |
| 5 | P2 · Java Fundamentals | Methods, arrays | Refactored calculator |
| 6 | P2 · Java Fundamentals | Collections: List, Set, Map, generics | In-memory CRUD |
| 7 | P2 · Java Fundamentals | Exceptions, packages, access modifiers | Error-handled program |
| 8 | P3 · OOP | Classes, objects, encapsulation | First domain model |
| 9 | P3 · OOP | Inheritance, polymorphism, interfaces | Class hierarchy |
| 10 | P3 · OOP | Composition, SOLID principles | Refactored domain code |
| 11 | P4 · Modern Java | Lambdas, functional interfaces, Streams | Stream-based refactor |
| 12 | P4 · Modern Java | Records, enums, Date/Time, concurrency basics | Record-based DTOs |
| 13 | P5 · SQL & PostgreSQL | Relational modeling, keys, normalization | ERD + schema |
| 14 | P5 · SQL & PostgreSQL | CRUD queries, JOINs | Query set |
| 15 | P5 · SQL & PostgreSQL | Aggregates, indexing, transactions, ACID | Optimized queries |
| 16 | P6 · HTTP & REST | HTTP methods, status codes, REST principles | API contract (OpenAPI) |
| 17 | P7 · Spring Boot | DI, IoC, Beans, first Spring Boot app | `hello-spring` project |
| 18 | P7 · Spring Boot | REST Controllers, DTOs, validation | Product CRUD API |
| 19 | P8 · Spring Data JPA | Entities, repositories, relationships | API + PostgreSQL |
| 20 | P8 · Spring Data JPA | N+1 problem, pagination, JPQL | Optimized API |
| 21 | P9 · Spring Security | Auth vs authz, JWT, filter chain | API with auth |
| 22 | P10 · Testing | Unit & integration testing, Testcontainers | Test suite |
| 23 | P11 · Docker | Dockerfile, multi-stage build, Compose | `docker compose up` works |
| 24 | P12 · Redis | Cache-aside, TTL, invalidation | Cached endpoints |
| 25 | P13 · Kafka | Producers, consumers, topics, partitions | Event flow demo |
| 26 | P14–15 · Microservices & AWS | Service boundaries, EC2/RDS/S3 basics | Architecture notes |
| 27 | P16–17 · CI/CD & Observability | GitHub Actions, Actuator, logging | Working CI pipeline |
| 28 | P18 · System Design | Scalability, load balancing, CAP theorem | System design doc |
| 29 | P19 · AI Integration | LLM basics, Spring AI, RAG concepts | AI feature shipped |
| 30 | P20 · Portfolio & Interview Prep | README polish, mock interviews, CV | Portfolio finalized |

</details>

**Learning depth by topic:**
- 🔴 **MUST LEARN** — Java (fundamentals → modern), OOP, SQL/PostgreSQL, REST, Spring Boot Core/MVC/JPA, Spring Security basics, testing basics, Docker basics.
- 🟡 **SHOULD LEARN** — Redis, Kafka basics, CI/CD, AWS fundamentals, AI integration.
- ⚪ **AWARENESS ONLY** — full microservices, observability stack, advanced distributed systems, advanced AWS networking.

---

## 📁 Repository Structure

```
java-backend-engineering-roadmap/
├── README.md
├── LICENSE
├── .gitignore
├── .editorconfig
├── .github/
│   └── workflows/
│       └── ci.yml
├── docs/
│   ├── roadmap/
│   ├── architecture/
│   ├── interview/
│   ├── cheatsheets/
│   └── progress/
│       └── PROGRESS.md
├── 00-environment/
├── 01-programming-fundamentals/
├── 02-java-fundamentals/
├── 03-oop/
├── 04-modern-java/
├── 05-sql-postgresql/
├── 06-http-rest/
├── 07-spring-boot/
├── 08-spring-data-jpa/
├── 09-spring-security/
├── 10-testing/
├── 11-docker/
├── 12-redis/
├── 13-kafka/
├── 14-microservices/
├── 15-aws/
├── 16-cicd/
├── 17-observability/
├── 18-system-design/
├── 19-ai-integration/
├── projects/
│   └── final-project/          # Order Management System
└── portfolio/
    ├── index.html
    ├── style.css
    └── script.js
```

| Folder | Purpose |
|---|---|
| `0X-topic/` | Daily learning notes — each sub-topic has its own `README.md` + practice code |
| `docs/roadmap/` | This roadmap, versioned as it evolves |
| `docs/architecture/` | Final project architecture diagrams |
| `docs/interview/` | Mock interview notes & weak points to revisit |
| `docs/cheatsheets/` | Quick-reference sheets (Git, SQL syntax, etc.) |
| `docs/progress/PROGRESS.md` | Milestone checklist, updated after every completed day |
| `projects/final-project/` | The one serious project: **Order Management System** |
| `portfolio/` | Standalone landing page showcasing this journey |
| `.github/workflows/` | CI pipeline definitions |

---

## 🏗️ Final Project — Order Management System

Built as a **Modular Monolith first**, then selectively decomposed into services — to demonstrate understanding of *when* microservices are actually needed, not just how to use them.

```
Client (Postman / simple frontend)
        │  HTTP / REST
        ▼
┌─────────────────────────────────────┐
│         Spring Boot Application       │
│  ┌────────┐ ┌────────┐ ┌───────────┐ │
│  │  auth  │ │  user  │ │ inventory │ │
│  └────────┘ └────────┘ └───────────┘ │
│  ┌────────┐ ┌────────┐ ┌───────────┐ │
│  │ order  │ │payment │ │    ai     │ │
│  └────────┘ └────────┘ └───────────┘ │
└──────┬──────────┬──────────┬─────────┘
       ▼           ▼          ▼
  PostgreSQL     Redis      Kafka
```

**Features:** JWT authentication & authorization · product/inventory management · order processing · simulated payments · Redis caching · Kafka event-driven notifications · AI-generated product descriptions · full test coverage · Dockerized · CI pipeline.

---

## 🛠️ Tools & Setup

| Tool | Version | Required |
|---|---|:---:|
| JDK | 25 (LTS) | ✅ |
| IntelliJ IDEA | Latest | ✅ |
| Git | Latest | ✅ |
| Maven | Latest | ✅ |
| Docker Desktop / Engine | Latest | ✅ |
| PostgreSQL | 18 (via Docker) | ✅ |
| Postman / Bruno | Latest | ✅ |
| Redis | Latest (via Docker) | 🟡 |
| Kafka | Latest (via Docker Compose) | 🟡 |

---

## 📝 Commit Convention

This repository follows **[Conventional Commits](https://www.conventionalcommits.org/)** — every commit maps to a clear milestone.

```
feat(java): add variables and operators fundamentals
docs(git): add git workflow guide
feat(api): implement order creation endpoint
test(order): add order service unit tests
fix(security): correct JWT expiration handling
chore(deps): upgrade spring boot to 4.1
```

| Type | Use for |
|---|---|
| `feat` | New feature or learning module |
| `fix` | Bug fix |
| `docs` | Documentation changes |
| `refactor` | Code change with no behavior change |
| `test` | Adding or updating tests |
| `chore` | Tooling, dependencies, config |

---

## 📊 Progress Tracker

- [ ] Java Fundamentals
- [ ] OOP
- [ ] Modern Java (Streams, Records)
- [ ] SQL & PostgreSQL
- [ ] HTTP & REST
- [ ] Spring Boot Core & MVC
- [ ] Spring Data JPA
- [ ] Spring Security
- [ ] Testing
- [ ] Docker
- [ ] Redis
- [ ] Kafka
- [ ] Microservices & AWS Basics
- [ ] CI/CD
- [ ] System Design
- [ ] AI Integration
- [ ] Final Project — Order Management System

Full detail tracked in [`docs/progress/PROGRESS.md`](./docs/progress/PROGRESS.md).

---

<div align="center">

### 📬 Connect

**GitHub:** [@rubyske](https://github.com/rubyske)

*Rebuilding, one commit at a time.*

</div>
