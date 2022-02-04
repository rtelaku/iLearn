var enrolled = {
    name: "",
    lastname: "",
    studentid: "",
    code:"",
    courseid:""
   
}
$("#submit").click(function en(event) {
    event.preventDefault();

    code=$('#code').val();
    if(code === ""){
        alert("Please enter the code");
        

    }else if(code==="CSE1920"){
        enrollbtm = document.getElementById('enrollbutton').style.backgroundColor = 'Green';
        enrollform = document.getElementById('enroll_form').style.display = "none";
    }else {
        alert("Please check code");
    }

enrolled = {
       name: "Rigeita",
        lastname: "Telaku",
        studentid:"192047078",
        code: code,
        courseid:"2",
        
    }

    $.ajax({
        url: "http://localhost:8080/api/student/enrollStudent",
        type: 'post',
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: JSON.stringify(code),
        success: function (res) {
            localStorage.setItem('student', JSON.stringify(res))
            goToMaterials();
        }

    })
});

function goToMaterials() {
    window.location.href = "student_dashboard_courses_materials.html";
}

var enrollbtm;
var enrollform;
