基于SpringBoot的微信点餐系统

* 项目整体介绍。[http://www.sqmax.top/springboot-project/](http://www.sqmax.top/springboot-project/) 
* 项目中设计的知识细节及难点以博客的形式整理在Wiki里。[Wiki](https://github.com/sqmax/springboot-project/wiki)

## 使用方式

>下面是刚做完项目写的理解还不是太深刻，有些简略，可能有些问题，过几天再整理详细的。-2018.06.15

0. 安装环境：redis,mysql,maven。
1. 使用命令`git clone https://github.com/sqmax/springboot-project.git`克隆到本地。
2. 在IDEA里。File->open...，然后选择项目文件夹。
3. 在IDEA里，安装lombok插件。File->Settings...->Plugin，搜索lombok，安装。
4. 运行数据库脚本sqmax.sql（注意这里使用的是MySQL5.7，不同的数据库版本语法可能有些差异）。
5. 工程资源路径下的application.yml是Spring Boot的配置文件，修改里面的iP为自己的ip。
6. 以SellApplication类为Main class来运行项目（Spring Boot就是这样，可以运行一个含main方法的类来启动一个Web项目）。
7. 浏览器访问：`http://localhost:8080/sell/seller/order/list`，就可以来到商家管理界面。
8. 对于手机端微信公众号内访问，还要使用到内网穿透工具，由于微信里不能直接访问ip地址，还要购买域名，还涉及到挺复杂的微信调试。这里就不再介绍。可以使用postman这个工具模拟微信点餐下单。访问接口参见controller包下以Buyer开头的类。
9. 如果想查看微信端的访问效果，可以在微信客户端访问这个链接：`http://sell.springboot.cn/`。（注意这是师兄上线的项目演示）


>关于IDEA。对于使用Eclipse的伙伴，可以尝试一下IDEA。我做这个项目也是第一次使用IDEA，感觉非常智能好用，可以参见一下这个仓库：[https://github.com/judasn/IntelliJ-IDEA-Tutorial](https://github.com/judasn/IntelliJ-IDEA-Tutorial)，非常好的IDEA使用教程。
