package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.StainedGlassPaneBlock.class)
public class StainedGlassPaneBlock168314463Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1234759717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234759717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor_796305624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796305624L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.PINK);
    }


}
