#include <iostream>
#include <map>
#include <vector>

using namespace std;

int t, n;
map<string, vector<string>> mp;
string name, type;

int main() {
	cin >> t;
	for (int i=0; i<t; i++) {
		cin >> n;
		for (int j=0; j<n; j++) {
			cin >> name >> type;
			mp[type].push_back(name);
		}
		int result = 1;
		for (auto ret : mp) {
			result *= ret.second.size() + 1;
		}
		cout << result - 1 << '\n';
		mp.clear();
	}
	return 0;
}