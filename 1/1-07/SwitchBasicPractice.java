// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    switch���̊�{���

    int�^�̕ϐ�month���錾���Ă���܂��B�ϐ�month�͌���\���Ă��܂��B

    ������
    Integer.parseInt(System.console().readLine())�̋L�q�́A�L�[�{�[�h����
    ������̓��͂��󂯕t���A�����int�^�ɕϊ�����v���O�����ł��B
    ����͂��̂܂ܗ��p���Ă��������B�������A�L�[�{�[�h����uABC�v�̂悤��
    ���͂��s���ƁAint�^�ɕϊ��ł����ɗ�O���X���[���܂��B

    �ϐ�month�̒l��1,3,5,7,8,10,12�̏ꍇ�́u������31���܂ł���܂��v
    �ƕ\�����A4,6,9,11�̏ꍇ�́u������30���܂ł���܂��v�ƕ\�����܂��B
    2�̏ꍇ�́u2����28�A�܂���29���܂ł���܂��v�ƕ\�����܂��B

    �܂��A�ϐ�month�̒l��1 �` 12 �ȊO�̒l�̏ꍇ�́u�G���[�v��
    �\�����Ă��������B

    ��������ɂ͕K��switch�����g�p���Ă��������B
    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    �y���s���ʁz
    ������͂��Ă�������
    1
    1����31���܂ł���܂�

    �y���s���ʁz
    ������͂��Ă�������
    2
    2����28�A�܂���29���܂ł���܂�

    �y���s���ʁz
    ������͂��Ă�������
    4
    4����30���܂ł���܂�

    �y���s���ʁz
    ������͂��Ă�������
    13
    �G���[

*/
public class SwitchBasicPractice{

    public static void main(String[] args){

        System.out.println("������͂��Ă�������");

        int month = Integer.parseInt(System.console().readLine());

        // switch���̊J�n


    }

}
