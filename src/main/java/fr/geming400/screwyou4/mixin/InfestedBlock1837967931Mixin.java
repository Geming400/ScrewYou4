package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.InfestedBlock.class)
public class InfestedBlock1837967931Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__721145641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721145641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHostBlock()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void getHostBlock_1080702832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1080702832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "infestedStateByHost(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void infestedStateByHost_1500418002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500418002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hostStateByInfested(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void hostStateByInfested_1500417754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1500417754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCompatibleHostBlock(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isCompatibleHostBlock_1692679193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1692679193L))
            info.setReturnValue(null);
    }


}
