package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.declarative.MemoryCondition.Absent.class)
public class Absent705519547Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2091031806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091031806L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__429940428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429940428L))
            info.setReturnValue(",\u3F73Z!\u1772E\u22DDB&i\u53721!d?=y\u950Cs\uA01DeCC?\u1E1A\u887FVw:\uD362\uD50Bs'5^Pbf,X-\uB807&;jWN'ONQ\u71582L;L3\uD499-['0H");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_743782289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(743782289L))
            info.setReturnValue(-1922706462);
    }

    @Inject(at = @At("HEAD"), method = "condition()Lnet/minecraft/world/entity/ai/memory/MemoryStatus;", cancellable = true)
    private void condition_228905354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228905354L))
            info.setReturnValue(net.minecraft.world.entity.ai.memory.MemoryStatus.VALUE_ABSENT);
    }

    @Inject(at = @At("HEAD"), method = "memory()Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;", cancellable = true)
    private void memory_1415039286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415039286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAccessor(Lnet/minecraft/world/entity/ai/Brain;Ljava/util/Optional;)Lnet/minecraft/world/entity/ai/behavior/declarative/MemoryAccessor;", cancellable = true)
    private void createAccessor__1821325955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1821325955L))
            info.setReturnValue(null);
    }


}
