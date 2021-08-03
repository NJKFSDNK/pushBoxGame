package Word1_5;

import java.util.Scanner;

public class word1_5 {
	public static void main(String[] args) {
		int [][] map = {{1,1,0,0,0,0,1,1,1,1},
				{1,0,1,1,1,1,0,0,0,1},
				{1,0,1,2,2,3,1,1,6,0},
				{0,1,5,1,3,1,3,1,6,6},
				{1,0,1,3,1,3,1,1,6,6},
				{1,0,1,1,1,0,0,0,0,0},
				{1,1,0,0,0,1,1,1,1,1}};
		
		int playerX=3;
		int playerY=2;
		int win = 0;
		Scanner input = new Scanner(System.in);
		int playerX1=0;
		int playerY1=2;
//		
		while(true) {
			for(int i=0; i<7; i++) {
				for(int j=0; j<10; j++) {
					switch (map[i][j]) {
					case 0:
						System.out.print("🟫");
						break;
					case 1:
						System.out.print("🟩");
						break;
					case 2:
						System.out.print("🔥");
						break;
					case 3:
						System.out.print("📦");
						break;
					case 5:
						System.out.print("👩");
						break;
					case 6:
						System.out.print("⛳");
						break;
					case 7:
						System.out.print("👏");
						break;
					case 8:
						System.out.print("👩");
						break;

					default:
						break;
					}
					
				}
				System.out.println("");
			}
			if(win==5) {
				System.out.println("恭喜你闯关成功！！！");
				break;
			}
			
			String player = input.next();
			player=player.toLowerCase();
			switch (player) {
			case "w":
				if(map[playerX-1][playerY]==1) {
					map[playerX-1][playerY]=5;
					playerX1 = playerX-1;
					if(map[playerX][playerY]==5) {
						map[playerX][playerY]=1;
					}else if(map[playerX][playerY]==8) {
						map[playerX][playerY]=6;
					}
					playerX = playerX1;
					continue;
				}else if(map[playerX-1][playerY]==3) {
					if(map[playerX-2][playerY]==1) {
						map[playerX-1][playerY]=5;
						playerX1 = playerX-1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}
						map[playerX-2][playerY]=3;
						playerX = playerX1;
						continue;
					}else if(map[playerX-2][playerY]==6) {
						map[playerX-2][playerY]=7;
						win++;
						map[playerX-1][playerY]=5;
						playerX1 = playerX-1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}
						playerX = playerX1;
						continue;
					}
				}else if(map[playerX-1][playerY]==6) {
					map[playerX-1][playerY]=8;
					playerX1=playerX-1;
					if(map[playerX][playerY]==5) {
						map[playerX][playerY]=1;
					}else if(map[playerX][playerY]==8) {
						map[playerX][playerY]=6;
					}
					playerX = playerX1;
					continue;
				}else if(map[playerX-1][playerY]==7) {
//					0:墙 1:地  2：障碍物   3：箱子   5：人   6：目的地  7.箱子加目的地 8.人加目的地
					if(map[playerX-2][playerY]==1) {
						map[playerX-1][playerY]=8;
						playerX1 = playerX-1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}
						map[playerX-2][playerY]=3;
						win--;
						playerX = playerX1;
						continue;
					}else if(map[playerX-2][playerY]==6) {
						map[playerX-2][playerY]=7;
						map[playerX-1][playerY]=8;
						playerX1 = playerX-1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}	
						playerX = playerX1;
						continue;
					}
					
				}
				break;
			case "s":
				if(map[playerX+1][playerY]==1) {
					map[playerX+1][playerY]=5;
					playerX1 = playerX+1;
					if(map[playerX][playerY]==5) {
						map[playerX][playerY]=1;
					}else if(map[playerX][playerY]==8) {
						map[playerX][playerY]=6;
					}
					playerX = playerX1;
					continue;
				}else if(map[playerX+1][playerY]==3) {
					if(map[playerX+2][playerY]==1) {
						map[playerX+1][playerY]=5;
						playerX1 = playerX+1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}
						map[playerX+2][playerY]=3;
						playerX = playerX1;
						continue;
					}else if(map[playerX+2][playerY]==6) {
						map[playerX+2][playerY]=7;
						win++;
						map[playerX+1][playerY]=5;
						playerX1 = playerX+1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}
						playerX = playerX1;
						continue;
					}
				}else if(map[playerX+1][playerY]==6) {
					map[playerX+1][playerY]=8;
					playerX1 = playerX+1;
					if(map[playerX][playerY]==5) {
						map[playerX][playerY]=1;
					}else if(map[playerX][playerY]==8) {
						map[playerX][playerY]=6;
					}
					playerX = playerX1;
					continue;
				}else if(map[playerX+1][playerY]==7) {
//					0:墙 1:地  2：障碍物   3：箱子   5：人   6：目的地  7.箱子加目的地 8.人加目的地
					if(map[playerX+2][playerY]==1) {
						map[playerX+1][playerY]=8;
						playerX1 = playerX+1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}
						map[playerX+2][playerY]=3;
						win--;
						playerX = playerX1;
						continue;
					}else if(map[playerX+2][playerY]==6) {
						map[playerX+2][playerY]=7;
						map[playerX+1][playerY]=8;
						playerX1 = playerX+1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}	
						playerX = playerX1;
						continue;
					}
					
				}
				break;
			case "a":
				if(map[playerX][playerY-1]==1) {
					map[playerX][playerY-1]=5;
					playerY1 = playerY-1;
					if(map[playerX][playerY]==5) {
						map[playerX][playerY]=1;
					}else if(map[playerX][playerY]==8) {
						map[playerX][playerY]=6;
					}
					playerY = playerY1;
					continue;
				}else if(map[playerX][playerY-1]==3) {
					if(map[playerX][playerY-2]==1) {
						map[playerX][playerY-1]=5;
						playerY1 = playerY-1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}
						map[playerX][playerY-2]=3;
						playerY = playerY1;
						continue;
					}else if(map[playerX][playerY-2]==6) {
						map[playerX][playerY-2]=7;
						win++;
						map[playerX][playerY-1]=5;
						playerY1 = playerY-1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}
						playerY = playerY1;
						continue;
					}
				}else if(map[playerX][playerY-1]==6) {
					map[playerX][playerY-1]=8;
					playerY1 = playerY-1;
					if(map[playerX][playerY]==5) {
						map[playerX][playerY]=1;
					}else if(map[playerX][playerY]==8) {
						map[playerX][playerY]=6;
					}
					playerY = playerY1;
					continue;
				}else if(map[playerX][playerY-1]==7) {
//					0:墙 1:地  2：障碍物   3：箱子   5：人   6：目的地  7.箱子加目的地 8.人加目的地
					if(map[playerX][playerY-2]==1) {
						map[playerX][playerY-1]=8;
						playerY1 = playerY-1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}
						map[playerX][playerY-2]=3;
						win--;
						playerX = playerX1;
						continue;
					}else if(map[playerX][playerY-2]==6) {
						map[playerX][playerY-2]=7;
						map[playerX][playerY-1]=8;
						playerY1 = playerY-1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}	
						playerY = playerY1;
						continue;
					}
					
				}
				break;
			case "d":
				if(map[playerX][playerY+1]==1) {
					map[playerX][playerY+1]=5;
					playerY1 = playerY+1;
					if(map[playerX][playerY]==5) {
						map[playerX][playerY]=1;
					}else if(map[playerX][playerY]==8) {
						map[playerX][playerY]=6;
					}
					playerY = playerY1;
					continue;
				}else if(map[playerX][playerY+1]==3) {
					if(map[playerX][playerY+2]==1) {
						map[playerX][playerY+1]=5;
						playerY1 = playerY+1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}
						map[playerX][playerY+2]=3;
						playerY = playerY1;
						continue;
					}else if(map[playerX][playerY+2]==6) {
						map[playerX][playerY+2]=7;
						win++;
						map[playerX][playerY+1]=5;
						playerY1 = playerY+1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}
						playerY = playerY1;
						continue;
					}
				}else if(map[playerX][playerY+1]==6) {
					map[playerX][playerY+1]=8;
					playerY1 = playerY+1;
					if(map[playerX][playerY]==5) {
						map[playerX][playerY]=1;
					}else if(map[playerX][playerY]==8) {
						map[playerX][playerY]=6;
					}
					playerY = playerY1;
					continue;
				}else if(map[playerX][playerY+1]==7) {
//					0:墙 1:地  2：障碍物   3：箱子   5：人   6：目的地  7.箱子加目的地 8.人加目的地
					if(map[playerX][playerY+2]==1) {
						map[playerX][playerY+1]=8;
						playerY1 = playerY+1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}
						map[playerX][playerY+2]=3;
						win--;
						playerX = playerX1;
						continue;
					}else if(map[playerX][playerY+2]==6) {
						map[playerX][playerY+2]=7;
						map[playerX][playerY+1]=8;
						playerY1 = playerY+1;
						if(map[playerX][playerY]==5) {
							map[playerX][playerY]=1;
						}else if(map[playerX][playerY]==8) {
							map[playerX][playerY]=6;
						}	
						playerY = playerY1;
						continue;
					}
					
				}
				break;

			default:
				break;
			}
			
			
			
			
		

		
	}

}}
