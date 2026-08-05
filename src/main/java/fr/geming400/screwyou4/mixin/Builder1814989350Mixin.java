package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.food.FoodProperties.Builder.class)
public class Builder1814989350Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/food/FoodProperties;", cancellable = true)
    private void build__1278032469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1278032469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alwaysEdible()Lnet/minecraft/world/food/FoodProperties$Builder;", cancellable = true)
    private void alwaysEdible__2076646206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076646206L))
            info.setReturnValue(new net.minecraft.world.food.FoodProperties.Builder());
    }

    @Inject(at = @At("HEAD"), method = "saturationModifier(F)Lnet/minecraft/world/food/FoodProperties$Builder;", cancellable = true)
    private void saturationModifier_517616417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(517616417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nutrition(I)Lnet/minecraft/world/food/FoodProperties$Builder;", cancellable = true)
    private void nutrition__1626029773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1626029773L))
            info.setReturnValue(new net.minecraft.world.food.FoodProperties.Builder());
    }


}
