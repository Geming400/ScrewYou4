package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.debug.DebugEntryLookingAt.BlockTagInfo.class)
public class BlockTagInfo_1980693600Mixin {
        @Inject(at = @At("HEAD"), method = "group()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void group__462372954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462372954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/TypedInstance;", cancellable = true)
    private void getInstance__2065100059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2065100059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getInstance__100054872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-100054872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResult(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private void getHitResult__1246659536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1246659536L))
            info.setReturnValue(null);
    }


}
