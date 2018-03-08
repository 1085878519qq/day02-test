<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset="UTF-8">
      <title>Basic DataGrid - jQuery EasyUI Demo</title>
       <!--   <link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="../themes/icon.css">
        <link rel="stylesheet" type="text/css" href="../demo.css">
        <script type="text/javascript" src="../js/jquery.min.js"></script>
        <script type="text/javascript" src="../js/jquery.easyui.min.js"></script>--> 
    </head>
    <body>
       <table class="easyui-datagrid" title="用户信息表" style="width:100%;height:500px"
                data-options="singleSelect:true,collapsible:true,url:'datagrid_data1.json',method:'get'">
            <thead>
                <tr>
                    <th data-options="field:'itemid',width:80">ID</th>
                    <th data-options="field:'productid',width:100">用户名</th>
                    <th data-options="field:'listprice',width:80,align:'right'">联系方式</th>
                    <th data-options="field:'unitcost',width:80,align:'right'">邮件</th>
                    <th data-options="field:'attr1',width:250">性别</th>
                    
                </tr>
            </thead>
        </table>     
    </body>
    </html>

