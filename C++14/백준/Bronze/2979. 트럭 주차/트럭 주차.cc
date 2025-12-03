#include <iostream>
#include <map>
using namespace std;

int t[101];
int a,b,c;
map<int,int> mp;

int cnt;
int sum;

int main() {
	cin >> a >> b >> c;
	mp.insert({1, a});
	mp.insert({2, b});
	mp.insert({3, c});

	for (int i=0; i<3; i++) {
		int in=0;
		int out=0;
		cin >> in >> out;
		t[in]++;
		t[out]--;
	}

	for (int i=1; i<=100; i++) {
		sum += cnt * mp[cnt];
		cnt += t[i];
	}

	cout << sum << '\n';
	return 0;
}