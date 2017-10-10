&nbsp;-----<br />
Maven多模块 &nbsp;+ Spring4.0.6 + SpringMVC4.0.6 &nbsp;+ Mybatis 3.2.7 + log4j 2.1<br />
&nbsp;-----<br />
2017-10-10<br />
&nbsp;-----<br />
ssm-parent &nbsp;父模块 不包含任何代码&nbsp;<br />
ssm-model &nbsp; 对象模块,所有的实体对象都放到这里<br />
ssm-dao &nbsp; &nbsp; 数据库交互模块，Mybatis的mapper.xml文件及Dao层的接口就写到这里&nbsp;<br />
ssm-service 业务模块，业务接口及其实现都放到这里，事务控制也是在Service中<br />
ssm-web Maven Webapp &nbsp;控制层，页面发送的请求，都通过这里接收和响应&nbsp;<br />
ssm-common &nbsp;公共模块，一些公共组件，工具类都放到这个模块中<br />
<br />
<br />
【参考】各层命名规约<br />
A) Service/DAO层方法命名规约<br />
<span style="white-space:pre">	</span> 1） 获取单个对象的方法用get做前缀。&nbsp;<br />
<span style="white-space:pre">	</span> 2） 获取多个对象的方法用list做前缀。&nbsp;<br />
<span style="white-space:pre">	</span> 3） 获取统计值的方法用count做前缀。&nbsp;<br />
<span style="white-space:pre">	</span> 4） 插入的方法用save（推荐）或insert做前缀。&nbsp;<br />
<span style="white-space:pre">	</span> 5） 删除的方法用remove（推荐）或delete做前缀。<br />
<span style="white-space:pre">	</span> 6） 修改的方法用update做前缀。<br />
<span style="white-space:pre">	</span>&nbsp;<br />
B) 领域模型命名规约&nbsp;<br />
<span style="white-space:pre">	</span> 1） 数据对象：xxxDO,xxx即为数据表名。<br />
<span style="white-space:pre">	</span> 2） 数据传输对象：xxxDTO,xxx为业务领域相关的名称。&nbsp;<br />
<span style="white-space:pre">	</span> 3） 展示对象：xxxVO,xxx一般为网页名称。<br />
<span style="white-space:pre">	</span> 4） POJO是DO/DTO/BO/VO的统称，禁止命名成xxxPOJO。<br />
<br />
