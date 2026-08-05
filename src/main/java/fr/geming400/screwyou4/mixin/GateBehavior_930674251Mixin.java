package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.GateBehavior.class)
public class GateBehavior_930674251Mixin {
        @Inject(at = @At("HEAD"), method = "debugString()Ljava/lang/String;", cancellable = true)
    private void debugString__204786221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-204786221L))
            info.setReturnValue("媔?)'T>$ᔹ.3h'`ZYLs|MA#+b;7UgRU!₈5}dinv枻[g驽h[Z");
    }

    @Inject(at = @At("HEAD"), method = "tryStart(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)Z", cancellable = true)
    private void tryStart_8125900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(8125900L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStatus()Lnet/minecraft/world/entity/ai/behavior/Behavior$Status;", cancellable = true)
    private void getStatus_854392389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854392389L))
            info.setReturnValue(net.minecraft.world.entity.ai.behavior.Behavior.Status.STOPPED);
    }

    @Inject(at = @At("HEAD"), method = "getRequiredMemories()Ljava/util/Set;", cancellable = true)
    private void getRequiredMemories__898361236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-898361236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickOrStop(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void tickOrStop_8122056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(8122056L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doStop(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void doStop_8122056(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(8122056L))
            info.cancel();
    }


}
