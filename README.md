基于SpringBoot的微信点餐系统

* 项目整体介绍。[http://www.sqmax.top/springboot-project/](http://www.sqmax.top/springboot-project/) 
* 项目中设计的知识细节及难点以博客的形式整理在Wiki里。[Wiki](https://github.com/sqmax/springboot-project/wiki)

## 使用方式

1. 使用命令`git clone https://github.com/sqmax/springboot-project.git`克隆到本地。
2. 在IDEA里。File->open...，然后选择项目文件夹。
3. 在IDEA里，安装lombok插件。File->Settings...->Plugin，搜索lombok,安装。
4. 运行数据库脚本sqmax.sql（注意这里使用的是MySQL5.7，不同的数据库版本可能语法可能有些差异）。
5. 以SellApplication类为Main class来运行项目（Spring Boot就是这样可以像运行一个main方法的类来启动一个Web项目）。
6. 浏览器访问：`http://localhost:8080/sell/seller/order/list`，就可以来到商家管理界面。
7. 对于手机端微信公众号内访问，设计到挺复杂的微信调试。这里就不再介绍。可以使用postman这个工具模拟微信点餐下单。访问接口参见controller包下以Buyer开头的类。
8. 如果相查看微信端的访问效果，可以在微信客户端访问这个链接：`http://sell.springboot.cn/`。（注意这是师兄上线的项目演示）


>关于IDEA,对于使用Eclipse,可以尝试一下IDEA,非常智能好用，可以参见一下这个仓库：[https://github.com/judasn/IntelliJ-IDEA-Tutorial](https://github.com/judasn/IntelliJ-IDEA-Tutorial)，非常好的IDEA使用教程。