This project is used to provide ordered runner for both BlockJUnit4ClassRunner and OrderedParameterizedRunner (Odered version of Parameterized )

How to host your repo to github:
	+ Run mvn clean deploy to create local repo first
	+ Copy result from target/mvn-repo to github repository
How to use your repo in github:

	+ Add repository to reference pom like below (You can click to the git final file to get raw link):
	<repositories>
		<repository>
			<id>git-[your-git-id]</id>
			<url>https://github.com/crsici/OrderedRunnerJunit4.11/raw/master/</url>
		</repository>
	</repositories>

	<dependencies>
		<dependency>
			<groupId>com.sici.org.junit</groupId>
			<artifactId>ordered-runner</artifactId>
			<version>0.0.1-RELEASE</version>
		</dependency>
	</dependencies>
