// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �N���X�쐬�̕W�����

    �l��\��Person�N���X���쐬���Ă��������B
    Person�N���X���g�p����ClassNormalPractice�N���X��
    main���\�b�h�͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [Person�N���X]
    Person�N���X�ɂ͎��̂Q�̃C���X�^���X�t�B�[���h������܂��B

    �P�D������\��name (String�^)
    �Q�D�N���\��age (int�^)

    Person�N���X�ɂ͂T�̃C���X�^���X���\�b�h���K�v�ł��B

    �P�D�����ƔN����I�u�W�F�N�g�ɃZ�b�g���邽�߂�setData���\�b�h
    �Q�D�N��̏����擾���邽�߂�getAge���\�b�h
    �R�D���O�̏����擾���邽�߂�getName���\�b�h
    �S�D���ȏЉ������introduce���\�b�h
    �T�D�����œn���Ă������̐l�ƔN����r����compare���\�b�h


    �y���s���ʁz
    �킽���̖��O�͑哇�A�N���30�΂ł��B
    �킽���̖��O�͑���A�N���30�΂ł��B
    �킽���̖��O�͍���A�N���32�΂ł��B

    �킽�����哇�́A���コ��Ɠ����N��ł��B
    �킽�����哇�́A���򂳂���2�ΔN���ł��B
    �킽��������́A���コ����2�ΔN��ł��B

*/
public class ClassNormalPractice{

    public static void main(String[] args){

        // Person�N���X�̃I�u�W�F�N�g���쐬
        Person[] persons = { new Person(), new Person(), new Person()};

        // Person�I�u�W�F�N�g�Ɏ����ƔN����Z�b�g
        persons[0].setData("�哇", 30);
        persons[1].setData("����", 30);
        persons[2].setData("����", 32);

        // ���ȏЉ�
        for(int i = 0; i < persons.length; i++){
            persons[i].introduce();
        }

        System.out.println();

        // �N����`�F�b�N
        persons[0].compare(persons[1]);
        persons[0].compare(persons[2]);
        persons[2].compare(persons[1]);

    }

}

// ������Person�N���X���쐬���Ă�������

