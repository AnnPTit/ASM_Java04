<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<main>

	<div class="row">
		<div class="col-12">
			<h2 class="tm-page-title mb-4">Our Video Catalog</h2>
			<div class="tm-categories-container mb-5">
				<h3 class="tm-text-primary tm-categories-text">Categories:</h3>
				<ul class="nav tm-category-list">
					<li class="nav-item tm-category-item"><a href="#"
						class="nav-link tm-category-link active">All</a></li>
					<li class="nav-item tm-category-item"><a href="#"
						class="nav-link tm-category-link">Drone Shots</a></li>
					<li class="nav-item tm-category-item"><a href="#"
						class="nav-link tm-category-link">Nature</a></li>
					<li class="nav-item tm-category-item"><a href="#"
						class="nav-link tm-category-link">Actions</a></li>
					<li class="nav-item tm-category-item"><a href="#"
						class="nav-link tm-category-link">Featured</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div class="row tm-catalog-item-list">
		<c:forEach items="${list}" var="x" varStatus="viTri">
			<div class="col-lg-4 col-md-6 col-sm-12 tm-catalog-item">
				<div class="position-relative tm-thumbnail-container">
					<%-- <iframe width="100%" height="315"
						src="https://www.youtube.com/embed/${x.href }"> </iframe> --%>
					<img alt="" style="width: 100%; height: 400px" src="${x.poster }">
					<a
						href="${pageContext.request.contextPath}/video/detail?index=${x.id}"
						class="position-absolute tm-img-overlay"> <i
						class="fas fa-play tm-overlay-icon"></i>
					</a>
				</div>
				<div class="p-4 tm-bg-gray tm-catalog-item-description">
					<a style="text-decoration: none;"
						href="${pageContext.request.contextPath}/video/detail?index=${x.id}"><h3
							class="tm-text-primary mb-3 tm-catalog-item-title">${x.title}</h3></a>
					<p class="tm-catalog-item-text">${x.description }</p>
					View : <span>${x.views}</span> <br>Shares : <span>${x.shares}</span>
				</div>
			</div>
		</c:forEach>


	</div>

	<!-- Catalog Paging Buttons -->
	<div>
		<ul class="nav tm-paging-links">
			<li class="nav-item active"><a href="#"
				class="nav-link tm-paging-link">1</a></li>
			<li class="nav-item"><a href="#" class="nav-link tm-paging-link">2</a></li>
			<li class="nav-item"><a href="#" class="nav-link tm-paging-link">3</a></li>
			<li class="nav-item"><a href="#" class="nav-link tm-paging-link">4</a></li>
			<li class="nav-item"><a href="#" class="nav-link tm-paging-link">></a></li>
		</ul>
	</div>
</main>
