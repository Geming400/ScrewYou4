package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.MipmapStrategy.class)
public class MipmapStrategy_1960073321Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/texture/MipmapStrategy;", cancellable = true)
    private static void values__1739114054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739114054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/texture/MipmapStrategy;", cancellable = true)
    private static void valueOf_883243521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883243521L))
            info.setReturnValue(net.minecraft.client.renderer.texture.MipmapStrategy.AUTO);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2048281942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2048281942L))
            info.setReturnValue("\u6B38\uA502,2TY<{+]fahh;\"9\uFED7\u6358GgI;Ho-");
    }


}
