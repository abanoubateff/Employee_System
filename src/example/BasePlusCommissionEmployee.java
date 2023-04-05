
package example;

public class BasePlusCommissionEmployee extends CommissionEmployee {
  
        private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

   
    @Override
    public double earning()
    {
    return base + super.earning();
    }
    
    
      
    public void Displayearnings()
    {
    System.out.println("Earning = " + earning());
    }
    
    public void Displayalldetails()
  {
  super.Displayalldetails();
  Displayearnings();
  }
    
}
