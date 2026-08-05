package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetBannerPatternFunction.Builder.class)
public class Builder_392144953Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__1898264144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1898264144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPattern(Lnet/minecraft/core/Holder;Lnet/minecraft/world/item/DyeColor;)Lnet/minecraft/world/level/storage/loot/functions/SetBannerPatternFunction$Builder;", cancellable = true)
    private void addPattern__1989320261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989320261L))
            info.setReturnValue(null);
    }


}
