<%@ include file="head.jsp" %>
<!-- 添加jsp页面字符编码 -->
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<table>
 <tr>
  <td><a id="loc" href="person/index.htm?ssid=1">点击跳转.....</a></td>
 </tr>
</table>

<script>
 var time = new Date().getTime();
 document.getElementById('loc').href="person/index.htm?ssid="+time;
</script>
<%@ include file="bottom.jsp" %>