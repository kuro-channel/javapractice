// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �񎟌��z��ƃ��\�b�h��`�̖��

    main���\�b�h�͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j
    main���\�b�h���ŌĂяo���Ă���A��������int�񎟌��z��^�̒l�̒�����A
    ��������int�^�̒l���������݂��邩���J�E���g����count���\�b�h���`
    ���Ă��������B

    �y���s���ʁz
    1�̌��F4
    7�̌��F3

*/
public class DoubleArrayMethodPractice{

    public static void main(String[] args){

        // int�񎟌��z��ϐ��̐錾�Ə�����
        int[][] arr = {{1, 5, 8}, {2, 4, 7}, {1, 9, 3, 5}, {4, 2},
                        {6, 1, 9, 4}, {7, 3, 8, 1}, {8, 4, 3, 9, 7}};

        // �������鐔�l�ϐ��̐錾�Ə�����
        int target = 1;

        // count���\�b�h�̌Ăяo��
        System.out.println(target + "�̌��F" + count(arr, target));

        // �������鐔�l�̕ύX
        target = 7;

        // count���\�b�h�̌Ăяo��
        System.out.println(target + "�̌��F" + count(arr, target));

    }

    // ������count���\�b�h���`���Ă�������


}
