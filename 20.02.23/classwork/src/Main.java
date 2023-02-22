public class Main {
    public static void main(String[] args) {
        Sniper s1 = new Sniper(5860145, 7, 1000, 1000);

        System.out.println(s1.getId());
        System.out.println(s1.getCode());
        System.out.println(s1.getShootsFired());
        System.out.println(s1.getShootsOnTarget());

        s1.setId(15487);
        s1.setCode(77);
        s1.setShootsFired(1000);
        s1.setShootsOnTarget(888);

        System.out.println("Your shots hit percent is : " + s1.percentHit());
    }
}