package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.MemoryMap.class)
public class MemoryMap_1063443587Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/entity/ai/memory/MemoryModuleType;)Lnet/minecraft/world/entity/ai/memory/ExpirableValue;", cancellable = true)
    private void get_666014657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(666014657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1846011947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846011947L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__72016885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-72016885L))
            info.setReturnValue("'^Z>.H%♓(/x'aᚡ'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1101705832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1101705832L))
            info.setReturnValue(-1153531098);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/util/stream/Stream;)Lnet/minecraft/world/entity/ai/memory/MemoryMap;", cancellable = true)
    private static void of_1816603463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816603463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1088172446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1088172446L))
            info.setReturnValue(null);
    }


}
