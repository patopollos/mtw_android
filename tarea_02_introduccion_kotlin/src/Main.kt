//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
        val alimentos = mapOf(
            "Pizza" to 800,
            "Ensalada" to 200,
            "Hamburguesa" to 700,
            "Manzana" to 100,
            "Helado" to 300,
            "Pasta" to 600,
            "Yogurt" to 150
        )
        //Mostrar la lista de alimentos y sus calorías.
        println("Lista de alimentos y calorias: $alimentos")
        println()
        /*
        * Separar los alimentos en dos categorías:
            alimentos con más de 500 calorías ("altos en calorías")
            y alimentos con menos de 500 calorías ("bajos en calorías").*/
        val altascalorias = alimentos.filter {it.value > 500}
        val bajascalorias = alimentos.filter {it.value < 500}
        println("Alimentos altos en calorias (metodo filter): $altascalorias")
        println("Alimentos bajos en calorias (metodo filter): $bajascalorias")
        println()

    /*
        * Separar los alimentos en dos categorías por bucle for:
            alimentos con más de 500 calorías ("altos en calorías")
            y alimentos con menos de 500 calorías ("bajos en calorías").*/
        var altos = 0
        for ((key, value) in alimentos) {

            if (value > 500){
                println("Alimentos altos en calorias (metodo for) $key = $value")
                altos++
            }
        }

         for ((key, value) in alimentos) {
            if (value < 500){
            println("Alimentos bajos en calorias (metodo for) $key = $value")
            }
        }
        println()
        //Calcular y mostrar el total de calorías consumidas.
        val totalcalorias = alimentos.values.sum()
        println("Total de calorias consumidas sum directo: $totalcalorias calorias")
        println()
        println("Total de calorias consumidas (sum a 2 variables): ")
        println((altascalorias.values.sum()) + (bajascalorias.values.sum()))
        println()
        println("Total de calorias consumidas (sumando elemento por elemento): ")
        println(alimentos.getValue(key = "Pizza") + alimentos.getValue(key = "Ensalada") + alimentos.getValue(key = "Hamburguesa") + alimentos.getValue(key = "Manzana") + alimentos.getValue(key = "Helado") + alimentos.getValue(key = "Pasta") + alimentos.getValue(key = "Yogurt"))
        println()

        // Mostrar cuántos alimentos están en la categoría de "altos en calorías".
        val numeroaltascalorias = altascalorias.count()
        println("Alimentos altos en calorias (metodo count): $numeroaltascalorias")
        println()

        println("Alimentos altos en calorias (imprimiendo variable): $altos ")


}