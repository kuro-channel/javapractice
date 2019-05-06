// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �l�X�g�N���X�Ɋւ����{���

    �w�Z��\������School�N���X�ƁA���̊w�Z�ɍ݊w���鐶�k��\��
    ����Student�N���X���쐬���Ă��������B�������AStudent�N���X��
    School�N���X�̒������Ŏg����private�Ȕ�static�l�X�g�N���X��
    ���Ă��������B

    School�N���X���g�p����NestClassBasicPractice�N���X��main���\�b�h
    �͊������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [School�N���X]
    �P�D����l����\������int�^�̒萔CAPACITY��錾���܂��B
        �����l�Ɂu5�v��ݒ肵�Ă��������B

    �Q�D���̂Q�̃C���X�^���X�t�B�[���h�������܂��B

        �E�w�Z����\��name(String�^)�C���X�^���X�t�B�[���h
        �E�ݍZ����\���z��students(Student[]�^)�C���X�^���X�t�B�[���h

    �R�D�R���X�g���N�^�ł͈����Ƃ��Ċw�Z��(String�^)���󂯎��܂��B
        ���̂܂܃C���X�^���X�t�B�[���h�ɒl���i�[���Ă��������B
        �܂��A���̃^�C�~���O�Œ���l�����̍ݍZ���z��I�u�W�F�N�g�𐶐����܂��B

    �S�D���w���\�b�henterSchool���`���܂��B�����͐��k���ŁA�ݍZ���z��̐擪�����
        (�܂�null)���������A�󂫂������Student�N���X�̃C���X�^���X�𐶐�����
        �z��v�f�Ƃ��Ċi�[���܂��B�o�Ȕԍ���1���珇�Ɋ��蓖�Ă܂��B
        ���̍ۂɁu�������񂪁����ɓ��w���܂����v�Əo�͂��Ă��������B
        ��������l���𒴂��Ă��܂��ꍇ�́u����I�[�o�[�Ł�������́����ɓ��w�ł��܂���v
        �ƕ\�����ē��w��������܂��B

    �T�D�ݍZ���Љ�\�b�hintroduce���`���܂��B�ݍZ���z��̐擪����A�ݍZ���������
        �i�܂�null�łȂ���΁jtoString���\�b�h���Ăяo���Ď��ȏЉ���܂��B

    �U�Dprivate�Ȕ�static�l�X�g�N���XStudent���`���܂��B

    [Student�l�X�g�N���X]
    �P�D���̂Q�̃C���X�^���X�t�B�[���h�������܂��B

        �E�o�Ȕԍ���\��id(int�^)�C���X�^���X�t�B�[���h
        �E���k����\��name(String�^)�C���X�^���X�t�B�[���h

    �Q�D�R���X�g���N�^�ł͈����Ƃ��ďo�Ȕԍ�(int�^)�Ɛ��k��(String�^)
        ���󂯎��܂��B���̂܂܃C���X�^���X�t�B�[���h�ɒl���i�[����
        ���������B

    �R�DtoString���\�b�h���I�[�o�[���C�h���āA���ȏЉ��߂�l�Ƃ���
        �Ԃ��܂��B�����͉��L���s���ʂ��Q�l�ɂ��Ă��������B

    �y���s���ʁz
    �{������Java�w���ɓ��w���܂���
    �u������Java�w���ɓ��w���܂���
    ��������Java�w���ɓ��w���܂���
    �c������Java�w���ɓ��w���܂���
    �n�ӂ���Java�w���ɓ��w���܂���
    ����I�[�o�[�ŎR�������Java�w���ɓ��w�ł��܂���

    Java�w���ɍ݊w���Ă���o�Ȕԍ�1�̋{���ł��B
    Java�w���ɍ݊w���Ă���o�Ȕԍ�2�̌u���ł��B
    Java�w���ɍ݊w���Ă���o�Ȕԍ�3�̉����ł��B
    Java�w���ɍ݊w���Ă���o�Ȕԍ�4�̓c���ł��B
    Java�w���ɍ݊w���Ă���o�Ȕԍ�5�̓n�ӂł��B

*/
public class NestClassBasicPractice{

    public static void main(String[] args){

        // �w�Z�̐ݗ�
        School school = new School("Java�w��");

        // ���k�����X�Ɠ��w
        school.enterSchool("�{��");
        school.enterSchool("�u��");
        school.enterSchool("����");
        school.enterSchool("�c��");
        school.enterSchool("�n��");

        // ����I�[�o�[
        school.enterSchool("�R��");

        System.out.println();

        // �ݍZ���̏Љ�
        school.introduce();

    }

}

// �����Ɋw�Z�N���X���쐬���Ă�������
// ����ɁA���k�l�X�g�N���X���쐬���Ă�������

