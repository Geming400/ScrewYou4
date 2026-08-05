package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.SetWalkTargetFromBlockMemory.class)
public class SetWalkTargetFromBlockMemory1621619776Mixin {
        @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;FIII)Lnet/minecraft/world/entity/ai/behavior/OneShot;", cancellable = true)
    private static void create__1353787766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1353787766L))
            info.setReturnValue(null);
    }


}
