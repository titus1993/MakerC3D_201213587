SET JAVA_HOME = "C:\Program Files\Java\jdk1.8.0_111\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\Titus\Documents\NetBeansProjects\MakerC3D_201213587\MakerC3D\src\org\compi2\codigo3d\parser
java -jar C:\Users\Titus\Documents\NetBeansProjects\MakerC3D_201213587\MakerC3D_201213587\lib\JFlex_1.6.1\java-cup-11a.jar -parser parser -symbols sym sintactico.cup
pause