import java.util.Random;

public class Player {
    private String name;
    private int score, nBattles, level;

    //Constructor

    public Player(String name, int score, int nBattles, int level){
        this.name = name;
        this. score = score;
        this. nBattles = nBattles;
        this.level = level;
    }

    //Gets and Sets

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getnBattles() {
        return nBattles;
    }

    public void setnBattles(int nBattles) {
        this.nBattles = nBattles;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //Methods

    public int UpdateScore(int score){
        return score+10;
    }

    public int LevelUp(int level){
        return level++;
    }

    public String Info(){
        return "Player: "+this.name+"\nScore: "+this.score+"\nBattles: "+this.nBattles+"\nLevel: "+this.level;
    }

    public void battle(Player opponet){
        if(this.level>opponet.level){
            this.level++;
            this.score=this.score+10;
            this.nBattles++;
            opponet.score=opponet.score-10;
            opponet.nBattles++;
            System.out.println(this.name+" vs "+opponet.name+"\n");
            System.out.println("Winner: "+this.name+"\nLevel "+this.name+": "+this.level+"\nScore "+this.name+": "+this.score+"\nBattles "+this.name+": "+this.nBattles+
            "\nLoser: "+opponet.name+"\nLevel "+opponet.name+": "+opponet.level+"\nScore "+opponet.name+": "+opponet.score+"\nBattles "+opponet.name+": "+opponet.nBattles+"\n");
        }else if(this.level<opponet.level){
            opponet.level++;
            opponet.score=opponet.score+10;
            opponet.nBattles++;
            this.score=this.score-10;
            this.nBattles++;
            System.out.println(this.name+" vs "+opponet.name+"\n");
            System.out.println("Winner: "+opponet.name+"\nLevel "+opponet.name+": "+opponet.level+"\nScore "+opponet.name+": "+opponet.score+"\nBattles "+opponet.name+": "+opponet.nBattles+
            "\nLoser: "+this.name+"\nLevel "+this.name+": "+this.level+"\nScore "+this.name+": "+this.score+"\nBattles "+this.name+": "+this.nBattles+"\n");
        }else if(this.nBattles>opponet.nBattles){
            this.level++;
            this.score=this.score+10;
            this.nBattles++;
            opponet.score=opponet.score-10;
            opponet.nBattles++;
            System.out.println(this.name+" vs "+opponet.name+"\n");
            System.out.println("Winner: "+this.name+"\nLevel "+this.name+": "+this.level+"\nScore "+this.name+": "+this.score+"\nBattles "+this.name+": "+this.nBattles+
            "\nLoser: "+opponet.name+"\nLevel "+opponet.name+": "+opponet.level+"\nScore "+opponet.name+": "+opponet.score+"\nBattles "+opponet.name+": "+opponet.nBattles+"\n");
        }else if(this.nBattles<opponet.nBattles){
            opponet.level++;
            opponet.score=opponet.score+10;
            opponet.nBattles++;
            this.score=this.score-10;
            this.nBattles++;
            System.out.println(this.name+" vs "+opponet.name+"\n");
            System.out.println("Winner: "+opponet.name+"\nLevel "+opponet.name+": "+opponet.level+"\nScore "+opponet.name+": "+opponet.score+"\nBattles "+opponet.name+": "+opponet.nBattles+
            "\nLoser: "+this.name+"\nLevel "+this.name+": "+this.level+"\nScore "+this.name+": "+this.score+"\nBattles "+this.name+": "+this.nBattles+"\n");
        }else if(this.score>opponet.score){
            this.level++;
            this.score=this.score+10;
            this.nBattles++;
            opponet.score=opponet.score-10;
            opponet.nBattles++;
            System.out.println(this.name+" vs "+opponet.name+"\n");
            System.out.println("Winner: "+this.name+"\nLevel "+this.name+": "+this.level+"\nScore "+this.name+": "+this.score+"\nBattles "+this.name+": "+this.nBattles+
            "\nLoser: "+opponet.name+"\nLevel "+opponet.name+": "+opponet.level+"\nScore "+opponet.name+": "+opponet.score+"\nBattles "+opponet.name+": "+opponet.nBattles+"\n");
        }else if(this.score<opponet.score){
            opponet.level++;
            opponet.score=opponet.score+10;
            opponet.nBattles++;
            this.score=this.score-10;
            this.nBattles++;
            System.out.println(this.name+" vs "+opponet.name+"\n");
            System.out.println("Winner: "+opponet.name+"\nLevel "+opponet.name+": "+opponet.level+"\nScore "+opponet.name+": "+opponet.score+"\nBattles "+opponet.name+": "+opponet.nBattles+
            "\nLoser: "+this.name+"\nLevel "+this.name+": "+this.level+"\nScore "+this.name+": "+this.score+"\nBattles "+this.name+": "+this.nBattles+"\n");
        }else{
            Random random = new Random();
            float randomNumber = random.nextFloat(); //gera um numero de [0 a 1[;
            if(randomNumber<0.5){
                this.level++;
                this.score=this.score+10;
                this.nBattles++;
                opponet.score=opponet.score-10;
                opponet.nBattles++;
                System.out.println(this.name+" vs "+opponet.name+"\n");
                System.out.println("Winner: "+this.name+"\nLevel "+this.name+": "+this.level+"\nScore "+this.name+": "+this.score+"\nBattles "+this.name+": "+this.nBattles+
                "\nLoser: "+opponet.name+"\nLevel "+opponet.name+": "+opponet.level+"\nScore "+opponet.name+": "+opponet.score+"\nBattles "+opponet.name+": "+opponet.nBattles+"\n");
            }else{
                opponet.level++;
                opponet.score=opponet.score+10;
                opponet.nBattles++;
                this.score=this.score-10;
                this.nBattles++;
                System.out.println(this.name+" vs "+opponet.name+"\n");
                System.out.println("Winner: "+opponet.name+"\nLevel "+opponet.name+": "+opponet.level+"\nScore "+opponet.name+": "+opponet.score+"\nBattles "+opponet.name+": "+opponet.nBattles+
                "\nLoser: "+this.name+"\nLevel "+this.name+": "+this.level+"\nScore "+this.name+": "+this.score+"\nBattles "+this.name+": "+this.nBattles+"\n");
            }
        }
    }
    
}
