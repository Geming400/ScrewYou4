package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.CreativeModeTab.TabVisibility.class)
public class TabVisibility498923216Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/CreativeModeTab$TabVisibility;", cancellable = true)
    private static void values_219064564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(219064564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/CreativeModeTab$TabVisibility;", cancellable = true)
    private static void valueOf__1652560783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1652560783L))
            info.setReturnValue(net.minecraft.world.item.CreativeModeTab.TabVisibility.SEARCH_TAB_ONLY);
    }


}
