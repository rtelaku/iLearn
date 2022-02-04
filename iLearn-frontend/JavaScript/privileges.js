$("#submit").click(function (event) {
    role=$('#roleuser').val();
    if(role === 0){
        goToAdmin();
    }else if(role=== 1){
        goToProfessor();
    }else if(role === 2){
        goToStudent();
    }else{
        alert("check role number");
    }
});

    function goToAdmin(){
        window.location.href = "adminpage.html";
    }
    
    function goToProfessor(){
        window.location.href = "professor_dashboard.html";
    }
    
    function goToStudent(){
        window.location.href = "student_dashboard.html";
    }

