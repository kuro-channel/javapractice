// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �R���X�g���N�^�̊�{���

    �l�p�`��\��Square�N���X���쐬���Ă��������B
    Square�N���X���g�p����ConstructorBasicPractice�N���X��
    main���\�b�h�͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [Square�N���X]
    �P�D��width�ƍ���height(�ǂ����double�^)�̂Q�̃C���X�^���X
        �t�B�[���h�������܂��B

    �Q�D���ƍ����̏����l�������Ƃ��Ď󂯎��R���X�g���N�^�����݂��܂��B
        �󂯎���������l�����̂܂܊e�t�B�[���h�ɃZ�b�g���Ă��������B

    �R�D���ƍ����Ɋւ�������o�͂���inform���\�b�h(�����Ȃ��E�߂�l�Ȃ�)��
        ���݂��܂��B�o�͓��e�́A���s���ʂ��Q�l�ɂ��Ă��������B

    �S�D�ʐς��Z�o����getArea���\�b�h(�����Ȃ��E�߂�ldouble�^)�����݂��܂��B

    �T�D���̒l�������Ŏ󂯎��������������������addWidth���\�b�h
        (����double�^�E�߂�l�Ȃ�)�����݂��܂��B

    �y���s���ʁz
    ���̎l�p�`�̕���4.5�A������2.8�ł��B
    ���̎l�p�`�̖ʐς�12.6�ł��B

    ���̎l�p�`�̕���7.5�A������2.8�ł��B
    ���̎l�p�`�̖ʐς�21.0�ł��B

*/
public class ConstructorBasicPractice{

    public static void main(String[] args){

        // Square�N���X�̃I�u�W�F�N�g���쐬
        Square square = new Square(4.5, 2.8);

        // �l�p�`�̏����o��
        square.inform();

        // �ʐς̕\��
        System.out.println("���̎l�p�`�̖ʐς�" + square.getArea() + "�ł��B");

        // ����3.0����������
        square.addWidth(3.0);

        System.out.println();

        // �l�p�`�̏����o��
        square.inform();

        // �ʐς̕\��
        System.out.println("���̎l�p�`�̖ʐς�" + square.getArea() + "�ł��B");

    }

}

// ������Square�N���X���쐬���Ă�������

