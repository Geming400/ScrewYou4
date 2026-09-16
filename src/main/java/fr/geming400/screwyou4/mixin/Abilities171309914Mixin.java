package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.Abilities.class)
public class Abilities171309914Mixin {
        @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/entity/player/Abilities$Packed;)V", cancellable = true)
    private void apply__2053755161(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2053755161L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/entity/player/Abilities$Packed;", cancellable = true)
    private void pack__631213126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-631213126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlyingSpeed()F", cancellable = true)
    private void getFlyingSpeed__536786565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536786565L))
            info.setReturnValue(2.842576E8F);
    }

    @Inject(at = @At("HEAD"), method = "getWalkingSpeed()F", cancellable = true)
    private void getWalkingSpeed_1213808569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213808569L))
            info.setReturnValue(2.842576E8F);
    }

    @Inject(at = @At("HEAD"), method = "setFlyingSpeed(F)V", cancellable = true)
    private void setFlyingSpeed__890661703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-890661703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setWalkingSpeed(F)V", cancellable = true)
    private void setWalkingSpeed_690346963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(690346963L))
            info.cancel();
    }


}
