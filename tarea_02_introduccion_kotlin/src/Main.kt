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
        println("Lista de alimentos y calorias: \n $alimentos")

        /*
        * Separar los alimentos en dos categorías:
            alimentos con más de 500 calorías ("altos en calorías")
            y alimentos con menos de 500 calorías ("bajos en calorías").*/
        val altascalorias = alimentos.filter {it.value > 500}
        val bajascalorias = alimentos.filter {it.value < 500}
        println("Alimentos altos en calorias: $altascalorias")
        println("Alimentos bajos en calorias: $bajascalorias")

        //Calcular y mostrar el total de calorías consumidas.
        val totalcalorias = alimentos.values.sum()
        println("Total de calorias consumidas: $totalcalorias calorias")

        // Mostrar cuántos alimentos están en la categoría de "altos en calorías".
        val numeroaltascalorias = altascalorias.count()
        println("Alimentos altos en calorias: $numeroaltascalorias")


}