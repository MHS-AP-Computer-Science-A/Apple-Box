public class AppleBoxTester
{
    public static void main(String[] args)
    {
        // -------------------------------
        // TEST 1 — Example from the prompt
        // Expected: 3 pies when poundsPerPie = 2.0
        // -------------------------------
        Apple[][] test1 = {
            { new Apple(0.3,false), new Apple(0.4,false), new Apple(0.35,false), new Apple(0.5,false), new Apple(0.45,false), new Apple(0.4,true) },
            { new Apple(0.42,false), new Apple(0.38,false), new Apple(0.33,false), new Apple(0.4,false), new Apple(0.41,false), new Apple(0.44,false) },
            { new Apple(0.32,false), new Apple(0.44,false), new Apple(0.35,true),  new Apple(0.49,false), new Apple(0.29,false), new Apple(0.32,false) },
            { new Apple(0.3,false), new Apple(0.4,false), new Apple(0.35,false), new Apple(0.5,false), new Apple(0.45,false), new Apple(0.4,false) }
        };

        AppleBox crate1 = new AppleBox(test1);
        System.out.println("Test 1 result: " + crate1.numberOfPies(2.0));
        System.out.println("Expected: 3\n");


        // -------------------------------
        // TEST 2 — No rotten apples
        // Should use ALL apples
        // -------------------------------
        Apple[][] test2 = {
            { new Apple(1.0,false), new Apple(1.0,false) },
            { new Apple(1.0,false), new Apple(1.0,false) }
        };

        AppleBox crate2 = new AppleBox(test2);
        System.out.println("Test 2 result: " + crate2.numberOfPies(2.0));
        System.out.println("Expected: 2\n");


        // -------------------------------
        // TEST 3 — Rotten apple blocks neighbors
        // Only one usable apple remains
        // -------------------------------
        Apple[][] test3 = {
            { new Apple(1.0,false), new Apple(1.0,true) },
            { new Apple(1.0,false), new Apple(1.0,false) }
        };

        AppleBox crate3 = new AppleBox(test3);
        System.out.println("Test 3 result: " + crate3.numberOfPies(1.0));
        System.out.println("Expected: 1\n");


        // -------------------------------
        // TEST 4 — Rotten apple in the center
        // Should remove 4 neighbors + itself
        // -------------------------------
        Apple[][] test4 = {
            { new Apple(0.5,false), new Apple(0.5,false), new Apple(0.5,false) },
            { new Apple(0.5,false), new Apple(0.5,true),  new Apple(0.5,false) },
            { new Apple(0.5,false), new Apple(0.5,false), new Apple(0.5,false) }
        };

        AppleBox crate4 = new AppleBox(test4);
        System.out.println("Test 4 result: " + crate4.numberOfPies(1.0));
        System.out.println("Expected: 2\n");
    }
}
