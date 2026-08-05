package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.CopyMemoryWithExpiry.class)
public class CopyMemoryWithExpiry_487279353Mixin {
        @Inject(at = @At("HEAD"), method = "create(Ljava/util/function/Predicate;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/util/valueproviders/UniformInt;)Lnet/minecraft/world/entity/ai/behavior/BehaviorControl;", cancellable = true)
    private static void create_1029662914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1029662914L))
            info.setReturnValue(null);
    }


}
