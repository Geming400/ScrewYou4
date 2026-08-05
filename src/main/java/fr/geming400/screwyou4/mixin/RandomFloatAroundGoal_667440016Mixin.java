package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Ghast.RandomFloatAroundGoal.class)
public class RandomFloatAroundGoal_667440016Mixin {
        @Inject(at = @At("HEAD"), method = "start()V", cancellable = true)
    private void start__958725344(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-958725344L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUse()Z", cancellable = true)
    private void canUse__247000049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-247000049L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSuitableFlyToPosition(Lnet/minecraft/world/entity/Mob;I)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getSuitableFlyToPosition_1072667465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072667465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canContinueToUse()Z", cancellable = true)
    private void canContinueToUse__22195279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-22195279L))
            info.setReturnValue(true);
    }


}
