package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.MemoryMap.Value.class)
public class Value_1117925710Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;", cancellable = true)
    private void type_1827445448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827445448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/entity/ai/memory/ExpirableValue;", cancellable = true)
    private void value__270068354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-270068354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1791529328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1791529328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__17534266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-17534266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1156188451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156188451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createUnchecked(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;Lnet/minecraft/world/entity/ai/memory/ExpirableValue;)Lnet/minecraft/world/entity/ai/memory/MemoryMap$Value;", cancellable = true)
    private static void createUnchecked_465281815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(465281815L))
            info.setReturnValue(null);
    }


}
