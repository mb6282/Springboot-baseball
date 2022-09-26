function stadiumSave() {

	let data = {
		stadiumId : $("stadiumId").val(),
		teamName: $("#teamName").val()
	};

	$.ajax("/team", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("팀 등록에 성공하였습니다");
			location.href = "/stadium";
		} else {
			alert("팀 등록에 실패하였습니다");
		}
	});
}