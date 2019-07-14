聚集函数(avg min max count sum)
确定行数 某行的和 最大值最小值 平均值等
distinct 出去不同的值 返回唯一不同值.
聚集函数可以多个组合在一起


===============================================
创建分组
group by
过滤分组
having 支持所有where 操作(一个过滤行 一个过滤分组)


=========================================================

Junit 测试方法的有点,为什么选择Junit测试方法
不需要再main方法中写很多测试代码
如果被测类中有很多方法就会显得很臃肿,或者多次重写代码
用Junit测试 让每个方法独立测试
判定结果 红色表示失败 绿色表示成功;
执行步骤
1.导入包而且必须@Test修饰
2.不在项目内
@Before 用于初始化方法,自愿申请关键字在每个子程序执行时先执行一次在执行子程序
@After 与before相反.释放资源每个测试方法结束后都会自动执行.


======================================================

框架是什么?
 框架:是半成品软件,在框架的基础上开发可以减缓编码
反射:框架的灵魂:
	将类的各个组成部分封装成其他对象(抽象定义)
	1,在执行过程中操作对象
	2,降低耦合性
	
类对象获取方式:源代码阶段, class类对象阶段,runtime运行时阶段
	1,第一阶段的获取 class.forname("全类名") 将字节码文件加载进内存 返回class对象
	2,类名的属性 class来获取
	3.对象.getclass
理解:第一种获取方法是 直接根据包的地址获取class
	第二种是用方法.类名称的形式取获取(person.class)
	第三种是用对象 获取到类, 返回的是一个包的地址
结论:同一个字节码文件(.class),在程序运行时只会被加载一次,都是同一个class;

获取了这个字节码文件之后可以获取
	1.类名称

	2.成员变量
	getDeclareFields获取全部的成员变量(可以对私有的设置值,但是还是没法直接设置获取私有值
					需要提前忽略安全检查 成员名.setAccessible(true))
	getField(String name)
 	getFields()//获取所有public修饰的成员变量的
		获取了成员变量可以干嘛?为什么要获取?
			1.设置他的值 field.set
			2.获取他的值 field.get
	3.成员方法
	getMethod(String name, Class<?>... parameterTypes)
	getMethods() 
		获取了成员方法干什么?
			1.执行方法 
			Method.invoke(对象名称,参数)返回object类
			2.获取方法名称
			 method.getname 
	4.成员构造方法
	获取他的构造方法干什么?
		可以创建对象cot.newInstance(参数与上面获取的一致)新建一个这种类型的对象
	getConstructor(Class<?>... parameterTypes) 注意参数类型要写上,int.class类似于
	getConstructors() 
	若是空参的构造可以简化,不用获取他的空参构造方法直接用 cls.newinstance即可.
	
问题 为什么getfields 打印出的是地址 而不是成员变量
	System.out.println(fields);错误
	System.out.println(field);正确
	打印的不是整个数组 而是单个成员,若打印数组,自然出现数组的地址


获取了这个字节码文件之后可以获取
	1.类名称

	2.成员变量
	getDeclareFields获取全部的成员变量(可以对私有的设置值,但是还是没法直接设置获取私有值
					需要提前忽略安全检查)
	getField(String name) 
 	getFields()//获取所有public修饰的成员变量的
		获取了成员变量可以干嘛?为什么要获取?
			1.设置他的值 field.set
			2.获取他的值 field.get
	3.成员方法
	getMethod(String name, Class<?>... parameterTypes)
	getMethods() 
	4.成员构造方法
	getConstructor(Class<?>... parameterTypes) 
	getConstructors() 
	
问题 为什么getfields 打印出的是地址 而不是成员变量
	System.out.println(fields);错误
	System.out.println(field);正确
	打印的不是整个数组 而是单个成员,若打印数组,自然出现数组的地址
	
	- ===============================================================================================
	- 案例:需求  创建一个"框架"可以完成创建任意类 的对象,并且执行其中任一方法.

获取class目录下的配置文件
Propertiespro=newProperties();
ClassLoaderclassLoader=ReflectTest.class.getClassLoader();
InputStreamresourceAsStream=classLoader.getResourceAsStream("pro.properties");
pro.load(resourceAsStream);

2019.7.4

2019.0705

CS: client  servlet
	一个升级 都得升级 维护安装比较麻烦,每个客户端都得安装
BS: jd taobao 百度 等 browser servlet
	客户端不需要升级 维护比较简单.
	Bs CS 各有优势
	Cs 比较美观 响应比较快

