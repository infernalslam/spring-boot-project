# spring-boot-project

learn spring boot framework implement by JAVA

SO, I learn follow from the MVC strcture and inspiration from javascript structure.
Now learning todo list.

- [x] spring boot gradle.
- [x] plan structure before coding my project.
- [x] provide controller api.
- [x] login (JWT) controller and security.
- [x] unit test code quality.
- [x] integrate mysql in tool migration db.
- [x] provide client for connect external api.
- [ ] loger error.



## use dependencies.

```java
dependencies {
	implementation('org.springframework.boot:spring-boot-starter-actuator')
	implementation('org.springframework.boot:spring-boot-starter-web')
	compile group: 'io.jsonwebtoken', name: 'jjwt', version: '0.7.0'
	compileOnly('org.projectlombok:lombok')
	testImplementation('org.springframework.restdocs:spring-restdocs-mockmvc')
	
	testImplementation('org.junit.jupiter:junit-jupiter-api:5.2.0')
	testCompile('org.junit.jupiter:junit-jupiter-params:5.2.0')
	testRuntime('org.junit.jupiter:junit-jupiter-engine:5.2.0')
	testCompile "org.mockito:mockito-core:2.+"
	testCompile('org.mockito:mockito-junit-jupiter:2.18.3')
	testCompile('org.springframework.boot:spring-boot-starter-test')
}


test {
	afterSuite { desc, result ->
		if (!desc.parent) {
			println "\nTest result: ${result.resultType}"
			println "Test summary: ${result.testCount} tests, " +
					"${result.successfulTestCount} succeeded, " +
					"${result.failedTestCount} failed, " +
					"${result.skippedTestCount} skipped"
		}
	}

```
'


migration spring boot with flyway
Doc: https://flywaydb.org/documentation/migrations


SQL-based migrations
Migrations are most commonly written in SQL. This makes it easy to get started and leverage any existing scripts, tools and skills. It gives you access to the full set of capabilities of your database and eliminates the need to understand any intermediate translation layer.

SQL-based migrations are typically used for

DDL changes (CREATE/ALTER/DROP statements for TABLES,VIEWS,TRIGGERS,SEQUENCES,…)
Simple reference data changes (CRUD in reference data tables)
Simple bulk data changes (CRUD in regular data tables)
Naming
In order to be picked up by Flyway, SQL migrations must comply with the following naming pattern:


The file name consists of the following parts:

Prefix: V for versioned (configurable), U for undo (configurable) and R for repeatable migrations (configurable)
Version: Version with dots or underscores separate as many parts as you like (Not for repeatable migrations)
Separator: __ (two underscores) (configurable)
Description: Underscores or spaces separate the words
Suffix: .sql (configurable)
