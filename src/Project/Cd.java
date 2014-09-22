/*
 /*
 * Programmer: Amandeep Kaur
 * Program:TheShipment.java
 * Date:08 Apr 2014
 */
package Project;

import java.util.Scanner;

public class Cd {

    private String name;
    private String director;
    private int year;
    private String type;
    private int _id;
    private double _price;

    Cd() {

    }

    Cd(int id, String movieName, String directorName, 
            String movieType, int yearReleased, double price) {

        name = movieName;
        director = directorName;
        year = yearReleased;
        type = movieType;
        _id = id;
        _price = price;

    }

    Cd load(Scanner scanner) {
        Cd loadCd = null;
        try {
            String Info = scanner.nextLine();
            String[] list = Info.split("\\,");
            String id = list[0];
            int convertedId = Integer.parseInt(id);
            String _name = list[1];
            String _director = list[2];
            String _type = list[3];
            String _year = list[4];
            int change = Integer.parseInt(_year);
            String price = list[5];
            double convertedPrice = Double.parseDouble(price);

            loadCd = new Cd(convertedId, _name, _director, 
                    _type, change, convertedPrice);

        } catch (NullPointerException | NumberFormatException e) {
            System.out.print("input values  not right");
        }
        return loadCd;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the _id
     */
    public int getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(int _id) {
        this._id = _id;
    }

    /**
     * @return the _price
     */
    public double getPrice() {
        return _price;
    }

    /**
     * @param _price the _price to set
     */
    public void setPrice(double _price) {
        this._price = _price;
    }

}
