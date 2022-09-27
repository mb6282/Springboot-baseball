function teamSave() {

	let data = {
		stadiumId : $("#stadiumId option:selected").val(),
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
			location.href = "/team";
		} else {
			alert("팀 등록에 실패하였습니다");
		}
	});
}

function teamUpdate() {
	let id = $("#id").val();
	
	let data = {
		stadiumId : $("#stadiumId option:selected").val(),	
		teamName: $("#teamName").val()
	};
	
	$.ajax("/team/" + id, {
		type: "PUT",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("팀 수정 성공");
			location.href = "/team";
		} else {
			alert("팀 수정에 실패하였습니다");
		}
	});
}

function teamDelete() {
	let checkBoxArr = [];
	$("input:checkbox[name='deleteCheck']:checked").each(function() {
		checkBoxArr.push($(this).val()); // 체크된 값 배열에 push
	})
	
	$.ajax("/teamDelete", {
		type: "POST",
		dataType: "json",
		data : {
			checkBoxArr : checkBoxArr
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("팀 삭제에 성공했습니다");
			location.href = "/team";
		} else {
			alert("팀 삭제에 실패했습니다");
		}
	});
}