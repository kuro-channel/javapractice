// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �p���ƃR���X�g���N�^�̖��

    �G����\��Magazine�N���X���쐬���Ă��������B

    �{��\��Book�N���X�͂��łɊ������Ă��܂��B
    �i�ύX���Ȃ��ł��������j

    �܂��AMagazine�N���X���g�p����InheritanceBasicPractice�N���X��
    main���\�b�h�͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [Magazine�N���X]
    �P�DBook�N���X���p�����܂��B

    �Q�D�X�[�p�[�N���X����󂯌p�����Q�̃C���X�^���X�t�B�[���h
        �i�^�C�g���A���i�j�̂ق��ɁA�\���Ɍf�ڂ���Ă���^�����g����
        �ێ����邽�߂�coverPersonName�C���X�^���X�t�B�[���h(String�^)
        ���`���܂��B

    �R�D�����Ƀ^�C�g���A���i�A�\���^�����g���̂R�̒l���󂯎��
        �R���X�g���N�^���`���܂��B���̂����^�C�g���A���i�̂Q��
        �l�́A�X�[�p�[�N���X�̃R���X�g���N�^�𗘗p���Ď󂯓n���܂��B

    �S�D�G���̓��e���Љ��show�C���X�^���X���\�b�h���`���܂��B
        �o�͓��e�́A���L���s���ʂ��Q�l�ɂ��Ă��������B

    �y���s���ʁz
    ����Runner��^�������I�I
    �艿650�~
    ����̕\���F���ʂ���

*/
public class InheritanceConstructorPractice{

    public static void main(String[] args){

        // Magazine�N���X�̃I�u�W�F�N�g�𐶐�
        Magazine magazine = new Magazine("����Runner", 650, "����");

        // �G���̓��e�Љ�\�b�h�̌Ăяo��
        magazine.show();

    }

}

// Book�N���X
class Book{

    // �^�C�g��
    private String title;

    // ���i
    private int price;

    // �R���X�g���N�^
    public Book(String title, int price){
        this.title = title;
        this.price = price;
    }

    // �^�C�g���擾���\�b�h
    public String getTitle(){
        return title;
    }

    // ���i�擾���\�b�h
    public int getPrice(){
        return price;
    }

}

// ������Magazine�N���X���쐬���Ă�������

