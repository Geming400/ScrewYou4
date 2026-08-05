package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.AnyFuel.class)
public class AnyFuel1519736412Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type__2060395359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060395359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_384275941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384275941L))
            info.setReturnValue("O$CbCey!#@<>'pZ銙蔆Q3RN.㍰7IN;)Ho502V)M嶾+6u嚃熊.,VW](");
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__62379276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62379276L))
            info.setReturnValue(null);
    }


}
