package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.CommonButtons.class)
public class CommonButtons_2056883416Mixin {
        @Inject(at = @At("HEAD"), method = "language(ILnet/minecraft/client/gui/components/Button$OnPress;Z)Lnet/minecraft/client/gui/components/SpriteIconButton;", cancellable = true)
    private static void language__2133541841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133541841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accessibility(ILnet/minecraft/client/gui/components/Button$OnPress;Z)Lnet/minecraft/client/gui/components/SpriteIconButton;", cancellable = true)
    private static void accessibility__2133541841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133541841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "friends(ILnet/minecraft/client/gui/components/Button$OnPress;Z)Lnet/minecraft/client/gui/components/FriendsButton;", cancellable = true)
    private static void friends__1481017206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1481017206L))
            info.setReturnValue(null);
    }


}
