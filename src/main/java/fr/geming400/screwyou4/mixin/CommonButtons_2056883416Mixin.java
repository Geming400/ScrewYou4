package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.CommonButtons.class)
public class CommonButtons_2056883416Mixin {
        @Inject(at = @At("HEAD"), method = "language(ILnet/minecraft/client/gui/components/Button$OnPress;Z)Lnet/minecraft/client/gui/components/SpriteIconButton;", cancellable = true)
    private static void language_463175559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463175559L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "accessibility(ILnet/minecraft/client/gui/components/Button$OnPress;Z)Lnet/minecraft/client/gui/components/SpriteIconButton;", cancellable = true)
    private static void accessibility__1349125763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1349125763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "friends(ILnet/minecraft/client/gui/components/Button$OnPress;Z)Lnet/minecraft/client/gui/components/FriendsButton;", cancellable = true)
    private static void friends__399743723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399743723L))
            info.setReturnValue(null);
    }


}
