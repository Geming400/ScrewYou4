package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.EnchantmentMenu.class)
public class EnchantmentMenu1871825352Mixin {
        @Inject(at = @At("HEAD"), method = "removed(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void removed__1482540298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1482540298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__1549446194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1549446194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotsChanged(Lnet/minecraft/world/Container;)V", cancellable = true)
    private void slotsChanged__889388702(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-889388702L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clickMenuButton(Lnet/minecraft/world/entity/player/Player;I)Z", cancellable = true)
    private void clickMenuButton_993109213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993109213L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getEnchantmentSeed()I", cancellable = true)
    private void getEnchantmentSeed_1910087598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910087598L))
            info.setReturnValue(-1880098690);
    }

    @Inject(at = @At("HEAD"), method = "getGoldCount()I", cancellable = true)
    private void getGoldCount_1910087598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910087598L))
            info.setReturnValue(-1880098690);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1482536454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1482536454L))
            info.setReturnValue(true);
    }


}
