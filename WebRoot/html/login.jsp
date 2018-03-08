<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<title>用户登录</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/site.css">
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>	
<div class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <button class="navbar-toggle collapsed" type="button" data-toggle="collapse" data-target=".navbar-collapse">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand hidden-sm" href="index.html"><img src="images/logo.png" alt=""></a>
    </div>
    <div class="navbar-collapse collapse" role="navigation">
      <ul class="nav navbar-nav">
        <li class="hidden-sm hidden-md"><a href="category.html">首页</a></li>
        <li><a href="change.html">所有产品</a></li>
        <li><a href="vote.html">博客</a></li>
        <li><a href="vote.html">文章列表</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right hidden-sm">
        <li><a href="search.html">搜索</a></li>
        <li><a href="register.html">注册</a></li>
        <li><a href="login.html">登录</a></li>
      </ul>
    </div>
  </div>
</div>

<div class="container marginTop">
      <div class="projects-header page-header">
        <p><a href="index.html">首页</a> > <a href="">用户登录</a></p>
      </div>
  <div class="col-lg-6 col-lg-offset-3">
  <div class="projects-header page-header">
    <h2>用户登录</h2>
  </div>
  <%=
  request.getAttribute("msg")
   %>
  <form class="form-horizontal" role="form">
    <div class="form-group">
      <label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="inputEmail3" placeholder="用户名">
      </div>
    </div>
    <div class="form-group">
      <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
      <div class="col-sm-10">
        <input type="password" class="form-control" id="inputPassword3" placeholder="输入密码">
      </div>
    </div>
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
        <input type="submit" class="btn btn-success" value="登录"> <input type="reset" class="btn btn-default" value="重置" /> <a href="register.html" class="btn btn-danger">还没有账号，去注册</a>
      </div>
    </div>
  </form>
  </div>
</div>
<div class="container-fluid panel-footer padtb_20">
  <div class="container">
    <div class="col-lg-3 col-md-3">
      <h4>青竹简介</h4>
      青竹良品原创生活类电商品牌，秉承一贯的严谨态度，我们深入世界各地，从源头全程严格把控商品生产环节，力求帮消费者甄选到最优质的商品，全线采用天然原材料，控制甲醛低量无害，采用进口工艺，国际生产线不断优化，食材保证核心原产地新鲜直供，让你享受品质生活
    </div>
    <dl class="text-muted col-lg-2 col-md-2 col-sm-4 dis">
      <dt>
        <a  href="/" >关于我们</a>
      </dt>
      <dd >
        <a href="javascript:void(0);">我的品牌</a>
      </dd>
      <dd>
        <a  href="javascript:void(0);">公司动态</a>
      </dd>
      <dd>
        <a  href="javascript:void(0);">经历发展</a>
      </dd>
      <dd>
        <a href="javascript:void(0);">商品推广</a>
      </dd>
    </dl>
    <dl class="text-muted  col-lg-2 col-md-2  col-sm-4 dis">
      <dt>
        <a  href="/" >支付方式</a>
      </dt>
      <dd >
        <a href="javascript:void(0);">微信支付</a>
      </dd>
      <dd>
        <a  href="javascript:void(0);">支付宝</a>
      </dd>
      <dd>
        <a  href="javascript:void(0);">百度钱包</a>
      </dd>
      <dd>
        <a href="javascript:void(0);">货到付款</a>
      </dd>
    </dl>
    <dl class="text-muted  col-lg-2 col-md-2 col-sm-4 dis">
      <dt>
        <a  href="/" >相关服务</a>
      </dt>
      <dd >
        <a href="javascript:void(0);">退货政策</a>
      </dd>
      <dd>
        <a  href="javascript:void(0);">购物流程</a>
      </dd>
      <dd>
        <a  href="javascript:void(0);">客服服务</a>
      </dd>
      <dd>
        <a href="javascript:void(0);">商务合作</a>
      </dd>
    </dl>
    <div class="text-muted col-lg-3 col-md-3 text-center dis">
      <img src="images/footerImgShow_2.png" width="50%"><br>微信公众号
    </div>
  </div>
</div>
<div class="panel-footer text-center">
  Copyright1999-2016 北京中公教育科技股份有限公司 .All Rights Reserved 京ICP证161188号
</div>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</body>
</html>