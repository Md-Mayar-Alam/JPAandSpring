$(document).ready(function(){
	$("#addStudent").click(function(event){
		addStudent(event);
	});
});

function addStudent(event){
	event.preventDefault();
	var formData=$("#studentAddForm").serialize();
	$.ajax({
		cache: false,
		type: "POST",
		url: "/JPAandSpring/addStudent",
		data: formData,
		success: function(response){
			$("#message").text(response);
			$("#message").css({
				"color": "green"
			});
		},
		error: function(error){
			$("#message").text(error);
			$("#message").css({
				"color": "red"
			});
		}
	});
}