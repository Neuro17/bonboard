<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="navbar navbar-inverse navbar-fixed-top" id="navbar">
    <div class="header">
        <a href="/bonboard/home"><img src="/bonboard/resources/img/logoBoB2.png" alt="" /></a>
        <img id="it" class="language" src="/bonboard/resources/img/it.jpg">
        <img id="en" class="language" src="/bonboard/resources/img/en.jpg">
        <nav class="pull-right">
			<ul class="icons-set">
				<li><a href="https://www.facebook.com/bonboardsrl?fref=ts" class="icon-facebook" target="blank"></a></li>
				<li><a href="http://www.linkedin.com/company/2599173?goback=npv_109304284_*1_*1_OUT*4OF*4NETWORK_vvJ*5_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1_*1&trk=prof-0-ovw-curr_pos" class="icon-linkedin" target="blank"></a></li>
				<li><a href="http://twitter.com/Bonboardsrl" class="icon-twitter" target="blank"></a></li>
				<li><a href="http://www.youtube.com/user/BOnBoardTV" class="icon-youtube" target="blank"></a></li>
			</ul>
		</nav>
    </div>
    <div class="navbar-inner">
        <div class="container">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>

            <!-- <a class="brand" href="index.html">BonBoard</a> -->

            <div class="nav-collapse collapse">
                <ul class="nav">
                    <li id="home">
                        <a href="/bonboard/home"><i class="icon-home icon-white"></i>Home</a></li>
                    <!-- <li><a href="#Home">About</a></li> -->
                    <li id="about" class="dropdown">
                        <a href="" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-user icon-white"></i><spring:message code="welcome.chisiamo" text="default text" /><b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="/bonboard/about/about_us">About us</a></li>
                            <li><a href="/bonboard/about/advisory">Advisory board</a></li>
                            <li><a href="/bonboard/about/partners">Partners</a></li>
                            <li><a href="/bonboard/about/staff">Staff</a></li>
                            <!-- <li class="divider"></li>
                            <li class="nav-header">Nav header</li>
                            <li><a href="#">Separated link</a></li>
                            <li><a href="#">One more separated link</a></li> -->
                        </ul>
                    </li>
                    <li id="servizi" class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><spring:message code="welcome.servizi" text="default text" /><b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="/bonboard/servizi/i_nostri_servizi_per_voi"><spring:message code="welcome.serviziPerVoi" text="default text" /></a></li>
                            <li><a href="/bonboard/servizi/offerta_modulare"><spring:message code="welcome.offertaModulare" text="default text" /></a></li>
                            <li><a href="/bonboard/servizi/personalizzazione_dei_servizi"><spring:message code="welcome.personalizzazioneServizi" text="default text" /></a></li>
                        </ul>
                    </li>
                    <li id="offerte" class=""><a href="#"><spring:message code="welcome.offerte" text="default text" /></a></li>
                    <li id="press" class=""><a href="#">Press Area</a></li>
                    <li id="blog" class=""><a href="/bonboard/blog">Blog</a></li>
                    <c:if test="${admin}">
                    	<li id="admin" class=""><a href="/bonboard/admin/dashboard">Admin</a></li>
                    </c:if>
                </ul>
<!--                 <form class="navbar-form pull-right"> -->
<!--                     <input class="span2" type="text" placeholder="Email"> -->
<!--                     <input class="span2" type="password" placeholder="Password"> -->
<!--                     <button type="submit" class="btn">Sign in</button> -->
                    
<!--                 </form> -->
   <c:choose>
    <c:when test="${authenticated}" >
    	${username}
         <button id="logOutButt" type="button" class="btn">Logout</button>
<%--          <a href="<c:url value="j_spring_security_logout" />" > </a> --%>
    </c:when>
    <c:otherwise>
        <form class="navbar-form pull-right">
                            <input id="user" class="span2" type="text" placeholder="Username">
                            <input id="pass" class="span2" type="password" placeholder="Password">                           
                                        <button id="logButt" type="button" class="btn">Sign in</button>
                <a href="/bonboard/register"><spring:message code="welcome.registrati" text="default text" /></a>
                        </form>
    </c:otherwise>
</c:choose>
                

            </div><!--/.nav-collapse -->
        </div>
    </div>
</div><br><br><br><br><br><br><br>
