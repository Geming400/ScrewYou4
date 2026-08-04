package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.language.ClientLanguage.class)
public class ClientLanguage1055869517Mixin {
        @Inject(at = @At("HEAD"), method = "getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void getOrDefault__1002218814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002218814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "has(Ljava/lang/String;)Z", cancellable = true)
    private void has__2086732786(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2086732786L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDefaultRightToLeft()Z", cancellable = true)
    private void isDefaultRightToLeft_1094148100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094148100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVisualOrder(Lnet/minecraft/network/chat/FormattedText;)Lnet/minecraft/util/FormattedCharSequence;", cancellable = true)
    private void getVisualOrder_1833512889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833512889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "loadFrom(Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/List;Z)Lnet/minecraft/client/resources/language/ClientLanguage;", cancellable = true)
    private static void loadFrom__114237823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-114237823L))
            info.setReturnValue(null);
    }


}
