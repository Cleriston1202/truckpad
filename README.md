# truckpad

Api de Cadastro de Motorista

Arquivos de configuração da API


#Chamada da Api para cadastrar um Motorista
Url  http://localhost:8080/motoristas
Corpo da Requisição
{
    "nome": "Marcos",
    "sexo": "M",
    "idade": 30,
    "tipoCnh": "C",
    "carregado": true,
    "tipoCaminhao": "CAMINHAO_TOCO",
    "origem": 222222222,
    "destino": 2222222,
    "veculoPropio": false
}
#Listar todos os Motoristas
http://localhost:8080/motoristas

#Consultar Motorista que não tem carga
http://localhost:8080/motoristas/carregado?carregado=false

#Consultar Motorista com Veiculo propio
http://localhost:8080/motoristas/veiculo?propio=true



Aplication.properties para configuração do banco de dados, usar o usuario e senha criado no banco de dados
#Criar o banco de dados (truckpad)
Com o banco de dados criado rodar a aplicação com esse parametro setado para create(spring.jpa.hibernate.ddl-auto=create)

e o Hibernate cria a tabela

spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/truckpad
spring.datasource.username=root
spring.datasource.password=




Arquivo Pom xml configuração das dependencias do projeto

#################################################################

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.3.1.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>br.com.truckpad</groupId>
	<artifactId>truckpad</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>truckpad</name>
	<description>Demo project for Spring Boot</description>

	<properties>
		<java.version>1.8</java.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-webflux</artifactId>
		</dependency>

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
			<exclusions>
				<exclusion>
					<groupId>org.junit.vintage</groupId>
					<artifactId>junit-vintage-engine</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
		<dependency>
			<groupId>io.projectreactor</groupId>
			<artifactId>reactor-test</artifactId>
			<scope>test</scope>
		</dependency>
		
		<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-data-jpa</artifactId>
			</dependency>
			 
			<dependency>
				<groupId>mysql</groupId>
				<artifactId>mysql-connector-java</artifactId>
				 <version>5.1.39</version>
			</dependency>
		
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>


