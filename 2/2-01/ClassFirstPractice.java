// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �N���X�쐬�̏����̖��

    �]�ƈ���\��Employee�N���X���쐬���Ă��������B
    Employee�N���X�𗘗p����ClassFirstPractice�N���X��main���\�b�h��
    ���łɊ������Ă��܂��B(�ύX���Ȃ��ł�������)

    [Employee�N���X]
    Employee�N���X�̓t�B�[���h�Ƃ��ĎЈ��ԍ�(int�^)�ƎЈ���(String�^)��
    �Q�̏���ێ����܂��B

    Employee�N���X�ɂ͎��̂R�̃��\�b�h���K�v�ł��B
    �P�D�Ј��ԍ��ƎЈ������I�u�W�F�N�g�ɃZ�b�g���邽�߂�setData���\�b�h
    �Q�D�Ј��ԍ��̏����I�u�W�F�N�g����擾���邽�߂�getId���\�b�h
    �R�D�Ј����̏����I�u�W�F�N�g����擾���邽�߂�getName���\�b�h

    �y���s���ʁz
    �Ј��ԍ��F1234
    �Ј����F�R�c

*/
public class ClassFirstPractice{

    public static void main(String[] args){

        // Employee�N���X�̃I�u�W�F�N�g���쐬
        Employee employee = new Employee();

        // Employee�I�u�W�F�N�g�ɎЈ��ԍ��ƎЈ������Z�b�g
        employee.setData(1234, "�R�c");

        // Employee�I�u�W�F�N�g�̎Ј��ԍ����o��
        System.out.println("�Ј��ԍ��F" + employee.getId());

        // Employee�I�u�W�F�N�g�̎Ј������o��
        System.out.println("�Ј����F" + employee.getName());

    }

}

// ������Employee�N���X���쐬���Ă�������

