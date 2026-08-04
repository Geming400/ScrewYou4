package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.TextureFilteringMethod.class)
public class TextureFilteringMethod_1269183852Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/TextureFilteringMethod;", cancellable = true)
    private static void values_1915470094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915470094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/TextureFilteringMethod;", cancellable = true)
    private static void valueOf__348010063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348010063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "caption()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void caption__907725314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907725314L))
            info.setReturnValue(null);
    }


}
