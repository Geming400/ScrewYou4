package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.predicates.AnyOfCondition.Builder.class)
public class Builder_2131694121Mixin {
        @Inject(at = @At("HEAD"), method = "or(Lnet/minecraft/world/level/storage/loot/predicates/LootItemCondition$Builder;)Lnet/minecraft/world/level/storage/loot/predicates/AnyOfCondition$Builder;", cancellable = true)
    private void or__310710161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-310710161L))
            info.setReturnValue(null);
    }


}
