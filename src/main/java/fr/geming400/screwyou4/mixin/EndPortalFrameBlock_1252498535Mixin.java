package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.EndPortalFrameBlock.class)
public class EndPortalFrameBlock_1252498535Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1306615038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1306615038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__6101233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-6101233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreatePortalShape()Lnet/minecraft/world/level/block/state/pattern/BlockPattern;", cancellable = true)
    private static void getOrCreatePortalShape_1536413422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536413422L))
            info.setReturnValue(null);
    }


}
