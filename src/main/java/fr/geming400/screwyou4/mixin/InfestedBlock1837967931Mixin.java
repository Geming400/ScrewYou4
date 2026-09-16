package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.InfestedBlock.class)
public class InfestedBlock1837967931Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1390554111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390554111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCompatibleHostBlock(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isCompatibleHostBlock_1884579442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884579442L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHostBlock()Lnet/minecraft/world/level/block/Block;", cancellable = true)
    private void getHostBlock__634508543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634508543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "infestedStateByHost(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void infestedStateByHost__1660907938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1660907938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hostStateByInfested(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void hostStateByInfested_1503386206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1503386206L))
            info.setReturnValue(null);
    }


}
