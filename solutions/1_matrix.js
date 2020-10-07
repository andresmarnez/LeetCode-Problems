/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */

var setZeroes = function(matrix) {
var zeroes  = [];

    for (var i = 0 ; i < matrix.length ; i++){

        for (var j = 0 ; j < matrix[i].length ; j++){

            if(matrix[i][j] === 0){
                zeroes.push([i,j]);
            };
        };
    };

    for(var h = 0; h < zeroes.length; h++){
        eliminai(matrix,zeroes[h][0],zeroes[h][1]);

    };
};


var eliminai = (total, x, y) => {

    for(var j = 0; j < total[x].length; j++ ){
        total[x][j] = 0;
    };

    for(var i = 0; i < total.length; i++ ){
        total[i][y] = 0;
    };
};
