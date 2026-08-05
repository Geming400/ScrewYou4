package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.AABB.class)
public class AABB2004606318Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1095979554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1095979554L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1519937949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519937949L))
            info.setReturnValue("o9/G\u84E6>\uFC58qV\u9279P8&kqn\uD103$w-]\uC2E4\uBB50[1i\u44D0[\u93C5<_\"\u7DBEmn");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1733009383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1733009383L))
            info.setReturnValue(614214629);
    }

    @Inject(at = @At("HEAD"), method = "min(Lnet/minecraft/core/Direction$Axis;)D", cancellable = true)
    private void min__818525994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818525994L))
            info.setReturnValue(2.24404600173009E8D);
    }

    @Inject(at = @At("HEAD"), method = "max(Lnet/minecraft/core/Direction$Axis;)D", cancellable = true)
    private void max_307121640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307121640L))
            info.setReturnValue(2.244046002836721E8D);
    }

    @Inject(at = @At("HEAD"), method = "inflate(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void inflate_1689749729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689749729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inflate(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void inflate__1909637855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1909637855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void of_512426226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(512426226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void contains_1441018832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441018832L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains(DDD)Z", cancellable = true)
    private void contains_407877304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(407877304L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSize()D", cancellable = true)
    private void getSize__1856238984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1856238984L))
            info.setReturnValue(2.2440460038051963E8D);
    }

    @Inject(at = @At("HEAD"), method = "move(Lorg/joml/Vector3f;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void move_1773190936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1773190936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void move_205048139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(205048139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void move__301666493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301666493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void move_1166265131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166265131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intersects(Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private void intersects__669025820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669025820L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "intersects(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void intersects__1041003731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041003731L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "intersects(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void intersects__813509135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813509135L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "intersects(DDDDDD)Z", cancellable = true)
    private void intersects_594683633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594683633L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "deflate(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void deflate__2059139067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2059139067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deflate(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void deflate__782813883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-782813883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intersect(Lnet/minecraft/world/phys/AABB;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void intersect__2047719344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2047719344L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinPosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getMinPosition__1059215134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1059215134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxPosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getMaxPosition__1995197808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1995197808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/world/phys/AABB;)D", cancellable = true)
    private void distanceToSqr_498738814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498738814L))
            info.setReturnValue(2.2440460024555445E8D);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/world/phys/Vec3;)D", cancellable = true)
    private void distanceToSqr__1693023489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1693023489L))
            info.setReturnValue(2.244046004583142E8D);
    }

    @Inject(at = @At("HEAD"), method = "encapsulatingFullBlocks(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void encapsulatingFullBlocks_102765339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(102765339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expandTowards(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void expandTowards__807963012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-807963012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expandTowards(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void expandTowards__37656812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-37656812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collidedAlongVector(Lnet/minecraft/world/phys/Vec3;Ljava/util/List;)Z", cancellable = true)
    private void collidedAlongVector_415731996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415731996L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "clip(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Optional;", cancellable = true)
    private void clip_341198828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(341198828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clip(DDDDDDLnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Optional;", cancellable = true)
    private static void clip_1311424868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311424868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clip(Ljava/lang/Iterable;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private static void clip__1117936010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117936010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZsize()D", cancellable = true)
    private void getZsize__349226518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-349226518L))
            info.setReturnValue(2.2540310057768258E8D);
    }

    @Inject(at = @At("HEAD"), method = "getXsize()D", cancellable = true)
    private void getXsize_43800492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43800492L))
            info.setReturnValue(2.2540310069278476E8D);
    }

    @Inject(at = @At("HEAD"), method = "getYsize()D", cancellable = true)
    private void getYsize__152713013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-152713013L))
            info.setReturnValue(2.2540310052203757E8D);
    }

    @Inject(at = @At("HEAD"), method = "getCenter()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getCenter_480712764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480712764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMinY(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void setMinY_2022245859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022245859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaxY(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void setMaxY__38049263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-38049263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofSize(Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void ofSize_245638414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(245638414L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaxZ(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void setMaxZ_291716498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291716498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaxX(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void setMaxX__367815024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-367815024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMinX(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void setMinX_1692480098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692480098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMinZ(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void setMinZ__1942955676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942955676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contract(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void contract_1908189100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908189100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasNaN()Z", cancellable = true)
    private void hasNaN_1479568324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479568324L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBottomCenter()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getBottomCenter__990139695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990139695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unitCubeFromLowerCorner(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void unitCubeFromLowerCorner__1488126595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1488126595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minmax(Lnet/minecraft/world/phys/AABB;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void minmax_2142498883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142498883L))
            info.setReturnValue(null);
    }


}
