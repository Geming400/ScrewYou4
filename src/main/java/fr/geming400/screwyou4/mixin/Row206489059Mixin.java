package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CreativeModeTab.Row.class)
public class Row206489059Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/CreativeModeTab$Row;", cancellable = true)
    private static void values_881565170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881565170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/CreativeModeTab$Row;", cancellable = true)
    private static void valueOf_403035449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(403035449L))
            info.setReturnValue(net.minecraft.world.item.CreativeModeTab.Row.BOTTOM);
    }


}
