#define  _CRT_SECURE_NO_WARNINGS  
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

#define ROWS 3
#define COLS 3

void menu(){//菜单函数，输出可供选择
		printf("******************\n");
		printf("****1,PLAY********\n");
		printf("****0,EXIT********\n");
		printf("********************\n");
		
	
}
void init_board(char arr[ROWS][COLS], int x, int y){//初始化函数
	int i = 0;
	int j = 0;
	for (i = 0; i < ROWS; i++){
		for (j = 0; j < COLS; j++){
			arr[i][j] = ' ';//将一个二维数组初始化为一个空字符
		}
		putchar('\n');
	}
}
void dispiay_board(char arr[ROWS][COLS]){//显示棋盘函数
	int i = 0;
	for (i = 0; i < ROWS; i++){
		if (i < 2){//在前两行输出下方的棋盘
			printf(" %c| %c| %c\n", arr[i][0], arr[i][1], arr[i][2]);
			printf("---|---|---\n");
		}
		else{
			printf(" %c| %c| %c\n", arr[i][0], arr[i][1], arr[i][2]);
		}
	}
}
void player_move(char arr[ROWS][COLS]){//玩家下棋函数
	int i = 0;
	int j = 0;
	printf("请输入坐标：");
	while (1){
		scanf("%d %d", &i, &j);
		if ((i >= 1 && i <= ROWS) && (j >= 1 && j >= ROWS)){//判断输入坐标是否正确
			i--;
			j--;
		}
		if (arr[i][j] = ' '){
			arr[i][j] = 'x';
			break;
		}
		else
			printf("请重新输入坐标：");
	}
}
int full(char arr[ROWS][COLS]){
	int i = 0;
	int j = 0;
	int count = 0;
	for (i = 0; i < ROWS; i++){
		for (j = 0; j < COLS; j++){
			if (arr[i][j] != 0){
				count++;
			}
		}
	}
	return count;
}
void com_move(char arr[ROWS][COLS]){//电脑行走函数
	int a = 0;
	int b = 0;
	while (1){
		a = rand() % 3;//对a在区间的随机数
		b = rand() % 3;//对b在区间的随机数
		if (arr[a][b] = ' '){//电脑选取位置
			arr[a][b] = 'o';
			break;
		}
	}
}
int check_win(char arr[ROWS][COLS], int c){//判断输赢
	int i=0;
	int j;
	for (i = 0; i < ROWS; i++){
		for (j = 0; j < COLS; j++){
			if (arr[i][0] == 'x'&&arr[i][1] == 'x',
				arr[i][0] == 'x'&&arr[i][2] == 'x')
				return 1;
			else if ((arr[0][j] == 'x'&&arr[1][j] == 'x',
				arr[0][j] == 'x'&&arr[2][j] == 'x')||
				(arr[0][0] == 'x'&&arr[1][1] == 'x',
				arr[0][0] == 'x'&&arr[2][2] == 'x')||
				(arr[0][2] == 'x'&&arr[1][1] == 'x',
				arr[0][2] == 'x'&&arr[2][0] == 'x'))
				return 1;
		}
	}
	for (i = 0; i < ROWS; i++){
		for (j = 0; j < COLS; j++)
			if (arr[i][0] == 'o'&&arr[i][1] == 'o',
				arr[i][0] == 'o'&&arr[i][2] == '0')
				return 2;
			else if ((arr[0][j] == 'o'&&arr[1][j] == 'o',
				arr[0][j] == 'o'&&arr[2][j] == 'o') ||
				(arr[0][2] == 'o'&&arr[1][1] == 'o',
				arr[0][2] == '0'&&arr[2][0] == 'o') ||
				(arr[0][0] == 'o'&&arr[1][1] == 'o',
				arr[0][0] == '0'&&arr[2][2] == 'o'))
				return 2;
		}
		if (full == 9)
			return '9';
		return ' ';
}
void game(){
	char board[ROWS][COLS];//创建一个符合条件的二维数组
	int i = 0;
	int j = 0;
	int m = 0;
	int ret = 0;
	init_board(board, ROWS, COLS);//初始化一个二维数组
	display_board(board);//显示一个初始化的棋盘
	while (1){
		player_move(board);//玩家先走
		printf("\n");
		display_board(board);//玩家走完显示一次棋盘
		ret = full(board);
		m = check_win(board, ret);
		if (m == 1){
			printf("你赢了！\n\n");
			break;
		}
		else{
			if (ret == 9){
				printf("你个菜鸡。平局\n");
				break;
			}
			else{
				printf("电脑下：\n\n");
				srand((unsigned)time(NULL));//随机数
				com_move(board);//电脑走
				m = check_win(board, ret);//判输赢
				display_board(board);
				if (m == 2){
					printf("你个菜鸡连电脑都玩不过\n\n");
					break;
				}
				else if (ret){
					if (ret == 9){
						printf("你个垃圾,平局\n");
						break;
					}
				}
				else
					continue;
			}
		}
	}
}
int main(){
	int input = 0;
	do{
		menu();
		printf("请输入你的选项：");
		scanf("%d", &input);
		switch (input){
		case 1:
			game();
			break;
		case 0:
			exit(0);
		default:
			break;
		}
	} while (input);
	system("pause");
		return 0;
}
