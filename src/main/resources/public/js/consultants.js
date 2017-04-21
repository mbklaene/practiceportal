angular.module('consultant', [])
.controller('consultant', function($scope, $http) {
	  $scope.visible = false;
	  $http.get('/ranking/').success(function(data) {
	    $scope.consultant = data;
	  });
	  
	  $scope.setSelected = function (consultant) {
		   $scope.visible = true;
		   $scope.nameForm = consultant.consultantName;
		   $scope.monthForm = consultant.month;
		   $scope.amountForm = consultant.amount;
		};
		
		$scope.add = function () {
			   $scope.visible = true;
			   $scope.singleConsultant.consultantName = "";
			   $scope.singleConsultant.month = "";
			   $scope.singleConsultant.amount = "";
			   
		};
		
		$scope.addToList = function () {
			   $scope.visible = false;
			   $scope.consultant.push($scope.singleConsultant);
			   
		};
		
	  $scope.update = function(){
		  
	  }
		
});