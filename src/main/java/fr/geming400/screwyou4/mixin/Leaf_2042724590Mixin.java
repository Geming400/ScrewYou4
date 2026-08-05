package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.ComponentPath.Leaf.class)
public class Leaf_2042724590Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__866730448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-866730448L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_907264614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907264614L))
            info.setReturnValue("N376\u71EDrQh^\u0271\uD51Foo^b#SIShFYrX\u3B9Bk*(KPHWVm?crn\u084E)ft@>|2Q2B!s^J\uA659h=`MP7@/{mL;UiLZ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2080987331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080987331L))
            info.setReturnValue(926010054);
    }

    @Inject(at = @At("HEAD"), method = "component()Lnet/minecraft/client/gui/components/events/GuiEventListener;", cancellable = true)
    private void component_2128761213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128761213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyFocus(Z)V", cancellable = true)
    private void applyFocus__1022625878(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1022625878L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "leafComponent()Lnet/minecraft/client/gui/components/events/GuiEventListener;", cancellable = true)
    private void leafComponent_2128761213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128761213L))
            info.setReturnValue(null);
    }


}
