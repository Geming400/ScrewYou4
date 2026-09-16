package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemCooldowns.class)
public class ItemCooldowns1774368711Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1644685053(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1644685053L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isOnCooldown(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isOnCooldown__841735441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-841735441L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCooldownPercent(Lnet/minecraft/world/item/ItemStack;F)F", cancellable = true)
    private void getCooldownPercent__1191458305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191458305L))
            info.setReturnValue(1.090273E8F);
    }

    @Inject(at = @At("HEAD"), method = "addCooldown(Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void addCooldown_91032986(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(91032986L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addCooldown(Lnet/minecraft/resources/Identifier;I)V", cancellable = true)
    private void addCooldown__1222865001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1222865001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCooldownGroup(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getCooldownGroup__883750937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-883750937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeCooldown(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void removeCooldown_176674771(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(176674771L))
            info.cancel();
    }


}
