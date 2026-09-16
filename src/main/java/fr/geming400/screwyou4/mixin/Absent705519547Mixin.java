package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.declarative.MemoryCondition.Absent.class)
public class Absent705519547Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__203106721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203106721L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1475943072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1475943072L))
            info.setReturnValue("p@\u0611I/JN,}u^[K^t>O$k)&<\u744E@\u6C57z]drsw@i\"cRvZ\u7A34+1FG/=P?H\uA38F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1262871638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262871638L))
            info.setReturnValue(-1648012606);
    }

    @Inject(at = @At("HEAD"), method = "condition()Lnet/minecraft/world/entity/ai/memory/MemoryStatus;", cancellable = true)
    private void condition__1193311729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1193311729L))
            info.setReturnValue(net.minecraft.world.entity.ai.memory.MemoryStatus.VALUE_ABSENT);
    }

    @Inject(at = @At("HEAD"), method = "createAccessor(Lnet/minecraft/world/entity/ai/Brain;Ljava/util/Optional;)Lnet/minecraft/world/entity/ai/behavior/declarative/MemoryAccessor;", cancellable = true)
    private void createAccessor__2044405536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2044405536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memory()Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;", cancellable = true)
    private void memory_645838741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645838741L))
            info.setReturnValue(null);
    }


}
