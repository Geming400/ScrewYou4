package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.DoNothing.class)
public class DoNothing_966454668Mixin {
        @Inject(at = @At("HEAD"), method = "debugString()Ljava/lang/String;", cancellable = true)
    private void debugString__169005804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-169005804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryStart(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)Z", cancellable = true)
    private void tryStart_43906317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43906317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStatus()Lnet/minecraft/world/entity/ai/behavior/Behavior$Status;", cancellable = true)
    private void getStatus_890172806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(890172806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doStop(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void doStop_43902473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(43902473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickOrStop(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void tickOrStop_43902473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(43902473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRequiredMemories()Ljava/util/Set;", cancellable = true)
    private void getRequiredMemories__862580819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-862580819L))
            info.setReturnValue(null);
    }


}
