#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){//����ɼ�����С����
	int arr[12];
	int i,j;
	int tmp;
	printf("������ɼ�\n");
	for (i = 0; i < 12; i++){
		printf("arr[%d]=",i);
		scanf("%d", &arr[i]);
	}
	for (i = 0; i < 11; i++){
		for (j = i + 1; j < 12; j++){
			if (arr[i] < arr[j]){
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
	}
	for (i = 0; i < 12; i++){
		printf("%d\t", arr[i]);
		if (i == 3 || i == 7){
			printf("\n");
		}
	}
	system("pause");
	return 0;
}

#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
int main(){
	char a[10];
	char b[10];
	int i=0;
	printf("�������ַ���a��\n");
	gets(a);
	while (a[i] != '\0'){
		 b[i] = a[i];
		i++;
	}
	b[i] = '\0';
	printf("��ӡ�ַ���b\n");
	puts(b);
	system("pause");
	
}
#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
main()
{
	char s1[30], s2[30];
	int i = 0;
	printf("�������ַ���1:\n");
	gets(s1);
	while (s1[i] != '\0')
	{
		s2[i] = s1[i];
		i++;
	}
	s2[i] = '\0';
	printf("�ַ���2:\n");
	puts(s2);
	system("pause");
}
