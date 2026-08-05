package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryLookingAt.BlockTagInfo.class)
public class BlockTagInfo_1980693600Mixin {
        @Inject(at = @At("HEAD"), method = "group()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void group_924388133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924388133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/TypedInstance;", cancellable = true)
    private void getInstance_21308272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21308272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getInstance__1467948237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1467948237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResult(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private void getHitResult_2118639894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118639894L))
            info.setReturnValue(null);
    }


}
