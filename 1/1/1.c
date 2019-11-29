#include<stdio.h>
#include<stdlib.h>
int printMulForm£¨int n) {
	for (int i = 0; i < n; i++){
		for (int j = 0; j < i; j++){
			printf("%d*%d=%d ", i, j, i*j)
		}
		printf("\n");
	}
}
int main(){
	int n; 
	printf("input n:");
	scanf("%d", &n);
	printMulForm(n);
	system("pause");
	return 0;
}