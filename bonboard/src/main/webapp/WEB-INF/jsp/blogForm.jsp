<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width">

        <link rel="stylesheet" href="/bonboard/resources/css/bootstrap.min.css">
        <style>
            body {
                padding-top: 60px;
                padding-bottom: 40px;
            }
        </style>
        <link rel="stylesheet" href="/bonboard/resources/css/bootstrap-responsive.min.css">
        <link rel="stylesheet" href="/bonboard/resources/css/main.css">

        <script src="/bonboard/resources/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
    </head>
    <body>
<form:form  method="post" modelAttribute="blogForm" action="blogForm"  >

<table>
  <tbody><tr>
   <td>User Name:<font color="red"><form:errors path="titleEng"></form:errors></font></td>
  </tr>
  <tr>
   <td><form:input path="titleEng"></form:input></td>
  </tr>
  <tr>
   <td>Age:<font color="red"><form:errors path="bodyEng"></form:errors></font></td>
  </tr>
  <tr>
   <td><form:input path="bodyEng"></form:input></td>
  </tr>
  <tr>
   <td><input type="submit" value="Submit"></td>
  </tr>
 </tbody></table>
</form:form>

 <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.9.1.min.js"><\/script>')</script>

        <script src="/bonboard/resources/js/vendor/bootstrap.min.js"></script>

        <script src="/bonboard/resources/js/main.js"></script>
        
        </body>