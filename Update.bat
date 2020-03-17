ren D:\SHARED\CF.jar CF_Old.jar
copy \\SERVER-PC\Update\CF.jar D:\SHARED\
taskkill /f /im javaw.exe
start D:\SHARED\CF.jar
