public record Conversor (double conversion_result) {
    @Override
    public String toString() {
        return "Resultado" + conversion_result;
    }
}