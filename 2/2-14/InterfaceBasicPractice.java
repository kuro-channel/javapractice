// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �C���^�t�F�[�X�̊�{���

    ���̂R�̃C���^�t�F�[�X������܂��B
    (�ύX���Ȃ��ł�������)

    �E��s�\��\������Flyable�C���^�t�F�[�X
      (���fly���ۃ��\�b�h����`����Ă��܂�)

    �E���j�\��\������Swimable�C���^�t�F�[�X
      (�j��swim���ۃ��\�b�h����`����Ă��܂�)

    �E�H���\��\������Eatable�C���^�t�F�[�X
      (�H�ׂ�eat���ۃ��\�b�h����`����Ă��܂�)

    �܂��A�H���\�C���^�t�F�[�X�������������ۃN���X
    Bird����`����Ă��܂��B(�ύX���Ȃ��ł�������)

    �����ł́Aeat���\�b�h���������Ă��܂���B���̂Ȃ�A
    ���̎�ނɂ���ĐH�ׂ���̂��قȂ邩��ł��B

    ���̎w���ɏ]���ċ�̓I�Ȓ���\���R��ނ̃N���X��
    �쐬���Ă��������B

    [�΂�Swallow�N���X]
    �P�DBird���ۃN���X���p�����܂��B

    �Q�DFlyable�C���^�t�F�[�X���������܂��B

    �R�D��ԃ��\�b�h�ƐH�ׂ郁�\�b�h���������܂��B
        �o�͓��e�͉��L���s���ʂ��Q�l�ɂ��Ă��������B

    [�y���M��Penguin�N���X]
    �P�DBird���ۃN���X���p�����܂��B

    �Q�DSwimable�C���^�t�F�[�X���������܂��B

    �R�D�j�����\�b�h�ƐH�ׂ郁�\�b�h���������܂��B
        �o�͓��e�͉��L���s���ʂ��Q�l�ɂ��Ă��������B

    [�J���Z�~Atthis�N���X]
    �P�DBird���ۃN���X���p�����܂��B

    �Q�DFlyable��Swimable�C���^�t�F�[�X���������܂��B

    �R�D��ԃ��\�b�h�Ɖj�����\�b�h�ƐH�ׂ郁�\�b�h���������܂��B
        �o�͓��e�͉��L���s���ʂ��Q�l�ɂ��Ă��������B

    �܂��AInterfaceBasicPractice�N���X��main���\�b�h�͈ꕔ�������ł��B
    ���̂悤�ɏ������������Ă��������B

    �P�D���z��I�u�W�F�N�g���g��for���Ń��[�v���܂��B

    �Q�D�H�ׂ郁�\�b�h�����s���܂��B

    �R�D������s�\�̒��Ȃ�Δ�ԃ��\�b�h�����s���܂��B

    �S�D�������j�\�̒��Ȃ�Ήj�����\�b�h�����s���܂��B

    �y���s���ʁz
    �΂߂�����H�ׂ܂����B
    �΂߂��X�C�X�C���ł܂��B

    �y���M��������H�ׂ܂����B
    �y���M�����X�C�X�C�j���ł��܂��B

    �J���Z�~���q����H�ׂ܂����B
    �J���Z�~���X�C�X�C���ł܂��B
    �J���Z�~���X�C�X�C�j���ł��܂��B

*/
public class InterfaceBasicPractice{

    public static void main(String[] args){

        // ���z��I�u�W�F�N�g�̐���
        Bird[] birds = {new Swallow(), new Penguin(), new Atthis()};

        // �������̏Љ�
        // ��������R�[�f�B���O���Ă�������

    }

}

// ��s�\�C���^�t�F�[�X
interface Flyable{
    // ��Ԓ��ۃ��\�b�h
    void fly();
}

// ���j�\�C���^�t�F�[�X
interface Swimable{
    // �j�����ۃ��\�b�h
    void swim();
}

// �H���\�C���^�t�F�[�X
interface Eatable{
    // �H�ׂ钊�ۃ��\�b�h
    void eat();
}

// �����ۃN���X
//abstract class Bird implements Eatable{}

// �����ɂ΂߃N���X���쐬���Ă�������

// �����Ƀy���M���N���X���쐬���Ă�������

// �����ɃJ���Z�~�N���X���쐬���Ă�������

