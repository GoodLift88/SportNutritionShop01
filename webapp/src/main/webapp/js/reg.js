

var main = {
    registration: function () {
        var second_name = document.getElementById("lastName").value;
        var first_name = document.getElementById("firstName").value;

        var email = document.getElementById("inputEmail").value;
        var pass = document.getElementById("inputPassword").value;
        var confpass = document.getElementById("confirmPassword").value;
        var phone = document.getElementById("phoneNumber").value;
        $.ajax({
            type: "POST",
            url: "/SportNutritionShop",
            dataType: "json",
            data: {requestType: "registration", lastName: second_name, firstName: first_name, Email: email,Password:pass,confirmPassword:confpass
            ,phoneNumber:phone},
            success: function (data) {

                console.log(data);
                document.location.href = 'User_cabinet.html';
            }
        });
    },

    log_in: function () {
        var email = document.getElementById("inputEmail").value;
        var pass = document.getElementById("inputPassword").value;
        $.ajax({
            type: "POST",
            url: "/sportNutritionShop",
            dataType: "json",
            data: {requestType: "login",  Email: email,Password:pass},
            success: function (data) {
                if(data.name == "error")
                    document.location.href = 'errorPage.html';
                else
                    document.location.href = 'User_cabinet.html';
                window.onload = function() {
                    document.getElementById("firstName").innerHTML = data.text;

                }

            }
        });
    }


};