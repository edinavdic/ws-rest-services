package ba.doet.webshop.restservices.controller

import ba.doet.webshop.restservices.service.ItemService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/items")
class ItemController(private val itemService: ItemService) {
}