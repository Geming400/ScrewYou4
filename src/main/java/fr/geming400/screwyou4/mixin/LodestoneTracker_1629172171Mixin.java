package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.LodestoneTracker.class)
public class LodestoneTracker_1629172171Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_720545902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(720545902L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "target()Ljava/util/Optional;", cancellable = true)
    private void target_1385411081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1385411081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1895371601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1895371601L))
            info.setReturnValue("D6YeHy7S\"\uCBC92o%;\uBEF6\u1B31Ed>U F\u00E2'v\u2692");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2108443035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108443035L))
            info.setReturnValue(-307451180);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/item/component/LodestoneTracker;", cancellable = true)
    private void tick__1355951666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1355951666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tracked()Z", cancellable = true)
    private void tracked_144464535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144464535L))
            info.setReturnValue(false);
    }


}
