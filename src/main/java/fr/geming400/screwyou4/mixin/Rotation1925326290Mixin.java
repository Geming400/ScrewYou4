package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.Rotation.class)
public class Rotation1925326290Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private static void values__1844355949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844355949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private static void valueOf_1868582746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1868582746L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.NONE);
    }

    @Inject(at = @At("HEAD"), method = "rotate(II)I", cancellable = true)
    private void rotate__166493923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-166493923L))
            info.setReturnValue(742597609);
    }

    @Inject(at = @At("HEAD"), method = "rotate(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void rotate__728992468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-728992468L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }

    @Inject(at = @At("HEAD"), method = "getRandom(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private static void getRandom_1937777283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937777283L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.NONE);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lcom/mojang/math/OctahedralGroup;", cancellable = true)
    private void rotation__1228333112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1228333112L))
            info.setReturnValue(com.mojang.math.OctahedralGroup.SWAP_NEG_YZ);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2013534912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013534912L))
            info.setReturnValue("-)|\u7ACE{F\u888F6X\u1F09L2+");
    }

    @Inject(at = @At("HEAD"), method = "getRotated(Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotated__1345889500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1345889500L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.COUNTERCLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "getShuffled(Lnet/minecraft/util/RandomSource;)Ljava/util/List;", cancellable = true)
    private static void getShuffled_960596985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960596985L))
            info.setReturnValue(null);
    }


}
