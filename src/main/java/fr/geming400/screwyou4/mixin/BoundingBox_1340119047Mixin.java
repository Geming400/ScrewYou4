package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.BoundingBox.class)
public class BoundingBox_1340119047Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_431492282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(431492282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2110542075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2110542075L))
            info.setReturnValue("qUWHI,g}rsId?0zJ2nq3`b\uB904,\u067CV]Q0pZO\u1C1EXl%\uB70B(.v\u667FT^;ixvr\u6BD7*a>.q/yVO");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1897470641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897470641L))
            info.setReturnValue(-1207336670);
    }

    @Inject(at = @At("HEAD"), method = "getLength()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getLength__1775773598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775773598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(III)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void move__588442906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-588442906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void move_35305600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35305600L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intersects(IIII)Z", cancellable = true)
    private void intersects__813031607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813031607L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "intersects(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Z", cancellable = true)
    private void intersects_766686484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766686484L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "moved(III)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void moved_1007844420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007844420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minY()I", cancellable = true)
    private void minY_1634983429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634983429L))
            info.setReturnValue(562332864);
    }

    @Inject(at = @At("HEAD"), method = "minX()I", cancellable = true)
    private void minX_1606354278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606354278L))
            info.setReturnValue(2099771455);
    }

    @Inject(at = @At("HEAD"), method = "maxX()I", cancellable = true)
    private void maxX_833875704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(833875704L))
            info.setReturnValue(-1195696656);
    }

    @Inject(at = @At("HEAD"), method = "minZ()I", cancellable = true)
    private void minZ_1663612580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1663612580L))
            info.setReturnValue(253011422);
    }

    @Inject(at = @At("HEAD"), method = "maxZ()I", cancellable = true)
    private void maxZ_891134006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891134006L))
            info.setReturnValue(-1830440388);
    }

    @Inject(at = @At("HEAD"), method = "maxY()I", cancellable = true)
    private void maxY_862504855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862504855L))
            info.setReturnValue(-1404983383);
    }

    @Inject(at = @At("HEAD"), method = "getCenter()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getCenter__1195101284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1195101284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "infinite()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void infinite__1261430820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261430820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inflatedBy(III)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void inflatedBy__259531101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-259531101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inflatedBy(I)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void inflatedBy__311948669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311948669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forAllCorners(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forAllCorners__2106325911(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2106325911L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isInside(III)Z", cancellable = true)
    private void isInside_1520172764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1520172764L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isInside(Lnet/minecraft/core/Vec3i;)Z", cancellable = true)
    private void isInside__810933640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-810933640L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fromCorners(Lnet/minecraft/core/Vec3i;Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void fromCorners_636526714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(636526714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encapsulate(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void encapsulate_898958838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(898958838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encapsulate(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void encapsulate_409602571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409602571L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intersectingChunks()Ljava/util/stream/Stream;", cancellable = true)
    private void intersectingChunks__1158094542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1158094542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encapsulatingPositions(Ljava/lang/Iterable;)Ljava/util/Optional;", cancellable = true)
    private static void encapsulatingPositions__1871336577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1871336577L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encapsulatingBoxes(Ljava/lang/Iterable;)Ljava/util/Optional;", cancellable = true)
    private static void encapsulatingBoxes__786243250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-786243250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encapsulating(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void encapsulating__1697492992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697492992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getXSpan()I", cancellable = true)
    private void getXSpan_242963264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(242963264L))
            info.setReturnValue(-1041638846);
    }

    @Inject(at = @At("HEAD"), method = "orientBox(IIIIIIIIILnet/minecraft/core/Direction;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void orientBox__1895034723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1895034723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getYSpan()I", cancellable = true)
    private void getYSpan_46449759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(46449759L))
            info.setReturnValue(-719691953);
    }

    @Inject(at = @At("HEAD"), method = "getZSpan()I", cancellable = true)
    private void getZSpan__150063746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150063746L))
            info.setReturnValue(1339580450);
    }


}
