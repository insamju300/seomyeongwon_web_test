<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="utf-8">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>게시글작성</title>
<!-- 테일윈드 불러오기 -->
<!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css" /> -->
<link
	href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2/dist/tailwind.min.css"
	rel="stylesheet" type="text/css" />

<!-- daisy ui 불러오기 -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/daisyui/4.6.1/full.css" />

<!-- 폰트어썸 불러오기 -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">

<!-- 제이쿼리 불러오기 -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
	<!--     	<header>
		<div class="btm-nav w-full bg-primary">
			<button>
				대충 로고
			</button>
			<button class="active">
				
			</button>
			<button>
				<svg xmlns="http://www.w3.org/2000/svg" class="h-5 w-5" fill="none"
					viewBox="0 0 24 24" stroke="currentColor">
					<path stroke-linecap="round" stroke-linejoin="round"
						stroke-width="2"
						d="M9 19v-6a2 2 0 00-2-2H5a2 2 0 00-2 2v6a2 2 0 002 2h2a2 2 0 002-2zm0 0V9a2 2 0 012-2h2a2 2 0 012 2v10m-6 0a2 2 0 002 2h2a2 2 0 002-2m0 0V5a2 2 0 012-2h2a2 2 0 012 2v14a2 2 0 01-2 2h-2a2 2 0 01-2-2z" /></svg>
			</button>
		</div>
	</header> -->
	<header class="fiexed">
		<div class="navbar bg-base-100">
			<div class="flex-1">
				<a class="btn btn-ghost text-xl">daisyUI</a>
			</div>
			<div class="flex-none">
				<ul class="menu menu-horizontal">
					<li>
						<details>
							<summary> 게시글 </summary>
							<ul class="p-2 bg-base-100 rounded-t-none w-32">
								<li>
									<a href="/article/showWrite">게시글 작성</a>
								</li>
								<li>
									<a href="/article/showList">게시글 목록</a>
								</li>
							</ul>
						</details>
					</li>
				</ul>
			</div>
		</div>
	</header>

	<main class="flex justify-center w-full ">
		<form action="/article/doWrite" method="POST"
			class="flex flex-col w-2/4 bg-red">
			<div class="flex w-full">
				<p class="w-20">타이틀</p>
				<label class="input input-bordered flex items-center gap-2 w-full">

					<input type="text" class="grow" placeholder="타이틀" name="title" />
				</label>
			</div>

				<p class="w-15">내용</p>
				<textarea class="textarea textarea-warning w-full" placeholder="내용" name="body"></textarea>

			<button class="btn btn-warning">전송</button>
		</form>
	</main>
</body>
</html>