package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Ghast.RandomFloatAroundGoal.class)
public class RandomFloatAroundGoal_667440016Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start_705714754(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(705714754L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse_705718598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705718598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSuitableFlyToPosition(Lnet/minecraft/world/entity/Mob;I)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getSuitableFlyToPosition_1034175247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034175247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse_705718598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705718598L))
            info.setReturnValue(null);
    }


}
