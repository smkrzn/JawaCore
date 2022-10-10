package Lesson_7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Info<L extends Collection<AnswerWeather>> {


    private List<AnswerWeather> infoList = new List<AnswerWeather>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<AnswerWeather> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] ts) {
            return null;
        }

        @Override
        public boolean add(AnswerWeather answerWeather) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends AnswerWeather> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, Collection<? extends AnswerWeather> collection) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public AnswerWeather get(int i) {
            return null;
        }

        @Override
        public AnswerWeather set(int i, AnswerWeather answerWeather) {
            return null;
        }

        @Override
        public void add(int i, AnswerWeather answerWeather) {

        }

        @Override
        public AnswerWeather remove(int i) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<AnswerWeather> listIterator() {
            return null;
        }

        @Override
        public ListIterator<AnswerWeather> listIterator(int i) {
            return null;
        }

        @Override
        public List<AnswerWeather> subList(int i, int i1) {
            return null;
        }
    };

    public Info() {
    }

    public List<AnswerWeather> getInfoList() {
        return infoList;
    }

    public void setInfiList(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        this.infoList = objectMapper.readValue(json, AnswerWeather.class);
    }
}
