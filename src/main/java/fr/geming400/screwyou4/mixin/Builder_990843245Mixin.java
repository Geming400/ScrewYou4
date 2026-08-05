package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.WeatherCheck.Builder.class)
public class Builder_990843245Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/predicates/WeatherCheck;", cancellable = true)
    private void build_1695352170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1695352170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition;", cancellable = true)
    private void build_1275236684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275236684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setThundering(Z)Lnet/minecraft/world/level/storage/loot/predicates/WeatherCheck$Builder;", cancellable = true)
    private void setThundering_816772841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816772841L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.predicates.WeatherCheck$Builder());
    }

    @Inject(at = @At("HEAD"), method = "setRaining(Z)Lnet/minecraft/world/level/storage/loot/predicates/WeatherCheck$Builder;", cancellable = true)
    private void setRaining_816772841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(816772841L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.predicates.WeatherCheck$Builder());
    }


}
