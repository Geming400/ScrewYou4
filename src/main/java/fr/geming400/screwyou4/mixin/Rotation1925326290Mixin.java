package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.Rotation.class)
public class Rotation1925326290Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private static void values_1634146805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1634146805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private static void valueOf_1832881202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832881202L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.CLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "rotate(II)I", cancellable = true)
    private void rotate_929434328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929434328L))
            info.setReturnValue(-271807111);
    }

    @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void rotate__301338671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301338671L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private static void getRandom_2101111644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2101111644L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.CLOCKWISE_180);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lcom/mojang/math/OctahedralGroup;", cancellable = true)
    private void rotation_988526726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988526726L))
            info.setReturnValue(com.mojang.math.OctahedralGroup.ROT_90_Z_POS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_789865819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(789865819L))
            info.setReturnValue("k3RKrFrE6D&J﹛$2ndW䂸䏥\\"IH,a4樜x7n'KwRqO9gzi@ꋫ[颙cw+ CJ`8iDC1#qEJ\"ᘘ<ik9U$j>_;ᎹKve(O:3[DDf奨X5E{J3y");
    }

    @Inject(at = @At("HEAD"), method = "getShuffled(Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private static void getShuffled_1881809754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1881809754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotated(Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotated_1597706737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597706737L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.COUNTERCLOCKWISE_90);
    }


}
