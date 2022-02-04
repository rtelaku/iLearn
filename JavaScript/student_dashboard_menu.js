function show(id) {
    var forma = document.getElementById(id);
    if(forma.style.display == "block")
        forma.style.display = "none";
    else
        forma.style.display = "block";
  }

  function disable(id){
      var forma = document.getElementById(id);
      var button = document.getElementById(submit);
      if(!onclick.button){
        forma.style.display = "none";
        }
        else{
            forma.style.display = "block";
        }
  }

  function show_info(){
    window.location.replace("student_dashboard_info.html");
}
  function show_courses(){
      window.location.replace("student_dashboard_courses.html");
  }
  function show_books(){
      window.location.replace("student_dashboard_books.html");
  }
  function show_student_dashboard(){
      window.location.replace("student_dashboard.html");
  }


