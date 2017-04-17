package entity;

public class CodingUpdate
{
    private String TaxCode;

    public String getTaxCode ()
    {
        return TaxCode;
    }

    public void setTaxCode (String TaxCode)
    {
        this.TaxCode = TaxCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TaxCode = "+TaxCode+"]";
    }
}
