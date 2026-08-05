package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LightBlock.class)
public class LightBlock53266139Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1119711393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119711393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLightOnStack(Lnet/minecraft/world/item/ItemStack;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void setLightOnStack_1495209774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495209774L))
            info.setReturnValue(null);
    }


}
