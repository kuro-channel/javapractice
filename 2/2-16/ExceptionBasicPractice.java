// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    ��O�Ɋւ����{���

    ExceptionBasicPractice�N���X��main���\�b�h�͈ꉞ
    �������Ă��܂��B

    4200�Ƃ����l���R�}���h���C�������Ŏw�肵���l�Ŋ���A
    ���̌v�Z���ʂ��o�͂���v���O�����ł��B

    �������A���̂R�̓_�ŕs���S�ł��B

    �s�s���S�ȗ��R�P�t 

        �R�}���h���C�������Ȃ��Ŏ��s�����ArrayIndexOutOfBoundsException
        ��O���X���[����Ă��܂�

    �s�s���S�ȗ��R�Q�t

        �R�}���h���C�������ɐ����ɕϊ��ł��Ȃ���������w�肷���NumberFormatException
        ��O���X���[����Ă��܂�

    �s�s���S�ȗ��R�R�t

        �R�}���h���C��������0���w�肷���0����ɂ��ArithmeticException
        ��O���X���[����Ă��܂�

    �����̓_���A���̏����𖞂����悤�ɉ��P���Ă��������B

    �P�D�����̗�O���O�����itry-catch���j�ɂĕߑ����A���̂悤�ȃ��b�Z�[�W��
        �o�͂��Ă��������B

        �s���S�ȗ��R�P�̏ꍇ����u�R�}���h���C���������w�肵�Ă��������v

        �s���S�ȗ��R�Q�̏ꍇ����u�R�}���h���C�������ɂ͐������w�肵�Ă��������v

        �s���S�ȗ��R�R�̏ꍇ����u�R�}���h���C�������ɂ�0�ȊO�̐������w�肵�Ă��������v

    �Q�D�v���O�����̍Ō�ɂ͐���I���E�ُ�I���Ɋ֌W�Ȃ��u�v���O�������I�����܂��v�Ƃ���
        ���b�Z�[�W��\�����Ă��������B

    ������
    �����R�̗�O�́u�񌟍���O�v�Ƃ����A�ʏ�͗�O�������܂���B

    �y���s���ʁz
    >java ExceptionBasicPractice
    �R�}���h���C���������w�肵�Ă�������
    �v���O�������I�����܂�

    �y���s���ʁz
    >java ExceptionBasicPractice A
    �R�}���h���C�������ɂ͐������w�肵�Ă�������
    �v���O�������I�����܂�

    �y���s���ʁz
    >java ExceptionBasicPractice 0
    �R�}���h���C�������ɂ�0�ȊO�̐������w�肵�Ă�������
    �v���O�������I�����܂�

    �y���s���ʁz
    >java ExceptionBasicPractice 12
    ����Z�̌��ʂ�350�ł�
    �v���O�������I�����܂�

*/
public class ExceptionBasicPractice{

    public static void main(String[] args){

        // ���q�ϐ�
        int numerator = 4200;

        // ����ϐ�
        int denominator;

        // �R�}���h���C�������𐮐��l�ɕϊ�����
        denominator = Integer.parseInt(args[0]);

        // ����Z���ʕϐ��ɑ��
        int result = numerator / denominator;

        System.out.println("����Z�̌��ʂ�" + result + "�ł�");

    }

}
