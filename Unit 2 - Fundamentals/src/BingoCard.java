public class BingoCard {
	public static void main(String args[]) {
        String[][] bingoCard = new String[6][5];
        bingoCard[0][0] = "B";
        bingoCard[0][1] = "I";
        bingoCard[0][2] = "N";
        bingoCard[0][3] = "G";
        bingoCard[0][4] = "O";
        for(int x = 1;x<=5;x++) {
            bingoCard[x][0] = (int) (Math.random()*15) + "";
        }
        for(int x = 1;x<=5;x++) {
            bingoCard[x][1] = (int) (Math.random()*14)+16 + "";
     
        }
        for(int x = 1;x<=5;x++) {
            bingoCard[x][2] = (int) (Math.random()*14)+31 + "";
            if(bingoCard[3][2] != "F") {
                bingoCard[3][2] = "F";
            }
        }
   
        for(int x = 1;x<=5;x++) {
            bingoCard[x][3] = (int) (Math.random()*14)+46 + "";
         
        }
        for(int x = 1;x<=5;x++) {
            bingoCard[x][4] = (int) (Math.random()*14)+61 + "";
          
        }



        for(int i = 0;i<bingoCard.length;i++) {
            for(int j = 0;j<bingoCard.length-1;j++) {
                System.out.print(bingoCard[i][j]+"\t");
                if(j==4) {
                    System.out.println("");
                }
            }
        }

    }
}
