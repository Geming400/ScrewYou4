package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.AABB.class)
public class AABB2004606318Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__904849215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-904849215L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_869145847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869145847L))
            info.setReturnValue("e`S!o\u390F*Y\"szR<g\u83DD\u3C1B7%X\u02732^(Gpn|\"e]\u8601Z$\uD1F0'.zU|k\u103A:&Dv\u192AOT<#RcPxAt\u74858@x5\u8887@/myZY=Z-`^O{!\u6418 \u21A7Y6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2042868564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042868564L))
            info.setReturnValue(347197940);
    }

    @Inject(at = @At("HEAD"), method = "min(Lnet/minecraft/core/Direction$Axis;)D", cancellable = true)
    private void min__1123754876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123754876L))
            info.setReturnValue(6.783052005902183E8D);
    }

    @Inject(at = @At("HEAD"), method = "max(Lnet/minecraft/core/Direction$Axis;)D", cancellable = true)
    private void max__1123754876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123754876L))
            info.setReturnValue(6.783052005902183E8D);
    }

    @Inject(at = @At("HEAD"), method = "inflate(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void inflate__1328876518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328876518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inflate(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void inflate__1939594598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939594598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void of__511667351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-511667351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void contains__1922621135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922621135L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "contains(DDD)Z", cancellable = true)
    private void contains_934203289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934203289L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSize()D", cancellable = true)
    private void getSize_2042863759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042863759L))
            info.setReturnValue(6.78305200594055E8D);
    }

    @Inject(at = @At("HEAD"), method = "move(Lorg/joml/Vector3f;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void move_1077815815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077815815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void move__1978886790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978886790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void move_1175874482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175874482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "move(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void move__1328876518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328876518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intersects(Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private void intersects_269141168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(269141168L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "intersects(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void intersects__2121590535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2121590535L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "intersects(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void intersects__752799323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752799323L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "intersects(DDDDDD)Z", cancellable = true)
    private void intersects_498806437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498806437L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "deflate(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void deflate__1328876518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328876518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deflate(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void deflate__1939594598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939594598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "intersect(Lnet/minecraft/world/phys/AABB;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void intersect_1618355953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618355953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ofSize(Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void ofSize_1883420806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1883420806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clip(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Optional;", cancellable = true)
    private void clip_1886814364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886814364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clip(DDDDDDLnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Optional;", cancellable = true)
    private static void clip__846612972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-846612972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clip(Ljava/lang/Iterable;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private static void clip_1052711718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1052711718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getYsize()D", cancellable = true)
    private void getYsize_2042863759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042863759L))
            info.setReturnValue(6.79305600594055E8D);
    }

    @Inject(at = @At("HEAD"), method = "getZsize()D", cancellable = true)
    private void getZsize_2042863759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042863759L))
            info.setReturnValue(6.79305600594055E8D);
    }

    @Inject(at = @At("HEAD"), method = "getXsize()D", cancellable = true)
    private void getXsize_2042863759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042863759L))
            info.setReturnValue(6.79305600594055E8D);
    }

    @Inject(at = @At("HEAD"), method = "getCenter()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getCenter__1192631449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192631449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMinY(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void setMinY__1939594598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939594598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaxY(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void setMaxY__1939594598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939594598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMinPosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getMinPosition__1192631449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192631449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxPosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getMaxPosition__1192631449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192631449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minmax(Lnet/minecraft/world/phys/AABB;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void minmax_1618355953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618355953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/world/phys/AABB;)D", cancellable = true)
    private void distanceToSqr_269120026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(269120026L))
            info.setReturnValue(6.793056008203021E8D);
    }

    @Inject(at = @At("HEAD"), method = "distanceToSqr(Lnet/minecraft/world/phys/Vec3;)D", cancellable = true)
    private void distanceToSqr__1922642277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922642277L))
            info.setReturnValue(6.793056005169188E8D);
    }

    @Inject(at = @At("HEAD"), method = "expandTowards(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void expandTowards_1175874482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175874482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expandTowards(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void expandTowards__1328876518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328876518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collidedAlongVector(Lnet/minecraft/world/phys/Vec3;Ljava/util/List;)Z", cancellable = true)
    private void collidedAlongVector_75994082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(75994082L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "encapsulatingFullBlocks(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void encapsulatingFullBlocks__1049707490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1049707490L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaxZ(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void setMaxZ__1939594598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939594598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMinX(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void setMinX__1939594598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939594598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMinZ(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void setMinZ__1939594598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939594598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasNaN()Z", cancellable = true)
    private void hasNaN_2042884901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042884901L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "contract(DDD)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void contract__1328876518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328876518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMaxX(D)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void setMaxX__1939594598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939594598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unitCubeFromLowerCorner(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private static void unitCubeFromLowerCorner_1175874730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175874730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBottomCenter()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getBottomCenter__1192631449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192631449L))
            info.setReturnValue(null);
    }


}
