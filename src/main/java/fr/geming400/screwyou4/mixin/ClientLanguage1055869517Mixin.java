package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.language.ClientLanguage.class)
public class ClientLanguage1055869517Mixin {
        @Inject(at = @At("HEAD"), method = "getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void getOrDefault__450603798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-450603798L))
            info.setReturnValue("R\u5E65");
    }

    @Inject(at = @At("HEAD"), method = "has(Ljava/lang/String;)Z", cancellable = true)
    private void has__1897325516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897325516L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getVisualOrder(Lnet/minecraft/network/chat/FormattedText;)Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void getVisualOrder__2100124047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2100124047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDefaultRightToLeft()Z", cancellable = true)
    private void isDefaultRightToLeft__1229608899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1229608899L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "loadFrom(Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/List;Z)Lnet/minecraft/client/resources/language/ClientLanguage;", cancellable = true)
    private static void loadFrom_1469928145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469928145L))
            info.setReturnValue(null);
    }


}
