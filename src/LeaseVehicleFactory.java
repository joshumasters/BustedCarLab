public class LeaseVehicleFactory
{
  public static Leaseable getLeasableVehicleByVin(String VIN)
  {
    Leaseable leaseable = null;
    
    // get the vehicle type, then lookup details in datastore
    String vehicleType = decodeVinForType(VIN);
    if(vehicleType.equals("Car"))
    {
      leasable = getCarDetails(VIN);
    }
    else if (VehicleType.equals("LightTruck"))
    {
      leasable = getTruckDetails(VIN);
    }
    // more types.  if not found return null
    return leaseable;
  }

private static String decodeVinForType(String vin) {
    return null;
}
}

// called in main as follows:

