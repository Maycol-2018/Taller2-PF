package object Derivacion {
  def derivada(f: Double => Double): Double => Double = {
    val h: Double = 0.01
    (x: Double) => (f(x - 2 * h) - 8 * f(x - h) + 8 * f(x + h) - f(x + 2 * h)) / (12 * h)
  }

  def derivadaSuma(f: Double => Double, g: Double => Double): Double => Double = {
    (x: Double) => derivada(f)(x) + derivada(g)(x)
  }

  def derivadaResta(f: Double => Double, g: Double => Double): Double => Double = {
    (x: Double) => derivada(f)(x) - derivada(g)(x)
  }

  def derivadaMult(f: Double => Double, g: Double => Double): Double => Double = {
    (x: Double) => derivada(f)(x) * g(x) + f(x) * derivada(g)(x)
  }
  
  def derivadaDiv(f: Double => Double, g: Double => Double): Double => Double = {
    (x: Double) => {
      require(g(x) != 0, "g(x) no debe ser cero")
      (derivada(f)(x) * g(x) - f(x) * derivada(g)(x)) / (g(x) * g(x))
    }
  }
}
