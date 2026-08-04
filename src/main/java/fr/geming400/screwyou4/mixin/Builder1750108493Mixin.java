package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.FuelValues.Builder.class)
public class Builder1750108493Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/level/block/entity/FuelValues$Builder;", cancellable = true)
    private void remove_486145220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(486145220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/level/ItemLike;I)Lnet/minecraft/world/level/block/entity/FuelValues$Builder;", cancellable = true)
    private void add_1889485060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889485060L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/tags/TagKey;I)Lnet/minecraft/world/level/block/entity/FuelValues$Builder;", cancellable = true)
    private void add__1027594851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1027594851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/block/entity/FuelValues;", cancellable = true)
    private void build_437242315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437242315L))
            info.setReturnValue(null);
    }


}
