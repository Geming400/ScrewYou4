package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.CustomHeadLayer.Transforms.class)
public class Transforms_1662747573Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_754121304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(754121304L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1861796199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861796199L))
            info.setReturnValue("\u1B90+jzU^q\uBA000yZoZ%`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2074867633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2074867633L))
            info.setReturnValue(-868990093);
    }

    @Inject(at = @At("HEAD"), method = "horizontalScale()F", cancellable = true)
    private void horizontalScale_2144734865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144734865L))
            info.setReturnValue(9.638035E8F);
    }

    @Inject(at = @At("HEAD"), method = "yOffset()F", cancellable = true)
    private void yOffset__1302093973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1302093973L))
            info.setReturnValue(9.638035E8F);
    }

    @Inject(at = @At("HEAD"), method = "skullYOffset()F", cancellable = true)
    private void skullYOffset_982828904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(982828904L))
            info.setReturnValue(9.638035E8F);
    }


}
