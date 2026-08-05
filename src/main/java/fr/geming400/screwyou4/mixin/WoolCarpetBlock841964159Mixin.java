package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WoolCarpetBlock.class)
public class WoolCarpetBlock841964159Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1908409413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908409413L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor_1469955320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469955320L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.BROWN);
    }


}
