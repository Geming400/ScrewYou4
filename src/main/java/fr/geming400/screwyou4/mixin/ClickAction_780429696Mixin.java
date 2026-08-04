package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.ClickAction.class)
public class ClickAction_780429696Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/inventory/ClickAction;", cancellable = true)
    private static void values__530316088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530316088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/inventory/ClickAction;", cancellable = true)
    private static void valueOf_1335482923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335482923L))
            info.setReturnValue(null);
    }


}
