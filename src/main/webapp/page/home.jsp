<%--
  Created by IntelliJ IDEA.
  User: 陈心航
  Date: 2017/3/4
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <title>首页</title>
</head>
<link rel="stylesheet" href="../css/home.css">
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="../js/home.js"></script>
<body>
<jsp:include page="../common/homeTop.jsp"></jsp:include>
<!-- 轮播图   中间部分-->
<div id="content" onclick="changeImg()">

    <div class="scroll_mid">
        <ul id="scroll_img">
            <li><img src="../image/1.png"/></li>
            <li><img src="../image/2.png"/></li>
            <li><img src="../image/3.png"/></li>
            <li><img src="../image/4.png"/></li>
            <li><img src="../image/5.png"/></li>

        </ul>
        <ul id="scroll_number">
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div>
</div>

<%--右侧部分--%>
<div class="book_new123">
    <div class="shop">
        <a href="#"> <img src="../image/woyaomai1.png"></a>
        <a href="#"> <img src="../image/woyaomai2.png"></a>
    </div>

    <div id="bookTab" class="book_sort">
        <div class="book_new">
            <!--<div class="shop1">-->
            <!--<div class="book_type book_type_out" id="history">游戏币</div>-->
            <div class="book_type" id="history">游戏币</div>
            <div class="book_type" id="family">QQ</div>
            <div class="book_type" id="culture">点卡</div>
            <div class="book_type" id="novel">话费</div>
            <!--</div>-->
        </div>
        <div class="book_class" style="height:250px;">
            <dl id="book_history">
                <dd>
                    游戏名称:<input type="text"><br>
                    &nbsp;游戏区:<input type="text"><br>
                    &nbsp;游戏服:<input type="text"><br>
                    购买比例:<br>
                    <input type="button" value="立即购买">
                </dd>
            </dl>
            <dl id="book_family" class="book_none">
                <dd>
                    QQ号码:<input type="text"><br>
                    &nbsp;类型:<input type="text"><br>
                    &nbsp;面值:<input type="text"><br>
                    价格:<br>
                    <input type="button" value="立即购买">
                </dd>
            </dl>
            <dl id="book_culture" class="book_none">
                <dd>
                    游戏名称:<input type="text"><br>
                    &nbsp;&nbsp;面值:<input type="text"><br>
                    价格:<input type="radio">客服快充<br>
                    <input type="button" value="立即购买">
                </dd>
            </dl>
            <dl id="book_novel" class="book_none">
                <dd>
                    手机号码:<input type="text"><br>
                    &nbsp;&nbsp;价格:<input type="radio">话费<br>
                    &nbsp;&nbsp;面值:<input type="text"><br>
                    <input type="button" value="立即购买">
                </dd>
            </dl>
        </div>
    </div>
</div>

</body>
</html>
