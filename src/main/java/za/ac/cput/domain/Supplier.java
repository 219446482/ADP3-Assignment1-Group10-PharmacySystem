package za.ac.cput.domain;
/*Ilyaas Davids (219466424)
* Supplier domain
* 11 Oct 2022*/
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Supplier implements Serializable {
    @Id
    private String suppId;
    private String suppName;


   //Getters
    public String getSuppId() {
        return suppId;
    }

    public String getSuppName() {
        return suppName;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "suppId='" + suppId + '\'' +
                ", suppName='" + suppName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return suppId.equals(supplier.suppId) && suppName.equals(supplier.suppName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suppId, suppName);
    }

    //Builder Constructor
    protected Supplier(){}

    private  Supplier (Supplier.Builder builder){
        this.suppId = builder.suppId;
        this.suppName = builder.suppName;
    }

    //Builder Classes
   public static class Builder{
        private String suppId;
        private String suppName;

        public Supplier.Builder suppId(String suppId) {
            this.suppId=suppId;
            return this;
        }

        public Supplier.Builder suppName(String suppName) {
            this.suppName=suppName;
            return this;
        }

        public Supplier.Builder copy(Supplier supplier)
        {
            this.suppId = supplier.suppId;
            this.suppName = supplier.suppName;
            return this;
        }
        public Supplier build(){ return new Supplier(this);}


    }

}
