package SerializationInJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationNew {
    public static void main(String[] args) {
        Building b = null;
        String buildingFile = "Building_List";

        try {
            FileInputStream file = new FileInputStream(buildingFile);
            ObjectInputStream in = new ObjectInputStream(file);
            b = (Building)in.readObject();
            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println("Building name: "+b.buildingName+"\nNumber of flores: "+b.numOfFlores+
                    "\nNumber of apartments: "+b.numOfApartment+"\nNumber of unoccupied apartments: "+b.numOfUnoccupied+
                    "\nNumber of occupied apartments: "+b.numOfOccupied);
        } catch (IOException | ClassNotFoundException io) {
            io.printStackTrace();
        }
    }
}
