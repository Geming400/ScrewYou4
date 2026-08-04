package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.MemoryMap.Builder.class)
public class Builder_306431604Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/ai/memory/ExpirableValue;)Lnet/minecraft/world/entity/ai/memory/MemoryMap$Builder;", cancellable = true)
    private void add_1975475803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1975475803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/entity/ai/memory/MemoryMap;", cancellable = true)
    private void build_609564040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609564040L))
            info.setReturnValue(null);
    }


}
