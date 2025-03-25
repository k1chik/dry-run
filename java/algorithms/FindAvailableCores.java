public class FindAvailableCores {
    public static void main(String[] args) {
        int availableCores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available Cores: " + availableCores);
    }
    
}
