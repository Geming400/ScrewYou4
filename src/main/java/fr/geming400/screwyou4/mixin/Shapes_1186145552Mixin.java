package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.Shapes.class)
public class Shapes_1186145552Mixin {
        @Inject(at = @At("HEAD"), method = "join(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/BooleanOp;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void join_21815206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21815206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void empty__374145994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-374145994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/phys/AABB;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void create_1713869314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1713869314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(DDDDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void create_1721976165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721976165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box(DDDDDD)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void box_963842292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(963842292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "collide(Lnet/minecraft/core/Direction$Axis;Lnet/minecraft/world/phys/AABB;Ljava/lang/Iterable;D)D", cancellable = true)
    private static void collide_1226473723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1226473723L))
            info.setReturnValue(2.2991970080450025E8D);
    }

    @Inject(at = @At("HEAD"), method = "equal(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;)Z", cancellable = true)
    private static void equal__2011204272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2011204272L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "block()Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void block__892028042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-892028042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/phys/shapes/VoxelShape;Lcom/mojang/math/OctahedralGroup;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void rotate_28699434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(28699434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/world/phys/shapes/VoxelShape;Lcom/mojang/math/OctahedralGroup;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void rotate_1850267900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1850267900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "or(Lnet/minecraft/world/phys/shapes/VoxelShape;[Lnet/minecraft/world/phys/shapes/VoxelShape;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void or__456820453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-456820453L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "or(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void or__1320879162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1320879162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinIsNotEmpty(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/BooleanOp;)Z", cancellable = true)
    private static void joinIsNotEmpty_733661765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(733661765L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "rotateAll(Lnet/minecraft/world/phys/shapes/VoxelShape;)Ljava/util/Map;", cancellable = true)
    private static void rotateAll_1937395468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937395468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAll(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Map;", cancellable = true)
    private static void rotateAll__532324290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532324290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAll(Lnet/minecraft/world/phys/shapes/VoxelShape;Lcom/mojang/math/OctahedralGroup;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Map;", cancellable = true)
    private static void rotateAll__1960359503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1960359503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateHorizontalAxis(Lnet/minecraft/world/phys/shapes/VoxelShape;)Ljava/util/Map;", cancellable = true)
    private static void rotateHorizontalAxis__194119182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-194119182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateHorizontalAxis(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Map;", cancellable = true)
    private static void rotateHorizontalAxis_1723193496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723193496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAttachFace(Lnet/minecraft/world/phys/shapes/VoxelShape;)Ljava/util/Map;", cancellable = true)
    private static void rotateAttachFace__1987902347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987902347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAttachFace(Lnet/minecraft/world/phys/shapes/VoxelShape;Lcom/mojang/math/OctahedralGroup;)Ljava/util/Map;", cancellable = true)
    private static void rotateAttachFace_1302717360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302717360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "faceShapeOccludes(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;)Z", cancellable = true)
    private static void faceShapeOccludes__2006884570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006884570L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "blockOccludes(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void blockOccludes__1598680759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1598680759L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mergedFaceOccludes(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void mergedFaceOccludes_1288616109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288616109L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "rotateHorizontal(Lnet/minecraft/world/phys/shapes/VoxelShape;)Ljava/util/Map;", cancellable = true)
    private static void rotateHorizontal_1984746067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984746067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateHorizontal(Lnet/minecraft/world/phys/shapes/VoxelShape;Lcom/mojang/math/OctahedralGroup;)Ljava/util/Map;", cancellable = true)
    private static void rotateHorizontal_1335216530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335216530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateHorizontal(Lnet/minecraft/world/phys/shapes/VoxelShape;Lcom/mojang/math/OctahedralGroup;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Map;", cancellable = true)
    private static void rotateHorizontal__2005134088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005134088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAllAxis(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/Vec3;)Ljava/util/Map;", cancellable = true)
    private static void rotateAllAxis__748250817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748250817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateAllAxis(Lnet/minecraft/world/phys/shapes/VoxelShape;)Ljava/util/Map;", cancellable = true)
    private static void rotateAllAxis_1890349611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1890349611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "joinUnoptimized(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/world/phys/shapes/BooleanOp;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void joinUnoptimized_1403575148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403575148L))
            info.setReturnValue(null);
    }


}
