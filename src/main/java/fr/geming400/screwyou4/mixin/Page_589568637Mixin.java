package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.SocialInteractionsScreen.Page.class)
public class Page_589568637Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/social/SocialInteractionsScreen$Page;", cancellable = true)
    private static void values__1840031172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1840031172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/social/SocialInteractionsScreen$Page;", cancellable = true)
    private static void valueOf_1124928799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1124928799L))
            info.setReturnValue(null);
    }


}
