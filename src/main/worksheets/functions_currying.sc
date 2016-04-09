def multiple(x: Int, y: Int): Int =
  x * y


multiple(2, 3)


val multipleOf2 = multiple(2, _: Int)

multipleOf2(3)
