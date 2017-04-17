package entity;

public class DPSheader
{
    private String Service;

    private String DataType;

    private String HighWaterMark;

    private String VendorID;

    private String EntityType;

    private String Got;

    private String MoreData;

    private String NItemsReturned;

    private String Timestamp;

    private String Entity;

    private String NItems;

    public String getService ()
    {
        return Service;
    }

    public void setService (String Service)
    {
        this.Service = Service;
    }

    public String getDataType ()
    {
        return DataType;
    }

    public void setDataType (String DataType)
    {
        this.DataType = DataType;
    }

    public String getHighWaterMark ()
    {
        return HighWaterMark;
    }

    public void setHighWaterMark (String HighWaterMark)
    {
        this.HighWaterMark = HighWaterMark;
    }

    public String getVendorID ()
    {
        return VendorID;
    }

    public void setVendorID (String VendorID)
    {
        this.VendorID = VendorID;
    }

    public String getEntityType ()
    {
        return EntityType;
    }

    public void setEntityType (String EntityType)
    {
        this.EntityType = EntityType;
    }

    public String getGot ()
    {
        return Got;
    }

    public void setGot (String Got)
    {
        this.Got = Got;
    }

    public String getMoreData ()
    {
        return MoreData;
    }

    public void setMoreData (String MoreData)
    {
        this.MoreData = MoreData;
    }

    public String getNItemsReturned ()
    {
        return NItemsReturned;
    }

    public void setNItemsReturned (String NItemsReturned)
    {
        this.NItemsReturned = NItemsReturned;
    }

    public String getTimestamp ()
    {
        return Timestamp;
    }

    public void setTimestamp (String Timestamp)
    {
        this.Timestamp = Timestamp;
    }

    public String getEntity ()
    {
        return Entity;
    }

    public void setEntity (String Entity)
    {
        this.Entity = Entity;
    }

    public String getNItems ()
    {
        return NItems;
    }

    public void setNItems (String NItems)
    {
        this.NItems = NItems;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Service = "+Service+", DataType = "+DataType+", HighWaterMark = "+HighWaterMark+", VendorID = "+VendorID+", EntityType = "+EntityType+", Got = "+Got+", MoreData = "+MoreData+", NItemsReturned = "+NItemsReturned+", Timestamp = "+Timestamp+", Entity = "+Entity+", NItems = "+NItems+"]";
    }
}