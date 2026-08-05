package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.EraseMemoryIf.class)
public class EraseMemoryIf_1092131466Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create__757238758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-757238758L))
            info.setReturnValue(null);
    }


}
