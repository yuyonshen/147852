//ѭ�����ƿκ���
//���0-100���ܱ�����������
#include<stdio.h>
#include<stdlib.h>
int main(){
	int i;
	for (i = 0; i <= 100; i++){
		if (i % 3 != 0){
			printf("i=%d\n", i);
		}
	}
	system("pause");
	return 0;
}
#include<stdio.h>
#include<stdlib.h>//ʹ��forѭ����ӡ��д��ĸ��Ӧ��ASCII��
int main(){
	int i;
	for (i = 0; i < 26; i=i+2){
		printf("��ĸ %c ��Ӧ��ASCII��Ϊ %d  ��  ", i + 65, i + 65);

		printf("��ĸ %c ��Ӧ��ASCII��Ϊ %d \n", i + 66, i + 66);
	}
	system("pause");
	return 0;
}