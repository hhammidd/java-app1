app1.controller("mainController", function ($scope,$rootScope,sessionService, loginService,$http, $location, $log, $window ,URL_SERVICES, $cookies){
    $scope.user = loginService;
    $scope.urlApp1 = URL_SERVICES[1];
    $scope.urlApp2 = URL_SERVICES[2];
    $scope.urlApp3 = URL_SERVICES[3];
    $scope.urlApp4 = URL_SERVICES[4];
    $scope.urlApp5 = URL_SERVICES[5];

    let page = $window.sessionStorage.getItem("pageXFM");

    let tmp_cod =  $window.sessionStorage.getItem("cod")
    let tmp_password =$window.sessionStorage.getItem("password");

    //&& tmp_password.length > 0
    if(tmp_cod!=null && tmp_cod.length > 0){
        // silent doLogin
        $log.info("cookies exists, let's try to do login");
        $log.debug("cod: " + tmp_cod);
        $log.debug("password: " + tmp_password);

        loginService.doLogin({
            cod:      tmp_cod,
            password:   tmp_password
        },function(response){
            if(response.statusCode == 0){
                loginService.init(response.data.user);
                // everything is going well
                // user object is into data.data
                $scope.user=loginService;
                if(angular.equals(page,"/404page")){ // REDIRECT TO HOME IF REFRESH ON 404 PAGE.
                    $location.path("/home");
                }
                else if(page !="" && !angular.isUndefined(page) && page!=null){
                    $location.path(page);
                }
                else{
                    $location.path("/home");
                }
            }else{
                $log.debug("something is wrong, i read cookies but this is the response:");
                $log.debug(response);
            }
        });
    }

    $scope.logout = function() {
        $log.info("Logout| deleting cookies");
        $log.info("Logout| called the modal");
        swal({
                title: "Are you sure?",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#DD6B55",
                confirmButtonText: "Yes, exit!",
                closeOnConfirm: true
            },
            function(){
                sessionService.removeAllCookie();
                $.session.clear();
                window.location = $scope.urlXFMHome+"/logout.jsp" ;
            });
    };
});