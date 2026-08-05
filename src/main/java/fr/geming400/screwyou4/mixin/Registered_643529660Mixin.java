package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.declarative.MemoryCondition.Registered.class)
public class Registered_643529660Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2029041918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029041918L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__491930316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491930316L))
            info.setReturnValue("+yn- \u61F2w\u9B52Un8{\u5E083j_1e>4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_681792401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(681792401L))
            info.setReturnValue(1401908280);
    }

    @Inject(at = @At("HEAD"), method = "condition()Lnet/minecraft/world/entity/ai/memory/MemoryStatus;", cancellable = true)
    private void condition_166915466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166915466L))
            info.setReturnValue(net.minecraft.world.entity.ai.memory.MemoryStatus.VALUE_ABSENT);
    }

    @Inject(at = @At("HEAD"), method = "memory()Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;", cancellable = true)
    private void memory_1353049398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1353049398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAccessor(Lnet/minecraft/world/entity/ai/Brain;Ljava/util/Optional;)Lnet/minecraft/world/entity/ai/behavior/declarative/MemoryAccessor;", cancellable = true)
    private void createAccessor__1883315843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1883315843L))
            info.setReturnValue(null);
    }


}
