# DavidTGNewsProject

##【Android】最新主流新闻app功能实现。仿网易,搜狐等新闻客户端

作者：[程序员小冰](http://blog.csdn.net/qq_21376985)  

[欢迎点击关注微博](http://weibo.com/mcxiaobing)

[点击从OSChina进行下载](http://git.oschina.net/MCXIAOBING/DavidTGNewsProject)

(原创作品，转载请说明出处)先给大家看一下效果图： 

![这里写图片描述](http://img.blog.csdn.net/20161026111546696)

![这里写图片描述](http://img.blog.csdn.net/20161026104303501)

这个项目总体来说虽然不是特别难，但是确实非常常用的功能。是业余时间自己写的一个小项目。

以前我们写的时候一般都是自己写tab或者引用一个著名的库Indicator，

这里我直接使用的是系统的tablayout，刷新的话，我这里使用的是recycleView进行刷新与加载更多。

总体来说使用技术(感谢项目中所有的开源项目)：

1,OkHttp3.4.1(网络请求)

2,Gson2.7(解析)

3,picasso2.5.2(图片显示)

4,以及V7包下的cardview,recycleView,design,Tablayout

5,百度APIstore(所用接口)

项目结构:

![这里写图片描述](http://img.blog.csdn.net/20161026111112762)

项目为小冰所写，仅供参考，请勿用于任何商业。转载请说明出处。

可以直接放在AndroidStudio开发工具中运行,记得将Constants类中的百度API秘钥改为自己的即可。

欢迎star,fork，提出更好的建议。
