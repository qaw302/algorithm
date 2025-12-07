// 1차시 못품

#include <iostream>
using namespace std;

int a[15000], n, m, result;

int main() {
	cin >> n;
	cin >> m;
	if (m > 200000) {
		cout << 0 << '\n';
		return 0;
	}

	for (int i=0; i<n; i++) {
		cin >> a[i];
	}
	for (int i=0; i<n; i++) {
		for (int j=i+1; j<n; j++) {
			if (a[i] + a[j] == m) {
				result++;
			}
		}
	}
	cout << result << '\n';
	
 	return 0;
}