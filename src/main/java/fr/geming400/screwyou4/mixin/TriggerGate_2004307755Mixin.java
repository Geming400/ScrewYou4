package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.TriggerGate.class)
public class TriggerGate_2004307755Mixin {
        @Inject(at = @At("HEAD"), method = "triggerGate(Ljava/util/List;Lnet/minecraft/world/entity/ai/behavior/GateBehavior$OrderPolicy;Lnet/minecraft/world/entity/ai/behavior/GateBehavior$RunningPolicy;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void triggerGate__808285468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-808285468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerOneShuffled(Ljava/util/List;)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void triggerOneShuffled__823874135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823874135L))
            info.setReturnValue(null);
    }


}
