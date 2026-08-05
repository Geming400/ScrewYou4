package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryLookingAt.BlockStateInfo.class)
public class BlockStateInfo_1993047145Mixin {
        @Inject(at = @At("HEAD"), method = "group()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void group_936741678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(936741678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/StateHolder;", cancellable = true)
    private void getInstance__2005418011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005418011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getInstance__1455594692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455594692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResult(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private void getHitResult_2130993439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130993439L))
            info.setReturnValue(null);
    }


}
