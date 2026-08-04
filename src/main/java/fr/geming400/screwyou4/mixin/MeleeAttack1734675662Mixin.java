package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.MeleeAttack.class)
public class MeleeAttack1734675662Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;I)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__1509092773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1509092773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(I)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create_739280076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(739280076L))
            info.setReturnValue(null);
    }


}
