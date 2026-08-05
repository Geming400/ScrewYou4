package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.ItemStackRenderState.FoilType.class)
public class FoilType_1753291538Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;", cancellable = true)
    private static void values_755010474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755010474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/item/ItemStackRenderState$FoilType;", cancellable = true)
    private static void valueOf__358262415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358262415L))
            info.setReturnValue(net.minecraft.client.renderer.item.ItemStackRenderState.FoilType.NONE);
    }


}
