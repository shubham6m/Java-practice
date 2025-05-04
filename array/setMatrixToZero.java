class setMatrixToZero {
  public void setZeroes(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == 0) {
          while (i < m && j < n) {
            if (matrix[i][j] != 0) {
              matrix[i][j] = 0;
            }
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
    setMatrixToZero s = new setMatrixToZero();
    s.setZeroes(arr);
  }
}