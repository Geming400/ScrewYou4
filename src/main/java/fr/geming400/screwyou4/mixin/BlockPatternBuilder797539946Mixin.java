package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.pattern.BlockPatternBuilder.class)
public class BlockPatternBuilder797539946Mixin {
        @Inject(at = @At("HEAD"), method = "start()Lnet/minecraft/world/level/block/state/pattern/BlockPatternBuilder;", cancellable = true)
    private static void start__1213430297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1213430297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/block/state/pattern/BlockPattern;", cancellable = true)
    private void build_1831274088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831274088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "where(CLjava/util/function/Predicate;)Lnet/minecraft/world/level/block/state/pattern/BlockPatternBuilder;", cancellable = true)
    private void where_2120761978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2120761978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aisle([Ljava/lang/String;)Lnet/minecraft/world/level/block/state/pattern/BlockPatternBuilder;", cancellable = true)
    private void aisle__1783952470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1783952470L))
            info.setReturnValue(null);
    }


}
