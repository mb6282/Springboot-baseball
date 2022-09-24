function stadiumSave() {

	let data = {
			stadiumName : $("#stadiumName").val()
		};

	$.ajax("/stadium", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("경기장 등록에 성공하였습니다");
			location.href = "/stadium";
		}else {
			alert("경기장 등록에 실패하였습니다");
		}
	});
}

function stadiumUpdate() {
	let id = $("#id").val();
	
	let data = {
		stadiumName : $("#stadiumName").val()
	};


	$.ajax("/stadium/"+id, {
		type: "PUT",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("경기장 이름 수정 성공");
			location.href = "/stadium";
		} else {
			alert("경기장 이름 수정에 실패하였습니다");
		}
	});
}

function stardiumDelete(id) {
	
	$.ajax("/stadium/" + id, {
		type: "DELETE",
		dataType: "json"
	}).done((res) => {
		if (res.code == 1) {
			alert("경기장 삭제에 성공했습니다");
			location.href = "/stadium";
		} else {
			alert("경기장 삭제에 실패했습니다");
		}
	});
}