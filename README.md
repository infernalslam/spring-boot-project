# spring-boot-project

learn spring boot framework implement by JAVA

SO, I learn follow from the MVC strcture and inspiration from javascript structure.
Now learning todo list.

- [x] spring boot gradle.
- [x] plan structure before coding my project.
- [x] provide controller api.
- [x] login (JWT) controller and security.
- [x] unit test code quality.
- [ ] integrate mysql in tool migration db.
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
mock interface for test services 
