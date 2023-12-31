<%--
  Created by IntelliJ IDEA.
  User: 秦向阳
  Date: 2023/6/3
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<main class="lyear-layout-content">

    <div class="container-fluid">

        <div class="row">
            <div class="col-lg-12">
                <div class="card">
                    <div class="card-body">

                        <div class="edit-avatar">
                            <img src="${ctx}/static/bootstrap/images/users/avatar.jpg" alt="..." class="img-avatar">
                            <div class="avatar-divider"></div>
                            <div class="edit-avatar-content">
                                <button class="btn btn-default">修改头像</button>
                                <p class="m-0">选择一张你喜欢的图片，裁剪后会自动生成264x264大小，上传图片大小不能超过2M。</p>
                            </div>
                        </div>
                        <hr>
                        <form method="post" action="#!" class="site-form">
                            <div class="form-group">
                                <label for="username">用户名</label>
                                <input type="text" class="form-control" name="username" id="username" value="lightyear" disabled="disabled" />
                            </div>
                            <div class="form-group">
                                <label for="nickname">昵称</label>
                                <input type="text" class="form-control" name="nickname" id="nickname" placeholder="输入您的昵称" value="后台系统">
                            </div>
                            <div class="form-group">
                                <label for="email">邮箱</label>
                                <input type="email" class="form-control" name="email" id="email" aria-describedby="emailHelp" placeholder="请输入正确的邮箱地址" value="45334@qq.com">
                                <small id="emailHelp" class="form-text text-muted">请保证您填写的邮箱地址是正确的。</small>
                            </div>
                            <div class="form-group">
                                <label for="remark">简介</label>
                                <textarea class="form-control" name="remark" id="remark" rows="3"></textarea>
                            </div>
                            <button type="submit" class="btn btn-primary">保存</button>
                        </form>

                    </div>
                </div>
            </div>

        </div>

    </div>

</main>