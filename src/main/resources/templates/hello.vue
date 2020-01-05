<template>
    $END$
</template>
<!DOCTYPE html>
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- 引入样式 -->
<link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
<!-- 引入组件库 -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
这是vue的HTML

<div id="app">
    <p>{{a}}</p>


</div>
</body>
</html>
<script>

    var data = { a: 1 }
   var vue = new Vue({
       el:"#app",
       data:data
   })
</script>

<style scoped>

</style>