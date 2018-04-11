<%@page session="false"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Sanction UI</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<c:url var="home" value="/" scope="request" />
<spring:url value="/static/core/css/custom.css" var="coreCss" />
<spring:url value="/static/core/css/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/static/core/js/jquery.1.10.2.min.js" var="jqueryJs" />
<spring:url value="/static/core/js/custom.js" var="customJs" />
<spring:url value="/static/core/css/font-awesome.min.css" var="facss" />
<script src="${jqueryJs}"></script>
<script src="${customJs}"></script>
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
<link href="${facss}" rel="stylesheet" />


  
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <header class="main-header">
    <!-- Logo -->
    
      <!-- mini logo for sidebar mini 50x50 pixels -->
      
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Sanction</b>UI</span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
     
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        
      </h1>
      
    </section>

    <!-- Main content -->
    <section class="content">
     
     
      <div class="row">
        <div class="col-xs-12">
          <div class="box">
            <div class="box-header">
              <h3 class="box-title">Sanction List</h3>

              <div class="box-tools">
                <div class="input-group input-group-sm" style="width: 150px;">
                  <input type="text" name="table_search" class="form-control pull-right" placeholder="Search">

                  <div class="input-group-btn">
                    <button type="submit" class="btn btn-default"><i class="fa fa-search"></i></button>
                  </div>
                </div>
              </div>
            </div>
            <!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
              <table class="table table-hover">
                <tr>                  
                  <th>File Name</th>
                  <th>Hit Ratio Run1(New)</th>
                  <th>Hit Ratio Run2(PROD)</th>
                  <th>Hit Run1(New)</th>
				  <th>Hit Run2(PROD)</th>
                  <th>Time Reached</th>
				  <th>Action</th>
				  <th>Action</th>
                </tr>
                
                <tbody>
				<c:forEach items="${tupples}" var="tupple">
					<tr>
						<td>${tupple.fileName}</td>
						<td>${tupple.hitRatioRun1}</td>
						<td>${tupple.hitRatioRun2}</td>
						<td>${tupple.hitRun1}</td>
						<td>${tupple.hitRun2}</td>
						<td>${tupple.arrivalTime}</td>
						<td> <span class="label label-danger">Reject</span></td>
						<td><span class="label label-success">Approve</span></td>
					</tr>
				</c:forEach>
	    		</tbody>
              </table>
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
      </div>
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 0.0.0
    </div>
    <strong>Copyright &copy; 2019 <a href="">Dummy Dummy </a>.</strong> All rights
    reserved.
  </footer>

 
  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- jQuery 3 -->

</body>
</html>
