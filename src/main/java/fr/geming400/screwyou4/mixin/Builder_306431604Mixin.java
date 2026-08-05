package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.MemoryMap.Builder.class)
public class Builder_306431604Mixin {
        @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/ai/memory/ExpirableValue;)Lnet/minecraft/world/entity/ai/memory/MemoryMap$Builder;", cancellable = true)
    private void add__712453636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-712453636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/entity/ai/memory/MemoryMap;", cancellable = true)
    private void build_921846006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921846006L))
            info.setReturnValue(null);
    }


}
