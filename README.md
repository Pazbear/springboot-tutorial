# 정리내용

## 7. 정적 컨텐츠
내장 톰캣 서버가 요청을 받으면
1. 컨트롤러
2. static 폴더   
순으로 찾아 응답한다.

## 8. MVC와 템플릿 엔진
내장 톰캣 서버가 요청을 받으면  
컨트롤러는 모델과 템플릿 이름을 스프링에 넘겨주고  
스프링은 ViewResolver를 통해 템플릿을 찾아 렌더링후 변환한 HTML을 리턴함

## 9. API
내장 톰캣 서버가 요청을 받으면  
@ResponseBody가 있을 경우 
- 문자열이면 StringConverter를 통해 처리
- 객체라면 JsonConverter를 통해 처리  

후 리턴

## 10. 비즈니스 요구사항 정리
1. 웹 애플리케이션 계층 구조
- 컨트롤러 : 웹 MVC의 컨트롤러 역할
- 서비스 : 핵심 비즈니스 로직 구현
- 리포지토리 : 데이터베이스에 접근, 도메인 객체를 DB에 저장하고 관리
- 도메인 : 비즈니스 도메인 객체

## 12. 회원 리포지토리 테스트 케이스 작성
####TDD 란?  
- 테스트 주도 개발   
테스트를 먼저 만들어놓고 그것을 기반으로 개발하는 것

## 15. 컴포넌트 스캔과 자동 의존관계 설정 & 16. 자바 코드로 직접 스프링 빈 등록하기
### 스프링 빈을 등록하는 2가지 방법
#### 컴포넌트 스캔과 자동 의존관계 설정  
- @Component 어노테이션이 있으면 스프링 빈으로 자동 등록 ( @Controller 또한 @Component를 가짐)  
- 스프링이 스프링 컨테이너에 스프링 빈 등록 시, 기본적으로는 싱글톤으로 등록함
#### 자바 코드로 직접 스프링 빈 등록하기  
- @Configuration을 사용한 SpringConfig을 통해 등록
- 상황에 따라 구현 클래스를 변경해야 할 때 설정을 통해 등록하는 경우 용의하게 사용

### DI
- 필드 주입, 주입 setter 주입, 생성자 주입 3가지가 있지만 생성자 주입을 권장.(의존관계가 실행중 변경되면 되므로)

## 21. 순수 JDBC

### 스프링 컨테이너

#### 개방 - 폐쇄 원칙  

- 확장에는 열려있고 수정, 변경에는 닫혀있음.

#### 스프링의 DI를 통해 기존 코드를 전혀 손대지 않고 설정만으로 구현 클래스를 변경할 수 있다.

## 22. 스프링 통합 테스트

### @SpringBootTest  
: 스프링 컨테이너와 테스트를 함께 실행함

### @Transactional  
: 테스트 시작전에 트랜잭션을 시작하고 테스트 완료 후 롤백을 함으로써 디비에 영향을 미치지 않음

#### 통합 테스트보단 단위 테스트를 만드는 것이 더 좋은 개발이다.

## 23. 스프링 JdbcTemplate
Tip. 생성자가 하나만 있을 경우 @Autowired 생략 가능.

## 24. JPA
### JPA

- 객체 중심의 설계로 패러다임 전환을 할 수 있음
- 개발 생산성을 크게 높일 수 있음

## 25. 스프링 데이터 JPA

- 실무에서는 JPA와 스프링 데이터 JPA 를 기본으로 사용
- 복잡한 동적 쿼리는 Querydsl이라는 라이브러리 사용
- 그마저도 힘들 때 JPA 제공 네이티브 쿼리나 JdbcTemplate 사용