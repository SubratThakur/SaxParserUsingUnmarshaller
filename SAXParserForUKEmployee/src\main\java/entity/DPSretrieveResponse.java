package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "DPSretrieveResponse", namespace="https://tpvs.hmrc.gov.uk/dps")
@XmlAccessorType(XmlAccessType.FIELD)
public class DPSretrieveResponse

{	
    @XmlElement(name="DPSdata")
    private DPSdata DPSdata;

    @XmlAttribute(required=true)
    private String xmlns;
    
    public DPSdata getDPSdata ()
    {
        return DPSdata;
    }

    public void setDPSdata (DPSdata DPSdata)
    {
        this.DPSdata = DPSdata;
    }
    
    public String getXmlns ()
    {
        return xmlns;
    }

    public void setXmlns (String xmlns)
    {
        this.xmlns = xmlns;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [DPSdata = "+DPSdata+", xmlns = "+xmlns+"]";
    }
}