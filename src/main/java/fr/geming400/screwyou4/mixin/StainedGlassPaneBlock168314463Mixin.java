package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.StainedGlassPaneBlock.class)
public class StainedGlassPaneBlock168314463Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1904168187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1904168187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor_1603622693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603622693L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.YELLOW);
    }


}
