<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
	integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="../assets/css/Login.css">
<style type="text/css">
.form-control {
	padding: 10px;
	font-size: 20px;
}

.form-label {
	font-size: 20px;
}

.login__title {
	font-size: 40px;
}
</style>
</head>
<body>
	<div class="container register__main">
		<h3 class="login__title">Change password</h3>

		<form class="row g-3"
			action="${pageContext.request.contextPath}/changepass" method="post">
			<h4 style="color: red;">${mess }</h4>


			<div class="col-md-6">
				<label for="inputGroupPrepend3" class="form-label">Password</label>
				<div class="input-group has-validation">
					<span class="input-group-text" id="inputGroupPrepend3">*</span>
					<!-- Thêm class is-valied để check sai -->
					<input type="text" class="form-control"
						id="validationServerUsername"
						aria-describedby="inputGroupPrepend3 validationServerUsernameFeedback"
						required name="password" />

				</div>
			</div>
			<div class="col-md-6">
				<label for="inputGroupPrepend3" class="form-label">New
					Password</label>
				<div class="input-group has-validation">
					<span class="input-group-text" id="inputGroupPrepend3">*</span>
					<!-- Thêm class is-valied để check sai -->
					<input type="text" class="form-control"
						id="validationServerUsername"
						aria-describedby="inputGroupPrepend3 validationServerUsernameFeedback"
						required name="newPass" />

				</div>
			</div>
			<div class="col-md-6">
				<label for="inputGroupPrepend3" class="form-label">Re type
					New Password</label>
				<div class="input-group has-validation">
					<span class="input-group-text" id="inputGroupPrepend3">*</span>
					<!-- Thêm class is-valied để check sai -->
					<input type="text" class="form-control"
						id="validationServerUsername"
						aria-describedby="inputGroupPrepend3 validationServerUsernameFeedback"
						required name="reNewPass" />

				</div>
			</div>




			<div class="col-12">
				<button class="btn register__btn" type="submit">Send</button>
			</div>
		</form>
	</div>

</body>
</html>