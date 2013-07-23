<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
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
        <!--[if lt IE 7]>
            <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
        <![endif]-->

        <!-- This code is taken from http://twitter.github.com/bootstrap/examples/hero.html -->
		<form class="form-horizontal register">
            <div class="control-group">
                <label class="control-label" for="inputFirstName"><spring:message code="welcome.nome" text="default text" /></label>
                <div class="controls">
                    <input type="text" id="inputFirstName" placeholder="<spring:message code="welcome.nome" text="default text" />">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputLastName"><spring:message code="welcome.cognome" text="default text" /></label>
                <div class="controls">
                    <input type="text" id="inputLastName" placeholder="<spring:message code="welcome.cognome" text="default text" />">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputEmail">Email</label>
                <div class="controls">
                    <input type="text" id="inputEmail" placeholder="Email">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPassword">Password</label>
                <div class="controls">
                    <input type="password" id="inputPassword" placeholder="Password">
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputConfirmPassword">Password</label>
                <div class="controls">
                    <input type="password" id="inputConfirmPassword" placeholder="Password">
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <!-- <label class="checkbox">
                        <input type="checkbox"> Remember me
                    </label> -->
                    <button type="submit" class="btn">Register</button>
                </div>
            </div>
        </form>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.9.1.min.js"><\/script>')</script>

        <script src="/bonboard/resources/js/vendor/bootstrap.min.js"></script>

        <script src="/bonboard/resources/js/main.js"></script>

         <script>
        //     var _gaq=[['_setAccount','UA-XXXXX-X'],['_trackPageview']];
        //     (function(d,t){var g=d.createElement(t),s=d.getElementsByTagName(t)[0];
        //     g.src=('https:'==location.protocol?'//ssl':'//www')+'.google-analytics.com/ga.js';
        //     s.parentNode.insertBefore(g,s)}(document,'script'));
        // </script>
    </body>
</html>