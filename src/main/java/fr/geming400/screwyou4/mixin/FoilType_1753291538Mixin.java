package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ItemStackRenderState.FoilType.class)
public class FoilType_1753291538Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;", cancellable = true)
    private static void values__793984244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-793984244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;", cancellable = true)
    private static void valueOf__699298231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-699298231L))
            info.setReturnValue(null);
    }


}
