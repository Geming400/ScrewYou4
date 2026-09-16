package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.nautilus.Nautilus.class)
public class Nautilus_696792655Mixin {
        @Inject(at = @At("HEAD"), method = "getDefaultDimensions(Lnet/minecraft/world/entity/Pose;)Lnet/minecraft/world/entity/EntityDimensions;", cancellable = true)
    private void getDefaultDimensions_1692003946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692003946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxAirSupply()I", cancellable = true)
    private void getMaxAirSupply_1684453065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684453065L))
            info.setReturnValue(-1200675425);
    }

    @Inject(at = @At("HEAD"), method = "canBeLeashed()Z", cancellable = true)
    private void canBeLeashed__1251279460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1251279460L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBrain()Lnet/minecraft/world/entity/ai/Brain;", cancellable = true)
    private void getBrain_510890728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(510890728L))
            info.setReturnValue(new net.minecraft.world.entity.ai.Brain());
    }

    @Inject(at = @At("HEAD"), method = "baseTick()V", cancellable = true)
    private void baseTick_359504307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(359504307L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/AgeableMob;", cancellable = true)
    private void getBreedOffspring_836676754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(836676754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreedOffspring(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/AgeableMob;)Lnet/minecraft/world/entity/animal/nautilus/Nautilus;", cancellable = true)
    private void getBreedOffspring_1966558557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1966558557L))
            info.setReturnValue(null);
    }


}
