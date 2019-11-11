@echo off

set PROJECT_HOME=%CD%
set JAVA_HOME=%PROJECT_HOME%\jdk1.8.0_221
set path=%JAVA_HOME%\bin;%path%
set WORKSPACE=%PROJECT_HOME%\workspace_ee

start %PROJECT_HOME%\eclipse\eclipse.exe -data %WORKSPACE% -vm %JAVA_HOME%\bin\javaw.exe -vmargs -Xms512m -Xmx1024m

