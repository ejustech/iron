1.��������
����MyEclipse2013(MyEclipse10)������
  1-1.MyEclipse2013��װ
  1-2.MyEclipse�����������Ѿ����ڵĹ���

2.mysql����Դ����,ʹ��Tomcat���ӳء�
���������ݸ��Ƶ�%TOMCAT_HOME%\conf\context.xml�С�

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

3.mysql������
��project\lib\mysql-connector-javabin.jar���Ƶ�%TOMCAT_HOME%/lib/��