package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.equine.TraderLlama.class)
public class TraderLlama2129954521Mixin {
        @Inject(at = @At("HEAD"), method = "setDespawnDelay(I)V", cancellable = true)
    private void setDespawnDelay_1281347920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1281347920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__533715208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-533715208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTraderLlama()Z", cancellable = true)
    private void isTraderLlama_379892979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379892979L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1414914466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1414914466L))
            info.setReturnValue(null);
    }


}
