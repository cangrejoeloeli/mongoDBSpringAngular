package com.db.msApp.math;

import java.util.List;
import java.util.ArrayList;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.euclidean.twod.hull.ConvexHull2D;
import org.apache.commons.math3.geometry.euclidean.twod.hull.MonotoneChain;

public class MathService {

    public void UsarFuncion() throws MathIllegalArgumentException {
        List<Vector2D> points = new ArrayList<Vector2D>();

        // = { new Vector2D(0, 3), new Vector2D(2, 2), new Vector2D(1,
        // 1), new Vector2D(2, 1),
        // new Vector2D(3, 0), new Vector2D(0, 0), new Vector2D(3, 3) };
        // Vector2D[] points = { new Vector2D(0, 3), new Vector2D(2, 2) };

        try {

            points.add(new Vector2D(0, 3));
            points.add(new Vector2D(1, 3));
            points.add(new Vector2D(4, 3));
            points.add(new Vector2D(0, 5));

            MonotoneChain monotoneChain = new MonotoneChain();
            ConvexHull2D convexHull = monotoneChain.generate(points);

            Segment[] segmentos = convexHull.getLineSegments();
            Vector2D[] vertices = convexHull.getVertices();

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }

}
