// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    if���Ɖ��Z�Ɋւ�����

    double�^�̂Q�̕ϐ��i�g��height�Ƒ̏dweight�j������܂��B
    ���̂Q�̒l�̓L�[�{�[�h����󂯕t���܂��B
    
    ������
    Double.parseDouble(System.console().readLine())�̋L�q�́A�L�[�{�[�h����
    ������̓��͂��󂯕t���A�����double�^�ɕϊ�����v���O�����ł��B
    ����͂��̂܂ܗ��p���Ă��������B�������A�L�[�{�[�h����uABC�v�̂悤��
    ���͂��s���ƁAdouble�^�ɕϊ��ł����ɗ�O���X���[���܂��B

    ���̎菇�ɏ]���āA�얞�x�iBMI�j������s���Ă��������B

    �P�Ddouble�^�̕ϐ�bmi��錾���܂��B
    
    �Q�D�ϐ�bmi��BMI�l���i�[���܂��BBMI�l�̎Z�o���@�͈ȉ��̒ʂ�ł��B

        BMI = (�̏dkg) ���i�g��m�̓��j

    �R�D�ϐ�bmi�̒l�����̌`���ŏo�͂��܂��B

        �u���Ȃ���BMI�l�́����ł��v

    �S�D�Ō�ɁA�ϐ�bmi�̒l�ɉ����Ď��̂悤�ȃ��b�Z�[�W���o�͂��܂��B

        26.5�ȏ�        �c�u�얞�ł��v
        26.5����24�ȏ�  �c�u����C���ł��v
        24����20�ȏ�    �c�u���ʂł��v
        20����0�ȏ�     �c�u�X�����ł��v
        ����ȊO        �c�u�G���[�ł��v

    �y���s���ʁz
    �g���icm�j����͂��Ă�������
    170
    �̏d�ikg�j����͂��Ă�������
    88
    ���Ȃ���BMI�l��30.449826989619382�ł�
    �얞�ł�

    �y���s���ʁz
    �g���icm�j����͂��Ă�������
    170
    �̏d�ikg�j����͂��Ă�������
    55
    ���Ȃ���BMI�l��19.031141868512112�ł�
    �X�����ł�

*/
public class IfCalculatePractice{

    public static void main(String[] args){

        System.out.println("�g���icm�j����͂��Ă�������");
        double height = Double.parseDouble(System.console().readLine());

        System.out.println("�̏d�ikg�j����͂��Ă�������");
        double weight = Double.parseDouble(System.console().readLine());

        // BMI�l�̎Z�o�ƕ\��

    }

}
