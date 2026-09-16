package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.MapDecorations.class)
public class MapDecorations_491839963Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__416786306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-416786306L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1262263487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262263487L))
            info.setReturnValue("n0-ZFFq]\u56A2ytc[V5CtiC3.2t(\uD18A._X'W\u6FB4\uD48AL<0`X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1049192053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049192053L))
            info.setReturnValue(-424768859);
    }

    @Inject(at = @At("HEAD"), method = "decorations()Ljava/util/Map;", cancellable = true)
    private void decorations__2074964449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2074964449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDecoration(Ljava/lang/String;Lnet/minecraft/world/item/component/MapDecorations$Entry;)Lnet/minecraft/world/item/component/MapDecorations;", cancellable = true)
    private void withDecoration__1869634997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1869634997L))
            info.setReturnValue(null);
    }


}
