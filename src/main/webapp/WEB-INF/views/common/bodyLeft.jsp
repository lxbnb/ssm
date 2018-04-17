<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<aside class="main-sidebar">
    <section class="sidebar">
      <div class="user-panel">
        <div class="pull-left image">
          <img src="${APP_PATH }/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>功能列表</p>
          <a href="#"><i class="fa fa-circle text-success"></i> 如下</a>
        </div>
      </div>
      <!-- search form -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="搜索...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search">点击</i>
                </button>
              </span>
        </div>
      </form>
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header"><font color="red" size=3>功能列表</font></li>
        <li class="treeview active">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>个人信息管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li class="active"><a href="#"><i class="fa fa-circle-o"></i> 信息查看</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 信息修改</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-files-o"></i>
            <span>证书管理</span>
            <span class="pull-right-container">
              <span class="label label-primary pull-right">4</span>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="#"><i class="fa fa-circle-o"></i> 证书列表</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 添加证书</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> excel导入</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 证书修改</a></li>
          </ul>
        </li>
        <li>
          <a href="#">
            <i class="fa fa-th"></i> <span>最新消息</span>
            <span class="pull-right-container">
              <small class="label pull-right bg-green">新</small>
            </span>
          </a>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-pie-chart"></i>
            <span>地址管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="#"><i class="fa fa-circle-o"></i> 常驻地址</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 邮寄地址</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 公司地址</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 籍贯</a></li>
          </ul>
        </li>
       
        <li class="treeview">
          <a href="#">
            <i class="fa fa-edit"></i> <span>考试管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="#"><i class="fa fa-circle-o"></i> 考试报名</a></li>
            <li><a href="advanced.html"><i class="fa fa-circle-o"></i> 考试缴费</a></li>
            <li><a href="editors.html"><i class="fa fa-circle-o"></i> 订单信息</a></li>
          </ul>
        </li>
        
        <li>
          <a href="#">
            <i class="fa fa-envelope"></i> <span>邮箱</span>
            <span class="pull-right-container">
              <small class="label pull-right bg-yellow">12</small>
              <small class="label pull-right bg-green">16</small>
              <small class="label pull-right bg-red">5</small>
            </span>
          </a>
        </li>
       
        <li class="treeview">
          <a href="#">
            <i class="fa fa-share"></i> <span>培训班</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="#"><i class="fa fa-circle-o"></i> 培训班报名</a></li>
            <li class="treeview">
              <a href="#"><i class="fa fa-circle-o"></i>培训班信息
                <span class="pull-right-container">
                  <i class="fa fa-angle-left pull-right"></i>
                </span>
              </a>
              <ul class="treeview-menu">
                <li><a href="#"><i class="fa fa-circle-o"></i> 培训班人数</a></li>
                <li class="treeview">
                  <a href="#"><i class="fa fa-circle-o"></i> 培训班费用
                    <span class="pull-right-container">
                      <i class="fa fa-angle-left pull-right"></i>
                    </span>
                  </a>
                  <ul class="treeview-menu">
                    <li><a href="#"><i class="fa fa-circle-o"></i> 培训费</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> 教材费</a></li>
                  </ul>
                </li>
              </ul>
            </li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 我的培训班</a></li>
          </ul>
        </li>
        <li><a href="#"><i class="fa fa-book"></i> <span>新闻</span></a></li>
        <li class="header">其他</li>
        <li><a href="#"><i class="fa fa-circle-o text-red"></i> <span>注意</span></a></li>
        <li><a href="#"><i class="fa fa-circle-o text-yellow"></i> <span>提醒</span></a></li>
        <li><a href="#"><i class="fa fa-circle-o text-aqua"></i> <span>消息</span></a></li>
      </ul>
    </section>
    <!-- /.sidebar -->
  </aside>