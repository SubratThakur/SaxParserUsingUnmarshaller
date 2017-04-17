package entity;

public class Name
{
    private String Forename;

    private String Surname;

    public String getForename ()
    {
        return Forename;
    }

    public void setForename (String Forename)
    {
        this.Forename = Forename;
    }

    public String getSurname ()
    {
        return Surname;
    }

    public void setSurname (String Surname)
    {
        this.Surname = Surname;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Forename = "+Forename+", Surname = "+Surname+"]";
    }
}
