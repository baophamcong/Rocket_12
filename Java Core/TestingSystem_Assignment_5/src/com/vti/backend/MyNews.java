package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.News;

public class MyNews {
	ArrayList<News> listNews = new ArrayList<News>();

	public void insert() {
		Scanner sc = new Scanner(System.in);
		News news = new News();
		System.out.println("Nhap vao ban tin");
		System.out.println("Title:");
		String title = sc.nextLine();
		System.out.println("Author:");
		String author = sc.nextLine();
		System.out.println("Content:");
		String content = sc.nextLine();
		System.out.println("Published date:");
		String publishDate = sc.nextLine();
		System.out.println("Nhap vao 3 danh gia:");
		int[] rates = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("danh gia thu " + (i + 1) + ":");
			rates[i] = sc.nextInt();
		}
		news.setTitle(title);
//		news.setTitle(title);
		news.setContent(content);
		news.setAuthor(author);
		news.setPublishDate(publishDate);
		news.setRates(rates);

		listNews.add(news);
	}

	public void viewListNews() {
		for (News news : listNews) {
			news.display();
		}
	}

	public void avgRate() {
		for (News news : listNews) {
			news.calculate();
			System.out.println("Title: " + news.getTitle() + " Avegare rate: " + news.getAverageRate());
		}

	}

}
