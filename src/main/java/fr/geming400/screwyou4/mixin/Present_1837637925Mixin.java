package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.declarative.MemoryCondition.Present.class)
public class Present_1837637925Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1071817113(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1071817113L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_702177949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702177949L))
            info.setReturnValue("717\uB369]G<mW\u9EDC.\uB3C0]V70S");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1875900666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875900666L))
            info.setReturnValue(-1458761329);
    }

    @Inject(at = @At("HEAD"), method = "condition()Lnet/minecraft/world/entity/ai/memory/MemoryStatus;", cancellable = true)
    private void condition_1361023731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1361023731L))
            info.setReturnValue(net.minecraft.world.entity.ai.memory.MemoryStatus.VALUE_ABSENT);
    }

    @Inject(at = @At("HEAD"), method = "memory()Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;", cancellable = true)
    private void memory__1747809633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747809633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAccessor(Lnet/minecraft/world/entity/ai/Brain;Ljava/util/Optional;)Lnet/minecraft/world/entity/ai/behavior/declarative/MemoryAccessor;", cancellable = true)
    private void createAccessor__689207578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-689207578L))
            info.setReturnValue(null);
    }


}
