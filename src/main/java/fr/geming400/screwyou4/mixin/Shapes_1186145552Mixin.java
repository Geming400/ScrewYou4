package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.Shapes.class)
public class Shapes_1186145552Mixin {
        @Inject(at = @At("HEAD"), method = "join(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/BooleanOp;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void join_466610448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466610448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void empty__695524119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695524119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/phys/AABB;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void create_686353022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686353022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(DDDDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void create__256788119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256788119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box(DDDDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void box__256788119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256788119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collide(Lnet/minecraft/core/Direction$Axis;Lnet/minecraft/world/phys/AABB;Ljava/lang/Iterable;D)D", cancellable = true)
    private static void collide__385177155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-385177155L))
            info.setReturnValue(9.310979006107585E8D);
    }

    @Inject(at = @At("HEAD"), method = "equal(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;)Z", cancellable = true)
    private static void equal_1603534852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603534852L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void block__695524119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695524119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/phys/shapes/VoxelShape;Lcom/mojang/math/OctahedralGroup;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void rotate_1455989413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455989413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/phys/shapes/VoxelShape;Lcom/mojang/math/OctahedralGroup;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void rotate__473042399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-473042399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "or(Lnet/minecraft/world/phys/shapes/VoxelShape;[Lnet/minecraft/world/phys/shapes/VoxelShape;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void or_1471965086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1471965086L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "or(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void or__565923613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-565923613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAll(Lnet/minecraft/world/phys/shapes/VoxelShape;)Ljava/util/Map;", cancellable = true)
    private static void rotateAll_264102418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264102418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAll(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Map;", cancellable = true)
    private static void rotateAll_1634790520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634790520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAll(Lnet/minecraft/world/phys/shapes/VoxelShape;Lcom/mojang/math/OctahedralGroup;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Map;", cancellable = true)
    private static void rotateAll_1406119095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406119095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAllAxis(Lnet/minecraft/world/phys/shapes/VoxelShape;)Ljava/util/Map;", cancellable = true)
    private static void rotateAllAxis_264102418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264102418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAllAxis(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Map;", cancellable = true)
    private static void rotateAllAxis_1634790520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634790520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateHorizontal(Lnet/minecraft/world/phys/shapes/VoxelShape;Lcom/mojang/math/OctahedralGroup;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Map;", cancellable = true)
    private static void rotateHorizontal_1406119095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406119095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateHorizontal(Lnet/minecraft/world/phys/shapes/VoxelShape;Lcom/mojang/math/OctahedralGroup;)Ljava/util/Map;", cancellable = true)
    private static void rotateHorizontal__545919565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-545919565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateHorizontal(Lnet/minecraft/world/phys/shapes/VoxelShape;)Ljava/util/Map;", cancellable = true)
    private static void rotateHorizontal_264102418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264102418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergedFaceOccludes(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void mergedFaceOccludes_1904411536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904411536L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "faceShapeOccludes(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;)Z", cancellable = true)
    private static void faceShapeOccludes_1603534852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603534852L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "blockOccludes(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void blockOccludes_1904411536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904411536L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "rotateHorizontalAxis(Lnet/minecraft/world/phys/shapes/VoxelShape;)Ljava/util/Map;", cancellable = true)
    private static void rotateHorizontalAxis_264102418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264102418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateHorizontalAxis(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Map;", cancellable = true)
    private static void rotateHorizontalAxis_1634790520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634790520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAttachFace(Lnet/minecraft/world/phys/shapes/VoxelShape;Lcom/mojang/math/OctahedralGroup;)Ljava/util/Map;", cancellable = true)
    private static void rotateAttachFace__545919565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-545919565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAttachFace(Lnet/minecraft/world/phys/shapes/VoxelShape;)Ljava/util/Map;", cancellable = true)
    private static void rotateAttachFace_264102418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264102418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinUnoptimized(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/BooleanOp;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void joinUnoptimized_466610448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466610448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinIsNotEmpty(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/BooleanOp;)Z", cancellable = true)
    private static void joinIsNotEmpty__597250569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-597250569L))
            info.setReturnValue(false);
    }


}
