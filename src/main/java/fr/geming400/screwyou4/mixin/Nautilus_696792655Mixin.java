package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.nautilus.Nautilus.class)
public class Nautilus_696792655Mixin {
        @Inject(at = @At("HEAD"), method = "getMaxAirSupply()I", cancellable = true)
    private void getMaxAirSupply_735054900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735054900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed_735071237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735071237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions__545853390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-545853390L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseTick()V", cancellable = true)
    private void baseTick_735067393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(735067393L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain__2005197784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005197784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/nautilus/Nautilus;", cancellable = true)
    private void getBreedOffspring_1900057919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1900057919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring__2000386060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2000386060L))
            info.setReturnValue(null);
    }


}
