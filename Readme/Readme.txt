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

4.将project\lib\jxl.jar和poi-3.9-20121203.jar，复制到%TOMCAT_HOME%/lib/中
Excel用

5.执行SQL文件夹下的sql文件。
    01.DataBase.sql
            删除test数据库，并建立test数据库
    02.Table.sql
            删除test数据库中所有的数据表，并建立所有的数据表。m_user表中默认一条数据，用户名和密码都是admin，用于登录。
    03.TableData(Test ironinfo).sql
            测试用数据（2013年1月-5月的生产数据），非测试时，不需要执行
    04.Procedure.sql
            导入生产数据后执行，更新炉次索引的数据