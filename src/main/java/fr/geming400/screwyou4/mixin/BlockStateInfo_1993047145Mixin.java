package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryLookingAt.BlockStateInfo.class)
public class BlockStateInfo_1993047145Mixin {
        @Inject(at = @At("HEAD"), method = "group()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void group__450019409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-450019409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/StateHolder;", cancellable = true)
    private void getInstance_1744570640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744570640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getInstance__87701327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-87701327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResult(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private void getHitResult__1234305991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1234305991L))
            info.setReturnValue(null);
    }


}
