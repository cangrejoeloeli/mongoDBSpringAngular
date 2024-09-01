package com.db.msApp.math;

import java.util.List;
import java.util.ArrayList;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.euclidean.twod.hull.ConvexHull2D;
import org.apache.commons.math3.geometry.euclidean.twod.hull.MonotoneChain;
import org.apache.commons.math3.geometry.partitioning.Region;

public class MathService {

    public void UsarFuncion() throws MathIllegalArgumentException {
        List<Vector2D> points = new ArrayList<Vector2D>();

        // = { new Vector2D(0, 3), new Vector2D(2, 2), new Vector2D(1,
        // 1), new Vector2D(2, 1),
        // new Vector2D(3, 0), new Vector2D(0, 0), new Vector2D(3, 3) };
        // Vector2D[] points = { new Vector2D(0, 3), new Vector2D(2, 2) };

        try {

            points.add(new Vector2D(-10, -30));
            points.add(new Vector2D(20, 10));
            points.add(new Vector2D(-10, 10));
            points.add(new Vector2D(20, -30));
            points.add(new Vector2D(5, 5));
            points.add(new Vector2D(-5, -5));
            points.add(new Vector2D(1, 1));

            // Para obtener el convex hull con el método MonotoneChain
            MonotoneChain monotoneChain = new MonotoneChain();

            // Obtengo el convexhull
            ConvexHull2D convexHull = monotoneChain.generate(points);

            // List<Vector2D> vert = (List<Vector2D>)
            // monotoneChain.findHullVertices(points);
            // Vector2D[] dd = vert.toArray(new Vector2D[0]);
            Segment[] segmentos = convexHull.getLineSegments();
            // Vector2D[] vertices = convexHull.getVertices();

            PolygonsSet polygonsSet = (PolygonsSet) convexHull.createRegion();

            // Verificar si un punto está dentro de la región
            // boolean containsPoint = polygonsSet.checkPoint(new Vector2D(0.5, 0.5)) ==
            // Region.Location.INSIDE;

            // Obtener el área de la región
            double area = polygonsSet.getSize();
            // Obtener el baricentro de la región
            Vector2D baricenter = (Vector2D) polygonsSet.getBarycenter();

            System.out.println(baricenter + " - " + area);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }

}
