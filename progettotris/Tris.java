package progettotris;

public class Tris {

    private char[][] grid;
    private String g1, g2;
    private int turno;

    public Tris(String g1, String g2) {
        grid = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '|';
            }
        }
        this.g1 = g1;
        this.g2 = g2;
        turno = 0;
    }

    public String getG1() {
        return g1;
    }

    public String getG2() {
        return g2;
    }

    public String getGrid() {
        String out = "  1 2 3";
        for (int i = 0; i < 3; i++) {
            out += "\n"+(i+1);
            for (int j = 0; j < 3; j++) {
                out +=" "+grid[i][j];
            }
        }
        return out;
    }

    public int getTurno() {
        return turno;
    }

    public String getGiocatore() {
        String out;
        if (turno % 2 == 0) {
            out = g1;
        } else {
            out = g2;
        }
        return out;
    }

    public void gioca(int y, int x) {
        char segno = 'X';
        if (turno % 2 == 0) {
            segno = 'O';
        }
        grid[x - 1][y - 1] = segno;
        turno++;
    }

    private boolean trisOriz(char segno) {
        boolean out = false;

        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == segno && grid[i][1] == segno && grid[i][2] == segno) {
                out = true;
            }
        }
        return out;
    }

    private boolean trisVert(char segno) {
        boolean out = false;

        for (int i = 0; i < 3; i++) {
            if (grid[0][i] == segno && grid[1][i] == segno && grid[2][i]==segno) {
                out = true;
            }
        }
        return out;
    }

    private boolean trisDiag(char segno) {
        boolean out = false;

        if (grid[0][0] == segno && grid[1][1] == segno && grid[2][2] == segno){
            out = true;
        }
        if(grid[0][2] == segno && grid[1][1] == segno && grid[2][0] == segno){
            out = true;
        }
        return out;
    }
    
    private boolean controlloSegno(char segno){
        boolean out = false;
        if (trisDiag(segno) || trisOriz(segno) || trisVert(segno)) {
            out = true;
        }
        return out;
    }

    public boolean isVinta() {
        boolean out = false;
        char segno = 'X';
        
        if((turno-1)%2==0){
            segno = 'O';
        }
        if (controlloSegno(segno)) {
            out = true;
        }
        return out;
    }
    
    public String messVittoria(){
        String out ="complimenti ";
        if((turno-1)%2==0)
            out+=g1+" hai vinto!!";
        else
            out+=g2+" hai vinto!!";
        return out;
    }
    
    public boolean contCoor(int n){
        boolean out = false;
        
        if(n<1||n>3){
            out=true;
            System.out.println("Devi inserire un numero tra 1 e 3!!");
        }
            
        return out;
    }
    
    public boolean isOccupato(int x, int y){
        boolean out = false;
        if(grid[y-1][x-1]!='|'){
            out = true;
            System.out.println("Lo spazio selezionato è già occupato!!");
        }
            
        return out;
    }

    @Override
    public String toString() {
        String out = "turno " + turno + "\nO: " + g1 + "\tX: " + g2 + "\n" + getGrid();
        return out;
    }

}
