package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ClickAction.class)
public class ClickAction_780429696Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/inventory/ClickAction;", cancellable = true)
    private static void values__989719062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-989719062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/inventory/ClickAction;", cancellable = true)
    private static void valueOf__1852736509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1852736509L))
            info.setReturnValue(net.minecraft.world.inventory.ClickAction.PRIMARY);
    }


}
