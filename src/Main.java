public class Main {

    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 =new Product(); //Class ı tanımladık

        product1.setName("Delongi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInsStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 =new Product();
       product2.setName("Smeg Kahve Makinesi");
       product2.setDiscount(8);
       product2.setUnitPrice(6500);
       product2.setUnitInsStock(5);
       product2.setImageUrl("image2.jpg");

        Product product3 =new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitInsStock(3);
        product3.setImageUrl("image3.jpg");


        Product[] products ={product1,product2,product3};

        for (Product product : products ){
            System.out.println(product.getName());
        }
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05058890546");
        individualCustomer.setCustomerNumber("12345678");
        individualCustomer.setFirstName("Furkan");
        individualCustomer.setLastName("Arıç");

        CorporateCustomer corporateCustomer= new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("0589954514");
        corporateCustomer.setTaxNumber("11111111111");
        corporateCustomer.setCustomerNumber("87654123");

        





    }
}
