package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.food.FoodProperties.Builder.class)
public class Builder1814989350Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/food/FoodProperties;", cancellable = true)
    private void build__1331302055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331302055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alwaysEdible()Lnet/minecraft/world/food/FoodProperties$Builder;", cancellable = true)
    private void alwaysEdible_1518681378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518681378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "saturationModifier(F)Lnet/minecraft/world/food/FoodProperties$Builder;", cancellable = true)
    private void saturationModifier__72232168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-72232168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nutrition(I)Lnet/minecraft/world/food/FoodProperties$Builder;", cancellable = true)
    private void nutrition__1553864805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1553864805L))
            info.setReturnValue(null);
    }


}
