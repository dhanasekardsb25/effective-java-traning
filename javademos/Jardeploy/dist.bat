@echo off

set PROJECT_ROOT=D:\Tranings\Java\MyRepo\javademos\Jardeploy

set DIST=%PROJECT_ROOT%\dist
set CLASSES=%PROJECT_ROOT%\classes

md %DIST%

cd %CLASSES%

jar cvf %DIST%\fa.jar .

cd %DIST%

echo @java -cp fa.jar in.conceptarchitect.app.FurnitureApp > fa.bat