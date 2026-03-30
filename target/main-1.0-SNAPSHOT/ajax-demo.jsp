<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 30/3/26
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Demo Ajax</h1>
<button onclick="clickData()">Click me</button>
<p id="result"></p>
</body>
<%-- khi lam viec vs ajax muon lay duoc gia tri
=> jquery.min --%>
<script src="https://code.jquery.com/jquery-4.0.0.min.js"
        integrity="sha256-OaVG6prZf4v69dPg6PhVattBXkcOWQB62pdZ3ORyrao=" crossorigin="anonymous"></script>
<script>
    function clickData() {
        $.ajax(
            {
                url: "/api/sinh-vien/detail",
                type: "GET",
                dataType: "json",
                success: function (response) {
                    console.log("MSSV" + response.mssv)
                    document.getElementById("result").innerHTML = `MSSV` + response.mssv
                        + `Ten ` + response.ten + `Tuoi: ` + response.tuoi
                }, errors: function () {
                    document.getElementById("result").innerHTML = "Lay du lieu bi loi"
                }
            }
        )
    }
</script>

</html>
