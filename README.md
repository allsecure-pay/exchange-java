
# README

[![Release](https://jitpack.io/w/allsecure-pay/java-exchange.svg)](https://jitpack.io/#allsecure-pay/java-exchange)

## Using the library

See [`src/example/java`](src/example/java) for examples on how to integrate the library.

There is no HTTP client library included to keep the library small and you can use any Java HTTP client of your choosing. 

The library consists of two parts.
First `com.exchange.client.model` which contains JAXB models for all payment gateway operations.
Second `com.exchange.client.signing` which contains helpers to correctly sign an HTTP request and to hash transmitted passwords.

### Gradle

Add the [jitpack.io](https://jitpack.io) repository:
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency (replace `VERSION` with the [GitHub release name](https://github.com/allsecre-pay/java-exchange/releases)):
```gradle
dependencies {
	...
	compile 'com.github.allsecure-pay:java-exchange:VERSION'
	...
}
```

### Maven

Add the [jitpack.io](https://jitpack.io) repository:

```maven
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```

Add the dependency (replace `VERSION` with the [GitHub release name](https://github.com/allsecure-pay/java-exchange/releases)):
 ```maven
<dependency>
    <groupId>com.github.allsecure-pay</groupId>
    <artifactId>java-exchange</artifactId>
    <version>VERSION</version>
</dependency>
```