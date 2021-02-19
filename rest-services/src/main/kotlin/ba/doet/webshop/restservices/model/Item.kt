package ba.doet.webshop.restservices.model

data class Item(val id: Int,
                val name: String,
                val itemDescription: String,
                val price: Double,
                val category: Category)