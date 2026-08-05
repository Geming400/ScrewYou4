package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.ProcessorRule.class)
public class ProcessorRule2118951744Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void test_405429232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405429232L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOutputTag(Lnet/minecraft/util/RandomSource;Lnet/minecraft/nbt/CompoundTag;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getOutputTag__1876899040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1876899040L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "getOutputState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getOutputState__13584760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-13584760L))
            info.setReturnValue(null);
    }


}
