public class BmiService {
    public float calculate(float index, float weight) {
        float massIndex = index / (weight * weight);
        return massIndex;
    }
}
