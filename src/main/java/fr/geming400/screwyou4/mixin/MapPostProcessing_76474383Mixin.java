package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.MapPostProcessing.class)
public class MapPostProcessing_76474383Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/component/MapPostProcessing;", cancellable = true)
    private static void values_1659955995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659955995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/component/MapPostProcessing;", cancellable = true)
    private static void valueOf__1729697320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729697320L))
            info.setReturnValue(net.minecraft.world.item.component.MapPostProcessing.LOCK);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_114736628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(114736628L))
            info.setReturnValue(394145412);
    }


}
