#include<stdio.h>
#include<stdlib.h>
/*int main(){//����������м���һ�ĸ���
	int num = 10;
	int count = 0;
	while (num){
		if (num % 2 == 0){
			count++;
		}
		num = num / 2;
	}
	printf("%d", count);
	system("pause");
	return 0;
}*/
int main(){
	int num = 10;
	int count = 0;
	int i = 0;
	for (i = 0; i < 32; i++){
		if (((num >> i) & 1) == 1){
			count++;
		}
	}
	printf("count=%d", count);
	system("pause");
	return 0;
}