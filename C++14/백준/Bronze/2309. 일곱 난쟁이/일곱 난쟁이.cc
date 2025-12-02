#include<bits/stdc++.h>
using namespace std;

int a[9];
int main() {
	for(int i=0; i<9; i++) {
		cin >> a[i];
	}

	for(int i=0; i<8; i++) {
		for(int j=i+1; j<9; j++) {
			int sum=0;
			for (int k=0; k<9; k++) {
				if (k!=i & k!=j) {
					sum += a[k];
				}
			}
			if (sum == 100) {
				a[i]=0;
				a[j]=0;

				sort(a, a+9);
				for (int h : a) {
					if (h!=0){
						cout << h << "\n";
					}
				}
				return 0;
			}
		}
	}
	return 0;
}