package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.ProcessorRule.class)
public class ProcessorRule2118951744Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void test__1810210594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1810210594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOutputTag(Lnet/minecraft/util/RandomSource;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getOutputTag_1689416227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689416227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOutputState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getOutputState__176807122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-176807122L))
            info.setReturnValue(null);
    }


}
