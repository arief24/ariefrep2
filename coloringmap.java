/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coloring.map;

/**
 *
 * @author arief
 */

import java.io.*;
import java.util.*;

public class MapColor {

    public static void main(String[] args) throws IOException {

        ArrayList <String> statestemp = new ArrayList <String> ();
        ArrayList <State> states = new ArrayList <State> ();

        // read in each line
        BufferedReader reader = new BufferedReader(new FileReader("usa.txt"));
        String line = null;
        while ((line = reader.readLine()) != null) {
            statestemp.add(line);
        }
        reader.close();

        // create all state objects and adjacencies
        for (int i = 0; i < statestemp.size(); i++) {
            State st = new State();
            String[] str = statestemp.get(i).split(",");
            st.setName(str[0]);
            for (int j = 1; j < str.length; j++) {
                st.addAdj(str[j]);
            }
            states.add(st);
        }

        // set colors


        // print out states and adjacencies
        for (State s : states) {
            System.out.println("Name: " + s.getName());
            System.out.println("Color: " + s.getColor());
            System.out.print("Adj: ");
            s.getAdj();
            System.out.println();
            System.out.println();
        }

    }
}


