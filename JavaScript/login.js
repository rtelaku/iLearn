function validate1(event) {
    var username = document.forma2.username.value;
    var password = document.forma2.password.value;
    var emailVal = document.getElementById('e4');
    var passwordVal = document.getElementById('e5');
    var emailError = false;
    var passwordError = false;

    //email validation
    if(!username || username == ""){
        event.preventDefault();
        emailVal.innerHTML = "Username can't be blank !";
        emailVal.style.visibility = 'visible';
        emailError = true;
    }
    else if(!validateEmail(username)){
        emailVal.innerHTML = "Invalid email !";
        emailVal.style.visibility = "visible";
        emailError = true;
    }
    else{
        emailError =false;
        emailVal.style.visibility = "hidden";
        
    }

    //password validation
    if(!password || password == ""){
        event.preventDefault();
        passwordVal.innerHTML = "Password can't be blank !";
        passwordVal.style.visibility = 'visible';
        passwordError = true;
    }
    else{
        passwordError =false;
        passwordVal.style.visibility = "hidden";
    }

    function validateEmail(username) {
        var emailRegex = /^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
        return emailRegex.test(String(email).toLowerCase());
      }

}

function validate(form) {
    let inputs = document.querySelectorAll("input");
    let test = document.getElementsByTagName("input");

    login = {
        username: $("#username").val(),
        password: $("#password").val()
    }

    if (login[username] == "" && login[password] == "") {
        alert('please fill data')
        return;
    }
    
    return true
}

var login = {
    username: "",
    password: ""
}

$("#submit").click(function (s) {
    validate(0)
    s.preventDefault();
    console.log(login);

    $.ajax({
        url: "http://localhost:8080/api/student/login",
        type: 'post',
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: JSON.stringify(login),
        success: function (res) {
            localStorage.setItem('student', JSON.stringify(res))
            goToDashboard();
        },
        error: function (request, status, error) {
            console.log(request);
            console.log(error);
            console.log(status);
        }
    })
});

function goToDashboard() {
    window.location.href = "student_dashboard.html";
}


