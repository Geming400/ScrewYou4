package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.TextureFilteringMethod.class)
public class TextureFilteringMethod_1269183852Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/TextureFilteringMethod;", cancellable = true)
    private static void values__1484123728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484123728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/TextureFilteringMethod;", cancellable = true)
    private static void valueOf__1915202167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915202167L))
            info.setReturnValue(net.minecraft.client.TextureFilteringMethod.ANISOTROPIC);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption_1678708836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1678708836L))
            info.setReturnValue(null);
    }


}
