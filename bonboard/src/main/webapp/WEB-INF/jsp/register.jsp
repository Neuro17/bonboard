<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
    </body>
</html>