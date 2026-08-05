package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.EnchantmentNames.class)
public class EnchantmentNames_2053745699Mixin {
        @Inject(at = @At("HEAD"), method = "getInstance()Lnet/minecraft/client/gui/screens/inventory/EnchantmentNames;", cancellable = true)
    private static void getInstance__587359186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-587359186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initSeed(J)V", cancellable = true)
    private void initSeed__1026381105(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1026381105L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomName(Lnet/minecraft/client/gui/Font;I)Lnet/minecraft/network/chat/FormattedText;", cancellable = true)
    private void getRandomName_1994662836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994662836L))
            info.setReturnValue(null);
    }


}
