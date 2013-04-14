将一下内容复制到%TOMCAT_HOME%\conf\context.xml中。
或参照Readme\context.xml文件

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