del \\192.168.3.2\d\SHARED\CF_OLD.jar
ren \\192.168.3.2\d\SHARED\CF.jar CF_OLD.jar
copy \\SERVER-PC\Update\CF.jar \\192.168.3.2\d\SHARED

del \\192.168.4.21\shared\CF_OLD.jar
ren \\192.168.4.21\shared\CF.jar CF_OLD.jar
copy \\SERVER-PC\Update\CF.jar \\192.168.4.21\shared

del \\192.168.2.2\shared\CF_OLD.jar
ren \\192.168.2.2\shared\CF.jar CF_OLD.jar
copy \\SERVER-PC\Update\CF.jar \\192.168.2.2\shared

start D:\SHARED\notif.vbs
