package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.MeleeAttack.class)
public class MeleeAttack1734675662Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;I)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_1290033119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290033119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(I)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__1275098800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1275098800L))
            info.setReturnValue(null);
    }


}
