@echo off

set PROJECT_HOME=%CD%
set JRE_HOME=%PROJECT_HOME%\jdk1.8.0_221
set CATALINA_HOME=%PROJECT_HOME%\apache-tomcat-9.0.27


%CATALINA_HOME%\bin\startup.bat
pause





