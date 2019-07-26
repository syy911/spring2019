<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="/css/bootstrap-theme.min.css"/>
<style type="text/css">

</style>
<script type="text/javascript" src="/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript">
	
</script>
</head> 
<body>
	<nav class="navbar navbar-default">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="/">
	        <div>비트교육센터</div>
	      </a>
	    </div>
	   <p class="navbar-text"><a href="/" class="navbar-link">HOME</a></p>
	   <p class="navbar-text"><a href="/bbs/list.bit"" class="navbar-link">LIST</a></p>
	   <p class="navbar-text navbar-right">/  <a href="#" class="navbar-link">JOIN</a></p>
	   <p class="navbar-text navbar-right"><a href="#" class="navbar-link">LOGIN</a></p>
	  </div>
	</nav>
	<div class="container">
	
		<div class="row">
			<div class="col-md-12">
				<div class="jumbotron">
				  <h1>입력페이지</h1>
				  <p>...</p>
				</div>
			</div>
		</div>
				
		<div class="row">
			<div class="col-md-12">
			<form class="form-horizontal" action="insert.bit" method="post">
			  <div class="form-group">
			    <label for="sub" class="col-sm-2 control-label">제목</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="sub" name="sub" placeholder="Subject" />
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="name" class="col-sm-2 control-label">글쓴이</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="name" name="name" placeholder="name" />
			    </div>
			  </div>
			  <div class="form-group">
			  	<label for="name" class="col-sm-2 control-label">내용</label>
			  	<div class="col-sm-offset-2 col-sm10">
					<textarea class="form-control" name="content"  placeholder="content"></textarea>
			  	</div>	  	
			  </div>
			  <div class="form-group">
			  	<div class="col-sm-offset-2 col-sm10">
			  	<div class="btn-group btn-group-justified" role="group" aria-label="...">
			  		<div class="btn-group" role="group" aria-label="...">
				  		<button type="submit" class="btn btn-primary">입 력</button>
				  		<button type="reset" class="btn btn-default">취 소</button>
				  	</div>
				  	</div>
			  	</div>	  	
			  </div>
			</form>
			</div>
		</div>
		
	</div>
</body>
</html>