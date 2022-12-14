function playerSave() {

	let data = {
		playerName: $("#playerName").val(),
		teamId : $("#teamId option:selected").val(),
		position : $("#position").val()
	};

	$.ajax("/player", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("선수 등록에 성공하였습니다");
			location.href = "/player";
		} else {
			alert("선수 등록에 실패하였습니다");
		}
	});
}

function playerUpdate() {
	let id = $("#id").val();
	
	let data = {
		playerName: $("#playerName").val(),
		teamId : $("#teamId option:selected").val(),
		position : $("#position").val()
	};
	
	$.ajax("/player/" + id, {
		type: "PUT",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("선수정보 수정 성공");
			location.href = "/player";
		} else {
			alert("선수정보 수정에 실패하였습니다");
		}
	});
}

function playerDelete() {
	let checkBoxArr = [];
	$("input:checkbox[name='deleteCheck']:checked").each(function() {
		checkBoxArr.push($(this).val()); // 체크된 값 배열에 push
	})
	
	$.ajax("/playerDelete", {
		type: "POST",
		dataType: "json",
		data : {
			checkBoxArr : checkBoxArr
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("선수 삭제에 성공했습니다");
			location.href = "/player";
		} else {
			alert("선수 삭제에 실패했습니다");
		}
	});
}