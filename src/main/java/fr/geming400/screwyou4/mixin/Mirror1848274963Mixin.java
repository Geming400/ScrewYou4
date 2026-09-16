package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.Mirror.class)
public class Mirror1848274963Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/Mirror;", cancellable = true)
    private static void values_513081971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(513081971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/Mirror;", cancellable = true)
    private static void valueOf_1522531066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1522531066L))
            info.setReturnValue(net.minecraft.world.level.block.Mirror.FRONT_BACK);
    }

    @Inject(at = @At("HEAD"), method = "symbol()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void symbol__826644418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-826644418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mirror(Lnet/minecraft/core/Direction;)Lnet/minecraft/core/Direction;", cancellable = true)
    private void mirror_1248996817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1248996817L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "mirror(II)I", cancellable = true)
    private void mirror__1963785094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1963785094L))
            info.setReturnValue(-1659922429);
    }

    @Inject(at = @At("HEAD"), method = "rotation()Lcom/mojang/math/OctahedralGroup;", cancellable = true)
    private void rotation__1305384439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1305384439L))
            info.setReturnValue(com.mojang.math.OctahedralGroup.ROT_90_X_POS);
    }

    @Inject(at = @At("HEAD"), method = "getRotation(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation_730282157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730282157L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.CLOCKWISE_180);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1936483585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936483585L))
            info.setReturnValue("TAiA-'rpALw`/QdtynT\uB454x2n6}h\uB51Bv4)z\u89B9}ELSXT.S  3qfK;2\"trrn^gP \u3C7FF?\u9470\u7BD8f |=.Nn");
    }


}
