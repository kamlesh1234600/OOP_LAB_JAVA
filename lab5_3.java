class Product{
    int productID;
    String name;
    int categoryID;
    double unitprice;
    Product(int productID,String name,int categoryID,double unitprice){
        this.productID=productID;
        this.name=name;
        this.categoryID=categoryID;
        this.unitprice=unitprice;
    }
};
class ElectricalProduct extends Product{
    double voltageRange;
    double wattage;
    ElectricalProduct(int productID,String name,int categoryID,double unitprice,double voltageRange,double wattage){
        super(productID, name, categoryID, unitprice);
        this.voltageRange=voltageRange;
        this.wattage=wattage;
    }
    void changePrice(double val){
        unitprice=val;
    }
    void ChangeWattage(double val){
        wattage=val;
    }

};
public class lab5_3 {
    public static void main(String[] args) {
        ElectricalProduct e1=new ElectricalProduct(123, "sensor", 456, 250, 40.5, 15);
        e1.changePrice(90);
        e1.ChangeWattage(25);
        System.out.println("updated details of price and wattege are below:");
        System.out.println("updated value of Wattage:"+e1.wattage);
        System.out.println("updated value of price:"+e1.unitprice);
    }
}
