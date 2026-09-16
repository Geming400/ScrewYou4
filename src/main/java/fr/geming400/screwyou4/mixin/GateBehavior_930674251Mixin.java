package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.GateBehavior.class)
public class GateBehavior_930674251Mixin {
        @Inject(at = @At("HEAD"), method = "debugString()Ljava/lang/String;", cancellable = true)
    private void debugString__163049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-163049L))
            info.setReturnValue("Pe$/b3q{1E\u644A=-01gI9D;\u1FB89>.\u9D54y=x{!na7gH'p%\u0204t)HTYXmq\u6539!W@ub[hPr<1<|tV= w$\u66F8SLPbq!NrU^+@`/\u4C97i\uB459");
    }

    @Inject(at = @At("HEAD"), method = "tryStart(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)Z", cancellable = true)
    private void tryStart_1605132933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605132933L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStatus()Lnet/minecraft/world/entity/ai/behavior/Behavior$Status;", cancellable = true)
    private void getStatus_19162413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19162413L))
            info.setReturnValue(net.minecraft.world.entity.ai.behavior.Behavior.Status.STOPPED);
    }

    @Inject(at = @At("HEAD"), method = "tickOrStop(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void tickOrStop_1198413830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1198413830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doStop(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", cancellable = true)
    private void doStop_71977211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(71977211L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRequiredMemories()Ljava/util/Set;", cancellable = true)
    private void getRequiredMemories_984493656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984493656L))
            info.setReturnValue(null);
    }


}
