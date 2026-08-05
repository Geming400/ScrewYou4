package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.BanNoticeScreens.class)
public class BanNoticeScreens179093224Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;Lcom/mojang/authlib/minecraft/BanDetails;)Lnet/minecraft/client/gui/screens/ConfirmLinkScreen;", cancellable = true)
    private static void create_1293101843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1293101843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNameBan(Ljava/lang/String;Ljava/lang/Runnable;)Lnet/minecraft/client/gui/screens/ConfirmLinkScreen;", cancellable = true)
    private static void createNameBan_925414028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925414028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSkinBan(Ljava/lang/Runnable;)Lnet/minecraft/client/gui/screens/ConfirmLinkScreen;", cancellable = true)
    private static void createSkinBan_1447869910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447869910L))
            info.setReturnValue(null);
    }


}
