# Build custom eclipse
In this project we will show how to build a actifsource eclipse with integrated customized plugin by maven tycho.. 

|Project|Description|
|---|---|
|ch.actifsource.example.customeclipse|Contains the parent pom.xml. Define the target eclipse version inside this pom.xml|
|ch.actifsource.example.customeclipse.product|Defines the product to build|
|ch.actifsource.example.customeclipse.target|Defines all possible targets|
|ch.actifsource.example.customeclipse.jre.feature|Contains the jre to add to your eclipse application|
|ch.actifsource.example.customeclipse.feature|Defines the feature from the project which will be integrated as a plugin in eclipse|
|ch.actifsource.example.customeclipse.model|Contains the project which will be integrated as a plugin in eclipse|

## Set repository credentials
Add actifsoruce repository credentials to the 'settings.xml' file. ```${user.home}/.m2/settings.xml```
Use username and password from the actifsource update site (https://updates.actifsource.com/updates-enterprise).

File content:
```<settings>
    <servers>
        <server>
            <id>actifsource-enterprise</id>
            <username></username>
            <password></password>
        </server>
    </servers>
</settings>
```

## Run maven inside Eclipse
Create a new run configuration
![Eclipse run configuration](images/runinsideeclipse.png)

## Run maven standalone
Download the maven project (https://maven.apache.org/download.cgi)
and run maven: ``` mvn clean install ``` or ```run-mvn-local.bat```.

## Build success
![Eclipse run configuration](images/consolelog.png)

The products are now in the folder ```ch.actifsource.example.customeclipse.product\target\products```.
![Eclipse run configuration](images/products.png)

## Requirements
Actifsource Workbench Enterprise Edition

## License
[http://www.actifsource.com/company/license](http://www.actifsource.com/company/license)
