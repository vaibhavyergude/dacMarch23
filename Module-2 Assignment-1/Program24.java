class Program24 {
    public static void main(String[] args) {
        // Convert float value to String
        float floatValue = 3.14f;
        String strValue = Float.toString(floatValue);
        System.out.println("Float value converted to String: " + strValue);

        // Convert float value to Float instance
        Float floatInstance = Float.valueOf(floatValue);
        System.out.println("Float value converted to Float instance: " + floatInstance);

        // Convert String instance to Float instance
        String strInstance = "3.14";
        Float floatInstance2 = Float.parseFloat(strInstance);
        System.out.println("String instance converted to Float instance: " + floatInstance2);

        // Convert float value to hexadecimal string
        int intBits = Float.floatToIntBits(floatValue);
        String hexString = Integer.toHexString(intBits);
        System.out.println("Float value converted to hexadecimal string: " + hexString);

    }
}
