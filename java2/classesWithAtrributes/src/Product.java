public class Product {
    public Product(int id,String name,String description,double price,int stockAmount){
        System.out.println("yapıcı blok çalıştı");
       _id=id;
       _name=name;
       _description=description;
        _price=price;
       _stockAmount=stockAmount;
    }

    public Product(){

    }
    public String name;
    private int _id;
   private String _name;
   private  String _description;
   private  double _price;
   private int _stockAmount;


    public int getId(){
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getName(){
        return _name;
    }

    public void setName(String name){
        _name=name;
    }


    public String getDescription(){
        return _description;
    }

    public void setDescription(String description) {
        _description= description;
    }


    public double getPrice(){
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int get_stockAmount(){
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount =stockAmount ;
    }

}
