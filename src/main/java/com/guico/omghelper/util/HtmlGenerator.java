package com.guico.omghelper.util;

import com.guico.omghelper.domain.Cards;
import com.guico.omghelper.mapper.CardsMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class HtmlGenerator {
    private CardsMapper cardsService;

    public String generateCard(Cards card){
        return  """
               <div class="card">
                   <div class="question">
                        <strong>%s</strong>
                   </div>
                   <hr/>
                   <div class="answer">
                        %s
                   </div>
               </div>
                """.formatted(card.getQuestion(), card.getAnswer());
    }

    public String generateAllCards(){
        StringBuilder sb = new StringBuilder();
        List<Cards> list = cardsService.list();
        if(list.isEmpty()){
            return "";
        }
        for(Cards card : list){
            sb.append(generateCard(card));
        }
        return sb.toString();
    }
}
