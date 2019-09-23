<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>修改商品信息页面</title>
</head>
<script src="vuejs/vuejs-2.5.16.js"></script>
<script src="vuejs/axios-0.18.0.js"></script>
<body>
<div >修改商品信息:</div>
<table border="1" width="100%">
    <tr>
        <td>商品名称</td>
        <td><input type="text" name="name"></td>
    </tr>
    <tr>
        <td>商品价格</td>
        <td><input type="text" name="price"></td>
    </tr>
    <tr>
        <td>商品生产日期</td>
        <td><input type="datetime-local" name="price"></td>
    </tr>
    <tr>
        <td>商品图片</td>
        <td><input type="file" name="" id=""></td>
    </tr>
    <tr>
        <td>商品简介</td>
        <td></td>
    </tr>
    <tr >
        <td colspan="2"><input type="button" value="提交" ></td>
    </tr>
</table>
</body>
</html>