Mybatis核心 :是输入输出映射

Mybatis 取代了jdbc dbutils 等原始方法操作数据库

	
	
Mybatis 是什么:定制化sql,存储过程以及高级映射的优秀持久层框架, 避免了jdbc代码和手动设置参数以及获取结果集.
简化了对数据库的操作.

Ssm预备知识: Java基础,javaweb知识.


2019.7.7

注解
本质上就是一个借口继承了一个annotatio接口
@override:检测该注解表示的内容是否继承自父类
@deprecate:该注解表示的内容已经过时了
@suppresswarning:压制警告一般传递参数"all"
属性:接口中可以定义的成员方法称作注解的属性(接口中的成员方法)
		要求
		 属性的返回值类型:
			数据基本类型
			String
			枚举
			注解类型
			数组(以上类型的数组)
		 

演示 三种注解

如何去自定义注解?(分成两部分)

第一部分(较麻烦)
	元注解
第二部分
	Public @interface 注解名称(){}

20190708

今日内容

Sql数据库的配置操作


	什么是sql (struct query  language 00)操作所有关系类数据库的规则
		Sql语句可以分行书写,分号结尾.
		




	
	
	Alter  databse  database_name character set utf8;
	
Drop database  database_name;
	Show databases ;
	Use  database_name;
	Show tables; desc table_name;
	Select * from table_name;
	
	
创建表:crate table table_name (列名称1 数据类型,列名2 数据类型);
							最后一列不加逗号;
	复制表 create table new_name like old_name;
	修改表名:alter  table old name rename  to new_name;;
	修改字符集:      alter table character set utf8;
	添加一列：alter table name  add 列明, 类型;
	修改列名称: alter table 表名称  change 旧列名称 新名称 类型;
	删除列 alter table name drop 列明
			  Alter table name modify 列名称 要修改的类型.
		数据类型
			Int 
			Double(5.2)最多有五位小数点后面是两位
			Date //只包含年月日
			
							
							
							
							
							



create table student(id int,
name varchar(20),
age int,
score double(4,1),
birthday date,
insert_time timestamp);                                         	

字符串类型
Name varchar(20),最大二十个字符

Datatime: 年月日时分秒 yyy_mm_dd hh mm ss;
Timestamp
	如果是timestamp不赋值或者null 则使用系统时间
	
	

DML数据库操作语言

添加数据: inser into 表明(列明1 ,列明2,,,) valus(1,2,,3,,,,,)
删除数据: delete  from 表名 [where 条件] 
如果不加条件则删除所有数据;(truncate table stu):删除表然后创建一个同名的空表
修改表中的数据:update  表名称  set 列明 = ??  where 条件;



DQL数据库查询语言

排序查询:order by 排序方式;(降须还是升序)
	select *from user order by  u_id asc ;
	Select * from user order by u_id desc;
	如果有多个排序条件,当前面条件一样是才会用第二个条件.
聚合函数:将一列数据作为一个整体,进行纵向计算所有的聚合函数都排除了null
	Count:计算个数;	SELECT COUNT(u_id) FROM USER;
	Max:计算最大值;
	Min:最小值;
	Sum:求和;
	Avg:平均值;
排除null: 1.选择不包空值的列(主键)
		2.Count(*)
		
		
		
		
		
		
		
		

	
分组查询:1.语法 group by + 分组字段;
	Where 和Having 区别
	Where在分组前限定
	Having 在分组之后进行限定
		Where 不能跟聚合函数的判断
		Having 能进行聚合函数的判断
分页查询:语法limit开始的索引,每页查询的条数(方言)
		SELECT * FROM USER LIMIT 0,3;
		(当前的页码 -1 乘以每页的个数)



基础查询

多个字段查询
	SELECT  u_username,
	math,
	 english ,
	math+IFNULL(english ,0) 
	AS
	total 
	FROM USER 
	ORDER BY total 
	DESC;
去除重复
	distinct
计算列
	四则运算计算列的值(一般只会进行数值型 )
	Ifnull(哪个字段需要判断,如果为null的替换值 )
起别名
	AS 或者一个或者多个空格
如果有null 进行的运算,结果都是null
	

条件查询
			Where子句之后跟条件
			运算符
				Ø < = 等
				Ø In(集合)
				Ø Like
				Ø And &&
				Ø Or ||
				Ø Not !
		Null 无法使用等号来判断 只能用is 或者 is not
		

