package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.declarative.MemoryCondition.Present.class)
public class Present_1837637925Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_929011656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929011656L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1686905847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1686905847L))
            info.setReturnValue("W2E2gYE<4k\uB11F\u3D20\uA791\u8B6B\u7547JdC\u4F0Ap\uCDDADQV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1899977281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1899977281L))
            info.setReturnValue(-1349967657);
    }

    @Inject(at = @At("HEAD"), method = "condition()Lnet/minecraft/world/entity/ai/memory/MemoryStatus;", cancellable = true)
    private void condition__61193352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-61193352L))
            info.setReturnValue(net.minecraft.world.entity.ai.memory.MemoryStatus.VALUE_ABSENT);
    }

    @Inject(at = @At("HEAD"), method = "createAccessor(Lnet/minecraft/world/entity/ai/Brain;Ljava/util/Optional;)Lnet/minecraft/world/entity/ai/behavior/declarative/MemoryAccessor;", cancellable = true)
    private void createAccessor__912287159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-912287159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memory()Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;", cancellable = true)
    private void memory_1777957118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1777957118L))
            info.setReturnValue(null);
    }


}
