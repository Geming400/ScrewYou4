package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.memory.MemoryStatus.class)
public class MemoryStatus1407010941Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/entity/ai/memory/MemoryStatus;", cancellable = true)
    private static void values__1432043925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1432043925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/entity/ai/memory/MemoryStatus;", cancellable = true)
    private static void valueOf_1538031822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538031822L))
            info.setReturnValue(net.minecraft.world.entity.ai.memory.MemoryStatus.REGISTERED);
    }


}
