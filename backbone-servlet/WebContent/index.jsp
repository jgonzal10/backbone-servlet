<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Backbone Servlet</title>
    </head>
<body>
    <h1>Backbone Servlet: An example of backbone.js and servlets</h1>
    <p>An example project that demonstrates how to use <a href="">Backbone.js</a> with a Java servlet backend.</p>
    <p>You can download the code for the project from here: <a href="https://github.com/omouse/backbone-servlet">https://github.com/omouse/backbone-servlet</a></p>
    <h2>API</h2>
    <h3>List Categories [<a href="category/list">view</a>]</h3>
    <p>URL: <code>/backbone-servlet/category/list</code>
    <p>Parameters:
    <dl>
        <dt>name</dt>
        <dd>The name of the category, such as "books" or "music"</dd>
    </dl>
    </p>
    <h3>Get Product Details [<a href="product/detail">view</a>]</h3>
    <p>URL: <code>/backbone-servlet/product/detail</code>
    <p>Parameters:
    <dl>
        <dt>id</dt>
        <dd>The id of the product</dd>
    </dl>
    </p>
</body>
</html>