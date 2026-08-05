package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.BoundingBox.class)
public class BoundingBox_1340119047Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1569336487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569336487L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_204658575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(204658575L))
            info.setReturnValue("鐔Mp婐,rxa港N2嬩`{蹵6唓[6;㍵!['>&.㫽");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1378381292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378381292L))
            info.setReturnValue(-88685527);
    }

    @Inject(at = @At("HEAD"), method = "getLength()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void getLength_955720582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955720582L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void move__1188517969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188517969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(III)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void move_429051031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429051031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intersects(IIII)Z", cancellable = true)
    private void intersects__1340505091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340505091L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "intersects(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Z", cancellable = true)
    private void intersects__1382348088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382348088L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "moved(III)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void moved_429051031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429051031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "infinite()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void infinite_1510267080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510267080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forAllCorners(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forAllCorners_2021135459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2021135459L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "encapsulating(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void encapsulating_187111218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(187111218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encapsulatingBoxes(Ljava/lang/Iterable;)Ljava/util/Optional;", cancellable = true)
    private static void encapsulatingBoxes_1897675203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897675203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encapsulatingPositions(Ljava/lang/Iterable;)Ljava/util/Optional;", cancellable = true)
    private static void encapsulatingPositions_1897675203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897675203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxX()I", cancellable = true)
    private void maxX_1378381292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378381292L))
            info.setReturnValue(-88685527);
    }

    @Inject(at = @At("HEAD"), method = "minX()I", cancellable = true)
    private void minX_1378381292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378381292L))
            info.setReturnValue(-88685527);
    }

    @Inject(at = @At("HEAD"), method = "maxZ()I", cancellable = true)
    private void maxZ_1378381292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378381292L))
            info.setReturnValue(-88685527);
    }

    @Inject(at = @At("HEAD"), method = "minY()I", cancellable = true)
    private void minY_1378381292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378381292L))
            info.setReturnValue(-88685527);
    }

    @Inject(at = @At("HEAD"), method = "maxY()I", cancellable = true)
    private void maxY_1378381292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378381292L))
            info.setReturnValue(-88685527);
    }

    @Inject(at = @At("HEAD"), method = "minZ()I", cancellable = true)
    private void minZ_1378381292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378381292L))
            info.setReturnValue(-88685527);
    }

    @Inject(at = @At("HEAD"), method = "getCenter()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getCenter__553267833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-553267833L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInside(Lnet/minecraft/core/Vec3i;)Z", cancellable = true)
    private void isInside__277963522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-277963522L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isInside(III)Z", cancellable = true)
    private void isInside_560030486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(560030486L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "orientBox(IIIIIIIIILnet/minecraft/core/Direction;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void orientBox__1083512797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1083512797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getYSpan()I", cancellable = true)
    private void getYSpan_1378381292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378381292L))
            info.setReturnValue(-88685527);
    }

    @Inject(at = @At("HEAD"), method = "getXSpan()I", cancellable = true)
    private void getXSpan_1378381292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378381292L))
            info.setReturnValue(-88685527);
    }

    @Inject(at = @At("HEAD"), method = "getZSpan()I", cancellable = true)
    private void getZSpan_1378381292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1378381292L))
            info.setReturnValue(-88685527);
    }

    @Inject(at = @At("HEAD"), method = "fromCorners(Lnet/minecraft/core/Vec3i;Lnet/minecraft/core/Vec3i;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void fromCorners_481644486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(481644486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encapsulate(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void encapsulate_617379964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617379964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encapsulate(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void encapsulate__630646491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630646491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intersectingChunks()Ljava/util/stream/Stream;", cancellable = true)
    private void intersectingChunks_1129412731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129412731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inflatedBy(I)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void inflatedBy__2072124041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072124041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inflatedBy(III)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void inflatedBy_429051031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429051031L))
            info.setReturnValue(null);
    }


}
