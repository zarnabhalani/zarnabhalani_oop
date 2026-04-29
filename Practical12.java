class Volume {
    double calculateVolume(double side) {
        return side * side * side;
    }
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    double calculateVolume(int radius) {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
    public static void main(String[] args) {
        Volume v = new Volume();
        double cube = v.calculateVolume(3);
        double cuboid = v.calculateVolume(4, 5, 6);
        double sphere = v.calculateVolume(2);

        System.out.println("Cube Volume: " + cube);
        System.out.println("Rectangular Cube Volume: " + cuboid);
        System.out.println("Sphere Volume: " + sphere);
    }
}
