//This is the Tree.java file for World.java to run the full WorldTree program

public class Tree {

    // These variables store information about the tree.
    private String genus;
    private int height;
    private String size;

    // Keeps track of the tree's current season.
    private String season;

    // Constructor used when creating a new Tree object.
    public Tree(String genus, int height, String size) {
        this.genus = genus;
        this.height = height;
        this.size = size;

        // A new tree starts in Spring.
        this.season = "Spring";
    }

    // Returns the type of tree.
    public String getGenus() {
        return genus;
    }

    // Returns the current height of the tree.
    public int getHeight() {
        return height;
    }

    // Returns the size description of the tree.
    public String getSize() {
        return size;
    }

    // Returns the tree's current season.
    public String getSeason() {
        return season;
    }

    // Moves the tree forward to the next season.
    public void nextSeason() {

        // Determine which season comes next.
        if (season.equals("Spring")) {
            season = "Summer";
            summer();

        } else if (season.equals("Summer")) {
            season = "Fall";
            fall();

        } else if (season.equals("Fall")) {
            season = "Winter";
            winter();

        } else if (season.equals("Winter")) {
            season = "Spring";
            spring();
        }

        // Every time the tree moves to a new season,
        // it grows by 2 feet.
        height += 2;

        System.out.println("The tree has grown to " + height + " feet tall.");
        System.out.println();
    }

    // Describes what happens during Spring.
    public void spring() {
        System.out.println(
            "Spring has come, the " + genus +
            " tree's leaves are growing back."
        );
    }

    // Describes what happens during Summer.
    public void summer() {
        System.out.println(
            "Summer has come, the " + genus +
            " tree is flourishing."
        );
    }

    // Describes what happens during Fall.
    public void fall() {
        System.out.println(
            "Fall has come, the " + genus +
            " tree's leaves have changed color."
        );
    }

    // Describes what happens during Winter.
    public void winter() {
        System.out.println(
            "Winter has come, the " + genus +
            " tree's leaves have fallen off."
        );
    }
}
