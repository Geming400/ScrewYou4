package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.PreferredGraphicsApi.class)
public class PreferredGraphicsApi705889106Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/PreferredGraphicsApi;", cancellable = true)
    private static void values_1564110519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1564110519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/PreferredGraphicsApi;", cancellable = true)
    private static void valueOf__865057766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-865057766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption__1471020059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1471020059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__429571365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429571365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBackendsToTry()[Lcom/mojang/blaze3d/systems/GpuBackend;", cancellable = true)
    private void getBackendsToTry__891965601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-891965601L))
            info.setReturnValue(null);
    }


}
