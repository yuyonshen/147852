//�Զ�Ϊ�����ҳ�ÿһ�е����ֵ��
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int a[3][4];
	int(*p)[4];
	p = &a[0];
	printf("���������֣�\n");
	for (int i = 0; i < 3; i++){
		for (int j = 0; j < 4; j++){
			scanf("%d", &a[i][j]);
		}
	}
	MAX(p, 3);
	system("pause");
	return 0;
}
int MAX(int *(a)[4], int m){
	int i;
	int j;
	int v;
	int sum = 0;
	for (i = 0; i < m; i++){
		v = *(*(a + i));
		for (j = 0; j < 4; j++){
			if (*(*(a + i) + j)>v){
				v = *(*(a + i) + j);
			}
			sum = sum + v;
		}
		printf("��%d�У��������ǣ�%d\n",i, v);
	}
	printf("%d\n", sum);
	return 0;
}