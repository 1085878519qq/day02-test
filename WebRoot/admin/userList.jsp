<%@ page language="java" import="java.sql.*,java.util.*,com.offcn.model.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
    <!DOCTYPE html>
    <html>
    <head>
        <meta charset="UTF-8">
        <title>Basic DataGrid - jQuery EasyUI Demo</title>
        <link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="../themes/icon.css">
        <link rel="stylesheet" type="text/css" href="../demo.css">
        <script type="text/javascript" src="../js/jquery.min.js"></script>
        <script type="text/javascript" src="../js/jquery.easyui.min.js"></script>

    </head>
    <body>
       <table width="100%" >
            <thead>
                <tr>
                    <th data-options="field:'itemid',width:80">CID</th>
                    <th data-options="field:'productid',width:100">姓名</th>
                    <th data-options="field:'unitcost',width:80,align:'right'">邮箱</th>
                    <th data-options="field:'attr1',width:250">电话</th>
                    <th >性别</th>
                    <th >管理操作</th>
                </tr>
                <%
                List<Customer> list=(List)request.getAttribute("list");
                for(Customer c:list  ){
                
                 %>
                
                 <tr>
                    <td><%=c.getCID() %> </td>
                    <td ><%=c.getUser() %> </td>
                    <td ><%=c.getContact() %></td>
                    <td ><%=c.getEmail() %></td>
                    <td><%=c.getSex() %></td>
                    <td ><a href="delServlet?cid=<%=c.getCID()%>">删除</a>  修改</td>
                </tr>
                <%
                }
                 %>
               
             
                
            </thead>
        </table>     
    </body>
    </html>

