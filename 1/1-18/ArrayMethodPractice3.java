/*

    �z��ƃ��\�b�h��`�̖��R

    main���\�b�h�͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j
    main���\�b�h���ŌĂяo���Ă���A�Q��int�z��I�u�W�F�N�g�������Ɏ��A
    ���ʂ��鐔�l�̌��𒲂ׂĖ߂�l�Ƃ��ĕԂ�common���\�b�h���`���Ă��������B
    �i����̃T���v���ł�10�A17�A38�A55�̂S�̐��l���Q�̔z��ɋ��ʂ��Ă��܂��j


    �y���s���ʁz
    ���ʂ��鐔�l�̌��F4

 */
public class ArrayMethodPractice3 {

	public static void main(String[] args) {

		int[] arr = { 13, 90, 10, 79, 101, 25, 123, 38, 5, 16, 64, 55, 17 };
		int[] arr2 = { 38, 118, 26, 17, 41, 53, 10, 88, 92, 102, 67, 22, 55 };

		// common���\�b�h�̌Ăяo��
		System.out.println("���ʂ��鐔�l�̌��F" + common(arr, arr2));

	}

	// ������common���\�b�h���`���Ă�������
	private static int common(int[] arr, int[] arr2) {
		// ���ʂ��鐔�l�̌�
		int count = 0;
		for (int item1: arr) {
			for(int item2: arr2) {
				if(item1 == item2) {
					count++;
				}
			}
		}
		return count;
	}
}