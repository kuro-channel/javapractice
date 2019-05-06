// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    HashSet�Ɠ��l�Ɋւ�����

    ����O���[�v�ɑ����郁���o�[��\������Member�N���X������܂��B
    �t�B�[���h�Ƃ��āAint�^��id��String�^��name�������A��{�I��
    �R���X�g���N�^�������AtoString���\�b�h���I�[�o�[���C�h���Ă���
    �ƂĂ���{�I�ȃN���X�ł��B
    �قƂ�Ǌ������Ă��܂����A���闝�R�ŕs���S�ł��B

    Member�N���X���g�p����HashSetEqualsPractice�N���X��main���\�b�h
    �͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    ���̃v���O������ύX�����ɁA���̂܂܃R���p�C���E���s�����
    ���̂悤�ɏo�͂���܂��B

    �y�������Ȃ����s���ʁi���s���j�z
    ID:3 NAME:���c
    ID:1 NAME:�j�Z�R�c
    ID:5 NAME:��c
    ID:1 NAME:�R�c
    ID:2 NAME:���c
    ID:4 NAME:�g�c

    �����o�[���Ǘ����邽�߂̃O���[�v��\������HashSet�^��group�ϐ���
    �쐬���Ă��܂��B
    ���̃O���[�v�́A�����o�[���Ǘ����邽�߂�ID�̒l���g�p���A����ID�̒l��
    �������o�[�͉����ł��Ȃ��悤�ɂ��悤�Ǝv���Ă��܂��B

    �������A��قǂ̎��s���ʂł́A�O���[�v��ID��1�̃j�Z�R�c�������ł��Ă��܂��B

    Set�R���N�V�����́A�{�����l�̃I�u�W�F�N�g��o�^�ł��Ȃ��悤�ɐ݌v����Ă��܂��B

    �u����ID�̒l������Member�I�u�W�F�N�g�͓��l�v�ƂȂ�悤�ɁAMember�N���X���C��
    ���Ă��������B

    �q���g�́AObject�N���X�̎����\�b�h���Q�I�[�o�[���C�h���邱�Ƃł��B

    �y���������s���ʁi���s���j�z
    ID:1 NAME:�R�c
    ID:2 NAME:���c
    ID:3 NAME:���c
    ID:4 NAME:�g�c
    ID:5 NAME:��c

*/
import java.util.*;
public class HashSetEqualsPractice{

    public static void main(String[] args){

        // �O���[�v������
        HashSet<Member> group = new HashSet<Member>();

        // �����o�[��ǉ�
        group.add(new Member(1, "�R�c"));
        group.add(new Member(2, "���c"));
        group.add(new Member(3, "���c"));
        group.add(new Member(4, "�g�c"));
        group.add(new Member(5, "��c"));

        // �U���������o�[�Ƃ��Ēǉ��I
        group.add(new Member(1, "�j�Z�R�c"));

        // �����o�[�Љ�
        for(Member member : group){
            System.out.println(member);
        }

    }

}

// �����o�[�N���X�͕s���S�ł�
class Member{

    private int id;         // ID
    private String name;    // ���O

    // �R���X�g���N�^
    public Member(final int id, final String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "ID:" + id + " NAME:" + name;
    }

}
