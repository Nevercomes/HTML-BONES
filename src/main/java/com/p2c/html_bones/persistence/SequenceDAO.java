package com.p2c.html_bones.persistence;

import com.p2c.html_bones.domain.Sequence;

public interface SequenceDAO {

    Sequence getSequence(Sequence sequence);

    void updateSequence(Sequence sequence);
}
