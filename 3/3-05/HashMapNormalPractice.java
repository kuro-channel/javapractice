// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    HashMap�Ɋւ���W�����

    �󕨂�\������Treasure�N���X�ƁA���ɂ�\������
    StrongBox�N���X�A�閧�̌��t�Ɋւ����O��\������
    IllegalSecretException��O�N���X��DuplicateSecretException
    ��O�N���X���쐬���Ă��������B

    ���̂S�̃N���X���g�p����HashMapNormalPractice�N���X��
    main���\�b�h�͊��Ɋ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [Treasure�N���X]
    �P�D�󕨂̃^�C�v��\������type�C���X�^���X�t�B�[���h(String�^)
        ���`���܂��B

    �Q�D�^�C�v�̒l���󂯎��R���X�g���N�^���`���܂��B
        �^�C�v�̒l���C���X�^���X�t�B�[���h�ɐݒ肵�܂��B

    �R�D�I�u�W�F�N�g�̕�����\����Ԃ����߂�toString���\�b�h��
        �I�[�o�[���C�h���܂��B�߂�l�Ƃ��ĕԂ��l�́Atype�C���X�^���X
        �t�B�[���h�̒l���̂��̂ł��B

    [ IllegalSecretException��O�N���X��DuplicateSecretException��O�N���X]
    �P�D������O�Ȃ̂�Exception�N���X���p�����܂��B

    �Q�D�N���X�̒��͋���ۂł����ł��B

    [StrongBox�N���X]
    �P�DHashMap<String, Treasure>�^�̕󕨕ێ�HashMap�C���X�^���X�t�B�[���h
        treasures���`���܂��B�L�[��String�^�́A�閧�̌��t��\�����܂��B

    �Q�D�����Ȃ��R���X�g���N�^���`���܂��B�󕨕ێ�HashMap�C���X�^���X
        �t�B�[���htreasures�̃I�u�W�F�N�g�������Ő������Ă��������B

    �R�D�閧�̌��t�ƕ󕨂����ɂɊi�[����store���\�b�h���`���܂��B
        �������͔閧�̌��t�iString�^�j�A�������͕󕨃I�u�W�F�N�g
       �iTreasure�^�j�ł��B�߂�l�͂Ȃ��ł��B������ODuplicateSecretException
        ���X���[����\��������̂ŁAthrows���K�v�ł��B
        �܂��A�����œn���Ă����閧�̌��t�����łɎg�p����Ă��邩���`�F�b�N���܂��B
        ���łɎg�p����Ă���ꍇ�́ADuplicateSecretException�̃C���X�^���X�𐶐����A
        �X���[���܂��B
        �閧�̌��t���܂��g�p����Ă��Ȃ��ꍇ�́A�u���������ɂɊi�[���܂����I�v��
        �o�͂��AHashMap�C���X�^���X�t�B�[���htreasures�ɔ閧�̌��t���L�[�Ƃ���
        �󕨃I�u�W�F�N�g���i�[���Ă��������B

    �S�D�閧�̌��t�ɑ΂���󕨃I�u�W�F�N�g���擾����getTreasure���\�b�h��
        ��`���܂��B�����͔閧�̌��t�iString�^�j�A�߂�l�͕󕨃I�u�W�F�N�g
       �iTreasure�^�j�ł��B������OIllegalSecretException���X���[����\����
        ����̂ŁAthrows���K�v�ł��B
        HashMap�C���X�^���X�t�B�[���htreasures����A�閧�̌��t�����ɕ�
        �I�u�W�F�N�g���擾���A�߂�l�Ƃ��ĕԂ��܂��B
        �����閧�̌��t���s���̏ꍇ�́AHashMap�I�u�W�F�N�g��null��Ԃ��̂ŁA
        ���̏ꍇ��IllegalSecretException�̃C���X�^���X�𐶐����A�X���[���܂��B

    �y���s���ʁz
    �_�C���̎w�ւ����ɂɊi�[���܂����I
    �^��̃l�b�N���X�����ɂɊi�[���܂����I
    ���̃u���X���b�g�����ɂɊi�[���܂����I
    �閧�̌��t�uxrt03�v�͂��łɎg���Ă��܂�

    �_�C���̎w�ւ��Q�b�g���܂����I
    �^��̃l�b�N���X���Q�b�g���܂����I
    �閧�̌��t�uxrr03�v�͕s���ł�

*/

public class HashMapNormalPractice{

    public static void main(String[] args){

        // ���ɃC���X�^���X�̍쐬
        StrongBox guard = new StrongBox();

        // �閧�̌��t�ϐ��̐錾
        String secret = null;

        try{

            // �P�ڂ̕󕨂��i�[
            secret = "sgf01";
            guard.store(secret, new Treasure("�_�C���̎w��"));

            // �Q�ڂ̕󕨂��i�[
            secret = "zkq02";
            guard.store(secret, new Treasure("�^��̃l�b�N���X"));

            // �R�ڂ̕󕨂��i�[
            secret = "xrt03";
            guard.store(secret, new Treasure("���̃u���X���b�g"));

            // �S�ڂ̕󕨂��i�[�i�閧�̌��t���d���j
            secret = "xrt03";
            guard.store(secret, new Treasure("�v���`�i�̃C�������O"));

        }
        catch(DuplicateSecretException e){
            System.out.println("�閧�̌��t�u" + secret + "�v�͂��łɎg���Ă��܂�");
        }

        System.out.println();

        try{

            // �P�ڂ̕󕨂��擾
            secret = "sgf01";
            Treasure treasure1 = guard.getTreasure(secret);
            System.out.println(treasure1 + "���Q�b�g���܂����I");

            // �Q�ڂ̕󕨂��擾
            secret = "zkq02";
            Treasure treasure2 = guard.getTreasure(secret);
            System.out.println(treasure2 + "���Q�b�g���܂����I");

            // �R�ڂ̕󕨂��擾(�閧�̌��t���s��)
            secret = "xrr03";
            Treasure treasure3 = guard.getTreasure(secret);
            System.out.println(treasure3 + "���Q�b�g���܂����I");

        }
        catch(IllegalSecretException e){
            System.out.println("�閧�̌��t�u" + secret + "�v�͕s���ł�");
        }

    }

}

// �����ɕ󕨃N���X���쐬���Ă�������

// �����ɔ閧�̌��t�s����O�N���X���쐬���Ă�������

// �����ɔ閧�̌��t�d����O�N���X���쐬���Ă�������

// �����ɋ��ɃN���X���쐬���Ă�������

