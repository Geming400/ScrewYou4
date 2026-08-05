package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.crafting.display.SlotDisplay.Composite.class)
public class Composite1360926897Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/crafting/display/SlotDisplay$Type;", cancellable = true)
    private void type_2075762422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2075762422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1548528140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1548528140L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_225466922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225466922L))
            info.setReturnValue("U0XMR(M.Iy/}pJQ3mSꔩu<)!48_0nL⚢omrIWq$iScE7#hWꀷ./](Z+i }|潝荢Ep_?G8-!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1399189639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1399189639L))
            info.setReturnValue(-775642884);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/util/context/ContextMap;Lnet/minecraft/world/item/crafting/display/DisplayContentsFactory;)Ljava/util/stream/Stream;", cancellable = true)
    private void resolve__221188791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221188791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled(Lnet/minecraft/world/flag/FeatureFlagSet;)Z", cancellable = true)
    private void isEnabled__68842483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-68842483L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "contents()Ljava/util/List;", cancellable = true)
    private void contents__1307703583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1307703583L))
            info.setReturnValue(null);
    }


}
