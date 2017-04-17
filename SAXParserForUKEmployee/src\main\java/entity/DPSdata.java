package entity;

public class DPSdata
{
    private CodingNoticeP9 CodingNoticeP9;

    private String xmlns;

    private DPSheader DPSheader;

    public CodingNoticeP9 getCodingNoticeP9 ()
    {
        return CodingNoticeP9;
    }

    public void setCodingNoticeP9 (CodingNoticeP9 CodingNoticeP9)
    {
        this.CodingNoticeP9 = CodingNoticeP9;
    }

    public String getXmlns ()
    {
        return xmlns;
    }

    public void setXmlns (String xmlns)
    {
        this.xmlns = xmlns;
    }

    public DPSheader getDPSheader ()
    {
        return DPSheader;
    }

    public void setDPSheader (DPSheader DPSheader)
    {
        this.DPSheader = DPSheader;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [CodingNoticeP9 = "+CodingNoticeP9+", xmlns = "+xmlns+", DPSheader = "+DPSheader+"]";
    }
}
