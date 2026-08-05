package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.arrow.ThrownTrident.class)
public class ThrownTrident_1162733380Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1033049721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1033049721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWeaponItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getWeaponItem_1138767276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1138767276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerTouch(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void playerTouch_1114619859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1114619859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(DDD)Z", cancellable = true)
    private void shouldRender_1315475863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315475863L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isFoil()Z", cancellable = true)
    private void isFoil_376676036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(376676036L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tickDespawn()V", cancellable = true)
    private void tickDespawn_1973104857(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1973104857L))
            info.cancel();
    }


}
