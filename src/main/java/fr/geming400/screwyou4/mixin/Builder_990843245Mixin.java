package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.WeatherCheck.Builder.class)
public class Builder_990843245Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/predicates/WeatherCheck;", cancellable = true)
    private void build__1825475368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1825475368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition;", cancellable = true)
    private void build_2046858910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2046858910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setThundering(Z)Lnet/minecraft/world/level/storage/loot/predicates/WeatherCheck$Builder;", cancellable = true)
    private void setThundering_1512824937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512824937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setRaining(Z)Lnet/minecraft/world/level/storage/loot/predicates/WeatherCheck$Builder;", cancellable = true)
    private void setRaining__206852771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-206852771L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.predicates.WeatherCheck.Builder());
    }


}
