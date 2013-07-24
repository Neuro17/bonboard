<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="header">
        <a href="/bonboard/home"><img src="/bonboard/resources/img/logoBoB2.png" alt="" /></a>
        <img id="it" class="language" src="/bonboard/resources/img/it.jpg">
        <img id="en" class="language" src="/bonboard/resources/img/en.jpg">
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
                </ul>
                <form class="navbar-form pull-right">
                    <input class="span2" type="text" placeholder="Email">
                    <input class="span2" type="password" placeholder="Password">
                    <button type="submit" class="btn">Sign in</button>
                    <a href="/bonboard/register"><spring:message code="welcome.registrati" text="default text" /></a>
                </form>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div><br><br><br><br><br><br><br>
