package br.com.etechas.etecfood.controller;

public class ItemPedidoController {
    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    @GetMapping
    public List<Item_pedido> listar() {
        return itemPedidoRepository.findAll();
    }
}
