package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.BlockPos.class)
public class BlockPos522665491Mixin {
        @Inject(at = @At("HEAD"), method = "min(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void min__1388610694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388610694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void max_2002923816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002923816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(J)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void of_1404037533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404037533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset__383820603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-383820603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void offset_1941359330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941359330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void offset_1586360448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1586360448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(JIII)J", cancellable = true)
    private static void offset__934925154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934925154L))
            info.setReturnValue(-6482391724525999676L);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset__706917401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706917401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(JLnet/minecraft/core/Direction;)J", cancellable = true)
    private static void offset_985954379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(985954379L))
            info.setReturnValue(-949306893222843456L);
    }

    @Inject(at = @At("HEAD"), method = "multiply(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void multiply__853753770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-853753770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void multiply__539201103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-539201103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void rotate__910427060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-910427060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void subtract__1407607738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1407607738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void subtract_861589441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861589441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getY(J)I", cancellable = true)
    private static void getY__1506850194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506850194L))
            info.setReturnValue(-1985130974);
    }

    @Inject(at = @At("HEAD"), method = "mutable()Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void mutable__2096636539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096636539L))
            info.setReturnValue(new net.minecraft.core.BlockPos.MutableBlockPos());
    }

    @Inject(at = @At("HEAD"), method = "getX(J)I", cancellable = true)
    private static void getX_1900613421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1900613421L))
            info.setReturnValue(-1650505289);
    }

    @Inject(at = @At("HEAD"), method = "getZ(J)I", cancellable = true)
    private static void getZ__619346513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-619346513L))
            info.setReturnValue(2079504171);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relative__349223084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-349223084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relative__745932595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-745932595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction$Axis;I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relative_525630828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525630828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__1951169133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951169133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction$Axis;I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__1752185221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752185221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative_1306914490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306914490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containing(Lnet/minecraft/core/Position;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void containing_2011649036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2011649036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containing(DDD)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void containing__1488486770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1488486770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void above_28506007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(28506007L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void above__1921232662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921232662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void above__47680464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-47680464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void above_185521085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185521085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosedStream(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private static void betweenClosedStream__606784180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606784180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosedStream(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Ljava/util/stream/Stream;", cancellable = true)
    private static void betweenClosedStream_113320151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(113320151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosedStream(Lnet/minecraft/world/phys/AABB;)Ljava/util/stream/Stream;", cancellable = true)
    private static void betweenClosedStream_494840383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(494840383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosedStream(IIIIII)Ljava/util/stream/Stream;", cancellable = true)
    private static void betweenClosedStream__2127595476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127595476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void cross_124102002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(124102002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void cross__2001066219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2001066219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void below_1625661892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625661892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void below_1291883646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291883646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void below__1114771069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1114771069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void below_519526569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519526569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void east_1631208247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631208247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void east_517896522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(517896522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void east_2074987664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2074987664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void east_1563723613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563723613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void west__1930357909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930357909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void west__1085765950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085765950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void west__1811676219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811676219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void west_1162660476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1162660476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void north__123194472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-123194472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void north_953556783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(953556783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void north_985537618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(985537618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void north_2139554133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139554133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void south_1656384282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1656384282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void south_2083575655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2083575655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void south_1953179232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953179232L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void south_2082629517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2082629517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomInCube(Lnet/minecraft/util/RandomSource;ILnet/minecraft/core/BlockPos;I)Ljava/lang/Iterable;", cancellable = true)
    private static void randomInCube_253834738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253834738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomBetweenClosed(Lnet/minecraft/util/RandomSource;IIIIIII)Ljava/lang/Iterable;", cancellable = true)
    private static void randomBetweenClosed__678830133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678830133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlatIndex(J)J", cancellable = true)
    private static void getFlatIndex_1582766223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582766223L))
            info.setReturnValue(-6718900732647694462L);
    }

    @Inject(at = @At("HEAD"), method = "squareOutSouthEast(Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private static void squareOutSouthEast__1285343859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1285343859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withinManhattan(Lnet/minecraft/core/BlockPos;III)Ljava/lang/Iterable;", cancellable = true)
    private static void withinManhattan_268158211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(268158211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosed(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Ljava/lang/Iterable;", cancellable = true)
    private static void betweenClosed__860287897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-860287897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosed(IIIIII)Ljava/lang/Iterable;", cancellable = true)
    private static void betweenClosed_201158023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(201158023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosed(Lnet/minecraft/world/phys/AABB;)Ljava/lang/Iterable;", cancellable = true)
    private static void betweenClosed__2109321004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2109321004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clampLocationWithin(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void clampLocationWithin__2051487629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2051487629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withinManhattanStream(Lnet/minecraft/core/BlockPos;III)Ljava/util/stream/Stream;", cancellable = true)
    private static void withinManhattanStream_1384542960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384542960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "neighborColumn(IIII)Ljava/lang/Iterable;", cancellable = true)
    private static void neighborColumn_2023684347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023684347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spiralAround(Lnet/minecraft/core/BlockPos;ILnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;)Ljava/lang/Iterable;", cancellable = true)
    private static void spiralAround__115643116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-115643116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "breadthFirstTraversal(Lnet/minecraft/core/BlockPos;IILjava/util/function/BiConsumer;Ljava/util/function/Function;)I", cancellable = true)
    private static void breadthFirstTraversal__278018076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-278018076L))
            info.setReturnValue(800700908);
    }

    @Inject(at = @At("HEAD"), method = "betweenCornersInDirection(IIIIIILnet/minecraft/world/phys/Vec3;)Ljava/lang/Iterable;", cancellable = true)
    private static void betweenCornersInDirection_321766979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321766979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenCornersInDirection(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;)Ljava/lang/Iterable;", cancellable = true)
    private static void betweenCornersInDirection_701371235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701371235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenCornersInDirection(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/world/phys/Vec3;)Ljava/lang/Iterable;", cancellable = true)
    private static void betweenCornersInDirection_166973686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166973686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findClosestMatch(Lnet/minecraft/core/BlockPos;IILjava/util/function/Predicate;)Ljava/util/Optional;", cancellable = true)
    private static void findClosestMatch__2061181647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061181647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atY(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void atY_1420406163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420406163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "immutable()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void immutable_426054226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(426054226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asLong()J", cancellable = true)
    private void asLong__1028085076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028085076L))
            info.setReturnValue(7709296998902522788L);
    }

    @Inject(at = @At("HEAD"), method = "asLong(III)J", cancellable = true)
    private static void asLong_562757081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562757081L))
            info.setReturnValue(-1247746355630100696L);
    }


}
