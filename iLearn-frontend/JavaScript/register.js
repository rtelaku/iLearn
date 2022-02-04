
function validate(event){
    //fields
    var name = document.forma.emri.value;
    var email = document.forma.email.value;
    var password = document.forma.password.value;
    // var passwordConf = document.getElementById('password1').value;
    // var birthday = document.getElementById('bday').value;
    //errors
    var nameVal = document.getElementById('e1');
    var emailVal = document.getElementById('e2');
    var passwordVal = document.getElementById('e3');

    var nameError = false;
    var emailError = false;
    var passwordError = false;

    //name validation
    if(!name || name == ""){
        event.preventDefault();
        nameVal.innerHTML = "Name can't be blank !";
        nameVal.style.visibility = 'visible';
        nameError = true;
    }
    else if(!validateName(name)){
        nameVal.innerHTML = "Invalid name !";
        nameVal.style.visibility = "visible";
        nameError = true;
    }
    else{
        nameError =false;
        nameVal.style.visibility = "hidden";
    }

    //email validation
    if(!email || email == ""){
        event.preventDefault();
        emailVal.innerHTML = "Email can't be blank !";
        emailVal.style.visibility = 'visible';
        emailError = true;
    }
    else if(!validateEmail(email)){
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
    else if(!validatePassword(password)){
        passwordVal.innerHTML = "Invalid password !";
        passwordVal.style.visibility = "visible";
        passwordError = true;
    }
    else{
        passwordError =false;
        passwordVal.style.visibility = "hidden";
    }

    //password confirm
    // if(!passwordConf || passwordConf == ""){
    //     passwordConfirmVal.innerHTML = "Password confirmation can't be blank !";
    //     passwordConfirmVal.style.visibility = "visible";
    //     passwordConfirmError = true;
    // }
    // else if(!passwordConf.equals(password)){
    //     passwordConfirmVal.innerHTML = "Password doesn't match!";
    //     passwordConfirmVal.style.visibility = "visible";
    //     passwordConfirmError = true;
    // }
    // else{
    //     passwordConfirmError = false;
    //     passwordConfirmVal.style.visibility = "hidden";
    //     PasswordConfirmG.innerHTML = "Continue with birthday..."
    // }

    //birthday validation
    // if(!birthday || birthday == ""){
    //     birthdayVal.innerHTML = "Birthday can't be blank !";
    //     birthdayVal.style.visibility = 'visible';
    //     birthdayError = true;
    // }
    // else if(!validateBirthday(birthday)){
    //     birthdayVal.innerHTML = "Invalid birthday !";
    //     birthdayVal.style.visibility = "visible";
    //     birthdayError = true;
    // }
    // else{
    //     birthdayError =false;
    //     birthdayVal.style.visibility = "hidden";
    //     birthdayG.innerHTML = "Valid !";
    // }
}

function validateEmail(email) {
    var emailRegex = /^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
    return emailRegex.test(String(email).toLowerCase());
  }
  function validateName(name){
      var nameRegex = /^([a-zA-Z]+)$/;
      return nameRegex.test(name);
  }
  function validatePassword(password){
      var passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$!%*?.,&])[A-Za-z\d@$!%*?.,&]{8,}$/;
      return passwordRegex.test(password);
  }
//   function validateBirthday(birthday){
//       var birthdayRegex = /^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\d\d$/;
//       return birthdayRegex.test(birthday);
//   }



