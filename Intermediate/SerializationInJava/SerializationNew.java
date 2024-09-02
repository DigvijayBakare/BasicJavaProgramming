package SerializationInJava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Building implements Serializable {
    String buildingName;
    int numOfFlores;
    int numOfApartment;
    int numOfUnoccupied;
    int numOfOccupied;
    Building(String buildingName, int numOfFlores, int numOfApartment, int numOfUnoccupied, int numOfOccupied) {
        this.buildingName = buildingName;
        this.numOfFlores = numOfFlores;
        this.numOfApartment = numOfApartment;
        this.numOfUnoccupied = numOfUnoccupied;
        this.numOfOccupied = numOfOccupied;
    }
}
public class SerializationNew {
    public static void main(String[] args) {
        Building b = new Building("Lake Homes",25,100,15,85);
        String buildingFile = "Building_List";

        try {
            FileOutputStream file = new FileOutputStream(buildingFile);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(b);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
