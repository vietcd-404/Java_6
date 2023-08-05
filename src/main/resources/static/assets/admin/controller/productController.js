window.productController = function ($scope, $rootScope, $http, $routeParams) {
    $scope.listProduct = [];
    $scope.currentPage = 1;
    $scope.pageSize = 2;
    $scope.totalPages = 0;

    $scope.getProducts = function () {
        $http.get(productApi, { params: { page: $scope.currentPage - 1, size: $scope.pageSize } })
            .then(function (response) {
                $scope.listProduct = response.data.content;
                $scope.totalPages = response.data.totalPages;
            });
    };
    // console.log(getP)

    $scope.getProducts();

    $scope.nextPage = function () {
        if ($scope.currentPage < $scope.totalPages) {
            $scope.currentPage++;
            $scope.getProducts();
        }
    };

    $scope.previousPage = function () {
        if ($scope.currentPage > 1) {
            $scope.currentPage--;
            $scope.getProducts();
        }
    };


}