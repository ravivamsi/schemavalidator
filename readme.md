# Schema Validator



## JSON Schema Validation

```java
 SchemaValiator.validateJSONSchemaGeneric(path/to/sampleschema.json, path/to/sample.json");
       
```


## XML Schema Validation

```java
 SchemaValiator.validateXMLSchema(path/to/sampleschema.xml, path/to/sample.xml");
       
```

## Maven Dependencies 

### JSON 

```xml
<dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20180130</version>
</dependency>
<dependency>
    <groupId>org.everit.json</groupId>
    <artifactId>org.everit.json.schema</artifactId>
    <version>1.3.0</version>
</dependency>
<dependency>
	<groupId>com.github.fge</groupId>
	<artifactId>json-schema-validator</artifactId>
	<version>2.2.6</version>
</dependency>
<dependency>
	<groupId>com.github.fge</groupId>
	<artifactId>jackson-coreutils</artifactId>
	<version>1.8</version>
</dependency>
<dependency>
	<groupId>com.github.fge</groupId>
	<artifactId>json-schema-core</artifactId>
	<version>1.2.5</version>
</dependency>

```

## Folder Structure

```
├── pom.xml
├── readme.md
├── resources
├── src
└── target

```