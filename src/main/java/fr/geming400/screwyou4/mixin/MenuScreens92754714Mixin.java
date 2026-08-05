package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.MenuScreens.class)
public class MenuScreens92754714Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/world/inventory/MenuType;Lnet/minecraft/client/gui/screens/MenuScreens$ScreenConstructor;)V", cancellable = true)
    private static void register_505190205(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(505190205L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/inventory/MenuType;Lnet/minecraft/client/Minecraft;ILnet/minecraft/network/chat/Component;)V", cancellable = true)
    private static void create_1969934378(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1969934378L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selfTest()Z", cancellable = true)
    private static void selfTest__2027293045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2027293045L))
            info.setReturnValue(true);
    }


}
