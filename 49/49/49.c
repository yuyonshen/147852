//�������Ǹ����ݣ��Ƚ��Ǹ������е������ҵ����ٽ������������
/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	int i;
	int *p;
	int arr[10];
	printf("������ʮ�����ݣ�\n");
	for (i = 0; i < 10; i++){
		scanf("%d", &arr[i]);
	}
	p = arr;
	find(p,10);
	system("pause");
	return 0;
}
int find(int *p,int n){
	int sum = 0;
	int i;
	for (i = 0; i < n; i++){
		if (*(p + i) % 2 != 0){
			printf("%d\n", *(p + i));
			sum = sum + *(p + i);
		}
		}
	printf("sum=%d", sum);
}*/
//����ָ��ð������
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int  pailie(int *p, int n){
	int i;
	int t;
	int j;
	for (i = 0; i < n - 1; i++){
		for (j = 0; j < n - 1 - i; j++){
			if (*(p + j)>*(p + j + 1)){
				t = *(p + j);
				*(p + j) = *(p + j + 1);
				*(p + j + 1) = t;
			}
		}
	}
	printf("���кõ����飺\n");
	for (i = 0; i < n; i++){
		if (i % 5 == 0){
			printf("\n");
		}
		printf("%d\t", *(p + i));
	}
	printf("\n");
	return 0;
}
int main(){
	int a[20];
	int i;
	int n;
	printf("���������������\n");
	scanf("%d", &n);
	printf("����������ԭ����\n");
	for (i = 0; i < n; i++){
		scanf("%d", &a[i]);
	}
	pailie(a, n);
	system("pause");
	return 0;
}
