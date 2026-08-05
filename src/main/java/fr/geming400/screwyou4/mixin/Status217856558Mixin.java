package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.Behavior.Status.class)
public class Status217856558Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/behavior/Behavior$Status;", cancellable = true)
    private static void values_978417272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(978417272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/behavior/Behavior$Status;", cancellable = true)
    private static void valueOf__81755905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81755905L))
            info.setReturnValue(net.minecraft.world.entity.ai.behavior.Behavior.Status.RUNNING);
    }


}
