// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �I�[�o�[���[�h�̊�{���

    �t���R�[�X�𒲗�����V�F�t��\��Chef�N���X���쐬���Ă��������B
    Chef�N���X���g�p����OverloadBasicPractice�N���X��main���\�b�h
    �͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j
    �܂��A�e��H�ނ�\����Egg�N���X�A��Rice�N���X�A����Milk�N���X�A
    �`�[�YCheese�N���X�����łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    Chef�N���X�ɂ́A�C���X�^���X�t�B�[���h�͂���܂���B
    ������\������cook���\�b�h�݂̂����݂��܂��B
    �icook���\�b�h�̖߂�l�͗�������\��String�^�ł��j

    �����œn�����H�ރI�u�W�F�N�g�ɉ����ĉ��L���s���ʂ����Ƃ�
    ���������������Ă��������B

    �y���s���ʁz
    �P�i�ڂ̓X�N�����u���G�b�O�ł�
    �Q�i�ڂ̓I�����C�X�ł�
    �R�i�ڂ̓��]�b�g�ł�
    �S�i�ڂ̓v�f�B���O�ł�

*/
public class OverloadBasicPractice{

    public static void main(String[] args){

        // �V�F�t�I�u�W�F�N�g�̐���
        Chef chef = new Chef();

        // �H�ރI�u�W�F�N�g�̐���
        Egg egg = new Egg();
        Rice rice = new Rice();
        Milk milk = new Milk();
        Cheese cheese = new Cheese();

        // �V�F�t���t���R�[�X�𒲗����܂�
        System.out.println("�P�i�ڂ�" + chef.cook(egg, cheese) + "�ł�");
        System.out.println("�Q�i�ڂ�" + chef.cook(rice, egg) + "�ł�");
        System.out.println("�R�i�ڂ�" + chef.cook(rice, cheese) + "�ł�");
        System.out.println("�S�i�ڂ�" + chef.cook(milk, egg) + "�ł�");

    }

}

// �e��H�ރN���X
class Egg{}
class Rice{}
class Milk{}
class Cheese{}

// ������Chef�N���X���쐬���Ă�������

