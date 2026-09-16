package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.declarative.MemoryCondition.Registered.class)
public class Registered_643529660Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__265096609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-265096609L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1413953184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1413953184L))
            info.setReturnValue("\u4382vSDv1\uA306\u1E11\u5F83\u385BfahW(-vMSV\u350DR7Pc\"vZhglmLGU[oY]\u10EB\"26crSL0I:t.n<,caZkM3A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1200881750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200881750L))
            info.setReturnValue(-426699013);
    }

    @Inject(at = @At("HEAD"), method = "condition()Lnet/minecraft/world/entity/ai/memory/MemoryStatus;", cancellable = true)
    private void condition__1255301617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255301617L))
            info.setReturnValue(net.minecraft.world.entity.ai.memory.MemoryStatus.VALUE_PRESENT);
    }

    @Inject(at = @At("HEAD"), method = "createAccessor(Lnet/minecraft/world/entity/ai/Brain;Ljava/util/Optional;)Lnet/minecraft/world/entity/ai/behavior/declarative/MemoryAccessor;", cancellable = true)
    private void createAccessor__2106395424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106395424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memory()Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;", cancellable = true)
    private void memory_583848853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583848853L))
            info.setReturnValue(null);
    }


}
