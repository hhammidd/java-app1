app1.component("login",{
    templateUrl: "html/login.html",
    controller: function($scope, $log,$window, loginService, loginREST, $http, $cookies, $location) {
        loginService.init(response.data.user);
    }
    });