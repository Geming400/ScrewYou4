package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetWalkTargetAwayFrom.class)
public class SetWalkTargetAwayFrom1055990854Mixin {
        @Inject(at = @At("HEAD"), method = "pos(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;FIZ)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void pos_1670606169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670606169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entity(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;FIZ)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void entity_509734500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509734500L))
            info.setReturnValue(null);
    }


}
