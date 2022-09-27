import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListAPI {
    /**
     * List.of : 고정 크기의 리스트 반환 -> 요소 제거하거나 추가할려고 하면 UnsupportedOperationException 발생
     * Stream.of
     * new ArrayList<>(Collection)
     * removeIf : List 를 따로 깊은 복사 할 필요 없이 동적으로 List 내의 요소를 제거
     * replaceAll
     */
    public static void main(String[] args) {
        List<String> exampleList =
                Stream.of("수박", "참외", "바나나", "딸기", "토마토", "수영", "토익", "나루토", "김밥")
                        .collect(Collectors.toList());
//                new ArrayList<>(List.of("수박", "참외", "바나나", "딸기", "토마토", "수영", "토익", "나루토", "김밥"));

//        for (String s : exampleList) {
//            if (s.contains("수")) {
//                exampleList.remove(s); // ConcurrentModificationException 발생
//            }
//        }

        // 깊은 복사 후 진행
//        List tempList = new ArrayList();
//        for (String s : exampleList) {
//            if (!s.contains("수")) {
//                tempList.add(s);
//            }
//        }

        // removeIf 이용
        exampleList.removeIf(s -> s.contains("수"));
        System.out.println("result = " + exampleList);
    }
}
