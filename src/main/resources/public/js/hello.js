angular.module('hello', [])
.controller('hello', function($scope, $http) {
	  $http.get('/resource/').success(function(data) {
	    $scope.greeting = data;
	    console.log("Coming here too !!");
	  })
});