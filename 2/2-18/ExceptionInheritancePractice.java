// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    ��O�ƌp���Ɋւ�����

    �d���̃g���u����\������g���u����O�N���XTroubleException
    �͂��łɊ������Ă��܂��B�܂��A�Ј���\������Ј����ۃN���X
    Employee�͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    ����ɁAExceptionInheritancePractice�N���X��main���\�b�h��
    ���łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    ���̎w���ɏ]���āA��i��\������Boss�N���X�ƁA������\������
    Subordinate�N���X���쐬���Ă��������B

    [Boss�N���X]
    �P�DEmployee�N���X���p�����܂��B

    �Q�D�����̕�����\��Subordinate�^�̃t�B�[���hsub���`���܂��B

    �R�D�Ј����iString�^�j�ƕ����I�u�W�F�N�g�iSubordinate�^�j������
      �Ƃ��Ď󂯎��R���X�g���N�^���`���܂��B
      �X�[�p�[�N���XEmployee��name�t�B�[���h�ɎЈ�����ݒ肵�Ă��������B
      �܂��ABoss�N���X�̃C���X�^���X�t�B�[���hsub�Ɉ����̕����I�u�W�F�N�g
      ��ݒ肵�Ă��������B

    �S�D����work���\�b�h���������Ă��������B
        �������A�uthrows TroubleException�v�̋L�q�͗v��܂���B
        (��i�̓g���u���̐ӔC�������Ŏ�邱�Ƃ��ł��邩��ł�)

        ���s���e��
       �u���āA����́����͕����́����ɔC���悤�I�v�Əo�͂��A�����I�u�W�F�N�g
        ��work���\�b�h�����s���܂��B�������A��O�������K�{�Ȃ̂Œ��ӂ��܂��傤�B

        �������g���u�����N�������ꍇ��catch�u���b�N�ŎӍ߂��܂��B���e��
       �u�\���󂲂����܂���c�v
       �u��������ώ���v���܂����c�v
       �u��i�̂킽���������̊ēs�s���͂��ł������܂��c�v
       �Əo�͂��܂��B

       �������g���u�����N�����Ȃ������ꍇ�́A
      �u�����N�A�悭������I�v
      �u���������̉E�r���I�v
       �Əo�͂��܂��B

    [Subordinate�N���X]
    �P�DEmployee�N���X���p�����܂��B

    �Q�D�Ј����iString�^�j�������Ƃ��Ď󂯎��R���X�g���N�^���`���܂��B
      �X�[�p�[�N���XEmployee��name�t�B�[���h�ɒl��ݒ肵�Ă��������B

    �R�D���O���擾����getName���\�b�h�i�����Ȃ��A�߂�lString�^�j��
        ��`���Ă��������B

    �S�D����work���\�b�h���������܂��B
      �uthrows TroubleException�v�̋L�q���Y��Ȃ��悤�ɂ��Ă��������B
       �i�����̓g���u���̐ӔC�������Ŏ��Ȃ�����ł��j

        ���s���e��
       �u����́����͂킽�����������S���v���܂��v
       �u�������c�v�ƕ\�����܂��B

       ��������͂Q��ɂP��A�L���Ă��܂��܂��B
       java.util�p�b�P�[�W��Random�N���X���C���X�^���X�����A
       nextBoolean�C���X�^���X���\�b�h�i�����Ȃ��A�߂�lboolean�^�j��
       �Ăяo���܂��B���̃��\�b�h��true��false�𔼁X�ŕԂ��܂��B
       true�̏ꍇ�́A�L���܂��B

       �L�����ꍇ�́u�ӂ�����ȁA�΂���Y�I�v�Ƃ��q�l�ɖ\����f����
       �g���u����O�I�u�W�F�N�g���X���[���܂��B

       �L���Ȃ������ꍇ�́u����́����͂킽���������������C�����ʂ����܂����v
       �ƕ\�����Ă��̂܂܏I�����܂��B


    �y���s����(�L�����ꍇ)�z
    ���āA����̓��Ӑ�Ƃ̎���͕����̗L�g�ɔC���悤�I

    ����̓��Ӑ�Ƃ̎���͂킽�����L�g���S���v���܂�
    ���Ӑ�Ƃ̎�����c
    �ӂ�����ȁA�΂���Y�I

    �\���󂲂����܂���c
    �L�g����ώ���v���܂����c
    ��i�̂킽�����㓇�̊ēs�s���͂��ł������܂��c


    �y���s����(�L���Ȃ������ꍇ)�z
    ���āA����̓��Ӑ�Ƃ̎���͕����̗L�g�ɔC���悤�I

    ����̓��Ӑ�Ƃ̎���͂킽�����L�g���S���v���܂�
    ���Ӑ�Ƃ̎�����c
    ����̓��Ӑ�Ƃ̎���͂킽�����L�g�������C�����ʂ����܂���

    �L�g�N�A�悭������I
    ���������̉E�r���I

*/
public class ExceptionInheritancePractice{

    public static void main(String[] args){

        // �����N���X�̃C���X�^���X�𐶐�
        Subordinate sub = new Subordinate("�L�g");

        // ��i�N���X�̃C���X�^���X�𐶐�
        Boss boss = new Boss("�㓇", sub);

        // ��i�̓������\�b�h�����s
        boss.work("���Ӑ�Ƃ̎��");

    }

}

// �g���u����O�N���X
class TroubleException extends Exception{}

//// �Ј����ۃN���X
//abstract class Employee{
//
//    // �Ј���
//    protected String name;
//
//    // �������ۃ��\�b�h
//    public abstract void work(String workName) throws TroubleException;
//
//}

// �����ɏ�i�N���X���쐬���Ă�������

// �����ɕ����N���X���쐬���Ă�������

