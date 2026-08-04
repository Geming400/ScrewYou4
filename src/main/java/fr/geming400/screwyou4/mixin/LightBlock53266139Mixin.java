package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LightBlock.class)
public class LightBlock53266139Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1789119863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1789119863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLightOnStack(Lnet/minecraft/world/item/ItemStack;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void setLightOnStack_958246019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958246019L))
            info.setReturnValue(null);
    }


}
