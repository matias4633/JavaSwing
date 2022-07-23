
package client.components.productos;


public class ProductosComponent {
    private ProductosTemplate template;
    public ProductosComponent(){
        this.template=new ProductosTemplate(this);
    }

    public ProductosTemplate getTemplate() {
        return template;
    }
    
}
