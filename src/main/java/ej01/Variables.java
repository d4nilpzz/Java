package ej01;

import java.util.*;

public class Variables {

    // Byte can be from -128 up to 127
    public Byte _byte = 0;

    // Short can be from -32.768 up to 32.767
    public Short _short = 0;

    // Short can be from -2.147.483.648 a 2.147.483.647
    public Integer _int = 0;

    /*
    * Short can be from -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
    * Also this variable need to have at the end of the var an "L"
    */
    public Long _long = 0L;

    /*
    * Float can storage decimal numbers like pi
    * Also this variable need to have at the end of the var an "F"
    */
    public Float _float = 3.14F;

    /*
    * Double can storage decimal numbers in 8 bytes for more precision
    * Also this variable need to have at the end of the var an "D"
    */
    public Double _double = 3.14D;

    // Char must be inside this '' not ""
    public Character _char = 'a';

    // Use 1 bit to indicate if it's true or false
    public Boolean _boolean = true;

    // ----------------------------------------------------------------- //

    // String is a sequence of characters (text)
    public String _string = "Hello";

    // Array of integers (fixed size)
    public int[] _intArray = {1, 2, 3};

    // ArrayList is a dynamic list
    public List<String> _list = new ArrayList<>();

    // HashMap stores key-value pairs
    public Map<String, Integer> _map = new HashMap<>();

    // HashSet stores unique values (no duplicates)
    public Set<String> _set = new HashSet<>();

    // ----------------------------------------------------------------- //

    // Static variable belongs to the class, not instances
    public static int _staticInt = 10;

    // Final variable can't be changed once assigned
    public final double _finalPi = 3.1416;

    // Static final (constant)
    public static final String COUNTRY = "Spain";

    // Variable local (inside method)
    public void method() {
        int _local = 0;
    }
}