模糊查询: like
		%任意多个字符
		_任意一个字符
		

2019.7.9

约束:对表中的数据进行限定从而保证数据的正确性 有效性,完整性.
	分类:
	 主键primary key;
	非空约束:not null;
	唯一约束,:unique;
	外键约束:foreign key;
	
		非空约束:not null;
			创建表时添加约束
				删除约束: alter table stu modify name varchar(20);
			第二种添加约束:
				Modnify和change
				
	
	

唯一约束,:unique;
	删除唯一约束 有点特殊 alter table  stu drop index phone_number;
	添加约束 modify 或者change 或者在创建表的时候添加.

主键primary key; 非空且唯一
	创建表时:添加主键 create table stu(id int primary key);
	添加主键:alter table stu modify id int primary key;
	删除主键: ALTER TABLE stu DROP PRIMARY KEY;
	
	主键自动增长(auto_increment)
		创建表时:添加主键并且自动增长
			Create table stu (id int primary key auto_increment
			,name varchar(20));
			删除自动增长
			 alter table stu modify id int;

外键约束:foreign key;限制误删除 误添加操作.
		Constraint 外键名称 foreign  key  (晚间列名称 )references 主表名称(主表列名称)
		删除外键:alter table table_name drop foreign key  外键名称;
		添加外键 alter table table_name Add Constraint  fk_name  foreign key references table_name;
		
		ALTER TABLE employee ADD CONSTRAINT fk_name FOREIGN KEY (dep_id) REFERENCES department(id);

级联操作 : 级联更新
		ALTER TABLE employee ADD  CONSTRAINT fk_name FOREIGN KEY (dep_id) REFERENCES department(id) ON UPDATE CASCADE;
		UPDATE employee SET dep_id =NULL WHERE dep_id=3;
		UPDATE	employee SET dep_id = 3 WHERE dep_id = 2;
		UPDATE employee SET dep_id = 1 WHERE dep_id IS NULL;
		级联删除
			ALTER TABLE employee ADD  CONSTRAINT fk_name FOREIGN KEY (dep_id) REFERENCES department(id) ON UPDATE CASCADE on delete cascade;
		

数据库设计:
			多表之间的关系
				一对一 :  	人对应一张身份证,身份证对应一个人
				一对多	一个部门,有多个员工,一个员工只能有一个部门,多个员工可以一个部门
				多对多	学生和课程,学生多个课程,课程可以给多个学生.
				
一对多关系的实现:
				
				

再多的一方建立外键,关联到1的一方的主键即可 

多对多的关系: 学生表 课程表

	

想要完成多对多关系 需要中间表来完成中间表至少包含 两个字段 即两个表的主键 这两个字段作为第三章标的外键分别指向两张表的主键.

一对一关系的实现



案例

数据的范式: 设计数据库时需要遵循的规范       第一范式 第二范式 第三范式 ,巴斯克的范式 第五                         范式,第六范式

第一范式:每一列都是不可分割的原子数据项
第二范式;
第三范式:







                                                                                    

		
	
		
20190711

	任务 
	多表查询 
	事物
	DCL
	

多表查询 
		Select * from dept,emp; 
		#笛卡尔积 A*B
		#消除无用的数据
			    内连接查询 
					隐式内连接
						Where来限制表格
					显式内连接
						语法 select 字段 from  table_name inner(可以省) Join 表名 on 条件
				从哪些表中查 ,查哪些字段,限制条件
			   外链接查询
					 左外连接
					Select 字段列表 from 表1 left outer join 表2  on条件
						查询的是左表所有数据 以及交集.
					右外连接
					Select 字段列表 from 表1 right outer join 表2  on条件
		2.  子查询
			查询过程中嵌套查询 就是子查询.
			
			SELECT MAX(math) FROM USER;
			SELECT 
				u_username
			FROM USER
			WHERE 	user.`math`=(SELECT MAX(math) FROM USER ) ;
			子查询的多种情况
				1. 子查询的结果是单行单列
					a) 子查询作为条件去判断,运算符是><=等 如上例子
					SELECT 
						u_username
					FROM 
						USER
						WHERE user.math <(SELECT 
							AVG(math)
						 FROM 
							USER);
						
				2. 结果是多行单列的
					a) 也可以作为条件去查询的
					b) Select x xx from dept_id in(多行的值)
				3. 结果是多行多列的
					a) 可以作为一张table 来进行表查询

20190712

练习六个题

