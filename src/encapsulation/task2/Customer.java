package encapsulation.task2;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
    private long id;
    private String firstName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;

    public Customer() {
    }

    public Customer(Long id, String firstName, String email, LocalDate dateOfBirth, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    CRUD - акроним. Методдордун жыйындысы
//    С - Create. --  dannyi(object) tuzup beret jana bazaga saktait // add // save
//    R - Read -- uje sactalgan dannyilardy chyragyp beret
                  // bazadan bizge kerektuu bolgon gana dannyidy chygaryp beret
//    U - Update --- uje bazada saktalgan dannyidy ozgortup beret
//    D - Delete --  uje bazada bar dannyi ochurot


    // TODO CRUD
    // TODO CREATE
    public Customer[] createCustomer(Customer [] customers,Customer customer){
        // jany massiv tuzdum  anyn razmerin eski massivtin razmerine barabarlap aldym
        // jana 1 ge ozu koboitulup turgudai kyldym (Increament)
        Customer[] newCustomers = new Customer[customers.length + 1];


        //eski massivdin dannyilaryn jany kochurdum
        for (int i = 0; i < customers.length; ++i) {
            newCustomers[i] = customers[i];
        }

        // jany massivke jany object koshtum je saldym je saktadym
        newCustomers[customers.length] = customer;
        // kaira eski massivke uje dannyi saktalgan je kirgizilgen jany massivdi
        //kochurup koiduk
        customers = newCustomers;

        // message kaitardyk
        System.out.println("Uspeshno saktaldy!!");
        return customers;
    }

    // TODO GetALL
    public Customer [] getAllCustomers(Customer [] customers){
        return customers;
    }


    // TODO GET BY ID
    public Customer getById(long id, Customer [] customers){
        for (Customer customer : customers) {
            if (id == customer.id){
                return customer;
            }
        }
        return null;
    }

    // TODO UPDATE
    // TODO ВЫ должны update кылып атканда определенный
    //  полесин озгорткубуз келбесе эски данныйлар калыш керек
    public Customer[] updateCustomerById(long id,Customer[] customers,Customer updateCustomer){
        Customer oldCustomer = getById(id,customers);
        oldCustomer.setFirstName(updateCustomer.getFirstName());
        oldCustomer.setEmail(updateCustomer.getEmail());
        oldCustomer.setPhoneNumber(updateCustomer.getPhoneNumber());
        oldCustomer.setDateOfBirth(updateCustomer.getDateOfBirth());

        return customers;
    }


    // TODO DELETE
    public Customer[] deleteCustomerById(long id,Customer[]customers){
        // index arkyluu ochurushubuz kerek oshonduktan default index tuzduk
        int index = -1;

        // ochurulo turgan indextti taptyk
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId() == id){
                index = i;
                break;
            }
        }

        if (index !=-1){
            // eski massivden  razmeri 1 ge az bolgon jany massiv tuzduk
            Customer [] newCustomers = new Customer[customers.length - 1];
            // jany massivge eski massivtin ichinen tabylgan index ke cheinki dannyilardy kochurup aldyk
            for (int i = 0; i < index; i++) {
                newCustomers[i] = customers[i];
            }

            // jany massivge eski massivtin ichinen tabylgan indexten kiinki dannyilardy kochurup aldyk
            for (int i = index; i < newCustomers.length; i++) {
                newCustomers[i] = customers[i+1];
            }

            // jany massivtti eski indexkke barabarladyk
            customers = newCustomers;
        }


        return customers;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
