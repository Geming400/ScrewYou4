package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.SocialInteractionsScreen.Page.class)
public class Page_589568637Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/screens/social/SocialInteractionsScreen$Page;", cancellable = true)
    private static void values_1220166750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1220166750L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/screens/social/SocialInteractionsScreen$Page;", cancellable = true)
    private static void valueOf__1767769353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1767769353L))
            info.setReturnValue(net.minecraft.client.gui.screens.social.SocialInteractionsScreen.Page.HIDDEN);
    }


}
