// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    ArrayList�Ɋւ����{���

    �����p�P����i�[����ArrayList<String>�^�̕ϐ�number������A
    zero����ten�܂ł̐����p�P�ꂪ�i�[����Ă��܂��B

    ���ɁA�u0����10�܂ł̉p�P�����͂��Ă��������v�Əo�͂��A
    ���[�U�ɉp�P�����͂��Ă��炢�܂��B

    ������
    System.console().readLine()�̋L�q�́A�L�[�{�[�h���當�����
    ���͂��󂯕t���A�����String�^�̒l�Ƃ��ĕԂ��v���O�����ł��B
    ����͂��̂܂ܗ��p���Ă��������B

    ArrayList<String>�^�̕ϐ�number��for����p���đ������A
    ���͉p�P��ƕ�����̈�v���m�F���܂��B������v����
    �ꍇ�́u�����͐��l�́��ł��v�ƕ\�����܂��B�������ׂĈ�v
    ���Ȃ���΁u�����͉p�P��Ƃ��đ��݂��܂���v�ƕ\��
    ���܂��B�i���L���s���ʂ��Q�l�ɂ��Ă��������j

    �y���s���ʁz
    0����10�܂ł̉p�P�����͂��Ă�������
    five
    five�͐��l��5�ł�

    �y���s���ʁz
    0����10�܂ł̉p�P�����͂��Ă�������
    eit
    eit�͉p�P��Ƃ��đ��݂��܂���

*/
import java.util.*;
public class ArrayListBasicPractice {

    public static void main(String[] args){

        // �����p�P��i�[�p�ϐ��̐錾��ArrayList�I�u�W�F�N�g�̐���
        ArrayList<String> number = new ArrayList<String>();

        // �����p�P��̊i�[
        number.add("zero");
        number.add("one");
        number.add("two");
        number.add("three");
        number.add("four");
        number.add("five");
        number.add("six");
        number.add("seven");
        number.add("eight");
        number.add("nine");
        number.add("ten");

        // �p�P��̓���
        System.out.println("0����10�܂ł̉p�P�����͂��Ă�������");
        String input = System.console().readLine();

        // ��������R�[�f�B���O���Ă�������


    }

}
