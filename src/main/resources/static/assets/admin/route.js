var myApp = angular.module("adminApp", ["ngRoute"]);

myApp.config(function ($routeProvider, $locationProvider) {
    $locationProvider.hashPrefix("");
    $routeProvider
        .when("/product", {
            templateUrl: "/assets/admin/product/index.html",
             controller: productController,
        })
        .when("/authority", {
            templateUrl: "/assets/admin/auth/index.html",
            // controller: sanPhamConTroller,
        })
        .when("/accounts", {
            templateUrl: "/assets/admin/account/index.html",
            // controller: sanPhamConTroller,
        })
        .otherwise({
            redirectTo: "/product",
        });
});
