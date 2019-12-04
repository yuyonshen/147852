#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define MAX_ROW 9
#define MAX_COL 9
#define MAX_COUNT 10
int Menu(){//��ӡ�˵�������ѡ����
	printf("***********************\n");
	printf("*******1,��ʼ��Ϸ******\n");
	printf("*******0,������Ϸ******\n");
	printf("***********************\n");
	int choice = 0;
	printf("���������ѡ��");
	scanf("%d", &choice);
	return choice;
}
void Init(char show_map[][MAX_COL], char mine_map[][MAX_COL]){//��ʼ������
	int row ;
	int col ;
	for (row = 0; row < MAX_ROW; row++){
		for (col = 0; col < MAX_COL; col++){
			show_map[row][col] = '*';//��ʼ������
			mine_map[row][col] = '0';//��ʼ������
			
		}
		putchar('\n');
	}
}
void Proland(char mine_map[][MAX_COL], int r, int c){//��ʼ�����׺���
	int count = MAX_COUNT;
	while (count){
		int row = rand() % MAX_ROW;
		int col = rand() % MAX_COL;
		if ((mine_map[row][col] == '0')//
			&((row< r - 1) || (row > r + 1) || (col<c - 1)
			|| (col>c + 1))){
			mine_map[row][col] ='1';
			--count;
		}
	}
}
void Print(char show_map[][MAX_COL]){
	int row = 0;
	int col = 0;
	printf(" |");
	for (int i = 0; i < MAX_COL; i++){
		printf("%d", i);
	}
		printf("\n----------------------------");
		for (row = 0; row < MAX_ROW;++col){
			printf("\n%d|", row);
		for (row = 0; col < MAX_COL; col++){
			printf("%c", show_map[row][col]);
		}
	}
	printf("\n");
}
void Printover(char mine_map[][MAX_COL]){
	int i;
	int j;
	printf(" |");
	for (i = 0; i < MAX_COL; i++){
		printf("%d", i);
		printf("\n--------------------------");
		for (j = 0; j < MAX_COL; j++){
			if (mine_map[i][j] == '1'){
				printf("!");
			}
			else
				printf("0");
		}
		printf("\n");
	}
}

int Minenum(const char mine_map[][MAX_COL], int row, int col){
	int count = 0;
	if ((row - 1 >= 0) && (col - 1 >= 0) && (mine_map[row - 1][col - 1] == '1'))
		++count;
	if ((row - 1 >= 0) && (mine_map[row - 1][col] == '1'))
		++count;
	if ((row - 1 >= 0) && (col + 1 <= MAX_COL) && (mine_map[row - 1][col - 1] == '1'))
		++count;
	if ((col - 1 >= 0) && (mine_map[row][col - 1] == '1'))
		++count;
	if ((col + 1 >= MAX_COL) && (mine_map[row][col + 1] == '1'))
		++count;
	if ((row + 1 <= MAX_ROW) && (mine_map[row - 1][col] == '1'))
		++count;
	if ((row + 1 <= MAX_ROW) && (col + 1 <= MAX_COL) && (mine_map[row + 1][col + 1] == '1'))
		++count;
	if((row + 1 <= MAX_ROW) && (col + 1 <= MAX_COL) && (mine_map[row + 1][col + 1] == '1'))
		++count;
	return(count);
}
int Leapmine(char show_map[][MAX_COL]){
	int count = 0;
	int row;
	int col;
	for (row = 0; row < MAX_ROW; row++){
		for (col = 0; col < MAX_COL; col++){
			if (show_map[row][col] == '*')
				++count;
		}
	}
	return count;
}
void Game(){
	int row=0;
	int col=0;
	srand((unsigned)time(NULL));
	char show_map[MAX_ROW][MAX_COL];
	char mine_map[MAX_ROW][MAX_COL];
	Init(show_map, mine_map);
	Proland(mine_map, row, col);
	printf("��������Ҫ���������꣺");
	while (1){
		Init(show_map, mine_map);
		scanf("%d%d", &row, &col);
		if (row < 0 || row >= MAX_ROW || col < 0 || col >= MAX_COL){
			printf("��������������������룺");
			continue;
		}
		else
			break;
	}

	Proland(mine_map, row, col);//��ʼ�����飬��showȫ����ʼ��*.��mineȫ����ʼ��0
	show_map[row][col] = Minenum(mine_map, row, col) + '0';
	while (1){
		system("cls");
		printf("\n\n");
		printf("��������Ҫ���������꣺");
		while (1){
			scanf("%d%d", &row, &col);
			if (row < 0 || row >= MAX_ROW || col < 0 || col >= MAX_COL){
				printf("���������������");
				continue;
			}
			else if (show_map[row][col] != '*'){
				printf("��������ѱ�������");
				continue;
			}
			else
				break;

		}
		if (mine_map[row][col] == '1'){
			printf("�������");
			Printover(mine_map);
			break;
		}
		else{
			show_map[row][col] = Minenum(mine_map, row, col) + '0';
		}
		if (Leapmine(show_map) == MAX_COUNT){
			printf("��ϲ�㣬�ɹ�ɨ��");
			break;
		}
	}
}
int main(){
	while(1){
		int choice=Menu();
		if (choice == 1){
			Game();
		}
		else if (choice == 0){
			printf("goodbay\n");
			break;
		}
		else
			printf("�����������\n");
	}
	system("pause");
	return 0;
}