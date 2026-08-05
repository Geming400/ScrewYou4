package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.goal.Goal.Flag.class)
public class Flag_1238531033Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/goal/Goal$Flag;", cancellable = true)
    private static void values_2130254920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130254920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/goal/Goal$Flag;", cancellable = true)
    private static void valueOf_1651725199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651725199L))
            info.setReturnValue(net.minecraft.world.entity.ai.goal.Goal.Flag.MOVE);
    }


}
