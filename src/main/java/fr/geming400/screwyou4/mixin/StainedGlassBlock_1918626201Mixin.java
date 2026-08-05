package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.StainedGlassBlock.class)
public class StainedGlassBlock_1918626201Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1309895842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309895842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor__1748349935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1748349935L))
            info.setReturnValue(net.minecraft.world.item.DyeColor.MAGENTA);
    }


}
