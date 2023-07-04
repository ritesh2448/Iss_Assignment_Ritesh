function validateRegistrationForm() {
  var email = document.forms["registrationForm"]["email"].value;
  var password = document.forms["registrationForm"]["password"].value;

  // Perform validation logic here
  if (email === "") {
    alert("Please enter your email");
    return false; // Return false to prevent form submission
  }

  if (password === "") {
    alert("Please enter your password");
    return false; // Return false to prevent form submission
  }



  return true; // Return true to submit the form
}

function validateLoginForm() {
  var email = document.forms["loginForm"]["email"].value;
  var password = document.forms["loginForm"]["password"].value;

  // Perform validation logic here
  if (email === "") {
    alert("Please enter your email");
    return false; // Return false to prevent form submission
  }

  if (password === "") {
    alert("Please enter your password");
    return false; // Return false to prevent form submission
  }



  return true; // Return true to submit the form
}
