package pavelkim.homework8;

public class ItProfessions {

    Skills skills = new Skills();
    int positionId;

    String name (int positionId) {
        return skills.position[positionId];
    }


    public String toString(int positionId) {
        return "ItProfessions{" +
                "positionId=" + positionId +
                ", position=" + name(positionId) +
                '}';
    }
}
