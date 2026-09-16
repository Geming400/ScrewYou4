package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.NoteBlock.class)
public class NoteBlock_1406835859Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1821686184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1821686184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPitchFromNote(I)F", cancellable = true)
    private static void getPitchFromNote_899243660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899243660L))
            info.setReturnValue(9.305702E8F);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1062352622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062352622L))
            info.setReturnValue(null);
    }


}
