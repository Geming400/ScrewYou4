package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.BanNoticeScreens.class)
public class BanNoticeScreens179093224Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;Lcom/mojang/authlib/minecraft/BanDetails;)Lnet/minecraft/client/gui/screens/ConfirmLinkScreen;", cancellable = true)
    private static void create__900734569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900734569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSkinBan(Ljava/lang/Runnable;)Lnet/minecraft/client/gui/screens/ConfirmLinkScreen;", cancellable = true)
    private static void createSkinBan__376331892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376331892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNameBan(Ljava/lang/String;Ljava/lang/Runnable;)Lnet/minecraft/client/gui/screens/ConfirmLinkScreen;", cancellable = true)
    private static void createNameBan__725382796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-725382796L))
            info.setReturnValue(null);
    }


}
