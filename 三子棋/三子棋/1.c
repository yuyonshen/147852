#define  _CRT_SECURE_NO_WARNINGS  
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>

#define ROWS 3
#define COLS 3

void menu(){//�˵�����������ɹ�ѡ��
		printf("******************\n");
		printf("****1,PLAY********\n");
		printf("****0,EXIT********\n");
		printf("********************\n");
		
	
}
void init_board(char arr[ROWS][COLS], int x, int y){//��ʼ������
	int i = 0;
	int j = 0;
	for (i = 0; i < ROWS; i++){
		for (j = 0; j < COLS; j++){
			arr[i][j] = ' ';//��һ����ά�����ʼ��Ϊһ�����ַ�
		}
		putchar('\n');
	}
}
void dispiay_board(char arr[ROWS][COLS]){//��ʾ���̺���
	int i = 0;
	for (i = 0; i < ROWS; i++){
		if (i < 2){//��ǰ��������·�������
			printf(" %c| %c| %c\n", arr[i][0], arr[i][1], arr[i][2]);
			printf("---|---|---\n");
		}
		else{
			printf(" %c| %c| %c\n", arr[i][0], arr[i][1], arr[i][2]);
		}
	}
}
void player_move(char arr[ROWS][COLS]){//������庯��
	int i = 0;
	int j = 0;
	printf("���������꣺");
	while (1){
		scanf("%d %d", &i, &j);
		if ((i >= 1 && i <= ROWS) && (j >= 1 && j >= ROWS)){//�ж����������Ƿ���ȷ
			i--;
			j--;
		}
		if (arr[i][j] = ' '){
			arr[i][j] = 'x';
			break;
		}
		else
			printf("�������������꣺");
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
void com_move(char arr[ROWS][COLS]){//�������ߺ���
	int a = 0;
	int b = 0;
	while (1){
		a = rand() % 3;//��a������������
		b = rand() % 3;//��b������������
		if (arr[a][b] = ' '){//����ѡȡλ��
			arr[a][b] = 'o';
			break;
		}
	}
}
int check_win(char arr[ROWS][COLS], int c){//�ж���Ӯ
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
	char board[ROWS][COLS];//����һ�����������Ķ�ά����
	int i = 0;
	int j = 0;
	int m = 0;
	int ret = 0;
	init_board(board, ROWS, COLS);//��ʼ��һ����ά����
	display_board(board);//��ʾһ����ʼ��������
	while (1){
		player_move(board);//�������
		printf("\n");
		display_board(board);//���������ʾһ������
		ret = full(board);
		m = check_win(board, ret);
		if (m == 1){
			printf("��Ӯ�ˣ�\n\n");
			break;
		}
		else{
			if (ret == 9){
				printf("����˼���ƽ��\n");
				break;
			}
			else{
				printf("�����£�\n\n");
				srand((unsigned)time(NULL));//�����
				com_move(board);//������
				m = check_win(board, ret);//����Ӯ
				display_board(board);
				if (m == 2){
					printf("����˼������Զ��治��\n\n");
					break;
				}
				else if (ret){
					if (ret == 9){
						printf("�������,ƽ��\n");
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
		printf("���������ѡ�");
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
