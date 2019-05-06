// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �����Ɋւ����{���

    ���w����\������SchoolChild�N���X�́A�s���S�ł��B
    �܂��A���w���N���X���g�p����CompareBasicPractice�N���X��
    main���\�b�h���s���S�ł��B

    CompareBasicPractice�N���X�͈ȉ��̕����ŃR���p�C���G���[�ɂȂ�܂��B

        Collections.sort(classroom);

    Collections���[�e�B���e�B�N���X��sort���\�b�h�́A�����œn���ꂽList�^��
    �v�f���\�[�g���܂��B�������A�s���S�Ȃ��߃\�[�g�ł��܂���B

    ���̎w���ɏ]���āA�Q��ނ̃\�[�g���\�ɂ��Ă��������B

    [SchoolChild�N���X]
    �u�����̊�v��ݒ肷�邽�߂ɁASchoolChild�N���X��Comparable<SchoolChild>
    �C���^�t�F�[�X���������Ă��������B���̃C���^�t�F�[�X�́AcompareTo�Ƃ�������
    ���\�b�h������̂ŁA�K�؂Ɏ������Ă��������B

    �������A����̃��[���́u�o�Ȕԍ��̏��������v�ɂ��܂��B


    [CompareBasicPractice�N���X]
    Collections���[�e�B���e�B�N���X��sort���\�b�h�ɂ́A�������Ɂu���ʂȏ����̊�v
    ��ݒ肷�邽�߂�Comparator<SchoolChild>�C���^�t�F�[�X�����������I�u�W�F�N�g���w��
    ���邱�Ƃ��ł��܂��B���̃C���^�t�F�[�X�����̂܂܃C���X�^���X�����邱�Ƃ͂ł��܂��񂪁A
    �����i�����j�N���X�𗘗p���邱�Ƃŉ\�ƂȂ�܂��B

    ���̃C���^�t�F�[�X������compare���ۃ��\�b�h���A�����N���X�Ŏ������Ă��������B

    �������A����̃��[���́u�g���̍������v�ɂ��܂��B


    �y���s���ʁz
    ����O
    �o�Ȕԍ��F4 ���O�F���� �g���F145.0
    �o�Ȕԍ��F2 ���O�F���� �g���F130.0
    �o�Ȕԍ��F5 ���O�F���� �g���F162.5
    �o�Ȕԍ��F1 ���O�F�ɓ� �g���F155.3
    �o�Ȕԍ��F3 ���O�F�]�� �g���F151.1

    �o�Ȕԍ���
    �o�Ȕԍ��F1 ���O�F�ɓ� �g���F155.3
    �o�Ȕԍ��F2 ���O�F���� �g���F130.0
    �o�Ȕԍ��F3 ���O�F�]�� �g���F151.1
    �o�Ȕԍ��F4 ���O�F���� �g���F145.0
    �o�Ȕԍ��F5 ���O�F���� �g���F162.5

    �g���̍�����
    �o�Ȕԍ��F5 ���O�F���� �g���F162.5
    �o�Ȕԍ��F1 ���O�F�ɓ� �g���F155.3
    �o�Ȕԍ��F3 ���O�F�]�� �g���F151.1
    �o�Ȕԍ��F4 ���O�F���� �g���F145.0
    �o�Ȕԍ��F2 ���O�F���� �g���F130.0

*/
import java.util.*;

// CompareBasicPractice�͖������ł�
public class CompareBasicPractice{

    public static void main(String[] args){

        // ���w�����������鋳����\������ArrayList�^�ϐ�
        ArrayList<SchoolChild> classroom = new ArrayList<SchoolChild>();

        // �T�l�̐��k�������ɂ��܂�
        classroom.add(new SchoolChild(4, "����", 145.0));
        classroom.add(new SchoolChild(2, "����", 130.0));
        classroom.add(new SchoolChild(5, "����", 162.5));
        classroom.add(new SchoolChild(1, "�ɓ�", 155.3));
        classroom.add(new SchoolChild(3, "�]��", 151.1));

        // ���k�����̏���\���i����O�j
        System.out.println("����O");
        for(SchoolChild sc : classroom){
            System.out.println(sc);
        }

        System.out.println();

        // �搶����̎w���u�o�Ȕԍ����ɐ��񂵂Ȃ����v
        Collections.sort(classroom);

        // ���k�����̏���\���i�o�Ȕԍ����j
        System.out.println("�o�Ȕԍ���");
        for(SchoolChild sc : classroom){
            System.out.println(sc);
        }

        System.out.println();

        // �搶����̎w���u�g���̍������ɐ��񂵂Ȃ����v
        Collections.sort(classroom);

        // ���k�����̏���\���i�g���̍������j
        System.out.println("�g���̍�����");
        for(SchoolChild sc : classroom){
            System.out.println(sc);
        }

    }

}

// ���w���N���X�͖������ł�
class SchoolChild{

    private int no;         // �o�Ȕԍ�
    private String name;    // ���O
    private double height;  // �g��

    // �R���X�g���N�^
    public SchoolChild(final int no, final String name, final double height){
        this.no = no;
        this.name = name;
        this.height = height;
    }

    // �o�Ȕԍ��̎擾
    public int getNo(){
        return no;
    }

    // ���O�̎擾
    public String getName(){
        return name;
    }

    // �g���̎擾
    public double getHeight(){
        return height;
    }

    @Override
    public String toString(){
        return "�o�Ȕԍ��F" + no + 
                " ���O�F" + name + 
                " �g���F" + height;
    }

}
