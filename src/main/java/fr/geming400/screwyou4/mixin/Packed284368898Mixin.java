package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.Brain.Packed.class)
public class Packed284368898Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1669881157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669881157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__851091077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-851091077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_322631640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(322631640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memories()Lnet/minecraft/world/entity/ai/memory/MemoryMap;", cancellable = true)
    private void memories_587501335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587501335L))
            info.setReturnValue(null);
    }


}
