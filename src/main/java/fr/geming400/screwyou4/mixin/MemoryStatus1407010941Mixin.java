package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.MemoryStatus.class)
public class MemoryStatus1407010941Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/memory/MemoryStatus;", cancellable = true)
    private static void values_1303940493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303940493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/memory/MemoryStatus;", cancellable = true)
    private static void valueOf__634336602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634336602L))
            info.setReturnValue(net.minecraft.world.entity.ai.memory.MemoryStatus.REGISTERED);
    }


}
