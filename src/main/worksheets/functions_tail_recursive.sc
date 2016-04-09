
def power(x: Int, n: Int, acc: Long = 1): Long =
  if (n >= 1)
    power(x, n - 1, acc * x)
  else
    1



power(2, 3)
