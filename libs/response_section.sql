PGDMP         !                z           response_section    14.2    14.2                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    24603    response_section    DATABASE     t   CREATE DATABASE response_section WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'English_United States.1252';
     DROP DATABASE response_section;
                pg_execute_server_program    false            �            1259    24617    bodytype    TABLE     f   CREATE TABLE public.bodytype (
    "A" character varying(8) NOT NULL,
    "B" character varying(8)
);
    DROP TABLE public.bodytype;
       public         heap    postgres    false            �            1259    24609    eyecolor    TABLE     f   CREATE TABLE public.eyecolor (
    "A" character varying(6) NOT NULL,
    "B" character varying(6)
);
    DROP TABLE public.eyecolor;
       public         heap    postgres    false            �            1259    24604 	   haircolor    TABLE     g   CREATE TABLE public.haircolor (
    "A" character varying(7) NOT NULL,
    "B" character varying(7)
);
    DROP TABLE public.haircolor;
       public         heap    postgres    false            �            1259    24614    height    TABLE     D   CREATE TABLE public.height (
    heightinfo character varying(6)
);
    DROP TABLE public.height;
       public         heap    postgres    false            �            1259    24622    salary    TABLE     ?   CREATE TABLE public.salary (
    money character varying(8)
);
    DROP TABLE public.salary;
       public         heap    postgres    false            �          0    24617    bodytype 
   TABLE DATA           ,   COPY public.bodytype ("A", "B") FROM stdin;
    public          postgres    false    212   h       �          0    24609    eyecolor 
   TABLE DATA           ,   COPY public.eyecolor ("A", "B") FROM stdin;
    public          postgres    false    210   �       �          0    24604 	   haircolor 
   TABLE DATA           -   COPY public.haircolor ("A", "B") FROM stdin;
    public          postgres    false    209   �       �          0    24614    height 
   TABLE DATA           ,   COPY public.height (heightinfo) FROM stdin;
    public          postgres    false    211   %                  0    24622    salary 
   TABLE DATA           '   COPY public.salary (money) FROM stdin;
    public          postgres    false    213   R       p           2606    24621    bodytype bodytype_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY public.bodytype
    ADD CONSTRAINT bodytype_pkey PRIMARY KEY ("A");
 @   ALTER TABLE ONLY public.bodytype DROP CONSTRAINT bodytype_pkey;
       public            postgres    false    212            n           2606    24613    eyecolor eyecolor_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY public.eyecolor
    ADD CONSTRAINT eyecolor_pkey PRIMARY KEY ("A");
 @   ALTER TABLE ONLY public.eyecolor DROP CONSTRAINT eyecolor_pkey;
       public            postgres    false    210            l           2606    24608    haircolor haircolor_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.haircolor
    ADD CONSTRAINT haircolor_pkey PRIMARY KEY ("A");
 B   ALTER TABLE ONLY public.haircolor DROP CONSTRAINT haircolor_pkey;
       public            postgres    false    209            �   (   x�K,K-JLO�,����*�)-�L,��I-�L����� �
o      �   $   x�K*�/��L�)M��H�J��L/JM������ ���      �   A   x��A
�0��������,�DT����:S�֞��惢�1���P[�#rU%_��/ ?�U      �      x��1�2�5��z��f\vf\1z\\\ /��          !   x��15��b]C H�� B�+F��� 8�     