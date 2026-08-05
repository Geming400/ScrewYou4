package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.FuelValues.Builder.class)
public class Builder1750108493Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/level/block/entity/FuelValues$Builder;", cancellable = true)
    private void remove__819103672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819103672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/world/level/ItemLike;I)Lnet/minecraft/world/level/block/entity/FuelValues$Builder;", cancellable = true)
    private void add_127874341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(127874341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "add(Lnet/minecraft/tags/TagKey;I)Lnet/minecraft/world/level/block/entity/FuelValues$Builder;", cancellable = true)
    private void add__594290596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-594290596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/block/entity/FuelValues;", cancellable = true)
    private void build_730128285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730128285L))
            info.setReturnValue(null);
    }


}