事务 
	1.基本介绍
		一个包含多个步骤的操作,被事务管理,要么同时成功 要么同时失败
		失败之后就回滚
		操作 
		 start transaction
		Rollback回滚
		Commit 提交
		事务提交的两种方式 一种自动提交(mysql语句自动提交) 一种手动提交(需要开启事务)
		修改事务的默认提交方式
		Select @@autocommit 0 代表手动提交 1代表自动提交
		Set  @@autocommit = 0; 即可自动提交
			
	2.四大特征(记住)
		原子性:不可分割的最小操作单位,要么同时成功 要么同事失败
		持久性:如果事务一旦提交或者回滚数据库会 持久化的保存数据
		隔离性:多个事务之间相互独立
		一致性:事务操作前后数据总量不变
	
	.事务的隔离级别(了解)没听

DCL:  用户增删改查
	权限管理
	
	
	

Jdbc:                                                                                                                                   
		1. java database  connectivety
		JDBC本质是什么?
		Sun公司定义了一套操作所有关系型数据库的规则,即接口,个数据库厂商实现这些接口,提供数据库驱动的jar包,我们可以使用这套接口(jdbc)编程,真正执行的代码驱动是驱动的jar 包中的实现类.
		数据库本身书写了 实现类(数据库驱动)
	
	2. Jdbc 的快速入	门
		1.  导入驱动jar包mysql-connector-java-5.1.37
			i. 复制这个 jar包到目录下
			ii. 右键 Add as library
		2. 编写代码注册驱动
			i. 注册驱动Class.forName("com.mysql.jdbc.Driver");
		3. 获取数据库的连接对对象(connection)
			i. DrverManger.getconnection(")
		4. 定义sql语句:通过一些方式把sql 发送给数据库,数据库就可以帮我们执行sql了,从而达到java 代码 控制数据库的目的.
		5. Connection 无法直接执行sql 所以要 获取statement对象,
		6. 执行sql接受返回的结果.
		7. 处理结果
		8. 释放资源 
        Class.forName("com.mysql.jdbc.Driver");//导入jar包
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "0628");//注册驱动
        String sql = "update account set balance  = 30 where id=1";//定义SQL语句
        Statement stmt = conn.createStatement();//获取执行SQL的对象 statement
        int i = stmt.executeUpdate(sql);//处理结果
        System.out.println(i);//
        stmt.close();//释放资源
        conn.close();
   详解对象
    Drivemanage:驱动管理对象
      1.注册驱动:告诉程序使用哪一个驱动器jar包
         方法一:static void registerDriver(Driver driver)
          方法二:class.forname("com.mysql.jdbc.Driver")有一些代码会随着类的加载执行,到底是哪些代码呢?(静态代码块如下所示)
                    static {
                      try {
                          java.sql.DriverManager.registerDriver(new Driver());
                      } catch (SQLException E) {
                          throw new RuntimeException("Can't register driver!");
                      }
          注意:mysql5.0,之后的jar包可以省略注册驱动
      2.获取数据库连接
       static Connection getConnection(String url,//指定路径 语法:jdbc:mysql://IP地址:端口号/数据库名称
                                       String user,//
                                       String password)
       细节如果连接 的是本机的服务器,并且默认端口是3306则url可以简写为:jdbc:mysql:///数据库名称
              connection:数据库连接对象
                功能:获取执行特sql的对象
                  一  1. DriverManage.getConnection(url,user,password);
                      conn.createstatement()
                      2.preparestatement  prepareStatement(string sql);
                  二.管理事务
                    1.setautocommit (void setAutoCommit(boolean autoCommit))调用该方法设置其参数为false即开启事务;
                    2.commit 提交事务
                    3.void rollback(Savepoint savepoint)
              statement:执行SQL的对象
                    用于执行静态 SQL 语句并返回它所生成结果的对象。
                   1. Boolean excute(string sql);
                   2. int ecuteUpdate(String sql)//执行DML语句(insert,update,delete),DDL:(表和create alter drop)语句
                    返回值是影响的行数,判断语句是否执行成功
                   3.resultset excutequery(string sql) 执行DQL(select)语句
                练习:
                  1.account 增加一条记录:update account  set balance = 600 where id =5
                  2.        修改记录update account set balance= 500 where id= 6
                  3.        删除记录delete from account where id =3
                  4. 创建 create table stu (id int ,name ,varchar(20));
              resulset:结果集对象
                      
                   
              preparedstatement :执行sql的对象
    
    
		
	
			




