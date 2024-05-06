@echo off
echo Downloading Maven...
set MAVEN_VERSION=3.9.2
set MAVEN_BASE_URL=https://dlcdn.apache.org/maven/maven-3/3.9.2/binaries/
set MAVEN_ARCHIVE_NAME=apache-maven-3.9.2-bin.zip
set MAVEN_DOWNLOAD_URL=%MAVEN_BASE_URL%/%MAVEN_ARCHIVE_NAME%
powershell -Command "(New-Object Net.WebClient).DownloadFile('%MAVEN_DOWNLOAD_URL%', '%MAVEN_ARCHIVE_NAME%')"
echo Extracting Maven...
powershell Expand-Archive %MAVEN_ARCHIVE_NAME% -DestinationPath .\
echo Cleaning up...
del %MAVEN_ARCHIVE_NAME%
set MAVEN_DOWNLOAD_URL=%MAVEN_BASE_URL%/%MAVEN_ARCHIVE_NAME%
powershell -Command "(New-Object Net.WebClient).DownloadFile('%MAVEN_DOWNLOAD_URL%', '%MAVEN_ARCHIVE_NAME%')"

echo Clone Maven Project...
git clone https://github.com/actifsource/ch.actifsource.example.maven.git

echo Build Project...
REM set JAVA_HOME=jre
echo JAVA_HOME: %JAVA_HOME%
apache-maven-3.9.0/bin/mvn clean install -f ch.actifsource.example.maven/ch.actifsource.example.maven.actifsourceeclipse/ch.actifsource.example.actifsourceeclipse/ 
echo Eclipse Location: 'ch.actifsource.example.maven\ch.actifsource.example.maven.actifsourceeclipse\ch.actifsource.example.actifsourceeclipse.product\target\products' 
echo Done.