package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.PreferredGraphicsApi.class)
public class PreferredGraphicsApi705889106Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/PreferredGraphicsApi;", cancellable = true)
    private static void values_1104707545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104707545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/PreferredGraphicsApi;", cancellable = true)
    private static void valueOf_241690098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(241690098L))
            info.setReturnValue(net.minecraft.client.PreferredGraphicsApi.DEFAULT);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption_1115414091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115414091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBackendsToTry()[Lcom/mojang/blaze3d/systems/GpuBackend;", cancellable = true)
    private void getBackendsToTry_846676810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846676810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_794097728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(794097728L))
            info.setReturnValue("\u83FD#\uAFD8-}EN!VS,Ct+'\uB3BAxiH]u(d(\u4FDB*F3\uB4817*rmgvDMh\u18AAj\u5187\u46FA$\u6D94R");
    }


}
