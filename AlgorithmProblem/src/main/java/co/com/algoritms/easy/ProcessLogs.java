package co.com.algoritms.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ProcessLogs {

	public static List<String> processLogs(List<String> logs, int maxSpan) {
		
		Collections.sort(logs);

		Map<String, Long> map = new HashMap<>();

		for (int i = 0; i < logs.size(); i++) {
			if (logs.get(i).contains("sign-in") && logs.get(i + 1).contains("sign-out")) {
				long time = timeSign(logs, i, maxSpan);
				if (time != -1) {
					map.put(logs.get(i).split(" ")[0], time);
				}
				i = i + 2;
			}
		}

		List<String> result = new ArrayList<String>();
		List<Entry<String, Long>> list = new ArrayList(map.entrySet());
		list.sort(Entry.comparingByValue());
		list.forEach(a -> result.add(a.getKey()));
		return result;
	}

	public static long timeSign(List<String> logs, int index, int maxSpan) {
		long signIn = Long.parseLong(logs.get(index).split(" ")[1]);
		long signOut = Long.parseLong(logs.get(index + 1).split(" ")[1]);
		long result = signOut - signIn;
		if (result <= maxSpan) {
			return result;
		} else {
			return -1;
		}
	}
}
