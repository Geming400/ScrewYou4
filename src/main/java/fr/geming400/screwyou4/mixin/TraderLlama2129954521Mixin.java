package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.TraderLlama.class)
public class TraderLlama2129954521Mixin {
        @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__2126738036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2126738036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__316280837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-316280837L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTraderLlama()Z", cancellable = true)
    private void isTraderLlama__2126734192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2126734192L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setDespawnDelay(I)V", cancellable = true)
    private void setDespawnDelay__951095803(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-951095803L))
            info.cancel();
    }


}
