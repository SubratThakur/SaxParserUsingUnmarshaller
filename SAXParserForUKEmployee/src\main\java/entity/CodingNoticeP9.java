package entity;

public class CodingNoticeP9
{
    private Name Name;

    private String IssueDate;

    private String EmployerRef;

    private CodingUpdate CodingUpdate;

    private String TaxYearEnd;

    private String WorksNumber;

    private String EffectiveDate;

    private String xmlns;

    private String SequenceNumber;

    private String NINO;

    private String FormType;

    public Name getName ()
    {
        return Name;
    }

    public void setName (Name Name)
    {
        this.Name = Name;
    }

    public String getIssueDate ()
    {
        return IssueDate;
    }

    public void setIssueDate (String IssueDate)
    {
        this.IssueDate = IssueDate;
    }

    public String getEmployerRef ()
    {
        return EmployerRef;
    }

    public void setEmployerRef (String EmployerRef)
    {
        this.EmployerRef = EmployerRef;
    }

    public CodingUpdate getCodingUpdate ()
    {
        return CodingUpdate;
    }

    public void setCodingUpdate (CodingUpdate CodingUpdate)
    {
        this.CodingUpdate = CodingUpdate;
    }

    public String getTaxYearEnd ()
    {
        return TaxYearEnd;
    }

    public void setTaxYearEnd (String TaxYearEnd)
    {
        this.TaxYearEnd = TaxYearEnd;
    }

    public String getWorksNumber ()
    {
        return WorksNumber;
    }

    public void setWorksNumber (String WorksNumber)
    {
        this.WorksNumber = WorksNumber;
    }

    public String getEffectiveDate ()
    {
        return EffectiveDate;
    }

    public void setEffectiveDate (String EffectiveDate)
    {
        this.EffectiveDate = EffectiveDate;
    }

    public String getXmlns ()
    {
        return xmlns;
    }

    public void setXmlns (String xmlns)
    {
        this.xmlns = xmlns;
    }

    public String getSequenceNumber ()
    {
        return SequenceNumber;
    }

    public void setSequenceNumber (String SequenceNumber)
    {
        this.SequenceNumber = SequenceNumber;
    }

    public String getNINO ()
    {
        return NINO;
    }

    public void setNINO (String NINO)
    {
        this.NINO = NINO;
    }

    public String getFormType ()
    {
        return FormType;
    }

    public void setFormType (String FormType)
    {
        this.FormType = FormType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Name = "+Name+", IssueDate = "+IssueDate+", EmployerRef = "+EmployerRef+", CodingUpdate = "+CodingUpdate+", TaxYearEnd = "+TaxYearEnd+", WorksNumber = "+WorksNumber+", EffectiveDate = "+EffectiveDate+", xmlns = "+xmlns+", SequenceNumber = "+SequenceNumber+", NINO = "+NINO+", FormType = "+FormType+"]";
    }
}
			
			
