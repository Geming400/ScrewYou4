package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetStewEffectFunction.Builder.class)
public class Builder68501551Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/storage/loot/functions/LootItemFunction;", cancellable = true)
    private void build__645058603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-645058603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withEffect(Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/functions/SetStewEffectFunction$Builder;", cancellable = true)
    private void withEffect__1684758479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1684758479L))
            info.setReturnValue(new net.minecraft.world.level.storage.loot.functions.SetStewEffectFunction$Builder());
    }


}
