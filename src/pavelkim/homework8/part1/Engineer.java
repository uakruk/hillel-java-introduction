package pavelkim.homework8.part1;

public class Engineer {

    public static void main(String[] args) {
        BusinessCenter businessCenter = new BusinessCenter();
        Company company = new Company();
        ItProfessions itProfessions= new ItProfessions();
        Skills skills = new Skills();

        businessCenter.costPerMonth = 1000;
        businessCenter.name = "Gulliver";
        businessCenter.numberOfFlour = 30;
        System.out.println("BC info" + businessCenter.toString());

        company.name = "KC";
        company.size = 100;
        System.out.println("Company name = " + company.name + ", number of employees = " + company.size + "\n And we: " + company.slogan("Love cats"));

        skills.experience = 5;
        skills.softSkills = false;
        skills.wrightCode = false;
        itProfessions.positionId = 0;
        int position = itProfessions.positionId;
        itProfessions.name(position);
        System.out.println(itProfessions.toString(position));

    }

}
