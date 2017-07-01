# struts2
第一步：struts2项目用tomcat可以访问＜/br＞
    a.比较烦的是不会用ideal创建web项目，＜/br＞
    毕竟以前用的都是eclipse，在公司中都是成熟的框架。＜/br＞
    详情参考：http://blog.csdn.net/a735465047/article/details/41646589＜/br＞
    b.tomcat版本apache-tomcat-9.0.0.M21＜/br＞
    c.pom 作用:struts2的核心包 主要作用 org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter＜/br＞
        <dependency>＜/br＞
          <groupId>org.apache.struts</groupId>＜/br＞
          <artifactId>struts2-core</artifactId>＜/br＞
          <version>2.5.10.1</version>＜/br＞
        </dependency>＜/br＞
        