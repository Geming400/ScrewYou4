package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.EnchantmentNames.class)
public class EnchantmentNames_2053745699Mixin {
        @Inject(at = @At("HEAD"), method = "getInstance()Lnet/minecraft/client/gui/screens/inventory/EnchantmentNames;", cancellable = true)
    private static void getInstance__339614845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339614845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRandomName(Lnet/minecraft/client/gui/Font;I)Lnet/minecraft/network/chat/FormattedText;", cancellable = true)
    private void getRandomName_617502360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617502360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "initSeed(J)V", cancellable = true)
    private void initSeed__617984592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-617984592L))
            info.cancel();
    }


}
