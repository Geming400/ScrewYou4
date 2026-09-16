package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.DoNothing.class)
public class DoNothing_966454668Mixin {
        @Inject(at = @At("HEAD"), method = "debugString()Ljava/lang/String;", cancellable = true)
    private void debugString_35617368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(35617368L))
            info.setReturnValue("#$g<\u3A64t\u0458o\u39B3LYW\u3851\uD261\u7590\u7DD2?@$2W\u1731oo<|xW\"?2iX");
    }

    @Inject(at = @At("HEAD"), method = "tryStart(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)Z", cancellable = true)
    private void tryStart_1640913350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1640913350L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStatus()Lnet/minecraft/world/entity/ai/behavior/Behavior$Status;", cancellable = true)
    private void getStatus_54942830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(54942830L))
            info.setReturnValue(net.minecraft.world.entity.ai.behavior.Behavior.Status.STOPPED);
    }

    @Inject(at = @At("HEAD"), method = "tickOrStop(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void tickOrStop_1234194247(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1234194247L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doStop(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void doStop_107757628(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(107757628L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRequiredMemories()Ljava/util/Set;", cancellable = true)
    private void getRequiredMemories_1020274073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020274073L))
            info.setReturnValue(null);
    }


}
