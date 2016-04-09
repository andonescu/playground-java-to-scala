def power(x: Int, n: Int): Long =
  if (n >= 1)
    x * power(x, n-1)
 else
    1



power(2, 3)

