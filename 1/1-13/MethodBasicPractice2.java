// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    ���\�b�h��`�̊�{���Q

    main���\�b�h�͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    main���\�b�h���ŌĂяo���Ă���A�������Ƒ������̒l���A
    ��O�����̎�ނɂ���Čv�Z����calc���\�b�h���`���Ă��������B

    �������A�R�̈����̌^�͂��ׂ�int�^�Ƃ��A��O�����̒l��0�̂Ƃ���
    �����Z�A1�̂Ƃ��͈����Z�A2�̂Ƃ��͊|���Z�A3�̂Ƃ��͊���Z�Ƃ��܂��B
    ��O�����̒l��0�`3�ȊO�̏ꍇ�́A���E�������̒l�ɂ�����炸0��
    �Ԃ��Ă��������B

    �܂��A��������ɂ͕K��switch�����g�p���Ă��������B

    ������
    �����0�ɂ�鏜�Z(��O���X���[�����)�̑Ή��͕s�v�Ƃ��܂�

    �y���s���ʁz
    �����Z�F24
    �����Z�F12
    �|���Z�F108
    ����Z�F3

*/
public class MethodBasicPractice2{

    public static void main(String[] args){

        int a = 18;
        int b = 6;

        // calc���\�b�h�̌Ăяo��
        System.out.println("�����Z�F" + calc(a, b, 0));
        System.out.println("�����Z�F" + calc(a, b, 1));
        System.out.println("�|���Z�F" + calc(a, b, 2));
        System.out.println("����Z�F" + calc(a, b, 3));

    }

    // ������calc���\�b�h���`���Ă�������

}
