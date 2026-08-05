package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.arrow.ThrownTrident.class)
public class ThrownTrident_1162733380Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1201008118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1201008118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerTouch(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void playerTouch_2103335025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2103335025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(DDD)Z", cancellable = true)
    private void shouldRender_92330350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92330350L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getWeaponItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getWeaponItem_1686152039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1686152039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFoil()Z", cancellable = true)
    private void isFoil_1201011962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201011962L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tickDespawn()V", cancellable = true)
    private void tickDespawn_1201008118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1201008118L))
            info.cancel();
    }


}
