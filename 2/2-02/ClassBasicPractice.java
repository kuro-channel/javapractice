// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �N���X�쐬�̊�{���

    �y�b�g��\��Pet�N���X���쐬���Ă��������B
    Pet�N���X���g�p����ClassBasicPractice�N���X��main���\�b�h��
    ���łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [Pet�N���X]
    Pet�N���X�͎��̂S��private�C���X�^���X�t�B�[���h�������܂��B

    �P�D�����̎�ނ�ێ����邽�߂�type�t�B�[���h�iString�^�j
    �Q�D���O��ێ����邽�߂�name�t�B�[���h�iString�^�j
    �R�D�N���ێ����邽�߂�age�t�B�[���h�ibyte�^�j
    �S�D���ʂ�ێ����邽�߂�gender�t�B�[���h�iboolean�^ true:���X false:�I�X�j

    �܂��APet�N���X�͎��̂T��public���\�b�h�������܂��B

    �P�D�����̎�ނ�ݒ肷�邽�߂�setType���\�b�h
    �Q�D���O��ݒ肷�邽�߂�setName���\�b�h
    �R�D�N���ݒ肷�邽�߂�setAge���\�b�h
    �S�D���ʂ�ݒ肷�邽�߂�setGender���\�b�h
    �T�D�Љ���擾���邽�߂�getIntroduction���\�b�h
      (�Љ�̓��e�͉��L�̎��s���ʂ��Q�l�ɂ��Ă�������)

    �y���s���ʁz
    ���̃R�^���[�̓I�X��4�΂ł��B
    �L�̃~�[�̓��X��2�΂ł��B

*/
public class ClassBasicPractice{

    public static void main(String[] args){

        // 1�C�ڂ̃y�b�g�I�u�W�F�N�g�̐���
        Pet pet1 = new Pet();

        // 1�C�ڂ̃y�b�g�̃f�[�^��ݒ�
        pet1.setType("��");
        pet1.setName("�R�^���[");
        pet1.setAge((byte)4);
        pet1.setGender(false);

        // 2�C�ڂ̃y�b�g�I�u�W�F�N�g�̐���
        Pet pet2 = new Pet();

        // 2�C�ڂ̃y�b�g�̃f�[�^��ݒ�
        pet2.setType("�L");
        pet2.setName("�~�[");
        pet2.setAge((byte)2);
        pet2.setGender(true);

        // 2�C�̃y�b�g�̏Љ���擾���A�\������
        System.out.println(pet1.getIntroduction());
        System.out.println(pet2.getIntroduction());

    }

}

// ������Pet�N���X���쐬���Ă�������

