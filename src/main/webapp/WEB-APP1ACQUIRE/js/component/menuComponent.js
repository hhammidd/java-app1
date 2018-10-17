XFMAlipay.component("menuComponent", {
    templateUrl: "html/menu.html",
    controller: function MenuComponent($scope, $http, $log, $routeParams, $cookies, $location, URL_SERVICES, userService) {
        $scope.user = userService;
    }
});
