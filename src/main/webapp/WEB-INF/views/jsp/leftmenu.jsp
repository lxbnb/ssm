<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
      <!-- Sidebar user panel -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="../../dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>Alexander Pierce</p>
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>
      <!-- search form -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->
      <!-- sidebar menu: : style can be found in sidebar.less -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">功能列表</li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>项目管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="${APP_PATH }/itProject/jihuaxiang.action"><i class="fa fa-circle-o"></i> 计划项</a></li>
            <li><a href="${APP_PATH }/itProject/jixingxiang.action"><i class="fa fa-circle-o"></i> 进行项</a></li>
            <li><a href="${APP_PATH }/itProject/wanchengxiang.action"><i class="fa fa-circle-o"></i> 完成项</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>文档管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="${APP_PATH }/itProject/wendangliulan.action"><i class="fa fa-circle-o"></i> 文档浏览</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>统计分析</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="${APP_PATH }/itProject/xiangmu.action"><i class="fa fa-circle-o"></i> 项目</a></li>
          </ul>
        </li>
        <c:if test="${user.usertypeId == 1 }">
        	<li class="treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>后台管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="${APP_PATH }/itProject/daoru.action"><i class="fa fa-circle-o"></i> 导入</a></li>
            <li><a href="${APP_PATH }/itProject/daochu.action"><i class="fa fa-circle-o"></i> 导出</a></li>
            <li><a href="${APP_PATH }/itProject/xiaochushuju.action"><i class="fa fa-circle-o"></i> 消除数据</a></li>
          </ul>
        </li>
        </c:if>
        
        <!-- <li class="treeview">
          <a href="#">
            <i class="fa fa-files-o"></i>
            <span>报名考试</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="../page/exambatch.html"><i class="fa fa-circle-o"></i> 建筑安全考试报名</a></li>
            <li><a href="../page/exambatch.html"><i class="fa fa-circle-o"></i> 监理考试报名</a></li>
            <li><a href="../page/exambatch.html"><i class="fa fa-circle-o"></i> 二建考试报名</a></li>
            <li><a href="../page/exambatch.html"><i class="fa fa-circle-o"></i> 八大员考试报名</a></li>
            <li><a href="../page/exambatch.html"><i class="fa fa-circle-o"></i> 市政园林考试报名</a></li>
            <li><a href="../page/examPerList.html"><i class="fa fa-circle-o"></i> 报名统计</a></li>
          </ul>
        </li> -->
        
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>
<script async type="text/javascript" src="${APP_PATH}/myjs/bodyleft.js"></script>