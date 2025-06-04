package vcmsa.ci.gametesterlogapp

class GameSessionProcessor {
}
object InventoryManager {
    // 3 parallel 1-dimensional arrays
    private val calculate = mutableListOf<String>()
    private val itemPrices = mutableListOf<Double>()
    private val itemQuantities = mutableListOf<Int>()

    // Function to add an item (Global Procedure)
    fun addItem(name: String, price: Double, quantity: Int) {
        itemNames.add(name)
        itemPrices.add(price)
        itemQuantities.add(quantity)
    }

    // Function to get total stock count (Global Function, No Parameters)
    fun getTotalStock(): Int {
        return itemQuantities.sum()
    }

    // Function to check if an item is available (Global Function, With Parameter)
    fun checkAvailability(name: String): Boolean {
        val index = itemNames.indexOf(name)
        return if (index != -1) itemQuantities[index] > 0 else false
    }

    // Function to get a formatted list of items
    fun getItemList(): List<String> {
        return itemNames.mapIndexed { index, name -> "$name - $${itemPrices[index]} (Qty: ${itemQuantities[index]})" }
    }
