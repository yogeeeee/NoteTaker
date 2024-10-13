<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add notes</title>
<%@include file="all_js_css.jsp" %>
</head>
<body>
    <div class="container">
    <%@include file="navbar.jsp" %>
    <br>
    <h1>Please fill your note details</h1>
    <br>
    <!-- this is add notes -->
    <form action="SaveNoteServlet" method="post">
    
  <div class="mb-3">
    <label for="title" class="form-label">Note title</label>
    <input name="title" required type="text" class="form-control" id="title" placeholder="Enter here..">
  </div>
  
  <div class="mb-3">
    <label for="content" class="form-label">Note content</label>
    <textarea name="content" id="content" placeholder="Enter your content here.." class="form-control" style="height:300px"></textarea>
  </div>
 
  <div class="container text-center">
  <button type="submit" class="btn btn-primary">add</button>
  </div>
</form>
</div>
</body>
</html>