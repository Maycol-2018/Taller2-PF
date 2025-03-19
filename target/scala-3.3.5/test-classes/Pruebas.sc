import Derivacion ._
val cte = (x:Double)=>2.0;
val f = (x: Double) => (x*x + x)
val g = (x: Double) => (x*x*x)

val h = (x: Double) => f(x) / g(x)
val j = (x: Double) => g(x) / f(x)
// Probar con sumas, restas,de polinomios. Polinomios negativos.


val h1 = derivadaSuma(f,g)
val h2 = derivadaSuma(cte,g)
val h3 = derivadaSuma(f,g)

h1(2)
h2(2)
h3(2)

val h6 = derivadaDiv(f, g)
val h8 = derivadaDiv(g, f)
val h10 = derivadaDiv(g, f)




derivada(cte)(2)
derivada(cte)(6)