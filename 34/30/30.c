//��ӡһ����ά�����ҳ�һ���Խ����öԽ��ߵ������
/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int arr[3][3];
	int i;
	int j;
	int add=0;
	for (i = 0; i < 3; i++){
		for (j = 0; j < 3;j++){
			printf("arr[%d][%d]=",i, j);
			scanf("%d", &arr[i][j]);
		}
	}
	for (i = 0; i < 3; i++){
		for (j = 0; j < 3; j++){
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
	for (i = 0; i < 3; i++){
		for (j = 0; j < 3; j++){
			if (i == j){
				add =add+ arr[i][j];
			}
		}
	}
	printf("add=%d\n", add);
	system("pause");
	return 0;
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
//���ö�ά�����ӡһ����ʯ
#include<stdio.h>
#include<stdlib.h>
int main(){
	char a[][5] = { { ' ', ' ', '*', ' ', ' ' }, { ' ', '*', ' ', '*', ' ' },
	{ '*', ' ', ' ', ' ', '*' }, { ' ', '*', ' ', '*', ' ' },
	{ ' ', ' ', '*', ' ', ' ' } };
	int i;
	int j;
	for (i = 0; i <5; i++){
		for (j = 0; j <5; j++){
			printf("%c", a[i][j]);
		}
		printf("\n");
	}
	system("pause");
	return 0;
}
//�����ַ������ж��ж��ٸ�����
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	char a[100];
	int b;
	int word = 1;
	char c;
	gets(a);
	if (a[0] == '\0'){
		printf("����������ַ�����");
	}
	else if(a[0]==' '){
		printf("����ַ����ǿյ�");
	}
	else{
		for (b = 0; a[b] != '\0'; b++){
			
			if (a[b] == ' '){
				word++;
			}
		}
		printf("%d\n", word);
	}
	system("pause");
	return 0;
}*/
//ѡ���������飬����С���˳�����
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int arr[10];
	int i, j;
	int tmp;
	int z;
	for (i = 0; i < 10; i++){
		printf("a[%d]=", i);
		scanf("%d", &arr[i]);
	}
	for (i = 0; i < 9; i++){//�������ѭ��
		tmp = arr[i];
		z = i;
		for (j = i + 1; j < 10; j++){
			if (arr[j] < tmp){
				tmp = arr[j];
				z = j;
			}
		}
		arr[z] = arr[i];
		arr[i] = tmp;
	}
	for (i = 0; i < 10; i++){
		printf("%d\t", arr[i]);
		if (i == 4){
			putchar('\n');
		}
	}
	system("pause");
	return 0;
}