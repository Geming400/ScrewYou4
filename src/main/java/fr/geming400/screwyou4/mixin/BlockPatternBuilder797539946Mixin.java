package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.pattern.BlockPatternBuilder.class)
public class BlockPatternBuilder797539946Mixin {
        @Inject(at = @At("HEAD"), method = "start()Lnet/minecraft/world/level/block/state/pattern/BlockPatternBuilder;", cancellable = true)
    private static void start__362640247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-362640247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/block/state/pattern/BlockPattern;", cancellable = true)
    private void build_1081454586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1081454586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "where(CLjava/util/function/Predicate;)Lnet/minecraft/world/level/block/state/pattern/BlockPatternBuilder;", cancellable = true)
    private void where__901176621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901176621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aisle([Ljava/lang/String;)Lnet/minecraft/world/level/block/state/pattern/BlockPatternBuilder;", cancellable = true)
    private void aisle_506497190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(506497190L))
            info.setReturnValue(null);
    }


}
