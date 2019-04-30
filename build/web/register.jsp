<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>AdminLTE 2 | Registration Page</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.7 -->
        <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="bower_components/font-awesome/css/font-awesome.min.css">
        <!-- SET GLOBAL max_allowed_packet=268435456;
           Ionicons -->
        <link rel="stylesheet" href="bower_components/Ionicons/css/ionicons.min.css">
        <!-- daterange picker -->
        <link rel="stylesheet" href="bower_components/bootstrap-daterangepicker/daterangepicker.css">
        <!-- bootstrap datepicker -->
        <link rel="stylesheet" href="bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css">
        <!-- iCheck for checkboxes and radio inputs -->
        <link rel="stylesheet" href="plugins/iCheck/all.css">
        <!-- Bootstrap Color Picker -->
        <link rel="stylesheet" href="bower_components/bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css">
        <!-- Bootstrap time Picker -->
        <link rel="stylesheet" href="plugins/timepicker/bootstrap-timepicker.min.css">
        <!-- Select2 -->
        <link rel="stylesheet" href="bower_components/select2/dist/css/select2.min.css">

        <!-- Theme style -->
        <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
        <!-- iCheck -->
        <link rel="stylesheet" href="plugins/iCheck/square/blue.css">


        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Google Font -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
    </head>
    <body class="hold-transition register-page">
        <div class="register-box">
            <div class="register-logo">
                <a href="index.jsp"><b>EQRA</b> OJS</a>
            </div>

            <div class="register-box-body">
                <p class="login-box-msg">Register a new membership</p>

                <form action="register" method="post"enctype="multipart/form-data">
                    <div class="form-group has-feedback">
                        <input type="text" class="form-control" placeholder="Your name" name="name" required>
                        <span class="glyphicon glyphicon-user form-control-feedback"></span>
                    </div>


                    <div class="form-group">
                        <div class="input-group date">
                            <input type="date"   class="form-control" name="DOB" id="datepicker"  required>
                            <div class="input-group-addon">
                                <i class="fa fa-calendar"></i>
                            </div>
                        </div>
                        <!-- /.input group -->
                    </div>

                    <!--radio -->
                    <div class="form-group">
                        <label class="col-xs-4"><input type="radio" name="gender" value="male" checked>Male</label>
                        <label><input type="radio" name="gender" value="female" >Female</label>
                    </div>

                    <!--image -->
                    <div class="form-group has-feedback">
                        <div class="row">
                            <label for="img" class="col-xs-2">Image</label>
                            <div class="col-xs-10"><input type="file" class="form-control" id="img" name="image"></div>
                        </div>

                    </div>

                    <div class="form-group has-feedback">
                        <input type="text" class="form-control" name="phone" placeholder="phone" required >
                        <span class="glyphicon glyphicon-earphone form-control-feedback"></span>
                    </div>

                    <div class="form-group has-feedback">
                        <input type="text" class="form-control" name="uname" placeholder="UserName" required>
                        <span class="glyphicon glyphicon-user form-control-feedback"></span>
                    </div>

                    <div class="form-group has-feedback">
                        <input type="email" class="form-control" name="email" placeholder="Email">
                        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" name="pass" placeholder="Password">
                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <input type="password" class="form-control" name="rpass" placeholder="Retype password">
                        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
                    </div>
                    <div class="form-group has-feedback">
                        <div class="row">
                            <label for="img" class="col-xs-2">CV</label>
                            <div class="col-xs-10"><input type="file" class="form-control" id="cv" name="cv"></div>
                        </div>

                    </div>
                    <div class="form-group">
                        <label>Categories</label>
                        <select class="form-control select2" name="cat" style="width: 100%;" >
                            <option>Computer Science</option>
                            <option>is</option>
                            <option >it</option>
                            <option>Art</option>
                            <option>Web Develop</option>
                            <option>ART</option>

                        </select>
                        <div class="form-group">
                            <label class="col-sm-10">Request the following roles :</label>
                            <label><input type="checkbox" value="0" class="minimal" checked disabled>Reader</label>
                            <label><input type="checkbox" name="author" value="1"  class="minimal">Author</label>
                            <label><input type="checkbox" name="reviwer" value="2" class="minimal">Reviwer</label>
                        </div>
                        <!-- /.form-group -->
                        <div class="row">
                            <div class="col-xs-8">
                                <div class="checkbox icheck">
                                    <label>
                                        <input type="checkbox"> I agree to the <a href="#">terms</a>
                                    </label>
                                </div>
                            </div>
                            <!-- /.col -->
                            <div class="col-xs-4">
                                <button type="submit" class="btn btn-primary btn-block btn-flat">Register</button>
                            </div>
                            <!-- /.col -->
                        </div>
                </form>



                <a href="login.html" class="text-center">I already have a membership</a>
            </div>
            <!-- /.form-box -->
        </div>
        <!-- /.register-box -->

        <!-- jQuery 3 -->
        <script src="bower_components/jquery/dist/jquery.min.js"></script>
        <!-- Bootstrap 3.3.7 -->
        <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
        <!-- Select2 -->
        <script src="bower_components/select2/dist/js/select2.full.min.js"></script>
        <!-- InputMask -->
        <script src="plugins/input-mask/jquery.inputmask.js"></script>
        <script src="plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
        <script src="plugins/input-mask/jquery.inputmask.extensions.js"></script>
        <!-- date-range-picker -->
        <script src="bower_components/moment/min/moment.min.js"></script>
        <script src="bower_components/bootstrap-daterangepicker/daterangepicker.js"></script>
        <!-- bootstrap datepicker -->
        <script src="bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
        <!-- SlimScroll -->
        <script src="bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
        <!-- iCheck 1.0.1 -->
        <script src="plugins/iCheck/icheck.min.js"></script>
        <!-- FastClick -->
        <script src="bower_components/fastclick/lib/fastclick.js"></script>
        <!-- AdminLTE App -->
        <script src="dist/js/adminlte.min.js"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="dist/js/demo.js"></script>

        <!-- Page script -->
        <script>
            $(function () {
                //Initialize Select2 Elements
                $('.select2').select2()

        

                $('input').iCheck({
                    checkboxClass: 'icheckbox_square-blue',
                    radioClass: 'iradio_flat-green',
                    increaseArea: '20%' /* optional */
                });
                $('input[type="checkbox"].minimal').iCheck({
                    checkboxClass: 'icheckbox_minimal-blue'
                });
            });
            
        </script>
    </body>
</html>