import java.io.*;
import java.util.*;

public class Solution {

    // 26의 거듭제곱 (0~11)
    private static final long[] POW26 = new long[12];

    static {
        POW26[0] = 1L;
        for (int i = 1; i <= 11; i++) {
            POW26[i] = POW26[i - 1] * 26L;
        }
    }

    public static void main(String[] args) throws Exception {
        // 표준 입력/출력 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 파싱 (n, m, m개의 금지 단어)
        String line = br.readLine();
        if (line == null || line.isEmpty()) {
            bw.write("입력이 비어 있습니다.\n");
            bw.flush();
            bw.close();
            br.close();
            return;
        }
        long targetIndex = Long.parseLong(line.trim());

        int bannedWordsCount = Integer.parseInt(br.readLine().trim());
        String[] bannedWords = new String[bannedWordsCount];

        int filled = 0;
        while (filled < bannedWordsCount) {
            String curr = br.readLine();
            if (curr == null) break;
            StringTokenizer st = new StringTokenizer(curr);
            while (st.hasMoreTokens() && filled < bannedWordsCount) {
                bannedWords[filled++] = st.nextToken();
            }
        }

        String answer = solution(targetIndex, bannedWords);

        bw.write(answer);
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }

    public static String solution(long targetIndex, String[] bannedWords) {
        // 1) 금지 단어를 길이별로 그룹화하고 정렬
        List<String>[] bannedWordsByLength = new ArrayList[12]; // [길이] 인덱스 사용
        for (int len = 0; len <= 11; len++) {
            bannedWordsByLength[len] = new ArrayList<>();
        }
        for (String word : bannedWords) {
            int len = word.length();
            if (1 <= len && len <= 11) {
                bannedWordsByLength[len].add(word);
            }
        }
        for (int len = 1; len <= 11; len++) {
            bannedWordsByLength[len].sort(Comparator.naturalOrder());
        }

        // 2) 목표 길이 L 결정: 길이 1부터 누적해서 targetIndex를 깎아나간다.
        int targetLength = -1;
        for (int len = 1; len <= 11; len++) {
            long totalThisLength = POW26[len];
            long bannedThisLength = bannedWordsByLength[len].size();
            long validThisLength = totalThisLength - bannedThisLength;

            if (targetIndex > validThisLength) {
                targetIndex -= validThisLength;
            } else {
                targetLength = len;
                break;
            }
        }

        if (targetLength == -1) {
            // 이 경우는 n이 유효 범위를 벗어난 비정상 입력
            return "";
        }

        // 3) 길이 targetLength 내부에서 사전순 targetIndex번째 문자열 찾기
        StringBuilder currentPrefix = new StringBuilder();
        for (int position = 1; position <= targetLength; position++) {
            for (char candidate = 'a'; candidate <= 'z'; candidate++) {
                currentPrefix.append(candidate);

                long blockCount = countAvailableWithPrefix(
                        currentPrefix.toString(),
                        targetLength,
                        bannedWordsByLength[targetLength]
                );

                if (targetIndex > blockCount) {
                    // 이 접두사 블록을 통째로 건너뜀
                    targetIndex -= blockCount;
                    currentPrefix.deleteCharAt(currentPrefix.length() - 1);
                } else {
                    // 이 문자로 확정하고 다음 자리로
                    break;
                }
            }
        }

        return currentPrefix.toString();
    }

    private static long countAvailableWithPrefix(String prefix, int totalLength, List<String> bannedSameLengthSorted) {
        int remaining = totalLength - prefix.length();
        long totalWithPrefix = POW26[remaining];

        // 금지 단어 중 이 prefix로 시작하는 개수
        long bannedWithPrefix = countBannedStartWith(bannedSameLengthSorted, prefix);

        return totalWithPrefix - bannedWithPrefix;
    }
    
    private static int countBannedStartWith(List<String> sortedList, String prefix) {
        if (sortedList.isEmpty()) return 0;
        int left = lowerBound(sortedList, prefix);
        String upperKey = prefix + '{';
        int right = lowerBound(sortedList, upperKey);
        return Math.max(0, right - left);
    }

    private static int lowerBound(List<String> sortedList, String key) {
        int idx = Collections.binarySearch(sortedList, key);
        if (idx < 0) {
            return -idx - 1;
        } else {
            // 같은 값이 여럿일 수는 없지만, lower_bound 의미로 왼쪽 끝을 찾아준다.
            while (idx > 0 && sortedList.get(idx - 1).equals(key)) {
                idx--;
            }
            return idx;
        }
    }
}