// 첫시도 못품

#include <iostream>
using namespace std;

int cnt[101], flag, mid;
string name, result;


int main() {
	cin >> name;
	for (char a : name) cnt[a]++;

	for (int i='Z'; i>='A'; i--) {
		if (cnt[i] > 0) {
			if (cnt[i] & 1) {
				mid = i;
				flag++;
			} 
			if (flag>1){break;}

			for(int j=0; j<cnt[i]/2; j++) {
				result = char(i) + result;
				result += char(i);
			}
		} 
	}

	if (flag > 1) {
		cout << "I'm Sorry Hansoo" <<'\n';
	} else {
		if (mid) {
			result.insert(result.begin()+result.size()/2, mid);
		}
		cout << result <<'\n';
	}



	return 0;
}