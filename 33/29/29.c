/*#include<stdio.h>
#include<stdlib.h>
int main(){
	int i;
	int j;
	for (i = 0; i <= 5; i++){
		for (j = 0; j < 5-i; j++){
			putchar(' ');
		}
		for (j = 0; j < 2 * i + 1; j++){
			putchar('*');
		}
		putchar('\n');
	}
	system("pause");
	return 0;
}
#include<stdio.h>
#include<stdlib.h>
int main(){
	int i;
	int j;
	for (i = 1; i <=9; i++){
		for (j =1; j <= i; j++){
			printf("%d*%d=%d ",i,j, i*j);
		}
		printf("\n");
	}
	system("pause");
	return 0;
}*/
#include<stdio.h>
#include<stdlib.h>
int main(){
	int i;
	for (i = 0; i < 32; i+=2){
		printf("��д��ĸ%c��Ӧ��ASCII��%d |", i + 65, i + 65);

		printf("��д��ĸ%c��Ӧ��ASCII��%d\n", i + 66, i + 66);
	}
	system("pause");
	return 0;
}