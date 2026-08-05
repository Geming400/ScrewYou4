package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.ItemCooldowns.class)
public class ItemCooldowns1774368711Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1812643450(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1812643450L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCooldownGroup(Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getCooldownGroup__1238659383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1238659383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOnCooldown(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void isOnCooldown__786063453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-786063453L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCooldownPercent(Lnet/minecraft/world/item/ItemStack;F)F", cancellable = true)
    private void getCooldownPercent__265122085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-265122085L))
            info.setReturnValue(5.609126E8F);
    }

    @Inject(at = @At("HEAD"), method = "removeCooldown(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void removeCooldown_279927554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(279927554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addCooldown(Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void addCooldown__262336146(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-262336146L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addCooldown(Lnet/minecraft/resources/Identifier;I)V", cancellable = true)
    private void addCooldown__1576234133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1576234133L))
            info.cancel();
    }


}
