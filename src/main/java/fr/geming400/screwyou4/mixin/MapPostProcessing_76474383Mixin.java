package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.MapPostProcessing.class)
public class MapPostProcessing_76474383Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/component/MapPostProcessing;", cancellable = true)
    private static void values__517590855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-517590855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/component/MapPostProcessing;", cancellable = true)
    private static void valueOf_2104766720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104766720L))
            info.setReturnValue(net.minecraft.world.item.component.MapPostProcessing.SCALE);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_1676257721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676257721L))
            info.setReturnValue(-857892089);
    }


}
