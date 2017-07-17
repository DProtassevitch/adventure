function login() {
    var username = $("#username").val();
    var password = $("#password").val();
    $('#login-form').on('submit', function(ev) {
        ev.preventDefault();
    $.ajax("/signin", {
        method: "POST",
        contentType: "application/json",
        data: JSON.stringify({
            name: username,
            password: password
        })
    }).done(function (validationMessage) {
        $("#validation-message").text(validationMessage.text);
    });});
}

function saveUserLogin() {
    var userLogin = $("#username").val();
    var userPassword = $("#password").val();
    var requestObject = {
        name: userLogin,
        password: userPassword
    };
    $.ajax("/saveUser", {
        metod: "POST",
        contentType: "application/json",
        data: JSON.stringify(requestObject)
    });
}
