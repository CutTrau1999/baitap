<%
    request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="/admin/include/header.jsp">
        <jsp:param name="title" value="Product form"/>
        <jsp:param name="description" value="Admin area"/>
        <jsp:param name="keywords" value="admin, page..."/>
    </jsp:include>
</head>
<body class="w3-light-grey">

<!-- Top container -->
<div class="w3-bar w3-top w3-black w3-large" style="z-index:4">
    <button class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey" onclick="w3_open();"><i class="fa fa-bars"></i> Â Menu</button>
    <span class="w3-bar-item w3-right">Admin page</span>
</div>

<!-- Sidebar/menu -->
<jsp:include page="/admin/include/left-menu.jsp"/>


<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px;margin-top:43px;">

    <!-- Header -->
    <header class="w3-container" style="padding-top:22px">
        <h5><b><i class="fa fa-dashboard"></i> Product form</b></h5>
    </header>
    <div class="w3-padding w3-margin-bottom">
        <form action="/admin/product/create" method="post" class="w3-container w3-card-4 w3-margin">
            <div class="w3-margin">
                <label>Ma mon an</label>
                <input class="w3-input" name="mamonan" type="text">
            </div>
            <div class="w3-margin">
                <label>Tên món ăn</label>
                <input class="w3-input" name="tenmonan" type="text">
            </div>
            <div class="w3-margin">
                <label>Mã danh mục</label>
                <input class="w3-input" name="madanhmuc" type="text">
            </div>
            <div class="w3-margin">
                <label>Mô tả</label>
                <input class="w3-input" name="mota" type="text">
            </div>
            <div class="w3-margin">
                <label>Giá</label>
                <input class="w3-input" name="gia" type="number">
            </div>
            <div class="w3-margin">
                <label>Ảnh đại diện</label>
                <input class="w3-input" name="anhdaidien" type="url">
            </div>
            <div class="w3-margin">
                <label>Ngày bắt đầu</label>
                <input class="w3-input" name="ngaybatdau" type="text">
            </div>
            <div class="w3-margin">
                <label>Ngày sửa</label>
                <input class="w3-input" name="ngaysua" type="text">
            </div>
            <div class="w3-margin">
                <label>Status</label>
                <input class="w3-input" name="status" type="number">
            </div>
            <button class="w3-btn w3-blue w3-margin">Submit</button>
        </form>
    </div>
    <!-- Footer -->
    <jsp:include page="/admin/include/footer.jsp"/>
    <!-- End page content -->
</div>

<jsp:include page="/admin/include/script.jsp"/>

</body>
</html>