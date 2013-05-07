1.开发环境
基于MyEclipse2013(MyEclipse10)开发。
  1-1.MyEclipse2013安装
  1-2.MyEclipse启动，导入已经存在的工程

2.mysql数据源配置,使用Tomcat连接池。
将以下内容复制到%TOMCAT_HOME%\conf\context.xml中。

<Resource name="jdbc/mysql"
        type="javax.sql.DataSource"
        username="flyzz"  
        password="123456"
        driverClassName="com.mysql.jdbc.Driver"
        maxIdle="2"
        maxWait="50"
        url="jdbc:mysql://192.168.1.104:3306/test"   
        maxActive="4"
/>

3.mysql驱动包
将project\lib\mysql-connector-javabin.jar复制到%TOMCAT_HOME%/lib/中

4.SSH Key?

5.将project\lib\jxl.jar和poi-3.9-20121203.jar，复制到%TOMCAT_HOME%/lib/中
Excel用