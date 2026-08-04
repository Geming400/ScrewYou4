package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.NoteBlock.class)
public class NoteBlock_1406835859Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1152277714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1152277714L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_148236091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(148236091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPitchFromNote(I)F", cancellable = true)
    private static void getPitchFromNote__1674229594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1674229594L))
            info.setReturnValue(null);
    }


}
