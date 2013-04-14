1.mysql数据源配置
将以下内容复制到%TOMCAT_HOME%\conf\context.xml中。
或者直接覆盖project\Readme\context.xml文件到%TOMCAT_HOME%\conf\context.xml

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

2.mysql驱动包
将project\lib\mysql-connector-javabin.jar复制到%TOMCAT_HOME%/lib/中