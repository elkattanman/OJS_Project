<%@page import="model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DB.PostDOA"%>
<%@page import="model.post"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>EQRA JS</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="bower_components/font-awesome/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="bower_components/Ionicons/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
        <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
              page. However, you can choose any other skin. Make sure you
              apply the skin class to the body tag so the changes take effect. -->
        <link rel="stylesheet" href="dist/css/skins/skin-blue.min.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Google Font -->
        <link rel="stylesheet"
              href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
    </head>
    <!--
    BODY TAG OPTIONS:
    =================
    Apply one or more of the following classes to get the
    desired effect
    |---------------------------------------------------------|
    | SKINS         | skin-blue                               |
    |               | skin-black                              |
    |               | skin-purple                             |
    |               | skin-yellow                             |
    |               | skin-red                                |
    |               | skin-green                              |
    |---------------------------------------------------------|
    |LAYOUT OPTIONS | fixed                                   |
    |               | layout-boxed                            |
    |               | layout-top-nav                          |
    |               | sidebar-collapse                        |
    |               | sidebar-mini                            |
    |---------------------------------------------------------|
    -->
    
    <%
        User u=(User)request.getSession().getAttribute("user");
        ArrayList<post> all = new PostDOA().VIEWPOST_uname(u.getUname());
        request.setAttribute("posts", all);
    %>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">

            <!-- Main Header -->
            <header class="main-header">

                <!-- Logo -->
                <a href="index.jsp" class="logo">
                    <!-- mini logo for sidebar mini 50x50 pixels -->
                    <span class="logo-mini"><b>O</b>JS</span>
                    <!-- logo for regular state and mobile devices -->
                    <span class="logo-lg"><b>EQRA</b> OJS</span>
                </a>

                <!-- Header Navbar -->
                <nav class="navbar navbar-static-top" role="navigation">
                    <!-- Sidebar toggle button-->
                    <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
                        <span class="sr-only">Toggle navigation</span>
                    </a>
                    <!-- Navbar Right Menu -->
                    <div class="navbar-custom-menu">
                        <ul class="nav navbar-nav">
                            <!-- User Account Menu -->
                            <li class="dropdown user user-menu">
                                <!-- Menu Toggle Button -->
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <!-- The user image in the navbar-->
                                    <img src="data:image/jpg;base64,${user.base64Image}"class="user-image" alt="User Image">
                                    <!-- hidden-xs hides the username on small devices so only the image appears. -->
                                    <span class="hidden-xs">${user.name}</span>
                                </a>
                                <ul class="dropdown-menu">
                                    <!-- The user image in the menu -->
                                    <li class="user-header">
                                        <img src="data:image/jpg;base64,${user.base64Image}" class="img-circle" alt="User Image">

                                        <p>
                                            ${user.name} - ${user.type}
                                            <small> ${user.email}</small>
                                        </p>
                                    </li>
                                    <!-- Menu Body -->
                                    <li class="user-body">
                                        <div class="row">
                                            <div class="col-xs-4 text-center"></div>
                                            <div class="col-xs-4 text-center">
                                                <a href="#">Welcome</a>
                                            </div>
                                            <div class="col-xs-4 text-center"></div>
                                        </div>
                                        <!-- /.row -->
                                    </li>
                                    <!-- Menu Footer-->
                                    <li class="user-footer">
                                        <div class="pull-left">
                                            <a href="profile.jsp" class="btn btn-default btn-flat">Profile</a>
                                        </div>
                                        <div class="pull-right">
                                            <a href="login.jsp" class="btn btn-default btn-flat">Sign out</a>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </nav>
            </header>
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">

                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">

                    <!-- Sidebar user panel (optional) -->
                    <div class="user-panel">
                        <div class="pull-left image">
                            <img src="data:image/jpg;base64,${user.base64Image}" class="img-circle" alt="User Image">
                        </div>
                        <div class="pull-left info">
                            <p>${user.name}  </p>
                            <!-- Status -->
                            <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                        </div>
                    </div>

                    <!-- search form (Optional) -->
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

                    <!-- Sidebar Menu -->
                    <ul class="sidebar-menu" data-widget="tree">
                        <li class="header">HEADER</li>
                        <!-- Optionally, you can add icons to the links -->
                        <li class="active"><a href="index.jsp"><i class="fa fa-home"></i> <span>Home Page</span></a></li>
                        <li class="treeview">
                            <a href="#"><i class="fa  fa-edit"></i> <span>Categories</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">

                                <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  url="jdbc:mysql://localhost/journal"  user="root"  password=""/>  
                                <sql:query dataSource="${db}" var="rs">  
                                    SELECT * FROM catog;  
                                </sql:query> 
                                <c:forEach items="${rs.rows}" var="cat">
                                    <li><a href="index.jsp?cat_id=${cat.cat_id}">${cat.cat_name}</a></li>
                                </c:forEach>
                            </ul>
                        </li>
                        <li class="treeview">
                            <a href="#"><i class="fa fa-dashboard"></i> <span>Dashboard</span>
                                <span class="pull-right-container">
                                    <i class="fa fa-angle-left pull-right"></i>
                                </span>
                            </a>
                            <ul class="treeview-menu">
                                <li><a href="ReviewSubmession.jsp">Appending Posts</a></li>
                                <li><a href="userstate.jsp">Manage Users</a></li>
                                <li><a href="rejectedpost.jsp">rejected Posts</a></li>
                            </ul>
                        </li>
                        <li><a href="about.jsp"><i class="fa fa-send"></i> <span>about us</span></a></li>
                    </ul>
                    <!-- /.sidebar-menu -->
                </section>
                <!-- /.sidebar -->
            </aside>

            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                       Profile
                        <small>${user.uname}</small>
                    </h1>
                    <ol class="breadcrumb">
                         <li><a href="#"><i class="fa fa-dashboard"></i> profile</a></li>
                        <li class="active">${user.uname}</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content container-fluid">

                    <!--------------------------
                    | Your Page Content Here |
                    -------------------------->
                    <div class="row">
                        <div class="col-md-3">

                            <!-- Profile Image -->
                            <div class="box box-primary">
                                <div class="box-body box-profile">
                                    <img class="profile-user-img img-responsive img-circle" src= "data:image/jpg;base64,${user.base64Image}"   alt="User profile picture">

                                    <h3 class="profile-username text-center">${user.name}</h3>

                                    <p class="text-muted text-center">${user.type}</p>

                                    <ul class="list-group list-group-unbordered">
                                        <li class="list-group-item">
                                            <b>Followers</b> <a class="pull-right">1,322</a>
                                        </li>
                                        <li class="list-group-item">
                                            <b>Submession</b> <a class="pull-right">${posts.size()}</a>
                                        </li>
                                    </ul>
                                </div>
                                <!-- /.box-body -->
                            </div>
                            <!-- /.box -->

                            <!-- About Me Box -->
                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">About Me</h3>
                                </div>
                                <!-- /.box-header -->
                                <div class="box-body">
                                    <strong><i class="fa fa-at margin-r-5"></i>EMAIL</strong>

                                    <p class="text-muted">
                                        ${user.email}
                                    </p>

                                    <hr>

                                    <strong><i class="fa fa-phone margin-r-5"></i> PHONE NUMBER </strong>

                                    <p class="text-muted">${user.phone}</p>
                                    <hr>

                                    <strong><i class="fa fa-file-text-o margin-r-5"></i> Bio</strong>

                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam fermentum enim neque.</p>
                                </div>
                                <!-- /.box-body -->
                            </div>
                            <!-- /.box -->
                        </div>
                        <!-- /.col -->
                        <div class="col-md-9">
                            <div class="nav-tabs-custom">
                                <ul class="nav nav-tabs">
                                    <li class="active"><a href="#activity" data-toggle="tab">Activity</a></li>
                                    <li><a href="#writepost" data-toggle="tab">Write Post</a></li>
                                    <li><a href="#changepass" data-toggle="tab">Change Password</a></li>
                                    <li><a href="#settings" data-toggle="tab">Settings</a></li>
                                </ul>
                                <div class="tab-content">
                                    <div class="active tab-pane" id="activity">
                                        <c:forEach items="${posts}" var="post">
                                            <!-- post -->
                                            <div class="box box-widget">
                                                <div class="box-header with-border">
                                                    <div class="user-block">

                                                        <img class="img-circle" src="data:image/jpg;base64,${post.getBase64Image()}" alt="User Image">
                                                        <span class="username"><a href="#">${post.getName()}</a></span>
                                                        <span class="description">${post.getUname()} - ${post.getTime_stamp()}</span>
                                                    </div>
                                                    <!-- /.user-block -->
                                                    <div class="box-tools">
                                                        <button type="button" class="btn btn-box-tool" data-toggle="tooltip" title="Mark as read">
                                                            <i class="fa fa-circle-o"></i></button>
                                                        <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                                                        </button>
                                                        <a href="removepost.jsp?title=${post.getTitle()}"    <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button> </a>
                                                    </div>
                                                    <!-- /.box-tools -->
                                                </div>
                                                <!-- /.box-header -->
                                                <div class="box-body">

                                                    <h3 >${post.getTitle()}</h3>
                                                    <p>${post.getDescription()}</p>
                                                    <!-- Box Materail -->
                                                    <form class="form-horizontal">
                                                        <div class="form-group">
                                                            <div class="row">
                                                                <div class="col-xs-3">
                                                                  <a href="DBFileDownloadServlet?id=${post.getId()}&type=${1}" >  <button class="btn pull-right btn-primary">PDF</button></a>
                                                                </div>
                                                                <div class="col-xs-3">
                                                                    <a href="DBFileDownloadServlet?id=${post.getId()}&type=${2}" > <button class="btn pull-right btn-primary">DOCS</button></a>
                                                                    <!--<button type="submit" class="btn btn-danger pull-right btn-primary btn-block btn-sm">Send</button>-->
                                                                </div>
                                                                <div class="col-xs-3">
                                                                <a href="DBFileDownloadServlet?id=${post.getId()}&type=${3}" >    <button class="btn pull-right btn-primary">HTML</button></a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </form>
                                                    <!-- /.box-materail -->

                                                     
                                                    <span class="pull-right text-muted">${post.getCateg()}</span>
                                                </div>
                                                <!-- /.box-body -->

                                            </div>
                                            <!-- /.post -->
                                        </c:forEach>
                                    </div>
                                    <!-- /.tab-pane -->
                                    <div class="tab-pane" id="writepost">
                                        <form class="form-horizontal" action="writepost" method="post" enctype="multipart/form-data">
                                            <div class="box-body">
                                                <div class="form-group">
                                                    <label for="title" >Title</label>
                                                    <input type="text" class="form-control" id="title" placeholder="Enter Title ..." name="title">
                                                </div><div class="form-group">
                                                    <label for="key" >Key word</label>
                                                    <input type="text" class="form-control" id="key" placeholder="Enter keyword ..." name="keyword">
                                                </div>
                                                <div class="form-group">
                                                    <label for="disc" >Description</label>
                                                    <textarea class="form-control" id="disc" rows="3" placeholder="Enter Discription ..." name="post"></textarea>
                                                </div>
                                                <div class="form-group">
                                                    <div class="row">
                                                        <label for="pdfFile" class="col-xs-2">PDF File</label> <input type="file" id="pdfFile" name="pdfFile">
                                                    </div>      
                                                    <div class="row">
                                                        <label for="docsFile" class="col-xs-2">Docs File</label> <input type="file" id="docsFile" name="docsFile">
                                                    </div>
                                                    <div class="row">
                                                        <label for="htmlFile" class="col-xs-2">Html File</label> <input type="file" id="htmlFile" name="htmlFile">
                                                    </div>
                                                    <p class="help-block">Example a.pdf , b.docs , c.html</p>
                                                </div>

                                            </div>
                                            <div class="box-footer">
                                                <button type="submit" class="btn btn-facebook pull-right">Submit</button>
                                            </div>
                                        </form>
                                    </div>
                                    <!-- /.tab-pane -->

                                    <!-- /.tab-pane -->
                                    <div class="tab-pane" id="changepass">
                                       <form class="form-horizontal" action="ChangePassword" method="post">

                                            <div class="box-body">
                                                <div class="form-group">
                                                    <label for="cur_pass" class ="col-sm-2">Currenet Password</label>
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><i class="fa fa-key"></i></span>
                                                         <input type="password" class="form-control" id= "cur_pass"placeholder="Current Password" name="currentPass">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label for="new_pass" class ="col-sm-2">New Password</label>
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><i class="fa fa-key"></i></span>
                                                        <input type="password" class="form-control" id= "new_pass"placeholder="New Password" name="NewPass">
                                                    </div>
                                                </div>
                                                <div class="form-group">
                                                    <label for="re_pass" class ="col-sm-2">repeat Password</label>
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><i class="fa fa-key"></i></span>
                                                        <input type="password" class="form-control" id= "re_pass"placeholder="Repeat Password" name="RepPass">
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="box-footer">
                                                <button type="submit" class="btn btn-danger pull-right">Change</button>
                                            </div>
                                        </form>
                                    </div>
                                    <!-- /.tab-pane -->

                                    <div class="tab-pane" id="settings">
                                        <form class="form-horizontal" action="Setting">
                                            <div class="form-group">
                                                <label for="name" class="col-sm-2 control-label">Name</label>

                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" id="name" name="name" placeholder="Name">
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label for="email" class="col-sm-2 control-label">Email</label>

                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" id="email" name="email" placeholder="Email">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="phone" class="col-sm-2 control-label">Phone</label>

                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" id="phone" name="phone" placeholder="Phone">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-sm-offset-2 col-sm-10">
                                                    <div class="checkbox">
                                                        <label>
                                                            <input type="checkbox"> I agree to the <a href="#">terms and conditions</a>
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-sm-offset-2 col-sm-10">
                                                    <button type="submit" class="btn btn-danger">Submit</button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                    <!-- /.tab-pane -->
                                </div>
                                <!-- /.tab-content -->
                            </div>
                            <!-- /.nav-tabs-custom -->
                        </div>
                        <!-- /.col -->
                    </div>
                    <!-- /.row -->
                </section>
                <!-- /.content -->
            </div>
            <!-- /.content-wrapper -->

            <!-- Main Footer -->
            <footer class="main-footer">
                <!-- To the right -->
                <div class="pull-right hidden-xs">
                    version 1
                </div>
                <!-- Default to the left -->
                <strong>Copyright &copy; 2019 <a href="#">My Team</a>.</strong> All rights reserved.
            </footer>

            <!-- Add the sidebar's background. This div must be placed
            immediately after the control sidebar -->
        </div>
        <!-- ./wrapper -->

        <!-- REQUIRED JS SCRIPTS -->

        <!-- jQuery 3 -->
        <script src="bower_components/jquery/dist/jquery.min.js"></script>
        <!-- Bootstrap 3.3.7 -->
        <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
        <!-- AdminLTE App -->
        <script src="dist/js/adminlte.min.js"></script>

        <!-- Optionally, you can add Slimscroll and FastClick plugins.
             Both of these plugins are recommended to enhance the
             user experience. -->
    </body>
</html>