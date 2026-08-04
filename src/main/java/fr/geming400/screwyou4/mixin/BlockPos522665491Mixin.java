package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.BlockPos.class)
public class BlockPos522665491Mixin {
        @Inject(at = @At("HEAD"), method = "min(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void min_1653273868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1653273868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void max_1653273868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1653273868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(J)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void of__236318330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236318330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset__1806003686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806003686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(III)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void offset__757458579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-757458579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void offset_1974396757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1974396757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(JLnet/minecraft/core/Direction;)J", cancellable = true)
    private static void offset__1357864648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1357864648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(JIII)J", cancellable = true)
    private static void offset__415163439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-415163439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "offset(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset__815608526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815608526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void multiply_1947358349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947358349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiply(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void multiply_1658923770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658923770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void rotate_1852692615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852692615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void subtract_1974396757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1974396757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "subtract(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void subtract__815608526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815608526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getY(J)I", cancellable = true)
    private static void getY_1737493739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737493739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mutable()Lnet/minecraft/core/BlockPos$MutableBlockPos;", cancellable = true)
    private void mutable_1612631019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1612631019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX(J)I", cancellable = true)
    private static void getX_1737493739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737493739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZ(J)I", cancellable = true)
    private static void getZ_1737493739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737493739L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__557407033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-557407033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative_1563866630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563866630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction$Axis;I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void relative__1336693073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1336693073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relative_483548673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(483548673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relative_1768647584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1768647584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relative(Lnet/minecraft/core/Direction$Axis;I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relative_356464824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(356464824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "immutable()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void immutable__1370721388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370721388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosedStream(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private static void betweenClosedStream__953491456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-953491456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosedStream(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Ljava/util/stream/Stream;", cancellable = true)
    private static void betweenClosedStream__233387125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233387125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosedStream(Lnet/minecraft/world/phys/AABB;)Ljava/util/stream/Stream;", cancellable = true)
    private static void betweenClosedStream__336216053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-336216053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosedStream(IIIIII)Ljava/util/stream/Stream;", cancellable = true)
    private static void betweenClosedStream__977906464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977906464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containing(DDD)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void containing_701029120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701029120L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containing(Lnet/minecraft/core/Position;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void containing__1824053762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824053762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void north_138395987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(138395987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void north_1658923770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658923770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void north_1947358349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947358349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "north()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void north__1370721388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370721388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void south__1370721388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370721388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void south_1947358349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947358349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void south_1658923770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658923770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "south()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void south_138395987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(138395987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void west_138395987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(138395987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void west__1370721388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370721388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void west_1658923770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658923770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "west(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void west_1947358349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947358349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void east_1947358349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947358349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void east__1370721388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370721388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void east_138395987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(138395987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "east(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void east_1658923770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658923770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void cross__815608526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815608526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cross(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void cross_1974396757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1974396757L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asLong(III)J", cancellable = true)
    private static void asLong__257438197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-257438197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asLong()J", cancellable = true)
    private void asLong_560928698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(560928698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void below_138395987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(138395987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void below_1658923770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658923770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void below__1370721388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370721388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "below(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void below_1947358349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947358349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above(I)Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void above_1658923770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658923770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void above__1370721388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370721388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void above_1947358349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947358349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "above()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void above_138395987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(138395987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atY(I)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void atY_1947358349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1947358349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosed(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Ljava/lang/Iterable;", cancellable = true)
    private static void betweenClosed_1496569299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496569299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosed(Lnet/minecraft/world/phys/AABB;)Ljava/lang/Iterable;", cancellable = true)
    private static void betweenClosed__734405912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-734405912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenClosed(IIIIII)Ljava/lang/Iterable;", cancellable = true)
    private static void betweenClosed_1120589043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1120589043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenCornersInDirection(IIIIIILnet/minecraft/world/phys/Vec3;)Ljava/lang/Iterable;", cancellable = true)
    private static void betweenCornersInDirection_1399931431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399931431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenCornersInDirection(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/Vec3;)Ljava/lang/Iterable;", cancellable = true)
    private static void betweenCornersInDirection__635427513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-635427513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "betweenCornersInDirection(Lnet/minecraft/world/phys/AABB;Lnet/minecraft/world/phys/Vec3;)Ljava/lang/Iterable;", cancellable = true)
    private static void betweenCornersInDirection__1685144174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1685144174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "breadthFirstTraversal(Lnet/minecraft/core/BlockPos;IILjava/util/function/BiConsumer;Ljava/util/function/Function;)I", cancellable = true)
    private static void breadthFirstTraversal__796894358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-796894358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withinManhattan(Lnet/minecraft/core/BlockPos;III)Ljava/lang/Iterable;", cancellable = true)
    private static void withinManhattan__709236946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709236946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spiralAround(Lnet/minecraft/core/BlockPos;ILnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;)Ljava/lang/Iterable;", cancellable = true)
    private static void spiralAround_1260248182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1260248182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clampLocationWithin(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void clampLocationWithin__2082646760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082646760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlatIndex(J)J", cancellable = true)
    private static void getFlatIndex_1737494700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737494700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "squareOutSouthEast(Lnet/minecraft/core/BlockPos;)Ljava/util/stream/Stream;", cancellable = true)
    private static void squareOutSouthEast_1753221460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1753221460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findClosestMatch(Lnet/minecraft/core/BlockPos;IILjava/util/function/Predicate;)Ljava/util/Optional;", cancellable = true)
    private static void findClosestMatch__1706053802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1706053802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomInCube(Lnet/minecraft/util/RandomSource;ILnet/minecraft/core/BlockPos;I)Ljava/lang/Iterable;", cancellable = true)
    private static void randomInCube__476756139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476756139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withinManhattanStream(Lnet/minecraft/core/BlockPos;III)Ljava/util/stream/Stream;", cancellable = true)
    private static void withinManhattanStream__871338107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-871338107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "neighborColumn(IIII)Ljava/lang/Iterable;", cancellable = true)
    private static void neighborColumn_1427499027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1427499027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomBetweenClosed(Lnet/minecraft/util/RandomSource;IIIIIII)Ljava/lang/Iterable;", cancellable = true)
    private static void randomBetweenClosed__1617071046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1617071046L))
            info.setReturnValue(null);
    }


}
