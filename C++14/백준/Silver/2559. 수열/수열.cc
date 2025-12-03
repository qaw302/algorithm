#include <iostream>
#include <vector>

using namespace std;

int n, k, t[100004], m, sum;
vector<int> v;

int main() {
	cin >> n >> k;
	for (int i=0; i<n; i++) {
		int temp;
		cin >> temp;
		v.push_back(temp);
	}

	for (int i=0; i<k; i++) {
		sum += v[i];
	}
	m = sum;

	for (int i=k; i<n; i++) {
		sum += v[i] - v[i-k];
		if (m < sum) {
			m = sum;
		}
	}

	cout << m << '\n';

	return 0;
}